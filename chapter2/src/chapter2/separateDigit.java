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
public class separateDigit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num,dig1,dig2,dig3,dig4,dig5;
        System.out.println("enter a number with 5 digit");
        num = input.nextInt();
        dig5 = num % 10;
        num = num/10;
        dig4 = num % 10;
        num = num/10;
        dig3 = num % 10;
        num = num/10;
        dig2 = num % 10;
        num = num /10;
        dig1 = num % 10;
        System.out.printf("%d   %d   %d   %d   %d%n",dig1,dig2,dig3,dig4,dig5);
    }
    
    
}
