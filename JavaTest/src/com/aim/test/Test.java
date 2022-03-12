package com.aim.test;

import java.io.File;
import java.io.FileInputStream;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

public class Test {
	private static String pathOPC_TagMap_Mill = "C:\\aim\\220311\\OPC_TagMap_Mill_0.75.xml";
	
	public static void main(String[] args) {
		try {
			File file = new File(pathOPC_TagMap_Mill);
			FileInputStream stream = new FileInputStream(file);
			Document document = Jsoup.parse(stream, null, "", Parser.xmlParser());
//			System.out.println(document.toString());
			
			document.select("Item[Name=M1_MILL.EQ.CoilRollingDataSendData_M1_RefCurveIndex]").attr("Point", "10000");
//			Elements element = document.select("Item[Name=M1_MILL.EQ.CoilRollingDataSendData_M1_RefCurveIndex]");
//			element.attr("Point", "10000");
			
//			
//			System.out.println(element.toString());
			System.out.println(document.toString());
			
			
//			Elements contents = document.select("item[Name=M1_MILL.EQ.CoilRollingDataSendData_M1_RefCurveIndex]");
//			String text = contents.text();
//			System.out.println(text);
					
//			Elements body = Jsoup.connect(pathOPC_TagMap_Mill).get().select("M1_MILL.EQ.CoilRollingDataSendData_M1_RefCurveIndex");
//			System.out.println(body.toString());
			
//			Document document = parse(pathOPC_TagMap_Mill);
//			print(document);
//			edit(document);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	private static Document parse(String path) throws Exception {
//		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//		DocumentBuilder builder = factory.newDocumentBuilder();
//		return builder.parse(path);
//	}
//	
//	private static void print(Document document) throws Exception {
//		Transformer former = TransformerFactory.newInstance().newTransformer();
//		Writer writer = new StringWriter();
//		former.transform(new DOMSource(document), new StreamResult(writer));
//		System.out.println(writer.toString());
//	}
//	
//	private static void edit(Document document) {
////		Element root = document.getDocumentElement();
//		System.out.println(root);
//	}
}