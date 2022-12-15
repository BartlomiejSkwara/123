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
public class WinStatistics implements Statistics{
    
    
    private HashMap<String, Integer> highScores = new HashMap<>();
    
    
    @Override
    public void winner(Player player){        
        String name = player.getName();
        Integer temp = highScores.getOrDefault(name, 0);
            
        highScores.put(name, temp+1);
        
    }
    
    @Override
    public void printScores(){
        highScores.forEach((n,t)->System.out.println(n+": "+t));
    }
    
    @Override
    public void clearScores(){
        
    }
}
