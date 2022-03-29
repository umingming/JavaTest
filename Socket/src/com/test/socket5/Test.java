package com.test.socket5;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.Scanner;

public class Test {
	private static int num;
	public static void main(String[] args) throws IOException {
//		try {
//			String name = null;
//			System.out.println(name.length());
//		} catch (NullPointerException e) {
//			System.out.println("먄");
//		}
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		ServerSocket server = new ServerSocket(num);
		System.out.println("생성완료");
		
//		String name = null;
//		System.out.printf("%s님이 접속했습니다.", name);
	}
}
