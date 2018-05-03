/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1.data;


/**
 *
 * @author Transpar
 */
public class Product {
    private String ID;
    private String item;
    private String brand;    
    double price;
    
    //constructor?
    // public Product(){
    //     Product product = new Product(); xxxxxxxxxxxxxxxxx   
    // }


    public Product(String ID, String item, String brand, double price){
        this.ID = ID;
        this.item = item;
        this.brand = brand;
        this.price = price;
    }

    Product() {
        ID = "null";
        item = "null";
        brand = "null";
        price = 0.0;
    }

    public double getPrice(){
        return price;
    }
    
    public String getItem(){
        return item;
    }
 
    public String getBrand(){
        return brand;
    }
    // public void changePrice(double price){
    //     this.price = price;
    // }

    // public void toXML(){

    // }

    // public void toValue(){

    // }
}
