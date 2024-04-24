/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprojeccom;


public class ClothingProd extends product 
{
String size;
String fabric;

    public ClothingProd(String size, String fabric, int prodID, String name, float price) {
        super(prodID, name, price);
        this.size = size;
        this.fabric = fabric;
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }


}
