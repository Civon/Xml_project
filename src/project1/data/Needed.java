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
public class Needed extends Record{
	private Product item;
	private int quantity;

	public Needed(Product item, int quantity){
		this.item = item;
		this.quantity = quantity;
	}

	public int getQuantity(){
		return quantity;
	}

	public	Product getProduct(){
		return item;
	}
}
