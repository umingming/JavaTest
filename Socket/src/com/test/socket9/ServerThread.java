package com.test.socket9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/*
	서버 스레드
	- Runnable 인터페이스로 상속 받는 이유는 run 메소드만 사용하기 때문.
	- 접속한 클라이언트의 정보들을 저장하고, 메시지를 되돌려줄 것.
 */
public class ServerThread implements Runnable {
	private Socket client;
	private String name;
	private String msg;
	
	private InputStream in;
	private OutputStream out;
	private BufferedReader receiver;
	private PrintWriter sender;

	/*
		생성자 정의
		1. 필드의 client 변수를 매개 소켓으로 초기화
		2. setClient 메소드 호출
	 */
	public ServerThread(Socket client) {
		this.client = client;
		setClient();
	}
	
	/*
		setClient(); 클라이언트 정보 설정
		1. 스트림 변수에 client 소켓 스트림의 값을 초기화함.
		2. BufferedReader로 읽은 값을 name에 저장후 안내 메시지 출력
	 */
	private void setClient() {
		try {
			in = client.getInputStream();
			receiver = new BufferedReader(new InputStreamReader(in));
			out = client.getOutputStream();
			sender = new PrintWriter(new OutputStreamWriter(out));
			
			name = receiver.readLine();
			System.out.printf("[사용자 접속 성공] %s님이 접속했습니다.%n", name);

		} catch (IOException e) {
			System.out.println("[사용자 접속 실패]");
		}
	}
	
	/*
		run(); strat 메소드 호출시 실행됨.
		1. echo와 close 메소드 호출
	 */
	@Override
	public void run() {
		echo();
		close();
	}
	
	/*
		echo(); 클라이언트의 메시지를 읽고 돌려줌.
		1. while문 클라이언트로부터 받은 메시지가 있으면 반복; hasNext() 사용
			> 받은 메시지를 msg 변수에 저장함.
			> name과 msg를 argument로 echo 변수에 초기화 후 출력
			> echo를 클라이언트에 전송하고, flush 메소드로 스트림 확인
		2. 메시지 전송 실패의 경우 안내함.
	 */
	private void echo() {
		try {
			while((msg = receiver.readLine()) != null) {
				String echo = String.format("[%s] %s"
											, name, msg);
				System.out.println(echo);
				sender.println(echo);
				sender.flush();
			}
		} catch (Exception e) {
			System.out.println("[메시지 전송 실패]");
		}
	}
	
	/*
		close()
		1. 스트림과 소켓을 역순으로 닫음.
		2. 접속 종료 여부 안내
	 */
	private void close() {
		try {
			sender.close();
			out.close();
			receiver.close();
			in.close();
			client.close();
			System.out.printf("[사용자 접속 종료] %s님이 종료합니다.%n", name);
			
		} catch (IOException e) {
			System.out.println("[사용자 종료 실패]");
		}
	}
}
