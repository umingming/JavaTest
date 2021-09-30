package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex19_Overloading {

	public static void main(String[] args) throws IOException {
		//매개변소루 전달 받은 숫자들 중 양수의 개수가 몇개인지 반환하는 메소드.
		/* int count = positive(num)
		 * positive(10, -10) -> 1
		 
		 */
		
		System.out.println();
		int num1 = inputNumber();
		int count = positive(num1);
		System.out.println("양수의 개수: " + count);
		
		int num2 = inputNumber();
		count = positive(num1, num2);
		System.out.println("양수의 개수: " + count); 

		int num3 = inputNumber();
		count = positive(num1, num2, num3);
		System.out.println("양수의 개수: " + count); 
	}
	private static int positive(int num1, int num2, int num3) {

		int count = 0;
		
		count += num1 > 0 ? 1 : 0;  //누적할 수 있음.
		count += num2 > 0 ? 1 : 0;
		count += num3 > 0 ? 1 : 0;
		//count = num1 > 0 ? ++count : (num2 > 0 ? ++count : 0);
		
		return count;
	}
	private static int positive(int num1, int num2) {
		int count = 0;
		
		count += num1 > 0 ? 1 : 0;  //누적할 수 있음.
		count += num2 > 0 ? 1 : 0;
		//count = num1 > 0 ? ++count : (num2 > 0 ? ++count : 0);
		
		return count;
	}
	private static int positive(int num1) {
		//넘어온 매개변수 중 양수가 몇 개 있는지?
		int count = 0; //누적 변수
		count = num1 > 0 ? 1 : 0;
		return count;
	}
	public static int inputNumber() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 입력: ");
		String input = reader.readLine();
		return Integer.parseInt(input);
	}
}
