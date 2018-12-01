<<<<<<< HEAD
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
public class negposzero {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
                int a,b,c,d,e;
                int neg = 0;
                int pos = 0;
                int zero =0;
                System.out.println("enter five numbers");
         a = input.nextInt();
         b = input.nextInt();
         c =  input.nextInt();
         d =  input.nextInt();
         e = input.nextInt();
         if(a<0)
             neg = neg + 1;
         if(a>0)
             pos = pos + 1;
         if(a == 0)
             zero = zero + 1;
         
         if(b<0)
             neg = neg + 1;
         if(b>0)
             pos = pos + 1;
         if(b == 0)
             zero = zero + 1;
         
         if(c<0)
             neg = neg + 1;
         if(c>0)
             pos = pos + 1;
         if(c == 0)
             zero = zero + 1; 
        
         if(d<0)
             neg = neg + 1;
         if(d>0)
             pos = pos + 1;
         if(d == 0)
             zero = zero + 1;
         if(e<0)
             neg = neg + 1;
         if(e>0)
             pos = pos + 1;
         if(e == 0)
             zero = zero + 1;
         
         System.out.printf(" the negative number is %d%n", neg);
         System.out.printf(" the positive number is %d%n", pos);
         System.out.printf(" the zero number is %d%n", zero);
         
        
    }
    
}
=======
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
public class negposzero {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
                int a,b,c,d,e;
                int neg = 0;
                int pos = 0;
                int zero =0;
                System.out.println("enter five numbers");
         a = input.nextInt();
         b = input.nextInt();
         c =  input.nextInt();
         d =  input.nextInt();
         e = input.nextInt();
         if(a<0)
             neg = neg + 1;
         if(a>0)
             pos = pos + 1;
         if(a == 0)
             zero = zero + 1;
         
         if(b<0)
             neg = neg + 1;
         if(b>0)
             pos = pos + 1;
         if(b == 0)
             zero = zero + 1;
         
         if(c<0)
             neg = neg + 1;
         if(c>0)
             pos = pos + 1;
         if(c == 0)
             zero = zero + 1; 
        
         if(d<0)
             neg = neg + 1;
         if(d>0)
             pos = pos + 1;
         if(d == 0)
             zero = zero + 1;
         if(e<0)
             neg = neg + 1;
         if(e>0)
             pos = pos + 1;
         if(e == 0)
             zero = zero + 1;
         
         System.out.printf(" the negative number is %d%n", neg);
         System.out.printf(" the positive number is %d%n", pos);
         System.out.printf(" the zero number is %d%n", zero);
         
        
    }
    
}
>>>>>>> 2a3f2b463ae3e6a75e41fbbc29e7b7231bbbd07e
