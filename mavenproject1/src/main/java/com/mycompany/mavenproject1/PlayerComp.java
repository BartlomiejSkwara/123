/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Random;

public class PlayerComp extends Player{
    
    private Random rand = new Random(); 
    
    public PlayerComp(){}
    public PlayerComp(String name){
        super(name);
    }
    
    @Override
    public int guess()
    {   
        return rand.nextInt(6)+1;
    }
}
