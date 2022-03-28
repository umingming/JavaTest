package com.test.socket2;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class EchoServerThread implements Runnable {
	Socket socket;
	
	InputStream is;
	ObjectInputStream ois;
	
	OutputStream os;
	ObjectOutputStream oos;
	
	String msg;
	
	public EchoServerThread(Socket socket) {
		this.socket = socket;
		try {
			System.out.println(socket.getInetAddress() + "로 부터 연결 요청을 받음.");
			is = socket.getInputStream();
			ois = new ObjectInputStream(is);
			
			os = socket.getOutputStream();
			oos = new ObjectOutputStream(os);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				msg = (String)ois.readObject();
				System.out.println(socket.getInetAddress() + "의 메시지 : " + msg);
				oos.writeObject(msg);
				oos.flush();
			}
		} catch (Exception e) {
			System.out.println("클라이언트가 강제 종료");
		} finally {
			try {
				is.close();
				os.close();
				ois.close();
				oos.close();
				socket.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
