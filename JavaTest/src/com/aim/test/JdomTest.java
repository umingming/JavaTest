package com.aim.test;

import java.io.File;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.XMLOutputter;

public class JdomTest {
	private static Document doc;
	public static void main(String[] args) throws Exception {
		// xml 파일 출력
		String xmlPath = "C:\\aim\\220311\\OPC_TagMap_Mill_0.75.xml"; 
		JdomParser parser = new JdomParser(xmlPath);
		parser.print();
		
		// Item 태그 찾기
		Element root = parser.getRoot();
		Element blockMap = parser.navigate(root, "BlockMap");
		Element block = parser.navigate(blockMap, "Block", "Name", "CoilRollingDataSendData_M1");
		Element item = parser.navigate(block, "Item", "Name", "M1_MILL.EQ.CoilRollingDataSendData_M1_RefCurveIndex");
		
		// Item 태그 수정
		item.setAttribute("Point", "10000");
		
		// Trx 태그 찾기
		Element transaction = parser.navigate(root, "Transaction");
		Element receive = parser.navigate(transaction, "Receive");
		Element trx = parser.navigate(receive, "Trx", "Name", "S7_MILL.EQ.Event_TurnTableCoilIDRequest");
		
		// Trx에 MultiBlock 태그 추가
		String MB_EVENT = "MB_EVENT_REPLY_TURNTABLECOILIDREQUEST_APPEND";
		Element multiBlock = new Element("MultiBlock").setAttribute("Name", MB_EVENT)
													  .setAttribute("Action", "W");
		trx.addContent(multiBlock);
		
		block = new Element("Block")
					.setAttribute("Name", "S7_MILL.EQ.Event_Reply_TurnTableCoilIDRequest_APPEND");
		multiBlock.addContent(block);
		
		item = new Element("Item")
					.setAttribute("Name", "S7_MILL.EQ.Event_Reply_TurnTableCoilIDRequest_APPEND")
					.setAttribute("SyncValue", "true");
		block.addContent(item);

		// 새로운 경로에 저장
		String newPath = "C:\\aim\\220311\\OPC_TagMap_Mill_0.76.xml";
		parser.update(newPath);
	}
}