/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

/**
 *
 * @author Claude
 */
public class tab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 1 , N;
        System.out.println("N      10*N    100*N     1000*N");
        
        while(i <= 5){
           System.out.printf("%d%8d%10d%12d%n",i,10*i,100*i,1000*i);
        i++;
        }
    }
    
}
