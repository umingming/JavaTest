package com.aim.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

public class XmlParser {
	private String xml;
	private Document document;
	
	public XmlParser(String xml) {
		this.xml = xml;
	}

	public void parse() throws Exception {
		File file = new File(xml);
		FileInputStream stream = new FileInputStream(file);
		document = Jsoup.parse(stream, null, "", Parser.xmlParser());
	}
	
	public void modifyAttr(String query, String attr, String value) {
		document.select(query)
				.attr(attr, value);
	}
	
	public void addChild
	
	
	
	
	
	
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
