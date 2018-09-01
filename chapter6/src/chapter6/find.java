/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6;

/**
 *
 * @author claude
 */

    import java.util.Scanner;
import java.util.Random;

public class find {
  
public static void main (String[] args) {
    
Random rand = new Random ();
int numberToGuess = rand.nextInt (4);
int numberOfTries = 0;
Scanner input = new Scanner (System.in);
int guess;
boolean win = false;
    
while (win == false) {
      

System.out.println ("Guess a number between 1 and 1000: ");
guess = input.nextInt();
numberOfTries++;
      
if (guess == numberToGuess) {
win=true;
}
else if (guess < numberToGuess) {
System.out.println("Your guess is too low");
}
else if (guess > numberToGuess) {
System.out.println("Your guess is too high");
}
}
    
System.out.println("You win!");
System.out.println("The number was " + numberToGuess);
System.out.println("It took you " + numberOfTries + " tries ");
    
}
}

