package com.test.java;

public class Ex13_Operator {

	public static void main(String[] args) {
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1 && b2);	//false
		System.out.println(b1 || b2);	//true
		System.out.println(!b1);		//false
		System.out.println(!b2);		//true

		//나이를 입력 > 19세 이상~ 60세 미만
		int age = 25;
		
		System.out.println(age >= 19);
		System.out.println(age < 60);
//		System.out.println(19 <= age < 60);
		System.out.println((age >= 19)&&(age < 60));
		
		int num = 9;
		System.out.println((num % 2 ==0) && (num % 3 == 0));
		System.out.println((num % 2 ==0) || (num % 3 == 0));
	}

}
