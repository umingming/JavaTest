package com.parser.jdom2;


import org.jdom2.Element;
import org.w3c.dom.NodeList;

public class Test {
	
	public static void main(String[] args) {
		try {
			// xml 파일 객체화 후 출력
			String xmlPath = "C:\\Aim\\Spring\\JavaTest\\OPC_TagMap_Mill_0.75.xml";
			JdomParser parser = new JdomParser(xmlPath);
			parser.print();
			
			// Item 태그 찾기
			Element block = parser.navigate("Block", "Name", "CoilRollingDataSendData_M1");
			Element item = parser.navigate(block, "Item", "Name", "M1_MILL.EQ.CoilRollingDataSendData_M1_RefCurveIndex");
			
			// Item의 Point 속성 변경
			item.setAttribute("Point", "100000000");
			
			// Trx 태그 찾기
			Element trx = parser.navigate("Trx", "Name", "S7_MILL.EQ.Event_TurnTableCoilIDRequest");
			
			// Trx에 MultiBlock 추가
			Element multiBlock = new Element("MultiBlock")
						.setAttribute("Name", "MB_EVENT_REPLY_TURNTABLECOILIDREQUEST_APPEND")
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
			String newPath = "C:\\Aim\\OPC_TagMap_MILL_0.76_modify2.xml";
			parser.update(newPath);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
