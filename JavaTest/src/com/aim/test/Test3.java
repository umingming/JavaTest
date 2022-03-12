package com.aim.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test3 {
	/*
		xml 값을 변경한 후 새로운 이름으로 저장하는 프로그램
		a. M1_MILL.EQ.CoilRollingDataSendData_M1_RefCurveIndex의 Point 값을 10000으로 변경
		b. Trx name 이 S7_MILL.EQ.Event_TurnTableCoilIDRequest 에 MultiBlock 를 추가
		
		1. OPC~의 경로를 매개로 BufferedReader 생성
		2. 새로운 경로를 매개로 BufferedWriter 생성
		3. String으로 line 변수 선언
		4. while문 line = reader.readLine() != null을 조건으로 사용
			> if line이 a에 해당 되는지?
				> setValue 메소드 호출 후 line에 저장
			> else if line이 b에 해당 되는지?
				> addMultiBlock 메소드 호출 후 line에 저장
			> line을 write 메소드 사용해 저장함.
	 */

	public static void main(String[] args) {
		try {
			String path = "C:\\aim\\220311\\OPC_TagMap_Mill_0.75.xml";
			String newPath = "C:\\aim\\220311\\OPC_TagMap_Mill_0.76.xml";
			BufferedReader reader = new BufferedReader(new FileReader(path));
			BufferedWriter writer = new BufferedWriter(new FileWriter(newPath));
			
			String itemName = "M1_MILL.EQ.CoilRollingDataSendData_M1_RefCurveIndex";
			String trxName = "S7_MILL.EQ.Event_TurnTableCoilIDRequest";
			
			String line = null;
			while((line = reader.readLine()) != null) {
				if (line.contains(itemName)) {
					line = line.replace("Point=\"1\"", "Point=\"10000\"");
				
				} else if (line.contains("Trx Name") && line.contains(trxName)) {
					String multiBlock = "\r\n\t<MultiBlock Name=\"MB_EVENT_REPLY_TURNTABLECOILIDREQUEST_APPEND\" Action=\"W\" >\r\n"
								+ "\t\t<Block Name=\"S7_MILL.EQ.Event_Reply_TurnTableCoilIDRequest_APPEND\">\r\n"
								+ "\t\t\t<Item Name=\"S7_MILL.EQ.Event_Reply_TurnTableCoilIDRequest_APPEND\" SyncValue=\"true\" />\r\n"
								+ "\t\t</Block>\r\n"
								+ "\t</MultiBlock>";
					line += multiBlock;
				}
				
				writer.write(line);
				writer.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
