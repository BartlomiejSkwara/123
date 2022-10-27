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
    
    //private Scanner input = new Scanner(System.in);
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
        
        if(name==null||!name.matches("^[A-Za-z0-9\\.\\-_]{3,}$"))
        {
            
            System.err.println("ERROR::PLAYER::NAME_EMPTY_OR_NULL");
            return;
        }
        
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int guess()
    {   
        return rand.nextInt(6)+1;//input.nextInt();
    }
}
