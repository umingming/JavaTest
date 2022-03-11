package com.aim.test;

import java.io.StringWriter;
import java.io.Writer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

public class Parser {
	
	public static void main(String[] args) {
		try {
			String path = "C:\\aim\\220311\\Mill_FDCData.xml";
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(path);
			
			Transformer former = TransformerFactory.newInstance().newTransformer();
			Writer out = new StringWriter();
			former.transform(new DOMSource(document), new StreamResult(out));
			System.out.println(out.toString());
			
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
	}
}
