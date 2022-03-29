package com.test.socket4;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {
		int port = 1234;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("문자를 입력하세여");
//		String str = reader.readLine();
//		int number = Integer.parseInt(reader.readLine());
//		System.out.println("문자를 입력하세여");
//		String str2 = reader.readLine();
		ServerSocket server = new ServerSocket(port);
		
		System.out.println("서버 생성");
		
		while(true) {
			Socket client = server.accept();
			System.out.println("사용자 접속 : " + client.getInetAddress());
			
			InputStream is = client.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			
			OutputStream os = client.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			String name = dis.readUTF();
			System.out.println(name);
//			
//			if(dis.available() == 0) {
//				System.out.println("없어");
//			}
			
			if(dis.readUTF() == null) {
				System.out.println("없어");
			}
			
//			dos.writeUTF(str);
//			dos.writeUTF(str2);
//			dos.writeInt(number);
//			dos.flush();
			os.close();
			dos.close();
			dis.close();
			is.close();
			client.close();
		}
	}
}
