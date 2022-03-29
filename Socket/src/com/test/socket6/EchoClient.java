package com.test.socket6;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient {
	/*
		클라이언트
		- 서버에 메시지를 보내고, 해당 메시지를 돌려 받을 것.
		
		1. IP와 PORT를 매개로 Socket 생성 후 접속 메시지 출력
		2. BufferedReader 생성해 입력 값을 name 변수에 초기화함.
		3. 서버에 데이터를 보내기 위해 OutputStream 생성
		4. 데이터를 되돌려 받기 위해 InputStream 생성
		5. name을 writeUTF의 매개로 서버에 전송함.
		6. msg 변수 선언
		7. while문 입력 값을 msg에 초기화 후,
			msg가 null이 아닐 경우를 조건으로 반복; (msg = reader.readLine()) != null
			> msg를 writeUTF의 매개로 서버에 전송함.
			> flush 메소드로 OutputStream 확인
			> if문 InputStream의 존재 데이터가 0이 아닌가?
				> readUTF를 출력함.
		8. 스트림과 소켓을 역순으로 닫기
	 */
	public static void main(String[] args) {
		try {
			Socket client = new Socket("localhost", 1234);
			System.out.print("[서버 접속] 사용자 이름을 입력하세요.\n ☞ ");
			
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			String name = input.readLine();
			
			System.out.printf("[사용자 확인] %s님 환영합니다.%n ☞ ", name);

			OutputStream out = client.getOutputStream();
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(out));

			InputStream in = client.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			
			writer.println(name);
			String msg;
			
			while((msg = input.readLine()) != null) {
				if(input.equals("quit")) {
					break;
				}
				writer.println(msg);
				writer.flush();
				System.out.println(reader.readLine());
				System.out.print(" ☞ ");
			}

			reader.close();
			in.close();
			writer.close();
			out.close();
			input.close();
			client.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
