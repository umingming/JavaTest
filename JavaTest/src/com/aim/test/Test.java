package com.aim.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

public class Test {
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
			
			System.out.println(document.toString());
			setValue();
			
			
//			document.select("Block[Name=CoilRollingDataSendData_M1] Item[Name=M1_MILL.EQ.CoilRollingDataSendData_M1_RefCurveIndex]").attr("Point", "10000");
//			Elements elements = document.select("Trx[Name=S7_MILL.EQ.Event_TurnTableCoilIDRequest]");
//			Elements elements2 = elements.select("MultiBlock[Name=MB_EVENT_REPLY_TURNTABLECOILIDREQUEST]").get(0).children();
//			element = element.append("MultiBlock");
//			System.out.println(elements2.toString());
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