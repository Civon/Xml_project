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
public class Record {
    protected Product product;
    protected int quantity;
    
    public Record(){
        this.product = new Product();
        this.quantity = -1;
    }
    
    public Record(Product product , int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public int getQuantity(){
		return quantity;
	}

    public Product getProduct(){
	    return product;
    }

}
