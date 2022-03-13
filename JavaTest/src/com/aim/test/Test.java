package com.aim.test;

public class Test {
	
	public static void main(String[] args) {
		try {
			String xml = "C:\\aim\\220311\\OPC_TagMap_Mill_0.75.xml";
			XmlParser parser = new XmlParser(xml);
			parser.print();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}