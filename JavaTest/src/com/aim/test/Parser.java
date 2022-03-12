package com.aim.test;

import java.io.StringWriter;
import java.io.Writer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Parser {
	private static String pathOPC_TagMap_Mill = "C:\\aim\\220311\\OPC_TagMap_Mill_0.75.xml";
	private static String pathMill_FDCData = "C:\\aim\\220311\\Mill_FDCData.xml";
	
	public static void main(String[] args) {
		try {
			Document document = parse(pathOPC_TagMap_Mill);
			print(document);
			edit(document);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Document parse(String path) throws Exception {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		return builder.parse(path);
	}
	
	private static void print(Document document) throws Exception {
		Transformer former = TransformerFactory.newInstance().newTransformer();
		Writer writer = new StringWriter();
		former.transform(new DOMSource(document), new StreamResult(writer));
		System.out.println(writer.toString());
	}
	
	private static void edit(Document document) {
//		Element root = document.getDocumentElement();
		System.out.println(root);
	}
}
