package com.aim.test;

import java.io.File;
import java.io.FileInputStream;

import org.jdom2.Document;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.DOMOutputter;
import org.jdom2.output.XMLOutputter;

public class JdomTest {
	public static void main(String[] args) throws Exception {
		String xml = "C:\\aim\\220311\\OPC_TagMap_Mill_0.75.xml";
		String xmlNew = "C:\\aim\\220311\\OPC_TagMap_Mill_0.76.xml";
		
		SAXBuilder builder = new SAXBuilder();
		Document doc = builder.build(xml);
		
		XMLOutputter xout = new XMLOutputter();
		xout.output(doc, System.out);
	}
}
