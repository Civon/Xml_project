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
	protected String name;
	protected String contact;
	protected String addr;

	public Company (){
		name = new String();
		contact = new String();
		addr = new String();
	}
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
