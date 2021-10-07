package com.test.java.input;

import java.util.Arrays;
import java.util.Scanner;

public class Ex49_Scanner {

	public static void main(String[] args) {
		
//		m2();
		m4();

	}//main
	
	private static void m4() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수(국어, 영어, 수학): ");
		String input = scan.nextLine();
		String[] temp = input.split(", ");
		System.out.println(Arrays.toString(temp));

//		System.out.print("점수(국어, 영어, 수학): ");
//		String kor = scan.next();
//		String eng = scan.next();
//		String math = scan.next();
//		
//		System.out.println(kor);
//		System.out.println(eng);
//		System.out.println(math);
		
	}

	private static void m1() {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력: ");
		String name = scan.nextLine();
		System.out.println(name);
	}

	private static void m2() {
		Scanner scan = new Scanner(System.in);
		System.out.print("나이 입력: ");
		String age = scan.next();
		System.out.println(age);
		age = scan.next();
		System.out.println(age);
	}

}
