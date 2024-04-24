/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprojeccom;


public class product 
{
int prodID;
String name;
float price;

    public product(int prodID, String name, float price) {
        this.prodID = prodID;
        this.name = name;
        this.price = price;
    }

    public int getProdID() {
        return prodID;
    }

    public void setProdID(int prodID) {
        if(prodID<=0){
            this.prodID = Math.abs(prodID);
            return;
        }
        this.prodID = prodID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if(price<=0){
            this.price = Math.abs(price);
            return;
        }
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Price: " + price;
    }


}
