/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account2;
import java.util.Scanner;
/**
 *
 * @author Claude
 */
public class account2_test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account2 account1 = new Account2("Claude Joelle" , 5000.00);
        Account2 account2 = new Account2("Ella Marcelle",-100.20);
        
        System.out.printf("%s balance : %f%n",account1.getName(),account1.getBalance());
        System.out.printf("%s balance : %f%n", account2.getName(),account2.getBalance());
        
        Scanner input  = new Scanner(System.in);
        
        System.out.print("enter deposit amount");
        double amount = input.nextDouble();
        System.out.printf("adding %f to account1 balance%n%n",amount);
        account1.deposit(amount);
        
        System.out.printf("%s balance: $%f%n",account1.getName(),account1.getBalance());
        
        System.out.printf("%s balance: $%f%n",account2.getName(),account2.getBalance());
        
        System.out.print("enter deposit amount for account2");
         amount = input.nextDouble();
        System.out.printf("adding %f to account2 balance%n%n",amount);
        account2.deposit(amount);
        
        System.out.printf("%s balance: $%f%n",account1.getName(),account1.getBalance());
        
        System.out.printf(" %s balance: $%f%n",account2.getName(),account2.getBalance());
        
        
         System.out.print("enter withdraw amount");
        double withdrawal = input.nextDouble();
        System.out.printf("redrawing %f to account1 balance%n%n",withdrawal);
        account1.withdraw(withdrawal);
        
        System.out.printf("%s balance: $%f%n",account1.getName(),account1.getBalance());
        
        System.out.printf("%s balance: $%f%n",account2.getName(),account2.getBalance());
        
        System.out.print("enter withdraw amount for account 2");
        withdrawal = input.nextDouble();
        System.out.printf("redrawing %f to account1 balance%n%n",withdrawal);
        account2.withdraw(withdrawal);
           
        System.out.printf("%s balance: $%f%n",account1.getName(),account1.getBalance());
        
        System.out.printf("%s balance: $%f%n",account2.getName(),account2.getBalance());
    }
        
     }
    

