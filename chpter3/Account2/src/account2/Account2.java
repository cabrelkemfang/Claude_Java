/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account2;

/**
 *
 * @author Claude
 */
public class Account2 {
    private String name;
    private double balance;
    
    public Account2(String name, double balance){
            this.name = name;
            if (balance > 0.0)
                this.balance = balance;
    
    }
    public void deposit(double amount){
        if (amount > 0.0)
            balance = balance + amount;
        
    }
    public double getBalance()
    { 
        return balance;
    } 
      public void withdraw(double withdrawal){
          if (withdrawal <= balance)
              balance = balance - withdrawal;
          else
              System.out.println("Wwithdrawal amount exceed qccount balance");
          
         }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
        
    }
  
}
