package com.aim.test;

import java.io.File;
import java.io.FileInputStream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

/*
	xml parser
	- xml 파일 객체화, 내용 출력, 수정
 */
public class XmlParser {
	private String xml;
	private Document document;
	
	public XmlParser(String xml) throws Exception {
		this.xml = xml;
		parse();
	}
	
	/*
		document를 xml 파싱 값으로 초기화
	 */
	public void parse() throws Exception {
		File file = new File(xml);
		FileInputStream stream = new FileInputStream(file);
		document = Jsoup.parse(stream, null, "", Parser.xmlParser());
	}
	
	/*
		파일 콘솔에 출력
	 */
	public void print() {
		System.out.println(document.toString());
	}
	
	/*
		해당 쿼리의 속성을 원하는 값으로 수정
	 */
	public void modifyAttr(String query, String attr, String value) {
		document.select(query)
				.attr(attr, value);
	}
}
