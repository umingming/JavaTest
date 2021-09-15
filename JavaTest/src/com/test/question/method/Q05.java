package com.test.question.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws Exception{

//		숫자를 전달하면 '짝수' 혹은 '홀수'라는 단어 반환하는 메소드 선언 후 호출
		
//		설계>
//		1. BufferedReader
//		2. 숫자 : 출력
//		3. 숫자 입력
//		4. 입력 받은 숫자를 int로 변경
//		5. getNumber(int) 메소드 생성 > 입력 받은 숫자 -> 짝수/홀수 반환
//		6. 입력하신 숫자 ' '는(은) ' '입니다. 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 : ");
		String input = reader.readLine();
		int num = Integer.parseInt(input);
		
		System.out.printf("입력하신 숫자 '%,d'는(은) '%s'입니다.%n", num, getNumber(num));
	}

	private static String getNumber(int num) {
		// TODO Auto-generated method stub
		String result = num % 2 == 0 ? "짝수" : "홀수"; 
		return result;
	}

}
