/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.mavenproject1;
/**
 *
 * @author Student
 */
import java.util.Random;
import java.util.Scanner;
public class Mavenproject1 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int number;                     
        int guess;                      
        Random rand = new Random(); 
        Player pl = new PlayerHuman("Gracz2");
        
        try {
            pl.setName(input.next());
        } catch (IllegalArgumentException e) {
            
        }
            
        
        do {
            System.out.println("---------------------");

            number = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + number);

            guess = pl.guess();
            System.out.println(pl.getName() + ": " + guess);

            if (number != guess) {
                System.out.println("PUDŁO!");
            }
            else {
                System.out.println("BRAWO!");
            }
        } while (number != guess);
    }
}
