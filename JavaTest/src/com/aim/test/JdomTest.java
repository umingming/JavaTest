package com.parser.jdom;

import java.io.File;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

public class JdomTest {
	private static Document doc;
	public static void main(String[] args) throws Exception {
		String xmlPath = "C:\\Aim\\OPC_TagMap_Mill_0.75.xml";
		String newPath = "C:\\Aim\\Spring\\JavaTest\\OPC_TagMap_Mill_0.76.xml";

		File file = new File(xmlPath);
		
		SAXBuilder builder = new SAXBuilder();
		doc = builder.build(xmlPath);
		
//		Element multiBlock = new Element("MultiBlock")
//									.setAttribute("Name", "MB_EVENT_REPLY_TURNTABLECOILIDREQUEST_APPEND")
//									.setAttribute("Action", "W");
//		Element block = new Element("Block")
//									.setAttribute("Name", "S7_MILL.EQ.Event_Reply_TurnTableCoilIDRequest_APPEND");
//		Element item = new Element("Item")
//									.setAttribute("Name", "S7_MILL.EQ.Event_Reply_TurnTableCoilIDRequest_APPEND")
//									.setAttribute("SyncValue", "true");
//		block.addContent(item);
//		multiBlock.addContent(block);
		
//		multiBlock.setAttribute("Name", "MB_EVENT_REPLY_TURNTABLECOILIDREQUEST_APPEND")
//					.setAttribute("Action", "W");
		
		Element root = doc.getRootElement();
//		System.out.println(root.getChildren().size());
		
		Element element = getChild(root, "BlockMap");
		Element child = getChild(element, "Block", "Name", "CoilRollingDataSendData_M1");
		Element child2 = getChild(child, "Item", "Name", "M1_MILL.EQ.CoilRollingDataSendData_M1_RefCurveIndex");
		child2.setAttribute("Point", "10000");
		
		
//		System.out.println(doc.getRootElement().getChildren().get(2));
//		List<Element> rootList = root.getChildren();
//		
//		for(Element e : rootList) {
//			for(int i=0; i<e.getChildren().size(); i++) {
//				if(e.getChildren().get(i).getName().equals("Block")) {
//					if(e.getChildren().get(i).getAttributeValue("Name").equals("CoilRollingDataSendData_M1")){
//						e.getChildren().get(i).setAttribute("Name", "Hi");
//					}
//				}
//			}
//		}
		
//		System.out.println(blockList.size());
//		List<Element> itemList = root.getChildren("Item");
//		Element item2 = null;
//		for(Element e : blockList) {
//			if(e.getAttribute("Name").equals("CoilRollingDataSendData_M1")) {
//				itemList = e.getChildren("Item");
//				System.out.println(itemList.size());
//				break;
//			}
//		}
//
//		for(Element e : itemList) {
//			if(e.getAttribute("Name").equals("M1_MILL.EQ.CoilRollingDataSendData_M1_RefCurveIndex")) {
//				item2 = e.setAttribute("Point", "10000");
//			}
//		}
//		
//		
//		doc = new Document();
//		doc.setRootElement(root);
		XMLOutputter xout = new XMLOutputter();
//		Format format = xout.getFormat();
//		format.setLineSeparator("\r\n");
//		format.setIndent("\t");
//		format.setTextMode(Format.TextMode.TRIM);
//		xout.setFormat(format);
//		xout.output(doc, new FileOutputStream(xmlNew));
//		xout.output(doc, System.out);
		xout.output(doc, System.out);
	}
	public static Element getChild(Element element, String tag) {
		for(int i=0; i<element.getChildren().size(); i++) {
			if(element.getChildren().get(i).getName().equals(tag)) {
				System.out.println(element.getChildren().get(i));
				return element.getChildren().get(i);
			}
		}
		
		return null;
	}
	
	public static Element getChild(Element e, String tag, String attr, String value) {
		for(int i=0; i<e.getChildren().size(); i++) {
			Element child = e.getChildren().get(i);
			if(child.getName().equals(tag)
					&& child.getAttributeValue(attr).equals(value)) {
				return child;
			}
		}
		
		return null;
	}
}