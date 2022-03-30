package com.test.socket8;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.InputMismatchException;
import java.util.Properties;
import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

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
	
	private static Logger logger;
	
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
				logger.info("사용자 접속 대기");
				
				ServerThread serverThread = new ServerThread(client);
				Thread thread = new Thread(serverThread);
				thread.start();
			}
		} catch (Exception e) {
			logger.error("사용자 접속 실패");
		} 
	}

	private void setServer() {
		try {
			logger.info("시스템 시작");
			System.out.print("Port 번호를 입력하세요. \n ☞ ");
			
			scan = new Scanner(System.in);
			port = scan.nextInt();
			
			if(port > 0 && port < 65536) {
				server = new ServerSocket(port);
				logger.info("서버 생성 성공");
			} else {
				new Exception();
			}
			
		} catch (InputMismatchException e) {
			logger.error("서버 접속 실패; 65536 보다 작은 양수를 입력하세요.");
		} catch (UnknownHostException e) {
			logger.error("서버 접속 실패; 불가능한 Port 번호입니다.");
		} catch (IOException e) {
			logger.error("서버 접속 실패; 불가능한 Port 번호입니다.");
		}
	}
	
	public static void main(String[] args) {
		try {
			logger = Logger.getLogger(EchoServer.class);
			BasicConfigurator.configure();
			FileInputStream log4jRead =new FileInputStream ("log4j.properties");
			Properties log4jProperty=new Properties (); 
			log4jProperty.load (log4jRead);
			PropertyConfigurator.configure(log4jProperty);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		new EchoServer();
	}
}
