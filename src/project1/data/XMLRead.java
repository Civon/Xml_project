/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1.data;

import java.util.List;
//import java.util.jar.Attributes.Name;

//import com.sun.corba.se.pept.transport.ContactInfo;
import org.xml.sax.Attributes;

import org.xml.sax.SAXException;

// import java.util.Map;

import org.xml.sax.helpers.DefaultHandler;
import project1.data.Dealer;
import project1.data.Needed;

/**
 *
 * @author Transpar
 */
public class XMLRead extends DefaultHandler{
    //exactly is handler  restruct later
//	private String filepath ;
	private Dealer dealerData;
	// private Needed tempNeeded;
	// private Sold tempSold;
	private Record tempRecord;
	private Company tempCompany;
	private String tempChar;

	    
//	private Needed aNeeded;
//	private Soled aSoled;
//	private 
	public XMLRead(){
//		this.filepath = filepath;
		dealerData = new Dealer();
		
		// tempNeeded = new Needed();
		// tempSold = new Sold();
		// tempChar = new String();
		// accumulator = new StringBuffer();
		// fact = SAXParserFactory.newInstance();
		// saxPar = fact.newSAXParser();
		
	}
	public Dealer getDealerData(){
		return dealerData;
	}
    public void characters(char[] buffer, int start, int length) {
		tempChar = new String(buffer, start, length);
	}
	
	public void startElement(String uri,String lname, String name, Attributes attributes){
		//	dealerData.neededList.add(new Needed());  protected
		switch (name) {
			case "Company":
			// tempCompany = new Company();
			
			break;
			case "Sold": case "Needed":
				tempRecord = new Record();
				break;
			case "Product":
				// do nothing 
				break;
			default:
				System.out.println("xml Unexpect tag:"+ name);
				break;
		}
		// if(name.equals("Record")){
		// 	recordList = new List<Record>();
		// }else if(name.equals(""))
	}

	public void endElement(String uri,String lname,String name){
		switch (name) {
			case "Company":
				break;
				case "name":
					dealerData.companyInfo.name = tempChar;
					break;
				case "contact":
					dealerData.companyInfo.contact = tempChar;
					break;
				case "addr":
					dealerData.companyInfo.addr = tempChar;
					break;
				
			case "Sold": case "Needed":
					if(name == "Sold")
						dealerData.addSold((Sold)tempRecord);
					else
						dealerData.addNeeded((Needed)tempRecord);						
					break;
				case "Product":
					// tempRecord.product = 
					break;
					case "item":
						tempRecord.product.item = tempChar;
						break;
					case "price":
						tempRecord.product.price = Double.parseDouble(tempChar);
						break;
					case "ID":
						tempRecord.product.ID = tempChar;
						break;
					case "brand": 
						tempRecord.product.brand = tempChar;
						break;
				case "quantity":
					tempRecord.quantity = Integer.parseInt(tempChar);
					break;
				
			default:
				System.out.println("xml Unexpect tag:"+ name);
				break;
		}
	}

}
