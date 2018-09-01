/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makingdiff;
import java.security.SecureRandom;
import java.util.Scanner;

/**
 *
 * @author claude
 */
public class computerAssistedInstruction {

    /**
     * @param args the command line arguments
     * 
     */
    
   private static int answer;
 private static int product;
 private static int checkReponse;
 private static int num;
 private static int num2;

     
    public static void main(String[] args) {
        // TODO code application logic here
        
         SecureRandom randomNumbers = new SecureRandom();
         
        Scanner input = new Scanner(System.in);
      
        calc();
      
      
          }
    
     public static void calc(){
         SecureRandom randomNumbers = new SecureRandom();
    Scanner input = new Scanner(System.in);
  
          num = randomNumbers.nextInt(9);
 num2 = randomNumbers.nextInt(9);
 answer = num * num2;
    
 
    
     int product;
      do{
          System.out.printf("How much is %d times %d\n",num,num2);
          
     product = input.nextInt();
  
       if(answer==product){
          
          check();
          break;
      } 
       else{
           
    System.out.println("No. Please try again.");
        
        }}
    
    while (answer!=product) ;     
     
    }
              
     
     public static void check(){
        
      
     System.out.println("Very good");
    calc();
    
     
      }
    
  }

