package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10_BufferedReader {

	public static void main(String[] args) throws IOException {
		
		//숫자 두개를 입력 받아 두 수의 합을 구하시오.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 입력: ");
		String input1 = reader.readLine();
		
		System.out.print("숫자 입력: ");
		String input2 = reader.readLine();
		System.out.println(input1+input2);
		
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);		
		System.out.println(num1+num2);
		

	}

}
