package com.test.question.iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws IOException {
//		사용자의 이름과 인사할 횟수를 입력 받아 출력하시오.
		
//		설계>
//		1. BufferedReader 사용
//		2. 이름과 횟수를 입력 받음.
//		3. for문> 횟수만큼 "ㅇㅇㅇ님 안녕하세요~" 출력함
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String name = reader.readLine();
		int num = Integer.parseInt(reader.readLine());
		
		for(int i=0; i<num; i++) {
			System.out.printf("%s님 안녕하세요~%n", name);
		}

	}

}
