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
public class largest {
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     int a,b,c,d,e;
     System.out.println("enter five numbers");
     a = input.nextInt();
     b = input.nextInt();
     c = input.nextInt();
     d = input.nextInt();
     e = input.nextInt();
     if(a>b)
         if(a>c)
             if(a>d)
                 if (a>e)
                     System.out.printf("%d",a);
    else if(b>a)
             if(b>c)
                 if (b>d)
                     if(b>e)
                         System.out.printf("%d",b);
    else if (c > d)
         if(c>e)
              System.out.printf("%d",c);
    else if(d>e)
          System.out.printf("%d",d);
     else
          System.out.printf("%d",e);        
     
        
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
public class largest {
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     int a,b,c,d,e;
     System.out.println("enter five numbers");
     a = input.nextInt();
     b = input.nextInt();
     c = input.nextInt();
     d = input.nextInt();
     e = input.nextInt();
     if(a>b)
         if(a>c)
             if(a>d)
                 if (a>e)
                     System.out.printf("%d",a);
    else if(b>a)
             if(b>c)
                 if (b>d)
                     if(b>e)
                         System.out.printf("%d",b);
    else if (c > d)
         if(c>e)
              System.out.printf("%d",c);
    else if(d>e)
          System.out.printf("%d",d);
     else
          System.out.printf("%d",e);        
     
        
    }
    
}
>>>>>>> 2a3f2b463ae3e6a75e41fbbc29e7b7231bbbd07e
