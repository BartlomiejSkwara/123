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
    
    private int winningNumber;                     
    private int guess;                      
    
    private Random rand = new Random();
        
    private ArrayList<Player> players = new ArrayList<>();
    
    public Game(){
        players.add(new PlayerComp("Komputer1"));
    }
    
    
    private boolean wasNameUsed(String name){
        for(Player p : players){
                if(p.getName().equals(name)){
                   return true;
                }
        }
        return false;
    }
    
    public void addPlayer(Player player){
        if(player!=null){
            
            while (wasNameUsed(player.getName())){
                player.setName(player.getName()+rand.nextInt(9));
            }
             
            players.add(player);
        }
    }
    
    public void play(){
        boolean someoneGuessed = false;
        do {
            
            System.out.println("---------------------");
            winningNumber = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + winningNumber+ "\n");

            for(Player p : players){
                guess = p.guess();
                System.out.println(p.getName() + ": " + guess);
                if (winningNumber != guess) {
                    System.out.println("PUDŁO!\n");
                }
                else {
                    someoneGuessed = true;
                    System.out.println("BRAWO dla gracza "+p.getName()+"!\n");
                }
            }        
        
        } while (!someoneGuessed);
    }
    
}
