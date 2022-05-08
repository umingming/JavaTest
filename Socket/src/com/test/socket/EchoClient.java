package com.test.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
	에코 클라이언트
	- 서버에 메시지를 보내고, 해당 메시지를 돌려 받을 것.
 */
public class EchoClient {
	private Socket client;
	
	private String name;
	private String msg;
	private String ip;
	private int port;
	
	private OutputStream out;
	private InputStream in;
	private PrintWriter sender;
	private Scanner receiver;
	private Scanner scanner;
	
	/*
		생성자 정의
		1. accessServer 메소드 호출
		2. if문 클라이언트가 null이 아닌지? 
			> setClient 메소드
			> communicate 메소드 호출
		3. close 메소드 호출
	 */
	public EchoClient() {
		accessServer();
		
		if(client != null) {
			setClient();
			communicate();
		}
		close();
	}

	/*
		accessServer; 서버 접근을 위한 메소드
		1. Scanner 생성자 호출 후 초기화
		2. 입력 값을 port에 저장
		3. if문 port가 허용 범위내인지? 
			> port를 매개로 클라이언트 소켓 생성
			> 이름을 입력 받고 name 변수에 초기화
		4. 예외 처리
			> 잘못된 port 넘버일 경우; 사용할 수 없거나 사용 중인 port
			> IP가 불가능한 경우
	 */
	private void accessServer() {
		try {
			scanner = new Scanner(System.in);
			System.out.print("[시스템 시작] Port 번호를 입력하세요. \n ☞ ");
			port = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("[시스템 시작] IP 주소를 입력하세요. \n ☞ ");
			ip = scanner.nextLine();
			
			if(port > 0 && port < 65536) {
				client = new Socket(ip, port); 
				System.out.print("[서버 접속 중] 사용자 이름을 입력해주세요. \n ☞ ");
				name = scanner.nextLine();
				
			} else {
				new InputMismatchException();
			}
			
		} catch (InputMismatchException e) {
			System.out.println("[서버 접속 실패] 65536 보다 작은 양수를 입력하세요.");
		} catch (SocketException e) {
			System.out.printf("[서버 접속 실패] %d는 불가능한 Port입니다.", port);
		} catch (UnknownHostException e) {
			System.out.printf("[서버 접속 실패] %s는 불가능한 IP입니다.", ip);
		} catch (IOException e) {
			System.out.printf("[서버 접속 실패]");
		} 
	}
	
	/*
		setClient(); 클라이언트 정보 설정
		1. 스트림 변수에 client 소켓 스트림의 값을 초기화함.
		2. name을 println 메소드로 서버에 전송함.
	 */
	private void setClient() {
		try {
			out = client.getOutputStream();
			sender = new PrintWriter(new OutputStreamWriter(out));
	
			in = client.getInputStream();
			receiver = new Scanner(new InputStreamReader(in));
			
			sender.println(name);
			System.out.printf("[통신 시작] %s님 환영합니다.%n ☞ ", name);
			
		} catch (IOException e) {
			System.out.println("[통신 실패]");
		}
	}

	/*
		communicate 메소드
		1. while문 입력 값을 msg에 초기화 후 null이 아닐 경우 반복함.  
			> if문 msg가 종료이면, break
			> msg를 println으로 서버에 전송하고 flush 메소드로 확인함.
			> 서버로부터 돌려 받은 값을 출력함.
	 */
	private void communicate() {
		while((msg = scanner.nextLine()) != null) {
			if(msg.equals("종료")) {
				break;
			}
			
			sender.println(msg);
			sender.flush();
			System.out.printf("%s%n ☞ ", receiver.nextLine());
		}
	}
	
	/*
		close 메소드
		1. 스트림과 소켓을 역순으로 닫음.
		2. 접속 종료 여부를 안내함.
	 */
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
	
	/*
		메인 메소드
		1. 생성자 호출
	 */
	public static void main(String[] args) {
		new EchoClient();
	}
}
