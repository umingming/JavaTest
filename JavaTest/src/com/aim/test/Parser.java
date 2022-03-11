package com.aim.test;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Parser {
	
	public static void main(String[] args) {
		try {
			String path = "C:\\aim\\220311\\Mill_FDCData.xml";
			list(path);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void list(String path) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(path);
		
		NodeList nlist = document.getElementsByTagName("Item");
		for (int i = 0; i < nlist.getLength(); i++) {
			Node node = nlist.item(i);
			ItemDTO dto = new ItemDTO();

			dto.setName(node.getAttributes().item(0).getTextContent());
			dto.setDeviceCode(node.getAttributes().item(1).getTextContent());
			dto.setPoint(node.getAttributes().item(2).getTextContent());
			
			System.out.println(dto.toString());
		}
	}
}
