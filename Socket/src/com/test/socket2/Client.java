package com.test.socket2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	Socket client = null;
	
	String ip;
	static final int PORT = 1234;
	
	static BufferedReader reader;
	
	InputStream is;
	ObjectInputStream ois;
	
	OutputStream os;
	ObjectOutputStream oos;
	
	String msg;
	String echo;
	
	public Client(String name) {
		this.ip = "localhost";
		try {
			System.out.println("클라이언트 접속");
			
			client = new Socket(ip, PORT);
			
			reader = new BufferedReader(new InputStreamReader(System.in));
			
			os = client.getOutputStream();
			oos = new ObjectOutputStream(os);
			
			is = client.getInputStream();
			ois = new ObjectInputStream(is);
			
			oos.writeObject(name);
			System.out.println("입력>>");
			
			while((msg = reader.readLine()) != null) {
				oos.writeObject(msg);
				oos.flush();
				if(msg.equals("quit")) {
					break;
				}
				
				echo = (String)ois.readObject();
				System.out.println(client.getInetAddress() + "로 부터 받은 메시지 : " + echo);
				System.out.println("입력>>");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		} finally {
			try {
				is.close();
				ois.close();
				os.close();
				oos.close();
				client.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		try {
			System.out.println("닉네임을 입력하세요.");
			String name = reader.readLine();
			new Client(name);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}