/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
import java.util.Random;


/**
 *
 * @author Student
 */
public class Player 
{
    
    private Random rand = new Random(); 
    private String name = "Gracz";
    
    public Player(String name)
    {
        this.setName(name);
    }
    public Player()
    {
        ///:>
    }
    
    public void setName(String name)
    {
        if(name==null||!name.matches("^[A-Za-z\\d\\.\\-_]{3,}$"))
            throw new IllegalArgumentException("ERROR::PLAYER::NAME_EMPTY_OR_NULL");
        
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int guess()
    {   
        return rand.nextInt(6)+1;
    }
}
