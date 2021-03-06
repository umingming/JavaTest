package com.test.socket8;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Properties;
import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ServerThread implements Runnable {
	/*
		서버 스레드
		- 접속한 클라이언트의 정보들을 저장하고, 메시지를 되돌려줄 것.
		- Runnable 인터페이스로 상속 받는 이유는 run 메소드만 사용하기 때문.
		
		1. 필드 변수 선언
			> client, name, msg; 클라이언트 정보 변수
			> In/OutputStream, BufferedReader, PrintWriter; 데이터 전송을 위한 스트림
		2. client를 매개로 생성자 정의
			> 필드의 client 초기화
			> setClient 메소드 호출
		3. setClient 메소드
			> 스트림 변수에 client 소켓 스트림의 값을 초기화함.
			> BufferedReader로 읽은 값을 name에 저장후 안내 메시지 출력
		4. run 메소드 재정의
			> echo, close 메소드 차례로 호출
		5. echo 메소드
			> while문 읽을 메시지가 없을 때까지 반복함.
				> name과 msg를 이용해 echo 변수를 초기화 후 출력
				> echo를 클라이언트에 보내기 전에 확인함.
		6. close 메소드
			> 역순으로 닫음.
	 */
	
	private Socket client;
	private String name;
	private String msg;
	
	private InputStream in;
	private OutputStream out;
	private Scanner reader;
	private PrintWriter writer;

	private Logger logger;

	public ServerThread(Socket client) {
		this.client = client;
		setLogger();
		setClient();
	}

	private void setClient() {
		try {
			in = client.getInputStream();
			reader = new Scanner(new InputStreamReader(in));
			
			out = client.getOutputStream();
			writer = new PrintWriter(new OutputStreamWriter(out));
			
			name = reader.nextLine();
			logger.info("사용자 접속 성공");
			System.out.printf("%s님이 접속했습니다.%n", name);

		} catch (IOException e) {
			logger.error("사용자 접속 실패");
		}
	}
	
	@Override
	public void run() {
		echo();
		close();
	}

	private void echo() {
		try {
			while(reader.hasNext()) {
				msg = reader.nextLine();
				String echo = String.format("[ %s ] %s"
											, name, msg);
				System.out.println(echo);
				writer.println(echo);
				writer.flush();
			}
		} catch (Exception e) {
			logger.error("메시지 전송 실패");
		}
	}
	
	private void close() {
		try {
			writer.close();
			out.close();
			reader.close();
			in.close();
			client.close();
			logger.info("사용자 접속 종료");
			System.out.printf("%s님이 종료합니다.%n", name);
			
		} catch (IOException e) {
			logger.error("사용자 접속 종료 실패");
		}
	}
	
	private void setLogger() {
		try {
			logger = Logger.getLogger(ServerThread.class);
			BasicConfigurator.configure();
			FileInputStream log4jRead =new FileInputStream ("log4j.properties");
			Properties log4jProperty=new Properties (); 
			log4jProperty.load (log4jRead);
			PropertyConfigurator.configure(log4jProperty);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
