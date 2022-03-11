package com.aim.test;

import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
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

				dto.setName(node.getChildNodes().item(0).getTextContent());
				dto.setDeviceCode(node.getChildNodes().item(1).getTextContent());
				dto.setPoint(node.getChildNodes().item(2).getTextContent());
				list.add(dto);
			}
			
			return list;
//			Element root = document.getDocumentElement();
//			NodeList children = root.getChildNodes();
//			
//			System.out.println(root.getNodeName());
//			
//			for(int i=0; i<children.getLength(); i++) {
//				Node node = children.item(i);
//				if(node.getNodeType() == Node.ELEMENT_NODE) {
//					Element ele = (Element)node;
//					String nodeName = ele.getNodeName();
//					System.out.println("node name: " + nodeName);
//				}
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
