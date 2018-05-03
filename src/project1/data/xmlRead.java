/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1.data;

import java.util.List;
import java.util.jar.Attributes.Name;

import org.xml.sax.SAXException;

// import java.util.Map;

import org.xml.sax.helpers.DefaultHandler;
import project1.data.Dealer;
import project1.data.Needed;

/**
 *
 * @author Transpar
 */
public class xmlRead extends DefaultHandler{
	private String filepath ;
	private Dealer dealerData;
	private Needed tempNeeded;
	private Sold tempSold;
	private Company tempCompany;
	private String tempChar;

	    
//	private Needed aNeeded;
//	private Soled aSoled;
//	private 
	public xmlRead(String filepath){
		this.filepath = filepath;
        dealerData = new Dealer();
		tempNeeded = new Needed();
		tempSold = new Sold();
		tempCompany = new Company();
		tempChar = new String();
		// accumulator = new StringBuffer();
		// fact = SAXParserFactory.newInstance();
		// saxPar = fact.newSAXParser();
                
	}
	      
    public void characters(char[] buffer, int start, int length) {
		tempChar = new String(buffer, start, length);
	}
	
	public void startElement(String uri,String lname, String name, Attributes attributes){
		//	dealerData.neededList.add(new Needed());  protected

		switch (name) {
			case "Company":
				// if
                // dealerData.companyInfo.name = 
				break;
			case "Record":
				if(name == "Needed"){
					String s = new String();
                                        s = dealerData.getName();
//					if (condition) {
//
//					}
				}else{

				}
				break;
			case "Product":

				break;
			
			// default:
			// 	break;
		}
		// if(name.equals("Record")){
		// 	recordList = new List<Record>();
		// }else if(name.equals(""))
	}

	public void endElement(String uri,String lname,String name){
		switch (name) {
			case "Company":
				
				break;
		
			default:
				break;
		}
	}



	// private void checkXmlType(String tagName){
	// 	if(tagName.equals("Sold") ){
	// 		isSoldRecordXml = true;
	// 		isNotChecked = false;
	// 	}else if(tagName.equals("Needed")){
	// 		isSoldRecordXml = false;
	// 		isNotChecked = false;
	// 	}
	// }
}
