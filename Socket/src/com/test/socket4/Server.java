package com.test.socket4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		int port = 1234;
		ServerSocket server = new ServerSocket(port);
		
		System.out.println("서버 생성");
		
		while(true) {
			Socket client = server.accept();
			System.out.println("사용자 접속 : " + client.getInetAddress());
		}
	}

}
