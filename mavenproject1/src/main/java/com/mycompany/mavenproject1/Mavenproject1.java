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
public class Mavenproject1 
{

    public static void main(String[] args) 
    {
          //obiekt losujący
        int number;                     //wylosowana liczba
        int guess;                      //propozycja (strzał) gracza
        Random rand = new Random(); 
        Player pl = new Player("Gracz");
        //pl.setName(null);
        
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
