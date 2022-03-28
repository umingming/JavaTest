package com.test.socket1;

import java.io.DataInputStream;
import java.io.InputStream;

public class ClientThread extends Thread{
	private InputStream in;
	
	public ClientThread(InputStream in) {
		this.in = in;
	}
	
	@Override
	public void run() {
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(in);
			String msg = "";
			while (true) {
				msg = dis.readLine();
				System.out.println(msg);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
