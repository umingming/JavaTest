package com.aim.test;

import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ItemDAO {
	
	public ArrayList<ItemDTO> list() {
		try {
			String path = "C:\\aim\\220311\\Mill_FDCData.xml";
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(path);
			
			ArrayList<ItemDTO> list = new ArrayList<>();
			NodeList nlist = document.getElementsByTagName("Item");

			for (int i = 0; i < nlist.getLength(); i++) {
				Node node = nlist.item(i);
				ItemDTO dto = new ItemDTO();

				dto.setName(node.getAttributes().item(0).getTextContent());
				dto.setDeviceCode(node.getAttributes().item(1).getTextContent());
				dto.setPoint(node.getAttributes().item(2).getTextContent());
				list.add(dto);
				
				System.out.println(dto.toString());
			}
			
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
