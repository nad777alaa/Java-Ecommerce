/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprojeccom;


public class Customer 
{
int CustomerID;
String name;
String address;

    public Customer(int CustomerID, String name, String address) {
        this.CustomerID = CustomerID;
        this.name = name;
        this.address = address;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    
}
