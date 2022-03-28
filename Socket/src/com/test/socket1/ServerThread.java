package com.test.socket1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ServerThread extends Thread {
	private Socket clientSocket = null;
	private DataInputStream dis = null;
	private DataOutputStream dos = null;
	
	private Map<String, DataOutputStream> clientMap;
	private String clientKey = "";
	private String nickName = "";
	
	public ServerThread(Socket clientSocket, Map<String, DataOutputStream> clientMap) {
		this.clientSocket = clientSocket;
		this.clientMap = clientMap;
	}
	
	@Override
	public void run() {
		try {
			dis = new DataInputStream(clientSocket.getInputStream());
			
			nickName = dis.readUTF();
			clientKey = nickName +clientSocket.getInetAddress().toString();
			
			dos = new DataOutputStream(clientSocket.getOutputStream());
			clientMap.put(clientKey, dos);
			
			System.out.println(clientSocket + "[" + nickName + "] 님 접속");
			
			String msg = "";
			while (msg.toLowerCase().equals("exit")) {
				msg = dis.readUTF();
				sendBoardCast("["+nickName+"]"+msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				clientMap.remove(clientKey);
				
				dos.close();
				dis.close();
				clientSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void sendBoardCast(String msg) throws IOException{
		Set<String> keySet = clientMap.keySet();
		Iterator<String> iter = keySet.iterator();
		
		while(iter.hasNext()) {
			String key = iter.next();
			DataOutputStream tempDos = clientMap.get(key);
			try {
				tempDos.writeUTF(msg);
			} catch (IOException e) {
				System.out.println(key + "에게 메시지를 보내던 중 에러 발생");
				clientMap.remove(key);
			}
		}
		
	}
}
