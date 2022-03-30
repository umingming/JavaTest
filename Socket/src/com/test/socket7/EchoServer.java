package com.test.socket7;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
	/*
		에코 서버
		- 클라이언트로부터 받은 메시지를 돌려줄 것
		
		1. 필드 변수 선언
			> In/OutputStream, BufferedReader, PrintWrtier 선언
			> clientSocket, name, msg 선언
		2. 생성자 정의
			> 1234 포트로 서버 소켓 생성 후 생성 메시지 출력함.
			> 무한 루프
				> client 접근 확인 후 client 소켓에 초기화함.
				> if문 client가 null이 아닌지?
					> setClient 메소드 호출해 클라이언트 설정
					> 익명 객체로 스레드 객체 생성함.
						> run 메소드 재정의하며 echo메소드 호출
		3. setClient 메소드
			> 스트림 변수에 client 소켓 스트림의 값을 초기화함.
			> BufferedReader로 읽은 값을 name에 저장후 안내 메시지 출력
		4. echo 메소드
			> while문 읽을 메시지가 없을 때까지 반복함.
				> name과 msg를 이용해 echo 변수를 초기화 후 출력
				> echo를 클라이언트에 보내기 전에 확인함.
		5. 메인 메소드
			> 생성자 호출
	 */
	private ServerSocket server;
	private Socket client;
	
	private Scanner scan;
	private int port;
	
	public EchoServer() {
		setServer();
		
		if(server != null) {
			communicate();
		}
	}
	
	private void communicate() {
		try {
			while(true) {
				client = server.accept();
				System.out.println("[사용자 접속 대기]");
				
				ServerThread serverThread = new ServerThread(client);
				Thread thread = new Thread(serverThread);
				thread.start();
			}
		} catch (Exception e) {
			System.out.println("[사용자 접속 실패]");
			System.exit(0);
		} 
	}

	private void setServer() {
		try {
			System.out.print("[시스템 시작] Port 번호를 입력하세요. \n ☞ ");
			
			scan = new Scanner(System.in);
			port = scan.nextInt();
			
			if(port > 0 && port < 65536) {
				server = new ServerSocket(port);
				System.out.printf("[서버 생성 성공] Port 번호는 %d입니다.%n"
									, server.getLocalPort());
			} else {
				new Exception();
			}
			
		} catch (Exception e) {
			System.out.println("[서버 생성 실패] 65536 보다 작은 양수를 입력하세요."); // 
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new EchoServer();
	}
}
