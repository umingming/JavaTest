package com.test.socket1;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Server {
	public static final int PORT = 1234;
	
	public static void main(String[] args) {
		ServerSocket socket = null;
		Map<String, DataOutputStream> clientMap = new HashMap<>();
		
		Collections.synchronizedMap(clientMap);
		
		try {
			socket = new ServerSocket(PORT);
			System.out.println("Client Wait...");
			Socket client = socket.accept();
			ServerThread clientThread = new ServerThread(client, clientMap);
			clientThread.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
