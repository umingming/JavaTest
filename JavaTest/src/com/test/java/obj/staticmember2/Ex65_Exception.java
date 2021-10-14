package com.test.java.obj.staticmember2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex65_Exception {

	public static void main(String[] args) {
//		m1();
//		m2();
//		m3();
//		m4();
		m5();
		
	}

	private static void m5() {
		int num = 5;
		if(num % 2 == 1	) {
			System.out.println("업무 진행");
		} else {
			System.out.println("예외 처리");
		}
		
		try {
			if(num % 2 == 0) {
				throw new Exception();
			}
			System.out.println("업무 진행");
		} catch (Exception e) {
			System.out.println("예외 처리");
		}
		
	}

	private static void m4() throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//		try {
//			String input = reader.readLine();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		String input = reader.readLine();
		
		
	}

	private static void m3() {
		try {
			int num = 10;
			System.out.println(100/num);
			
			int[] nums = { 10, 20, 30 };
			System.out.println(nums[1]);
			
			Parent p = new Parent();
			Child c;
			c = (Child)p;
			
		}catch(Exception e) {
			System.out.println("예외처리");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누기");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 첨자 오류");
		} catch (ClassCastException e) {
			System.out.println("형변환 오류");
		}
		
		
	}

	private static void m2() {
		int num = 0;
		try {
			System.out.println(100/num);
		} catch(Exception e) {
			System.out.println("0으로 나눔");
		}
		
		int[] nums = { 10, 20, 30 };
		try { 
			System.out.println(nums[5]);
		} catch (Exception e) {
			System.out.println("배열 첨자 오류");
		}
		
		Parent p = new Parent();
		Child c;
		try {
			c = (Child)p;
		} catch (Exception e) {
			System.out.println("형변환 오류");
		}
		
	}

	private static void m1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력: ");
		int num = scan.nextInt();
		
		try{
			System.out.printf("100 / %d = %d%n", num, 100 / num);
		}catch(Exception e) {
			System.out.println("0을 입력하면 안 됩니다.");
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}

//		if(num == 0) {
//			System.out.println("0을 입력하면 안 됩니다.");
//		} else {
//			System.out.printf("100 / %d = %d%n", num, 100 / num);
//		}
		
		System.out.println("다른 업무..");
	}

}

class Parent {
	
}

class Child extends Parent {
	
}
