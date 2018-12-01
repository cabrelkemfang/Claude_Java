/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5.makingDiffrence;

/**
 *(Facebook User Base Growth) According to CNNMoney.com, Facebook hit one billion us-
ers in October 2012. Using the compound-growth technique you learned in Fig. 5.6 and assuming
its user base grows at a rate of 4% per month, how many months will it take for Facebook to grow
its user base to 1.5 billion users? How many months will it take for Facebook to grow its user base
to two billion users?
 * @author claude
 */
public class FacebookUserBaseGroup {
     public static void main(String[] args) {
         double amount = 1500000.0 ; 
         double principal = 1000000.0; 
         double rate = 0.04;
         double month = (Math.log(amount/principal))/(Math.log(1+rate));
          System.out.printf("the month is %f\n",month);
          amount = 2000000.0 ;
         month = (Math.log(amount/principal))/(Math.log(1+rate));
          System.out.printf("the month is %f\n",month);

     }
    
}
