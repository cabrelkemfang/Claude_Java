/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package making_diff2;

/**
 *
 * @author Claude
 */
public class heartRateTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HeartRates person = new HeartRates("Kamaha","Claude",24,05,1997);
        
        person.Displaydate();
        
        System.out.printf("%s%n",person.getlastname());
        
         System.out.printf("%s%n",person.getname());
        
        System.out.printf("%d%n", person.age());
        
         System.out.printf("%d%n",person.maxheartRate());
        
         System.out.printf("%.2f%n",person.target());
                
        // TODO code application logic here
    }
    
}
