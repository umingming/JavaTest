package com.test.java.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2_read {

	public static void main(String[] args) throws IOException {
		
		//한 글자를 입력 받은 대로 출력하시오.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("성: ");
		int input1 = reader.read();
		System.out.printf("내 성은 %c씨 입니다.%n", input1);
		reader.readLine();
		//이름을 입력 받아 출력하시오.
		System.out.print("이름: ");
		String input = reader.readLine();
		System.out.printf("내 이름은 %s입니다.%n", input);

	}

}
