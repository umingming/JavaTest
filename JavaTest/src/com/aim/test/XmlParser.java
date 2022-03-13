package com.aim.test;

import java.io.File;
import java.io.FileInputStream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

public class XmlParser {
	private String xml;
	private Document document;
	
	public XmlParser(String xml) throws Exception {
		this.xml = xml;
		parse();
	}

	public void parse() throws Exception {
		File file = new File(xml);
		FileInputStream stream = new FileInputStream(file);
		document = Jsoup.parse(stream, null, "", Parser.xmlParser());
	}
	
	public void print() {
		System.out.println(document.toString());
	}
	
	public void modifyAttr(String query, String attr, String value) {
		document.select(query)
				.attr(attr, value);
	}
}
