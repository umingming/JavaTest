package com.test.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws Exception{
		/*
		이메일 주소를 입력받아 아이디와 도메인을 각각 추출하시오.
		
		설계>
		1. BufferedReader
		2. 이메일 입력
		3. indexOf로 @위치값 찾기
		4. substring으로 @ 전은 id, 후는 도메인
		5. 결과 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("이메일 : ");
		String email = reader.readLine();

		int index = email.indexOf('@');
		String id = email.substring(0, index);
		String domain = email.substring(index + 1);
		
		System.out.printf("아이디 : %s%n", id);
		System.out.printf("도메인 : %s%n", domain);

	}

}
