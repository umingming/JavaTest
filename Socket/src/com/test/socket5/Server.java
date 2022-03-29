package com.test.socket5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	/*
		에코 서버
		- 클라이언트로부터 받은 메시지를 돌려줄 것.
		
		1. 1234 포트로 서버 소켓 생성 후 서버 생성 메시지 출력
			> 생성 안 될 경우는?
		2. accept() 메소드로 클라이언트의 접근 확인 후 소켓 생성
		3. 클라이언트의 데이터를 받기 위한 InputStream 생성
		4. 받은 데이터를 되돌려 주기 위해 OutputStream 생성
		5. 사용자의 이름을 readUTF()로 저장함.
		6. while문 InputStream 내 데이터가 0이 아닐 경우 반복; dis.avaliable() != 0
			> readUTF()를 클라이언트의 이름과 변수 msg에 초기화함.
			> msg를 서버에 출력함.
			> OutputStream의 write 메소드로 msg를 전송함.
			> flush 메소드로 스트림 확인
		7. 스트림과 소켓을 역순으로 닫아줌. 	
	 */
	InputStream in;
	BufferedReader reader;
	
	OutputStream out;
	PrintWriter writer;
	
	String name;
	String msg;
	
	public Server() {
		try {
			ServerSocket server = new ServerSocket(1234);
			System.out.printf("[서버 생성] PORT=1234%n", server.getLocalPort());
			
			while(true) {
				Socket client = server.accept();
				System.out.println("[사용자 접속]");

				in = client.getInputStream();
				reader = new BufferedReader(new InputStreamReader(in));
				
				out = client.getOutputStream();
				writer = new PrintWriter(new OutputStreamWriter(out));
				
				name = reader.readLine();
				System.out.printf("%s님이 접속했습니다.%n", name);
				
//				if(client != null) {
					Thread thread = new Thread() {
						@Override
						public void run() {
							echo(client);
						}
					};
					thread.start();
//				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	private void echo(Socket client) {
		try {
			while((msg = reader.readLine()) != null) {
				String echo = String.format("[%s] %s"
						, name, msg);
				System.out.println(echo);
				writer.println(echo);
				writer.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Server();
//		try {
//			ServerSocket server = new ServerSocket(1234);
//			System.out.printf("[서버 생성] PORT=1234%n", server.getLocalPort());
//			
//			Socket client = server.accept();
//			System.out.println("[사용자 접속]");
//			
//			InputStream in = client.getInputStream();
//			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
//			
//			OutputStream out = client.getOutputStream();
//			PrintWriter writer = new PrintWriter(new OutputStreamWriter(out));
//			
//			String name = reader.readLine();
//			System.out.printf("%s님이 접속했습니다.%n", name);
//			String msg = null;
//			
//			while((msg = reader.readLine()) != null) {
//				String echo = String.format("[%s] %s"
//						, name, msg);
//				System.out.println(echo);
//				writer.println(echo);
//				writer.flush();
//			}
//			
//			writer.close();
//			out.close();
//			reader.close();
//			in.close();
//			client.close();
//
//			System.out.println("[서버 종료]");
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}

}
