/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Game {
    
    private int number;                     
    private int guess;                      
    
    private Random rand = new Random(); 
    private Scanner input = new Scanner(System.in);

        
    private ArrayList<Player> players = new ArrayList<>();
    
    
    public Game(){
        players.add(new PlayerComp("Komputer1"));
    }
    
    public void addPlayer(Player player){
        if(player!=null){
            players.add(player);
        }
    }
    
    public void play(){
        
        do {
            
            System.out.println("---------------------");

            number = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            for(Player p : players){
                guess = p.guess();
                System.out.println(p.getName() + ": " + guess);
                if (number != guess) {
                    System.out.println("PUDŁO!");
                }
                else {
                    System.out.println("BRAWO dla gracza "+p.getName()+'!');
                    break;
                }
            }

            
        } while (number != guess);
    }
    
}
