package com.parser;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
	private static Logger logger;
	
	static {
		block = new Tag();
		item = new Tag();
		trx = new Tag();
		multiBlock = new Tag();
		blockInTrx = new Tag();
		itemInTrx = new Tag();
		logger = LogManager.getLogger(XmlParserApplication.class);
	}
	
	public static void main(String[] args) {
		try {
			SpringApplication.run(XmlParserApplication.class, args);
			parser = new JdomParser(path);
			String temp = parser.navigate(block).toString();
			System.out.println(temp);
//			modifyAttr();
//			addChild();
//			parser.print();
		} catch (Exception e) {
			logger.error(e);
		}
	}

	private static void addChild() {
		Element eleTrx = parser.navigate(trx);
		
		if(eleTrx != null) {
			Element eleMultiBlock = parser.copy(eleTrx, multiBlock);
			Element eleBlock = parser.copy(eleTrx, blockInTrx);
			Element eleItem = parser.copy(eleTrx, itemInTrx);
			
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
	
	@Value("${new-xml.path}")
	public void setNewPath(String input) {
		newPath = input;
	}

	@Value("${tag.attr.point}")
	public void setAttr(String input) {
		attr = input;
	}
	
	@Value("${block.item.point.value}")
	public void setAttrValue(String input) {
		attrValue = input;
	}

	@Value("${tag.block} ${block.name}")
	public void setBlock(String input) {
		String[] info =  input.split(" ");
		block.setTag(info[0]);
		block.setName(info[1]);
	}
	
	@Value("${tag.item} ${block.item.name}")
	public void setItem(String input) {
		String[] info =  input.split(" ");
		item.setTag(info[0]);
		item.setName(info[1]);
	}

	@Value("${tag.trx} ${trx.name}")
	public void setTrx(String input) {
		String[] info =  input.split(" ");
		trx.setTag(info[0]);
		trx.setName(info[1]);
	}
	
	@Value("${tag.multi-block} ${trx.multi-block.name}")
	public void setMultiBlock(String input) {
		String[] info =  input.split(" ");
		multiBlock.setTag(info[0]);
		multiBlock.setName(info[1]);
	}

	@Value("${tag.block} ${trx.multi-block.block.name}")
	public void setBlockInTrx(String input) {
		String[] info =  input.split(" ");
		blockInTrx.setTag(info[0]);
		blockInTrx.setName(info[1]);
	}
	
	@Value("${tag.item} ${trx.multi-block.block.item.name}")
	public void setItemInTrx(String input) {
		String[] info =  input.split(" ");
		itemInTrx.setTag(info[0]);
		itemInTrx.setName(info[1]);
	}
}
