/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprojeccom;
import java.util.Scanner;
import java.util.Arrays;

public class EccomerceSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ElecProduct p1 = new ElecProduct("samsung",10,1,"phone",1200);
        ClothingProd p2 = new ClothingProd("M","cotton",2,"tshirt",399);
        BookProd p3 = new BookProd("paulo coello", "A24",3,"witch of portobello",295);
        System.out.println("Welcome to Ecommerce system!");
        System.out.println("Please enter your ID: ");
        int id = sc.nextInt();
        System.out.println("Please enter your name: ");
        String name = sc.next();
        System.out.println("Please enter your addres: ");
        String add = sc.next();
        Customer c1 = new Customer(id,name,add);
        System.out.println("How many products do you want to purchase? ");
        int nprod = sc.nextInt();
        Cart t1 = new Cart(id,nprod);
        for (int i = 0 ; i< nprod ; i++){
            System.out.println("which product do you want?");
            System.out.println("1)phone 2)tshirt 3)book");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    t1.addProduct(p1);
                    break;
                    
                case 2:
                    t1.addProduct(p2);
                    break;
                    
                case 3:
                    t1.addProduct(p3);
                    break;
                    
                default:
                    System.out.println("invalid input");
                    break;
            }
            System.out.println("your current total is "+t1.calculateTotalPrice());
            System.out.println("would you like to order?  1)yes  2)no ");
            int order = sc.nextInt();
            switch(order){
                case 1:
                    t1.PlaceOrder();
                    break;
                    
                case 2:
                    break;
                    
                default:
                    System.out.println("invalid input");
            }
        }
                
        
    }
    
}
