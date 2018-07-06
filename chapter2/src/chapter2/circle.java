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
public class circle {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
              int radius,diameter;
              double area;
              double circumference;
              
       System.out.println("enter the radius ");
       radius = input.nextInt();
       diameter = 2 * radius;
       circumference = 2 * Math.PI * radius;
       area = Math.PI * radius * radius;
       System.out.printf("the diameter is %d%n ",diameter );
       System.out.printf("The circumference is %f%n) ",(2 * Math.PI * radius));
        System.out.printf("the area is %f%n ",(Math.PI * radius * radius));
}
}