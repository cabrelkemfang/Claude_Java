/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2;
import java.util.Scanner;

/**
 *
 * @author Claude
 */
public class BMI {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int weight,height;
    float BMI;
    System.out.println("enter height in meter and weight in kg ");
    height = input.nextInt();
    weight = input.nextInt();
    BMI = (weight/(height*height));
    System.out.printf(" your BMI is %f%n ",BMI);
    System.out.println("BMI VALUES ");
    System.out.println("Underweight: less than 18.5 ");
    System.out.println("normal:      between 18.5 and 24.9 ");
    System.out.println("Overweight:  between 25 and 29.9 ");
    System.out.println("OBESE:       30 or greater ");
    
    
    
            }
    
}
