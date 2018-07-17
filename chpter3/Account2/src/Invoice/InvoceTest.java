/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Invoice;
import java.util.Scanner;

/**
 *
 * @author Claude
 */
public class InvoceTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Invoice store = new Invoice("welcome","SHOPPNG CLOTHES",3,10);
         System.out.printf("%s balance : %d%n",store.getNum(),store.getQty());
        
        Scanner input = new Scanner(System.in);
        System.out.println("enter qyantity and price");
        int qtity = input.nextInt();
        double price = input.nextDouble();
        System.out.printf(" the invoice amount is %f",store.getInvoice(qtity, price));
        // TODO code application logic here
    }
    
}
