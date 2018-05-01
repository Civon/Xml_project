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
public class Company {
	private String name;
	private String contact;
	private String addr;

	public Company(String name, String contact, String addr){
		this.name = name;
		this.contact = contact;
		this.addr = addr;
	}

	public String getName(){
		return name;
	}

	public String getContact(){
		return contact;
	}	

	public String getAddr(){
		return addr;
	}
	
	
}
