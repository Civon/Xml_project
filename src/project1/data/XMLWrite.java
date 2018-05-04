/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1.data;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

/**
 *
 * @author Transpar
 */
public class XMLWrite {
	private StringWriter sw ;
	private XMLOutputFactory xof ;
	private XMLStreamWriter xsw ;

	public XMLWrite() throws XMLStreamException {
		sw = new StringWriter();
		xof = XMLOutputFactory.newInstance();
		xsw = xof.createXMLStreamWriter(sw);
	}
        
        
	public void startDoc() throws XMLStreamException{
		xsw.writeStartDocument();
	}

	public void startTag(String tag) throws XMLStreamException{
		xsw.writeStartElement(tag);
		// xsw.writeStartElement(object.getClass().getName());
	}

	public void startTag(String tag, String value) throws XMLStreamException{
		xsw.writeStartElement(tag);
			xsw.writeCharacters(value);		
	}

	public void endTag() throws XMLStreamException{
		xsw.writeEndElement();
	}

	public void closeSave(String filepath) throws XMLStreamException, IOException{
		xsw.writeEndDocument();
		xsw.close();
		
		String xmlStr = sw.getBuffer().toString();
		FileWriter output = new FileWriter(filepath);
		output.write(xmlStr);
		output.close();
		
		sw.close();
	}

}
