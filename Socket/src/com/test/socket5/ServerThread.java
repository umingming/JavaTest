package com.test.socket5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread extends Thread {
	Socket client;
	
	InputStream in;
	BufferedReader reader;
	
	OutputStream out;
	PrintWriter writer;
	
	String name;
	String msg;
	
	public ServerThread(Socket client) {
		this.client = client;
		try {
			in = client.getInputStream();
			reader = new BufferedReader(new InputStreamReader(in));
			
			out = client.getOutputStream();
			writer = new PrintWriter(new OutputStreamWriter(out));
			
			name = reader.readLine();
			System.out.printf("%s님이 접속했습니다.%n", name);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		try {
			while((msg = reader.readLine()) != null) {
				String echo = String.format("[%s] %s"
											, name, msg);
				System.out.println(echo);
				writer.println(echo);
				writer.flush();
			}
		} catch (Exception e) {
			System.out.println("클라이언트가 강제 종료");
		} finally {
			try {
				writer.close();
				out.close();
				reader.close();
				in.close();
				client.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}

