/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprojeccom;

public class ElecProduct extends product
{
    String brand;
    int warrantyPeriod;

    public ElecProduct(String brand, int warrantyPeriod, int prodID, String name, float price) {
        super(prodID, name, price);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        if(warrantyPeriod<=0){
            this.warrantyPeriod = Math.abs(warrantyPeriod);
            return;
        }
        this.warrantyPeriod = warrantyPeriod;
    }    
}
