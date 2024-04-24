/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprojeccom;


public class Cart 
{
int CustomerID;
int nProducts;
int i = 0;
product[] products;

    public Cart() {
    }

 
public Cart(int customerId, int nProducts) {
        this.CustomerID = Math.abs(customerId);
        this.nProducts = Math.abs(nProducts);
        products = new product[nProducts];
}
        
    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int CustomerID) {
        if(CustomerID<=0){
            this.CustomerID = Math.abs(CustomerID);
            return;
        }
        this.CustomerID = CustomerID;
    }

    public int getnProducts() {
        return nProducts;
    }

    public void setnProducts(int nProducts) {
        if(nProducts<=0){
            this.nProducts = Math.abs(nProducts);
            return;
        }
        this.nProducts = nProducts;
    }

    public product[] getProducts() {
         return products;
        
    }

   public void setProducts(product[] products) {
        this.products = products;
    }
    
    public void addProduct(product element) {
       products[i]=element;
       i++;
    }
    
  public float calculateTotalPrice() {
        float totalPrice = 0;
        for (product product : products) {
            if (product != null) {
                totalPrice += product.getPrice();
            }
        }
        return totalPrice;
    }
    
 public void PlaceOrder(){
        order ord = new order( CustomerID , 123 , products, calculateTotalPrice());
        ord.printOrderInfo();
    }

     public void printProducts(){
        for(int i = 0 ; i<products.length ; i++){
            System.out.println(products[i].getName()+" "+products[i].getPrice());
        }

}
}
