package com.test.socket2;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	ServerSocket server;
	final int PORT = 7000;
	Socket socket;
	
	public Server() {
		try {
			server = new ServerSocket(PORT);
		} catch(Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		System.out.println("**** 다중 사용자 접속 채팅 서버 ****");
		System.out.println("서버는 클라이언트 소켓의 접속 요청을 기다리고 있음.");
		
		while(true) {
			try {
				socket = server.accept();
				
				EchoServerThread childThread = new EchoServerThread(socket);
				Thread thread = new Thread(childThread);
				thread.start();
			} catch(Exception e) {
				e.printStackTrace();
				System.exit(0);
			}
		}
	}
	public static void main(String[] args) {
		new Server();
	}
}
