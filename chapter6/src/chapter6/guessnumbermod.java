/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 *
 * @author claude
 */
public class guessnumbermod {

    /**
     * @param args the command line arguments
     */
    private int num;
    private static int count = 0;
    
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner input = new Scanner(System.in);
        
        computeA();
        System.out.println("Total guesses:" + count);
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
               

                display();
               
}
    public static void display(){
       
         if(guessnumbermod.count<10){
     System.out.println("Either you know the secret or you got lucky!");
 }
 if(guessnumbermod.count==10){
     System.out.println("Aha! You know the secret!");}
        
  if(guessnumbermod.count>10){
     System.out.println("You should be able to do better!");
 }   
    
    }
    public static void compter(){
 
 System.out.println("Guess the number");
  ++guessnumbermod.count; 
  System.out.printf("num %d",count);

}
    public static void computeA(){
      
        
        int number;
       
        SecureRandom randomNumbers = new SecureRandom();
        Scanner input = new Scanner(System.in);

   
    
        int rndnum = 1 + randomNumbers.nextInt(4);
       do{ 
        compter();
        count++;
         number = input.nextInt();
         
         if (number<rndnum){
             System.out.println("too low.try again");
               compter();
               count++;
         number = input.nextInt();
         }
          if (number>rndnum){
             System.out.println("too high .Try again");
               compter();
               count++;
         number = input.nextInt();
         }
          if (number == rndnum){
               System.out.println("congratulations");
               }}
          while(number != rndnum);
    


    }
   
    
}
