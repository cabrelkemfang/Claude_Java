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
public class creditLC {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int acc_num,balance,charges,credits,credit_lim;
        acc_num =input.nextInt();
        balance =input.nextInt();
        charges =input.nextInt();
        credits = input.nextInt();
        credit_lim =input.nextInt();
                
            balance = balance + charges - credits;
            
        System.out.printf("the new balance is %d%n",balance);
        if(balance > credit_lim){
            System.out.println("credit limit exceeded");
        }
    }
    
}
