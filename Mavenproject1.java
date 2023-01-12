/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Student
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        
        

        String str = "abc";
        int offset = 4;
        
        //final int distanceBetweenAandZ = 'z'-'a';   
        //StringBuilder result = new StringBuilder("");
    
        
        //while(offset>distanceBetweenAandZ)
            //offset-=distanceBetweenAandZ;
        
        
        str.chars()
                .mapToObj(c->(char)(c+offset))
                .forEach(c->System.out.print((char)(c-offset)));
        
//        for(int i =0; i<str.length(); i++){
//            result.append((char)(str.charAt(i)+offset));
//        }
        
        //System.out.println(result.toString());
    }
}
