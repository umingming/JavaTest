package com.java.ch4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FlowEx8 {

	public static void main(String[] args) throws Exception{
		System.out.println("당신의 주민번호를 입력하세요. > ");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String regNo = reader.readLine();
		
		char gender = regNo.charAt(7); //8번째 문자를 저장
		
		switch(gender) {
		case '1' : case '3' :
			System.out.println("당신은 남자입니다.");
			break;
		case '4' : case '2' :
			System.out.println("당신은 여자입니다.");
			break;
		default :
			System.out.println("유효하지 않은 주민등록번호입니다.");
		}
	}//main

}
