package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Hello {

	public static void main(String[] args) throws Exception{
		
		//자바 콘솔 프로그램 배포
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("이름 입력: ");
		String name = reader.readLine();
		System.out.printf("안녕하세요. %s님%n", name);
	}

}
