package com.test.socket7;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EchoClient {
	/*
		클라이언트
		- 서버에 메시지를 보내고, 해당 메시지를 돌려 받을 것.
		
		1. 필드 변수 선언
			> socket, ip, port, name, msg, echo
			> In/OutputStream, Scanner, PrintWriter
		2. 생성자 정의
			> accessServer 메소드 호출
			> if문 클라이언트가 null이 아닌지? 
				> setClient 메소드
				> communicate 메소드 호출
			> close 메소드 호출
		3. accessServer 메소드
			> Scanner 생성
			> 입력 값을 port에 초기화
			> 클라이언트 소켓 생성 후 접속 안내 메시지
		4. setClient 메소드
			> 스트림 변수에 client 소켓 스트림의 값을 초기화함.
			> name을 println 메소드로 전송함.
		5. communicate 메소드
			> while문 입력 값이 있을 때까지 반복함.
				> 입력 값을 msg에 초기화
				> msg를 println으로 서버에 전송하고 flush 메소드로 확인
				> flush 메소드로 OutputStream 확인
		6. close 메소드
			> 역순으로 닫음.
	 */
	private Socket client;
	
	private String name;
	private String msg;
	private String echo;
	private String ip;
	private int port;
	
	private OutputStream out;
	private InputStream in;
	private PrintWriter sender;
	private Scanner receiver;
	private Scanner scanner;
	
	public EchoClient() {
		accessServer();
		
		if(client != null) {
			setClient();
			communicate();
		}
		close();
	}
	
	private void close() {
		try {
			sender.close();
			out.close();
			receiver.close();
			in.close();
			client.close();
			System.out.println("[접속 종료]");
			
		} catch (IOException e) {
			System.out.println("[접속 종료 실패]");
		}
	}

	private void communicate() {
		while((msg = scanner.nextLine()) != null) {
			if(msg.equals("종료")) {
				break;
			}
			sender.println(msg);
			sender.flush();
			System.out.println(receiver.nextLine());
			System.out.print(" ☞ ");
		}
	}

	private void setClient() {
		try {
			out = client.getOutputStream();
			sender = new PrintWriter(new OutputStreamWriter(out));
	
			in = client.getInputStream();
			receiver = new Scanner(new InputStreamReader(in));
			
			sender.println(name);
			System.out.printf("%s님 환영합니다.", name);
			
		} catch (IOException e) {
			
		}
	}
	
	private void accessServer() {
		try {
			System.out.print("[시스템 시작] Port 번호를 입력하세요. \n☞ ");
			scanner = new Scanner(System.in);
			port = scanner.nextInt();
			ip = "localhost";
			
			if(port > 0 && port < 65536) {
				client = new Socket("localhost", port);
				System.out.println("[서버 접속 성공] 사용자 이름을 입력해주세요. \n☞ ");
				scanner.nextLine();
				name = scanner.nextLine();
			} else {
				new InputMismatchException();
			}
			
		} catch (InputMismatchException e) {
			System.out.println("[서버 접속 실패] 65536 보다 작은 양수를 입력하세요.");
		} catch (UnknownHostException e) {
			System.out.printf("[서버 접속 실패] %d는 불가능한 Port 번호입니다.");
		} catch (Exception e) {
			System.out.println("[서버 접속 실패]");
		}
	}
	
	public static void main(String[] args) {
		new EchoClient();
	}
}
