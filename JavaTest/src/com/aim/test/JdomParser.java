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
	1. 밸리데이션
	2. config; 파일의 위치, 저장명, 태그, 속성, value, 추가할 경우의 element 제거 -> 변수 빼기
	3. 추가, 삭제, 변경, 주석 처리 등의 메소드
	4. log4j 같은 로깅 시스템 console, file 출력 가능한 것
	5. 파싱 시간이 느리다
	
	=>내일 오후 =>네!
	
	잡을 수 있는 에러는 다 처리해라
	-> NULL -> log 
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
		파싱하는 시간이 길다,,??
		어떻게 하면 짧아질까?
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
		
		if(doc != null) {
			xout.output(doc, System.out);
		}
	}

	/*
		Root를 반환
	 */
	public Element getRoot() {
		if(doc != null) {
			return doc.getRootElement();
		}
		return null;
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
		if(element != null) {
			Iterator<Element> iter = element.getDescendants(new ElementFilter(tag));
			
			while(iter.hasNext()) {
				Element descendant = (Element) iter.next();
				
				if(descendant.getAttributeValue(attr).equals(value)) {
					return descendant;
				}
			}
		}
		return null;
	}
	
	public Element copy(Element element, String tag, String attr, String value) {
		Element copy = navigate(element, tag, attr, value).clone();

		if(copy != null) {
			copy.removeContent();
			
			String newVal = copy.getAttributeValue(attr) + "_APPEND";
			copy.setAttribute(attr, newVal);
			return copy;
		}
		return null;
	}
	
	/*
		새로운 경로에 저장
	 */
	public void update(String newPath) throws Exception {
		if(doc != null) {
			xout.output(doc, new FileOutputStream(newPath));
		}
	}
}
