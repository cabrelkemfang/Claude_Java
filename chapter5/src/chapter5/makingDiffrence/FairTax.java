/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5.makingDiffrence;

import java.util.Scanner;

/**
 *(Tax Plan Alternatives; The “FairTax”) There are many proposals to make taxation fairer.
Check out the FairTax initiative in the United States at www.fairtax.org . Research how the pro-
posed FairTax works. One suggestion is to eliminate income taxes and most other taxes in favor of
a 23% consumption tax on all products and services that you buy. Some FairTax opponents ques-
tion the 23% figure and say that because of the way the tax is calculated, it would be more accurate
to say the rate is 30%—check this carefully. Write a program that prompts the user to enter expenses
in various expense categories they have (e.g., housing, food, clothing, transportation, education,
health care, vacations), then prints the estimated FairTax that person would pay.
 * @author claude
 */

public class FairTax {

    /**
     * @param args the command line arguments
     */
    private static final double fairTax = 0.23; 
    public static void main(String[] args) {
        double totalIncome;
        double housing;
        double food;
        double clothing;
        double transportation;
        double education;
        double healthCare;
        double vacations;
        double totalExpenses = 0 ;
        double taxAmount;
        double estimatedFairTax;
        
        
       Scanner input = new Scanner(System.in);
       System.out.println("Enter your Income");
       totalIncome = input.nextInt();
       
       System.out.println("Enter your housing");
        housing = input.nextInt();
        
       System.out.println("Enter your food");
        food = input.nextInt();
             
       System.out.println("Enter your clothing");
        clothing = input.nextInt();
               
       System.out.println("Enter your transportation");
        transportation = input.nextInt();
                 
       System.out.println("Enter your education");
        education = input.nextInt();
                   
       System.out.println("Enter your healthCare");
        healthCare= input.nextInt();
                     
       System.out.println("Enter your vacations");
        vacations = input.nextInt();
        
        totalExpenses =  housing +  food + clothing + transportation + education + healthCare + vacations;
        System.out.printf("your total expenses fair tax is %f\n",totalExpenses);
        
        taxAmount= totalIncome - totalExpenses;
        System.out.printf("the tax amount tax is %f\n",taxAmount);
        
        estimatedFairTax = taxAmount * fairTax ;
        
         System.out.printf("the estimated fair tax is %f\n",estimatedFairTax);
         
        
        
    }
    
}
