package com.java.ch4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FlowEx7 {

	public static void main(String[] args) throws Exception{
		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요.>");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int user = Integer.parseInt(reader.readLine());
		int com = (int)(Math.random() * 3) + 1;
		
		System.out.printf("당신은 %d입니다.%n", user);
		System.out.printf("컴은 %d입니다.%n", com);
		
		switch(user-com) {
		case 2 : case -1 :
			System.out.println("당신이 졌습니다.");
			break;
		case 1 : case -2 :
			System.out.println("당신이 이겼습니다.");
			break;
		case 0 :
			System.out.println("비겼습니다.");
			break;
		}

	}

}
