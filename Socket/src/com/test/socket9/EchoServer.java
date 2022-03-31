package com.test.socket9;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
	에코 서버
	- 서버를 생성자고 클라이언트의 접근을 확인해 스레드 생성
 */
public class EchoServer {
	private ServerSocket server;
	private Socket client;
	
	private Scanner scanner;
	private int port;
	
	/*
		생성자 정의
		1. setServer 메소드 호출
		2. if문 server가 null이 아닌지?
			> run() 메소드 호출
	 */
	public EchoServer() {
		setServer();
		
		if(server != null) {
			run();
		}
	}
	
	/*
		setServer(); 서버 생성
		1. Scanner 생성자 호출
		2. 입력 값을 port에 저장
		3. if문 port가 허용 범위인지? (0~65535)
			> port를 매개로 서버소켓 생성 후 안내 메시지 출력
		4. 예외처리
			> port 넘버를 잘못 입력했을 경우
			> 이미 존재하는 port의 경우
	 */
	private void setServer() {
		try {
			System.out.print("[시스템 시작] Port 번호를 입력하세요. \n ☞ ");
			
			scanner = new Scanner(System.in);
			port = scanner.nextInt();
			
			if(port > 0 && port < 65536) {
				server = new ServerSocket(port);
				System.out.printf("[서버 생성 성공] Port 번호는 %d입니다.%n"
									, server.getLocalPort());
			} else {
				new InputMismatchException();
			}
			
		} catch (InputMismatchException e) {
			System.out.println("[서버 접속 실패] 65536 보다 작은 양수를 입력하세요.");
		} catch (SocketException e) {
			System.out.printf("[서버 접속 실패] %d는 불가능한 Port입니다.", port);
		} catch (IOException e) {
			System.out.printf("[서버 접속 실패]");
		} 
	}
	
	/*
		run(); 클라이언트의 접속을 확인하고 스레드 생성
		1. while문 무한 루프
			> 클라이언트 접근 확인 후 client 소켓에 초기화
			> 해당 클라이언트를 매개로 ServerThread 객체 생성
			> 스레드를 생성해 start 메소드 호출
		2. 예외 처리
			> 사용자가 접속에 실패할 경우 종료함.
	 */
	private void run() {
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
	
	/*
		메인 메소드
		1. 생성자 호출
	 */
	public static void main(String[] args) {
		new EchoServer();
	}
}
