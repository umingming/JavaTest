package com.test.question.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws Exception{
//		이름을 전달하면 이름 뒤에 '님'을 붙여서 반환하는 메소드를 선언하고 호출하시오.
		
//		설계>
//		1. BufferedReader
//		2. 이름 : 출력
//		3. "홍길동" 입력
//		4. getName 호출
//		5. getName 메소드 생성 > "홍길동"을 "홍길동님" 반환
//		6. 고객 : 홍길동님 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("이름 : ");
		String name = reader.readLine();
		name = getName(name);
		System.out.printf("고객 : %s", name);
	}
	
	private static String getName(String name) {
		name += "님";
		return name;
	}
	
}
