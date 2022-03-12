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
			
			
			document.select("Block[Name=CoilRollingDataSendData_M1] Item[Name=M1_MILL.EQ.CoilRollingDataSendData_M1_RefCurveIndex]").attr("Point", "10000");
			
			System.out.println(document.toString());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}