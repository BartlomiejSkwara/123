/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Student
 */
public class Mavenproject1 
{

    public static void main(String[] args) 
    {       
//        Game game = new Game();
//        game.addPlayer(new PlayerComp("Komputer2"));
//        game.play();
           
        ArrayList<String> list = new ArrayList();
        
        list.add("1");
        list.add("2");
        list.add("12fasfsa");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        
       
   
        
        
    }
}
