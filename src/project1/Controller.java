/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLStreamException;


import org.xml.sax.SAXException;
import project1.data.Dealer;
import project1.data.Needed;
import project1.data.Sold;
import project1.data.XMLRead;
import project1.data.XMLWrite;

/**
 *
 * @author Transpar
 */
public class Controller {
//    private  final String filepath = "data.xml";
//    private XMLRead read;
    
    
    public Controller(){
        
        
    }
    
    public static  Dealer load() throws ParserConfigurationException, SAXException, IOException{
 String filepath = "data.xml";
        SAXParserFactory fact = SAXParserFactory.newInstance();
	    SAXParser saxPar = fact.newSAXParser();
        XMLRead read = new XMLRead();
        try{
            saxPar.parse(filepath, read);
        }catch (IOException e){
            System.out.println("File NOT found.");
        }
        return read.getDealerData();
    }
    
    public static void save(Dealer dealerData) throws XMLStreamException{
        XMLWrite x = new XMLWrite();
        x.startDoc();
            x.startTag("Data");
                x.startTag("Company");
                    x.startTag("name",dealerData.getName());
                    x.endTag();
                    x.startTag("contact");
                    x.endTag() ;
                    x.startTag("addr");
                    x.endTag() ;
                x.endTag() ;
                x.startTag("Needed");
                
//                for (int i = 0; i < dealerData.getNeededList().size(); i++)
//                        {
//                           Needed a = (Needed) dealerData.getNeededList().get(i);
//                           x.startTag("Product");
//                            x.startTag("item", a.getProduct().getItem());
//                            x.endTag() ;
//                            x.startTag("price", String.valueOf(a.getProduct().getPrice()));
//                            x.endTag() ;                            
//                            x.startTag("Brand", a.getProduct().getBrand());
//                            x.endTag() ;
//                        x.endTag() ;
//                        x.startTag("quantity",   String.valueOf(a.getQuantity()));
//                        x.endTag() ;
//                        }
//                    
                    for(Needed n : dealerData.getNeededList()){
                        Needed a = (Needed) n;
                        
                        x.startTag("Product");
                            x.startTag("item", a.getProduct().getItem());
                            x.endTag() ;
                            x.startTag("price", String.valueOf(a.getProduct().getPrice()));
                            x.endTag() ;                            
                            x.startTag("Brand", a.getProduct().getBrand());
                            x.endTag() ;
                        x.endTag() ;
                        x.startTag("quantity",   String.valueOf(a.getQuantity()));
                        x.endTag() ;
                    }
                x.endTag();
                x.startTag("Sold");
                    for(Object n : dealerData.getSoldList()){
                        Sold a = (Sold) n;
                        
                        x.startTag("Product");
                            x.startTag("item", a.getProduct().getItem());
                            x.endTag() ;
                            x.startTag("price",  String.valueOf(a.getProduct().getPrice()));
                            x.endTag() ;                            
                            x.startTag("Brand", a.getProduct().getBrand());
                            x.endTag() ;
                        x.endTag() ;
                        x.startTag("quantity", String.valueOf(a.getQuantity()));
                        x.endTag() ;
                    }
    }
}
