package com.aim.test;

import java.io.FileOutputStream;

import org.jdom2.Document;
import org.jdom2.Element;
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
		자식 태그 중 해당하는 요소를 반환
	 */
	public Element navigate(Element element, String tag, String attr, String value) {
		for(int i=0; i<element.getChildren().size(); i++) {
			Element child = element.getChildren().get(i);
			
			if(child.getName().equals(tag)
					&& child.getAttributeValue(attr).equals(value)) {
				return child;
			}
		}
		return null;
	}
	
	public Element navigate(Element element, String tag) {
		for(int i=0; i<element.getChildren().size(); i++) {
			Element child = element.getChildren().get(i);
			
			if(child.getName().equals(tag)) {
				return child;
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
