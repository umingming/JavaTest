package com.java.ch4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FlowEx2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int input;
		
		System.out.print("숫자를 하나 입력하세요.>");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String tmp = reader.readLine();
		input = Integer.parseInt(tmp);
		
		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다.");
		} else
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		

	}

}
