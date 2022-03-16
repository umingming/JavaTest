package com.parser.jdom;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.filter.ElementFilter;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import com.parser.XmlParserApplication;

/*
	XML Parser
	- XML 파일 객체화, 내용 출력, 수정
	3. 추가, 삭제, 변경, 주석 처리 등의 메소드
	4. log4j 같은 로깅 시스템 console, file 출력 가능한 것
	5. 파싱 시간이 느리다
	
	=>내일 오후 =>네!
	
	잡을 수 있는 에러는 다 처리해라
	-> NULL -> log 
 */
public class JdomParser {
	private String path;
	private Document doc;
	private XMLOutputter xout;
	private Logger logger;
	
	public JdomParser() throws Exception {
		parse();
	}
	
	public JdomParser(String path) throws Exception {
		this.path = path;
		this.logger = LogManager.getLogger(XmlParserApplication.class);
		parse();
	}
	
	/*
		doc를 xml 파싱 값으로 초기화
		파싱하는 시간이 길다,,??
		어떻게 하면 짧아질까?
	 */
	public void parse() throws Exception {
		SAXBuilder builder = new SAXBuilder();
 		this.doc = builder.build(path); 
	}
	
	/*
		콘솔에 내용 출력
	 */
	public void print() {
		xout = new XMLOutputter();
		Format format = xout.getFormat();
		
		format.setLineSeparator("\r\n");
		format.setIndent("\t");
		format.setTextMode(Format.TextMode.TRIM);
		xout.setFormat(format);
		
		try {
			xout.output(doc, System.out);
			logger.info("success");
		} catch (IOException e) {
			logger.error("Error at print()", e);
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
	public Element navigate(Tag tag) {
		Iterator iter = doc.getDescendants(new ElementFilter(tag.getTag()));
		
		while(iter.hasNext()) {
			Element descendant = (Element) iter.next();
			
			if(descendant.getAttributeValue("Name").equals(tag.getName())) {
				return descendant;
			}
		}
		return null;
	}
	
	/*
		요소 내에서 태그 탐색해 해당하는 요소를 반환함.
	 */
	public Element navigate(Element element, Tag tag) {
		if(element != null) {
			Iterator<Element> iter = element.getDescendants(new ElementFilter(tag.getTag()));
			
			while(iter.hasNext()) {
				Element descendant = (Element) iter.next();
				
				if(descendant.getAttributeValue("Name").equals(tag.getName())) {
					return descendant;
				}
			}
		}
		return null;
	}

	/*
		태그 탐색 후 해당 요소를 카피함.
	 */
	public Element copy(Element element, Tag tag) {
		Element copy = navigate(element, tag).clone();

		if(copy != null) {
			copy.removeContent();
			
			String newVal = copy.getAttributeValue("Name") + "_APPEND";
			copy.setAttribute("Name", newVal);
			
			return copy;
		}
		return null;
	}
	
	/*
		태그 탐색 후 해당 태그를 가진 자식을 생성함.
	 */
	public void createChild(Tag tagParent, Tag tagChild) {
		Element parent = navigate(tagParent);
		
		if(parent != null) {
			Element child = new Element(tagChild.getTag())
								.setAttribute("Name", tagChild.getName());
			parent.addContent(child);
		}
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
