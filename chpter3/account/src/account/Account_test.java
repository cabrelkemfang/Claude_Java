/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author Claude
 */
import java.util.Scanner;
public class Account_test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account myaccount = new Account();
        System.out.println("Please enter your name");
        String Name = input.nextLine();
        myaccount.setName(Name);
        
     
        System .out.printf("account2 name is %s%n", myaccount.getName());
        
        // TODO code application logic here
    }
    
}
