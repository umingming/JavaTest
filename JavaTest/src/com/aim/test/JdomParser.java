package com.parser.jdom2;

import java.io.FileOutputStream;
import java.util.Iterator;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.filter.ElementFilter;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/*
	XML Parser
	- XML 파일 객체화, 내용 출력, 수정
 */
public class JdomParser {
	private String xmlPath;
	private Document doc;
	private XMLOutputter xout; 
	
	public JdomParser(String xmlPath) throws Exception {
		this.xmlPath = xmlPath;
		parse();
	}
	
	/*
		doc를 xml 파싱 값으로 초기화
	 */
	public void parse() throws Exception {
		SAXBuilder builder = new SAXBuilder();
		this.doc = builder.build(xmlPath);
	}
	
	/*
		콘솔에 내용 출력
	 */
	public void print() throws Exception {
		xout = new XMLOutputter();
		Format format = xout.getFormat();
		
		format.setLineSeparator("\r\n");
		format.setIndent("\t");
		format.setTextMode(Format.TextMode.TRIM);
		xout.setFormat(format);
		
		xout.output(doc, System.out);
	}

	/*
		Root를 반환
	 */
	public Element getRoot() {
		return doc.getRootElement();
	}
	
	/*
		루트 내에서 태그 탐색해 해당하는 요소를 반환
	 */
	public Element navigate(String tag, String attr, String value) {
		Iterator iter = doc.getDescendants(new ElementFilter(tag));
		
		while(iter.hasNext()) {
			Element descendant = (Element) iter.next();
			
			if(descendant.getAttributeValue(attr).equals(value)) {
				return descendant;
			}
		}
		return null;
	}
	
	/*
		요소 내에서 태그 탐색해 해당하는 요소를 반환함.
	 */
	public Element navigate(Element element, String tag, String attr, String value) {
		Iterator iter = element.getDescendants(new ElementFilter(tag));
		
		while(iter.hasNext()) {
			Element descendant = (Element) iter.next();
			
			if(descendant.getAttributeValue(attr).equals(value)) {
				return descendant;
			}
		}
		return null;
	}
	
	/*
		새로운 경로에 저장
	 */
	public void update(String newPath) throws Exception {
		xout.output(doc, new FileOutputStream(newPath));
	}
}
