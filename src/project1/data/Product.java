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
    public String ID;
    public String name;
    public String brand;    
    public double price;
    
    //constructor?
    // public Product(){}


    public Product(String ID, String name, String brand, double price){
        this.ID = ID;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public double getPrice(){
        return price;
    }
    
    public String getName(){
        return name;
    }
 
    // public void changePrice(double price){
    //     this.price = price;
    // }

    public void toXML(){

    }

    public void toValue(){

    }
}
