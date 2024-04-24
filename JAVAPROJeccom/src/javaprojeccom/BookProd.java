/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprojeccom;

public class BookProd extends product 
{
String author;
String publisher;

    public BookProd(String author, String publisher, int prodID, String name, float price) {
        super(prodID, name, price);
        this.author = author;
        this.publisher = publisher;
    }

    public BookProd (int prodID, String name, float price) {
        super(prodID, name, price);
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


}
