package com.test.socket6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
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
	
	private InputStream in;
	private OutputStream out;
	private BufferedReader reader;
	private PrintWriter writer;
	private Scanner scan;
	
	private int port;
	private String name;
	private String msg;
	
	public EchoServer() {
		try {
			setServer();
			
			while(true) {
				client = server.accept();
				System.out.println("[사용자 접속 대기]");
				
				setClient();
			}
			
		} catch (Exception e) {
			System.out.println("[시스템 종료]");
			System.exit(0);
		} finally {
			close();
		}
	}
	
	private void close() {
		try {
			writer.close();
			out.close();
			reader.close();
			in.close();
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void setServer() {
		try {
			System.out.print("[시스템 시작] Port 번호를 입력하세요. \n☞ ");
			
			scan = new Scanner(System.in);
			port = scan.nextInt();
			
			if(port > 0 && port < 65536) {
				server = new ServerSocket(port);
				System.out.printf("[서버 생성 성공] Port 번호는 %d입니다.%n"
									, server.getLocalPort());
			} else {
				System.out.println("[서버 생성 실패] 65536 보다 작은 양수를 입력하세요.");
				System.exit(0);
			}
			
		} catch (Exception e) {
			System.out.println("[서버 생성 실패] 65536 보다 작은 양수를 입력하세요.");
			System.exit(0);
		}
	}

	private void setClient() {
		try {
			in = client.getInputStream();
			reader = new BufferedReader(new InputStreamReader(in));
			
			out = client.getOutputStream();
			writer = new PrintWriter(new OutputStreamWriter(out));
			
			name = reader.readLine();
			System.out.printf("[사용자 접속 성공] %s님이 접속했습니다.%n", name);
			
			Thread thread = new Thread() {
				@Override
				public void run() {
					echo();
				}
			};
			thread.start();
			
		} catch (IOException e) {
			System.out.println("[사용자 접속 실패]");
			System.exit(0);
		}
	}
	
	private void echo() {
		try {
			while((msg = reader.readLine()) != null) {
				String echo = String.format("[%s] %s"
											, name, msg);
				System.out.println(echo);
				writer.println(echo);
				writer.flush();
			}
			
		} catch (IOException e) {
			System.out.println("[메시지 전송 실패]");
		}
	}
	
	public static void main(String[] args) {
		new EchoServer();
	}
}
