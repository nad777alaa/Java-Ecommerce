/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprojeccom;
import java.util.Arrays;

public class order 
{
int CustomerID;
int OrderID;
product[] products;
float totalPrice;

    public order(int CustomerID, int OrderID, product[] products, float totalPrice) {
        this.CustomerID = CustomerID;
        this.OrderID = OrderID;
        this.products = products;
        this.totalPrice = totalPrice;
    }

    
    public void printOrderInfo (){
        System.out.println("here is your order summary: \norderID: "+OrderID+"\ncustomerID: "+CustomerID+"\nproducts: "+Arrays.toString(products));
        
    }
    
    public void printProducts(){
        for(int i = 0 ; i<products.length ; i++){
            System.out.println(products[i].getName()+" "+products[i].getPrice());
        }
    }


     
}
