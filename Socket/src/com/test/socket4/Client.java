package com.test.socket4;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws IOException {
		Socket client = new Socket("localhost", 1234);
		System.out.println("서버 접속");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("닉네임을 입력하세여");
		String name = reader.readLine();

		InputStream is = client.getInputStream();
		DataInputStream dis = new DataInputStream(is);

		OutputStream os = client.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		
		dos.writeUTF(name);
//		String str = dis.readUTF();
//		String str2 = dis.readUTF();
//		int number = dis.readInt();
//		System.out.println(str + ", " + str2);

		dos.flush();
		os.close();
		dos.close();
		dis.close();
		is.close();
		client.close();
	}
}
