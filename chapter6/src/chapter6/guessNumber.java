/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6;
import java.security.SecureRandom;
import java.util.Scanner;

/**
 *(Guess the Number) Write an application that plays “guess the number” as follows: Your
program chooses the number to be guessed by selecting a random integer in the range 1 to 1000.
The application displays the prompt Guess a number between 1 and 1000 . The player inputs a first
guess. If the player's guess is incorrect, your program should display Too high. Try again. or Too
low. Try again. to help the player “zero in” on the correct answer. The program should prompt the
user for the next guess. When the user enters the correct answer, display Congratulations. You
guessed the number! , and allow the user to choose whether to play again. [Note: The guessing tech-
nique employed in this problem is similar to a binary search, which is discussed in Chapter 19,
Searching, Sorting and Big O.]
 * @author claude
 */
public class guessNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        computeA();
        
         int play;
         System.out.printf("%s\n","would you play again\n"
               +"1: yes\n"
               +"2: No");
         play = input.nextInt();
               switch(play){
                   case 1:
                       computeA();
                       break;
                   case 2: default:
                       System.out.println("Goodbye");
                       break;
                    
                       }
}
    public static void computeA(){
            
        int number;
       
        SecureRandom randomNumbers = new SecureRandom();
        Scanner input = new Scanner(System.in);

   
    
        int rndnum = 1 + randomNumbers.nextInt(4);
       do{ 
        System.out.println("Guess the number");
         number = input.nextInt();
         
         if (number<rndnum){
             System.out.println("too low.try again");
              System.out.println("Guess the number");
         number = input.nextInt();
         }
          if (number>rndnum){
             System.out.println("too high .Try again");
              System.out.println("Guess the number");
         number = input.nextInt();
         }
          if (number == rndnum){
               System.out.println("congratulations");
               }}
          while(number != rndnum);
    
}
}
