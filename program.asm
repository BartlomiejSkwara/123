program          segment
               assume  cs:program, ds:dane, ss:stosk

start:          mov     ax,dane ;przygotowanie segmentow
                mov     ds,ax
                mov     ax,stosk
                mov     ss,ax
                mov     sp,offset szczyt
                ;program

                mov dx, offset witam
                mov ah, 9
                int 21h

pocz:           mov dx, offset pytanie
                mov ah, 9
                int 21h


                ;wczytywanie
                mov dx, offset max
                mov ah, 0ah

                int 21h
                ;


                ;zmiana w liczbę
                xor bx,bx
                mov bl, 0

                mov [suma],0
                xor cx,cx
                mov cl, len ;number of iterations



                sprawdzenie:


                    ;mov dl,liczba[bx]
                    cmp liczba[bx], '0'
                    jb errorDane
                    cmp liczba[bx], '9'
                    ja errorDane


                    ;zamiana w liczbe
                    ;reset carry

                    mov ax, suma
                    mov dx,10
                    mul dx
                    jc errorZakres

                    xor dx,dx
                    mov dl,liczba[bx]
                    sub dx,30h

                    add ax, dx
                    jc errorZakres
                    mov suma,ax




                    inc bl
                loop sprawdzenie
                jmp decimal
                ;



errorDane:      mov dx, offset errorD
                mov ah, 9
                int 21h


                jmp pocz

errorZakres:    mov dx, offset errorZ
                mov ah, 9
                int 21h


                jmp pocz










decimal:        mov dx, offset _dec
                mov ah, 9
                int 21h

                xor bh,bh ;wyzerowanie starszego bajtu bx
                mov bl,len
                mov liczba[bx],'$'
                mov ah,09
                mov dx,offset liczba
                int 21h




binary:         mov dx, offset _bin
                mov ah, 9
                int 21h

                mov ah,2
                mov bx,suma
                mov cx,16
    kolejb:     mov dl,'0'
                rcl bx,1 ;obrót w lewo
                jnc ominb
                inc dl
    ominb:      int 21h
                loop kolejb






hexadec:        mov dx, offset _hex
                mov ah, 9
                int 21h

                mov ah,2
                mov bx,suma
                mov cx,4
    kolejh:     mov si,000Fh
                rol bx,4
                and si,bx
                mov dl,hex[si]
                int 21h
                loop kolejh

                

                jmp pocz




program          ends

dane           segment stack
    witam     db 'Witamy w konwerterze liczb :>$'
    pytanie   db 10,13,10,13,'Podaj dziesietna liczbe z zakresu <0,(2^16)-1>:',10,13,'$'
    errorD    db 'Podano liczba nie jest poprawnie zapisana !!!',10,13,10,13,'$'
    errorZ    db 'Podana liczba wykracza poza zakres !!!',10,13,10,13,'$'
    _dec      db 10,13,'DEC:$'
    _bin      db 10,13,'BIN:$'
    _hex      db 10,13,'HEX:$'
    newline   db 10,13,'$'

    max       db 6
    len       db ?
    liczba    db 6 dup(0)
    liczbadec db 6
    suma      dw 0

    hex       db '0123456789ABCDEF'
dane          ends

stosk          segment stack
                dw    100h dup(0)
szczyt          Label word
stosk          ends

end start