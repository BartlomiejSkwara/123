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
    private String name;
    

    public void setName(String name)
    {
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
