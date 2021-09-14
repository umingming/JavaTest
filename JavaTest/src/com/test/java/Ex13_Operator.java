package com.test.java;

public class Ex13_Operator {

	public static void main(String[] args) {
//		
//		boolean b1 = true;
//		boolean b2 = false;
//		
//		System.out.println(b1 && b2);	//false
//		System.out.println(b1 || b2);	//true
//		System.out.println(!b1);		//false
//		System.out.println(!b2);		//true
//
//		//나이를 입력 > 19세 이상~ 60세 미만
//		int age = 25;
//		
//		System.out.println(age >= 19);
//		System.out.println(age < 60);
////		System.out.println(19 <= age < 60);
//		System.out.println((age >= 19)&&(age < 60));
//		
//		int num = 9;
//		System.out.println((num % 2 ==0) && (num % 3 == 0));
//		System.out.println((num % 2 ==0) || (num % 3 == 0));
		
//		int sum = 10 + 20 + 30;
//		int sum = 30 + 30;
//		int sum = 30 + 30;
//		int sum = 60;

		
		int n = 10;
		//기존 n값에 1을 누적 ; 누적한다.
		n = n + 1; //11
		n %= 12;
		System.out.println(n);
		
		System.out.println(100 + 200 + 300);	//600
		System.out.println(100 + 200 + "300");	//300300
		System.out.println(100 + "200" + 300);	//100200300
		System.out.println("100" + 200 + 300);	//100200300
		System.out.println("100" + (200 + 300));	//100500
		
		System.out.println(true == true);
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = "아무개";
		String str4 = "홍";
		str4 = str4 + "길동";
		
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str1 == str4);
		System.out.println(str1.equals(str4));
		
		
		

	}

}
