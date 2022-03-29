package com.test.socket4;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws IOException {
		Socket client = new Socket("localhost", 1234);
		System.out.println("서버 접속");
		
		InputStream is = client.getInputStream();
		DataInputStream dis = new DataInputStream(is);
		
		String str = dis.readUTF();
		int number = dis.readInt();
		System.out.println(number + ", " + str);
		
		dis.close();
		is.close();
		client.close();
	}
}
