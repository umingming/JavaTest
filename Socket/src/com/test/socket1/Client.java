package com.test.socket1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Socket socket = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		String nickName = "";
		try {
			socket = new Socket("localhost", 1234);
			
			System.out.println("닉네임 입력");
			nickName = sc.nextLine();
			
			OutputStream out = socket.getOutputStream();
			dos = new DataOutputStream(out);
			dos.writeUTF(nickName);
			
			ClientThread thread = new ClientThread(socket.getInputStream());
			thread.start();
			
			String msg = "";
			
			while (!msg.toLowerCase().equals("exit")) {
				System.out.println(">>");
				msg = sc.nextLine();
				
				if(!msg.trim().equals("")) {
					dos.writeUTF(msg);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
