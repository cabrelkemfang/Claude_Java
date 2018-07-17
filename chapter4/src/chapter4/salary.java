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
public class salary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        
        System.out.println(" enter amount to be paid for 40 hours");
        int money = input.nextInt();
        
        while(count < 3){
            System.out.println("enter number of hours worked by each worker");
            int work_hours = input.nextInt();
             if(work_hours == 40){
             System.out.printf("the gross pay is %d", money);
            }
            if(work_hours > 40){
                money = money+ money/2;
                System.out.printf("the gross pay is %d", money);
            }
           
            count++;
        }
        
        
        // TODO code application logic here
    }
    
}
