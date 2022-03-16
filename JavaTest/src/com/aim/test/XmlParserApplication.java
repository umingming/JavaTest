package com.parser;

import java.io.File;

import org.jdom2.Element;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.parser.jdom.JdomParser;
import com.parser.jdom.Tag;

@SpringBootApplication
public class XmlParserApplication {
	private static String path;
	private static String newPath;
	private static String attr;
	private static String attrValue;
	
	private static Tag block;
	private static Tag item;
	private static Tag trx;
	private static Tag multiBlock;
	private static Tag blockInTrx;
	private static Tag itemInTrx;
	
	private static JdomParser parser;
	
	static {
		block = new Tag();
		item = new Tag();
		trx = new Tag();
		multiBlock = new Tag();
		blockInTrx = new Tag();
		itemInTrx = new Tag();
	}
	
	public static void main(String[] args) {
		try {
			SpringApplication.run(XmlParserApplication.class, args);
			
			if(new File(path).exists()) {
				parser = new JdomParser(path);
				
				modifyAttr();
				
				addChild();
			
				parser.print();
			}
		} catch (Exception e) {
		}
	}

	private static void addChild() {
		Element eleTrx = parser.navigate(trx);
		
		if(eleTrx != null) {
			Element eleMultiBlock = parser.copy(eleTrx, multiBlock);
			Element eleBlock = parser.copy(eleTrx, block);
			Element eleItem = parser.copy(eleTrx, item);
			
			// Trx에 MultiBlock 추가
			eleTrx.addContent(eleMultiBlock);
			eleMultiBlock.addContent(eleBlock);
			eleBlock.addContent(eleItem);
		}
	}

	private static void modifyAttr() {
		Element eleBlock = parser.navigate(block); 
		Element eleItem = parser.navigate(eleBlock, item);
		
		if(eleItem != null) {
			eleItem.setAttribute(attr, attrValue);
		}
	}

	@Value("${xml.path}")
	public void setPath(String input) {
		path = input;
	}

	@Value("${tag.attr.point}")
	public void setAttr(String input) {
		attr = input;
	}
	
	@Value("${tag.attr.point.value}")
	public void setAttrValue(String input) {
		attrValue = input;
	}

	@Value("${tag.block} ${tag.block.name}")
	public void setBlock(String input) {
		String[] info =  input.split(" ");
		block.setTag(info[0]);
		block.setName(info[1]);
	}
	
	@Value("${tag.item} ${tag.item.name}")
	public void setItem(String input) {
		String[] info =  input.split(" ");
		item.setTag(info[0]);
		item.setName(info[1]);
	}
}
