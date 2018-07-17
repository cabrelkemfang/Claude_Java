/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package making_diff2.ex2;

/**
 *
 * @author Claude
 */
public class healthprofileTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    healthprofile person = new healthprofile("Kamaha","Claude",'f',05,24,1997,100,30);
        person.Displaydate();
        
        System.out.printf("%s%n",person.getlastname());
        
         System.out.printf("%s%n",person.getname());
        
        System.out.printf("%d%n", person.age());
        
         System.out.printf("%d%n",person.maxheartRate());
        
         System.out.printf("%.2f%n",person.target());
                
        

     System.out.printf(" your BMI is %f%n ",person.BMI());
     
    System.out.println("BMI VALUES ");
    System.out.println("Underweight: less than 18.5 ");
    System.out.println("normal:      between 18.5 and 24.9 ");
    System.out.println("Overweight:  between 25 and 29.9 ");
    System.out.println("OBESE:       30 or greater ");
    
    }
    }           
