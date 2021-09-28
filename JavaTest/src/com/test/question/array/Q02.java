package com.test.question.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws Exception {
		/* 
		학생의 이름을 N개 입력 받아 아래와 같이 출력하시오.
		-입력 받은 학생 이름은 동적 배열에 저장함.
		-입력 받은 순서와 반대로 출력함.
		
		설계>
		1. BufferedReader
		2. 학생 수 입력 받음
		3. 학생 수를 길이로 하는 String 배열 생성
		4. for문 학생 수
			>학생명 이름받음
			>배열에 순차적으로 저장함(따로)
		5. 학생 수 출력
		6. for문 학생 수
			>names-i 출력
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("학생 수 : ");
		int n = Integer.parseInt(reader.readLine());
		String[] names = new String[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("학생명 : ");
			String name = reader.readLine();
			
			names[i] = name;
		}
		
		System.out.printf("입력한 학생은 총 %d명입니다.%n", n);
		for(int i=0; i<n; i++) {
			System.out.printf("%d. %s%n", i + 1, names[n-i-1]);
		}
		
	}

}
