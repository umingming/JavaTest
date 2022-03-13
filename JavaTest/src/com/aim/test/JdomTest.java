package com.aim.test;

import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class JdomTest {
	public static void main(String[] args) throws Exception {
		String xml = "C:\\aim\\220311\\OPC_TagMap_Mill_0.75.xml";
		String xmlNew = "C:\\aim\\220311\\OPC_TagMap_Mill_0.77.xml";
		
		SAXBuilder builder = new SAXBuilder();
		Document doc = builder.build(xml);
		
		Element multiBlock = new Element("MultiBlock")
									.setAttribute("Name", "MB_EVENT_REPLY_TURNTABLECOILIDREQUEST_APPEND")
									.setAttribute("Action", "W");
		Element block = new Element("Block")
									.setAttribute("Name", "S7_MILL.EQ.Event_Reply_TurnTableCoilIDRequest_APPEND");
		Element item = new Element("Item")
									.setAttribute("Name", "S7_MILL.EQ.Event_Reply_TurnTableCoilIDRequest_APPEND")
									.setAttribute("SyncValue", "true");
		block.addContent(item);
		multiBlock.addContent(block);
		
//		multiBlock.setAttribute("Name", "MB_EVENT_REPLY_TURNTABLECOILIDREQUEST_APPEND")
//					.setAttribute("Action", "W");
		
		Element root = doc.getRootElement();
		List<Element> blockList = root.getChildren("Block");
		Element block2;
		for(Element e : blockList) {
			if(e.getAttribute("Name").equals("CoilRollingDataSendData_M1")) {
				break;
			}
		}
		
		
		
//		doc = new Document();
		doc.setRootElement(multiBlock);
		XMLOutputter xout = new XMLOutputter();
		Format format = xout.getFormat();
		format.setLineSeparator("\r\n");
		format.setIndent("\t");
		format.setTextMode(Format.TextMode.TRIM);
		xout.setFormat(format);
//		xout.output(doc, new FileOutputStream(xmlNew));
//		xout.output(doc, System.out);
		xout.output(multiBlock, System.out);
	}
}
