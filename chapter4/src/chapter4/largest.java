/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;
import java.util.Scanner;

/**
 *
 * @author Claude
 */
public class largest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int counter = 0;
        int num ;
        int largest = 0;
       Scanner input = new Scanner(System.in);
         System.out.println("enter 5 number");
       while(counter < 5){
         
           num = input.nextInt();
            if(num > largest){
                largest = num;
            }
            counter++;
           }
       System.out.printf("The largest num is %d%n",largest);
       
       
    }
    
}
