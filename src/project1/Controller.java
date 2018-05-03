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


import org.xml.sax.SAXException;
import project1.data.Dealer;
import project1.data.XMLRead;

/**
 *
 * @author Transpar
 */
public class Controller {
    private final String filepath = "data.xml";
    private XMLRead read;
    
    
    public Controller(){
        
        
    }
    
    public Dealer load() throws ParserConfigurationException, SAXException, IOException{
        SAXParserFactory fact = SAXParserFactory.newInstance();
	    SAXParser saxPar = fact.newSAXParser();
        read = new XMLRead();
        try{
            saxPar.parse(filepath, read);
        }catch (IOException e){
            System.out.println("File NOT found.");
        }
        return read.getDealerData();
    }
    
    public void save(Dealer dealerData){
        
    }
}
