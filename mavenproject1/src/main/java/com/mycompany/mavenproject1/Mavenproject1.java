/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mavenproject1;

//import java.util.ArrayList;
//import java.util.Iterator;

/**
 *
 * @author Student
 */
public class Mavenproject1 
{

    public static void main(String[] args) 
    {       
        Game game = new Game();
        for (int i = 0; i<1500; i++){game.addPlayer(new PlayerComp("Komputer"));}
        game.play();
        
    }
}
