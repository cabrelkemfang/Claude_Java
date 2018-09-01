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
public class CAI3 {

    /**
     * @param args the command line arguments
     */
       
   private static int answer;
 private static int product;
 private static int checkReponse;
 private static int num;
 private static int num2;
 private static int count = 0;
 private static int corr = 0;
 private static int incorr =0;

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
    
 
    
     
     
      do{
          if(count < 2){
          System.out.printf("How much is %d times %d\n",num,num2);
          ++count;
     product = input.nextInt();
  
       if(answer==product){
           corr++;
          check();
          break;
      } 
       else{
           incorr++;
    incorrect();
        
        }
          } marking(); 
        break;} 
    while (answer!=product) ;  
     
     }
    
              
     
     public static void check(){
        
      
     correct();
    calc();
    
     }
     public static void correct(){
         SecureRandom randomNumbers = new SecureRandom();
          int rndnum = 1 + randomNumbers.nextInt(4);
          switch(rndnum){
              case 1:
                  System.out.println("Very good!");
                   break;
              case 2:
                  System.out.println("Excellent");
                   break;
              case 3:
                  System.out.println("Nice work!");
                   break;
              case 4:
                  System.out.println("Keep up the good work!");
                   break;
                 
                 
                    
          }
     }
           public static void incorrect(){
         SecureRandom randomNumbers = new SecureRandom();
          int rndnum = 1 + randomNumbers.nextInt(4);
          switch(rndnum){
              case 1:
                  System.out.println("No. Please try again.");
                  break;
              case 2:
                  System.out.println("Wrong. Try once more.");
                   break;
              case 3:
                  System.out.println("Don't give up!");
                   break;
              case 4:
                  System.out.println("No. Keep trying.");
                   break;
                 
          }   
             
    }
            public static void marking(){
           System.out.println(count);
           int calcu = corr * 10;
           System.out.println(calcu);
           if(calcu >= 20){
                System.out.println("Congratulations, you are ready to go to the next level!");
               
           }
           else{
               System.out.println("Please ask your teacher for extra help .");
               
           }

                
                
    
}
}
