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
public class Gas_mileage {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int gallons;
    int miles;
    int count =0;
    double total = 0.0;
    double mpg = 0.0;
    
    
    Scanner input = new Scanner(System.in);
    System.out.println("enter the trip number or -1 to stop");
  
    int trip = input.nextInt();
    
while(trip != -1) {
      System.out.println("enter the miles and number of gallons");
    
    
        miles = input.nextInt();
    gallons = input.nextInt();
    if(gallons != 0){
     mpg = (double) miles / gallons;
     System.out.printf("the miles per gallon of %d trip is %.2f%n",trip,mpg);
    }
    total += mpg;
    count++;
    System.out.println("enter the trip number or -1 to stop");
  
    trip = input.nextInt();
    
    
    
}
System.out.printf("the total  miles per gallons is %.2f%n",total);
            }

        // TODO code application logic here
        
    }
    

