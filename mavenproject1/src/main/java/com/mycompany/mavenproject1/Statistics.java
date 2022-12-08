/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.HashMap;
import java.util.function.BiConsumer;

/**
 *
 * @author Student
 */
public class Statistics {
    
    
    private HashMap<String, Integer> highScores = new HashMap<>();
    
    
    public void winner(Player player){
        
        String name = player.getName();
        Integer temp = highScores.getOrDefault(name, 0);
            
        highScores.put(name, temp+1);
        
    }
    
    public void printScore(String name){
        Integer temp = highScores.get(name);
        if(temp!=null){
            System.out.println(name+": "+temp);
        }
        
    }
    
    public void clearScores(){
        
    }
}
