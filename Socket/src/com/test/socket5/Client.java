package com.test.socket5;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
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
			System.out.println("[서버 접속]");
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("[사용자 이름 입력]");
			System.out.print("☞");
			String name = reader.readLine();

			OutputStream os = client.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);

			InputStream is = client.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			
			dos.writeUTF(name);
			String msg;
			
			while((msg = reader.readLine()) != null) {
				dos.writeUTF(msg);
				
				if(dis.available() != 0) {
					System.out.println(dis.readUTF());
				}
				dos.flush();
			}
			
			dis.close();
			is.close();
			os.close();
			dos.close();
			client.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
