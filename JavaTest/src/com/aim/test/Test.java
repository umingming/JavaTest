package com.aim.test;

import org.jsoup.nodes.Element;

public class Test {
	
	public static void main(String[] args) {
		try {
			String xml = "C:\\Aim\\Spring\\JavaTest\\OPC_TagMap_Mill_0.75.xml";
			XmlParser parser = new XmlParser(xml);
			
//			parser.print();
			
			String query = String.format("Block[Name=%s] Item[Name=%s]"
										, "CoilRollingDataSendData_M1"
										, "M1_MILL.EQ.CoilRollingDataSendData_M1_RefCurveIndex");
			String attribute = "Point";
			String value = "10000";
			
			parser.modifyAttr(query, attribute, value);
			
			Element element = new Element("MultiBlock")
									.attr("Name", "MB_EVENT_REPLY_TURNTABLECOILIDREQUEST_APPEND")
									.attr("Action", "W");
			element.append("<Block>");
			System.out.println(element.toString());
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
