package com.test.socket4;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		int port = 1234;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("문자를 입력하세여");
		String str = reader.readLine();
//		int number = Integer.parseInt(reader.readLine());
		System.out.println("문자를 입력하세여");
		String str2 = reader.readLine();
		ServerSocket server = new ServerSocket(port);
		
		System.out.println("서버 생성");
		
		while(true) {
			Socket client = server.accept();
			System.out.println("사용자 접속 : " + client.getInetAddress());
			
			OutputStream os = client.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			
			dos.writeUTF(str);
			dos.writeUTF(str2);
//			dos.writeInt(number);
//			dos.flush();
			dos.close();
			client.close();
		}
	}
}
