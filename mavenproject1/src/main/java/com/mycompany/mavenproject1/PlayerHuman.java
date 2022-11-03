/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class PlayerHuman extends Player {
    
    private Scanner input = new Scanner(System.in);

    public PlayerHuman() {
        super();
    }
    
    public PlayerHuman(String name){
        super(name);
    }
    
    
    @Override
    public int guess(){
        System.out.println("Podaj liczbę");
        return input.nextInt();
    }
}
