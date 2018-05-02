/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1.data;

import java.util.List;

// import java.util.Map;

import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Transpar
 */
public class xmlRead extends DefaultHandler{
	private String filepath ;
	// private boolean isSoldRecordXml;
	// private boolean isNotChecked;
	// private List<Record> recordList ;
	// private Map<int, Object> formtype = {}
	// private final Enum formtype = {};


	public xmlRead(String filepath){
		this.filepath = filepath;
		// isNotChecked = 1;
		// accumulator = new StringBuffer();
		// fact = SAXParserFactory.newInstance();
		// saxPar = fact.newSAXParser();
	}
	      
    public void characters(char[] buffer, int start, int length) {
		
		// return new String(buffer, start, length);
	}
	
	public void startElement(String uri,String lname, String name, Attributes attributes){

		switch (name) {
			case "Company":
				
				break;
			case "Record":
				if(name == "Needed"){
					
					if (condition) {
						
					}
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
