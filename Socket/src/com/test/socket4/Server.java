package com.test.socket4;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		int port = 1234;
		
		int number = Integer.parseInt(args[0]);
		String str = new String(args[1]);
		ServerSocket server = new ServerSocket(port);
		
		System.out.println("서버 생성");
		
		while(true) {
			Socket client = server.accept();
			System.out.println("사용자 접속 : " + client.getInetAddress());
			
			OutputStream os = client.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			dos.writeUTF(str);
			dos.writeInt(number);
			dos.flush();
			dos.close();
			client.close();
		}
	}
}
