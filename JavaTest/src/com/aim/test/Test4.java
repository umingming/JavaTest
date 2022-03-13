package com.aim.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

public class Test4 {
	private static String pathOPC_TagMap_Mill;
	private static Document document;
	
	public static void main(String[] args) {
		try {
			pathOPC_TagMap_Mill = "C:\\aim\\220311\\OPC_TagMap_Mill_0.75.xml"; 
			document = parse(pathOPC_TagMap_Mill);

			String blockName = "CoilRollingDataSendData_M1";
			String itemName = "M1_MILL.EQ.CoilRollingDataSendData_M1_RefCurveIndex";
			String attribute = "Point";
			String value = "10000";
			
			document.select(String.format("Block[Name=%s] Item[Name=%s]", blockName, itemName)).attr(attribute, value);
			
//			System.out.println(document.toString());
			setValue();
			
			
			document.select("Block[Name=CoilRollingDataSendData_M1] Item[Name=M1_MILL.EQ.CoilRollingDataSendData_M1_RefCurveIndex]").attr("Point", "10000");
//			Element element = document.createElement("hi");
//			Element element = new Element("hidddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
			Element element = document.select("Trx[Name=S7_MILL.EQ.Event_TurnTableCoilIDRequest]").first();
//										.createElement("hi");
			element.appendElement("MultiBlock").attr("Name","MB_EVENT_REPLY_TURNTABLECOILIDREQUEST").attr("blahblakc","i don't know");
//			document.select("Trx[Name=S7_MILL.EQ.Event_TurnTableCoilIDRequest]").first().insertChildren(0, element);
			System.out.println(element.toString());
//			System.out.println(document.html());
//			Element element = doc;
//			document.select("Trx[Name=S7_MILL.EQ.Event_TurnTableCoilIDRequest]").append(element);
//			System.out.println(document.toString());
//			Element element = document.select("Trx[Name=S7_MILL.EQ.Event_TurnTableCoilIDRequest] MultiBlock[Name=MB_EVENT_REPLY_TURNTABLECOILIDREQUEST]").get(0).appendElement("MultiBlock");
			Element elements = document.select("Trx[Name=S7_MILL.EQ.Event_TurnTableCoilIDRequest]").first();
//			Elements elements2 = elements.select("MultiBlock[Name=MB_EVENT_REPLY_TURNTABLECOILIDREQUEST]").get(0).children();
//			elements = elements.appendChild(element);
//			System.out.println(elements.toString());
//			document.select("Trx[Name=S7_MILL.EQ.Event_TurnTableCoilIDRequest]")
//					.append(element.toString());
//			System.out.println(document);
			
//			System.out.println(element.toString());
//			element = element.appendElement("Multiblock");
			
			
//					.append("MultiBlock");
			
//			System.out.println(document.toString());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void setValue() {
		String blockName = "CoilRollingDataSendData_M1";
		String itemName = "M1_MILL.EQ.CoilRollingDataSendData_M1_RefCurveIndex";
		
	}

	private static Document parse(String path) throws Exception {
		File file = new File(path);
		FileInputStream stream = new FileInputStream(file);
		return Jsoup.parse(stream, null, "", Parser.xmlParser());
	}
}