/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Invoice;

/**
 *
 * @author Claude
 */
public class Invoice {
    private String num;
    private String desc;
    private int qtity ;
    private double price;
    
    Invoice(String num,String Desc,int qtity,double price){
        this.num = num;
        desc = Desc;
       this.qtity = qtity;
       this.price = price;
        }
    public void setNum(String num){
    this.num = num;
    }
    public String getNum(){
    return num;
    }
     public void setDesc(String Desc){
    this.desc = Desc;
    }
    public String getDesc(){
    return desc;
    }
     public void setQty(int qtity){
    this.qtity = qtity;
    }
    public int getQty(){
    return qtity;
    }
     public void setPrice(double price){
    this.price = price;
    }
    public double getPrice(){
    return price;
    }
    public double getInvoice(int qtity,double price){
        double invoiceAmount;
        if (qtity < 0){
             invoiceAmount = 0;
            
        }
       if (price < 0){
             invoiceAmount = 0.0;
            }
        return invoiceAmount = qtity * price; 
        
    }
}
    
    
    
    

