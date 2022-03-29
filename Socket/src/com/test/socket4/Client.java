package com.test.socket4;

import java.io.IOException;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws IOException {
		Socket client = new Socket("localhost", 1234);
		System.out.println("서버 접속");
	}
}
