package com.parser.jdom;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jdom2.Comment;
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
 */
public class JdomParser {
	private File file;
	private Document doc;
	private XMLOutputter xout;
	private Logger logger;
	
	public JdomParser() throws Exception {
		parse();
	}
	
	public JdomParser(String path) throws Exception {
		this.file = new File(path);
		this.logger = LogManager.getLogger(XmlParserApplication.class);
		this.xout = new XMLOutputter();
		parse();
	}
	
	/*
		doc를 xml 파싱 값으로 초기화
		파싱하는 시간이 길다,,??
		어떻게 하면 짧아질까?
		-> 다른 라이브러리 사용
	 */
	public void parse() {
		try {
			SAXBuilder builder = new SAXBuilder();
			this.doc = builder.build(file);
			
			logger.info("Success to parse : " + file.getName());
		} catch (Exception e) {
			logger.error("Failure to parse : " + file.getName(), e);
		}
	}
	
	/*
		콘솔에 내용 출력
	 */
	public void print() {
		Format format = xout.getFormat();
		
		format.setLineSeparator("\r\n");
		format.setIndent("\t");
		format.setTextMode(Format.TextMode.TRIM);
		xout.setFormat(format);
		
		try {
			xout.output(doc, System.out);
			logger.info("Success to print : " + file.getName());
		} catch (IOException e) {
			logger.error("Failure to print : " + file.getName(), e);
		}
	}

	/*
		루트 내에서 태그 탐색해 해당하는 요소를 반환
	 */
	public Element navigate(Tag tag) {
		Iterator iter = doc.getDescendants(new ElementFilter(tag.getTag()));
		
		while(iter.hasNext()) {
			Element descendant = (Element) iter.next();
			
			if(descendant.getAttributeValue("Name").equals(tag.getName())) {
				logger.info("Success to navigate : " + tag.getName());
				return descendant;
			} 
		}
		logger.error("Failure to navigate : " + tag.getName());
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
					logger.info("Success to navigate : " + tag.getName());
					return descendant;
				}
			}
		}
<<<<<<< HEAD
		return null;
	}

	
	/*
		자식 태그 중 해당하는 요소를 반환
	 */
	public Element navigate(Element element, String tag) {
		for(int i=0; i<element.getChildren().size(); ++i) {
			Element child = element.getChildren().get(i);
			
			if(child.getName().equals(tag)) {
				return child;
			}
		}
=======
		logger.error("Failure to navigate : " + tag.getName());
>>>>>>> branch 'master' of https://github.com/umingming/JavaTest.git
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
			
			logger.info("Success to copy : " + tag.getName());
			return copy;
		}
		logger.error("Failure to copy : " + tag.getName());
		return null;
	}
	
	/*
		태그 탐색 후 해당 태그를 가진 자식을 생성함.
	 */
	public void createChild(Tag tagParent, Tag tagChild) {
		Element parent = navigate(tagParent);
		
		try {
			Element child = new Element(tagChild.getTag())
					.setAttribute("Name", tagChild.getName());
			parent.addContent(child);
			logger.info("Success to create : " + tagChild.getName());
			
		} catch (Exception e) {
			logger.error("Failure to create : " + tagChild.getName());
		}
	}
	
	/*
		태그 탐색 후 해당 태그를 원하는 속성으로 수정함.
	 */
	public void modify(Tag tag, String attr, String value) {
		Element element = navigate(tag);
		
		try {
			element.setAttribute(attr, value);
			logger.info("Success to modify : " + tag.getName());
			
		} catch (Exception e) {
			logger.error("Filure to modify : " + tag.getName());
		}
	}

	/*
		부모 요소 내에서 태그 탐색해 원하는 속성으로 수정함.
	 */
	public void modify(Element parent, Tag tag, String attr, String value) {
		Element element = navigate(parent, tag);
		
		try {
			element.setAttribute(attr, value);
			logger.info("Success to modify : " + tag.getName());
			
		} catch (Exception e) {
			logger.error("Filure to modify : " + tag.getName());
		}
	}
	
	/*
		부모 요소 내에서 태그 탐색해 주석 처리함.
	 */
	public void toggleComment(Element parent, Tag tag) {
		Element child = navigate(parent, tag);
		
		try {
			Comment comment = new Comment(xout.outputString(child));
			parent.setContent(parent.indexOf(child), comment);
			logger.info("Success to toggle : " + tag.getName());
			
		} catch (Exception e) {
			logger.error("Filure to toggle : " + tag.getName());
		}
	}
	
	/*
		태그를 탐색해 주석 처리함.
	 */
	public void toggleComment(Tag tag) {
		Element child = navigate(tag);
		Element parent = child.getParentElement();
		
		try {
			Comment comment = new Comment(xout.outputString(child));
			parent.setContent(parent.indexOf(child), comment);
			logger.info("Success to toggle : " + tag.getName());
			
		} catch (Exception e) {
			logger.error("Filure to toggle : " + tag.getName());
		}
	}
	
	/*
		태그 탐색해 삭제함.
	 */
	public void delete(Tag tag) {
		Element element = navigate(tag);
		
		try {
			element.getParent().removeContent(element);
			logger.info("Success to delete : " + tag.getName());
			
		} catch (Exception e) {
			logger.error("Filure to delete : " + tag.getName());
		}
	}
	
	/*
		새로운 경로에 저장
	 */
	public void update(String newPath) throws Exception {
		try {
			xout.output(doc, new FileOutputStream(newPath));
			logger.info("Success to update : " + file.getName());
			
		} catch (Exception e) {
			logger.error("Failure to update : " + file.getName());
		}
	}
}
