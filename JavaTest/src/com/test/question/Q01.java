package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws IOException {
		
		//사용자로부터 태어난 년도를 입력받아 나이를 출력하시오.
		//입력] 나이 입력: 1995
		//출력] 1995년생은 올해 27살 입니다.
		
		//설계 > 할 일의 순서를 시나리오로 작성.
		//1. 라벨 출력 > "생년 입력"
		//2. BufferedReader 생성
		//3. reader.readLine() 사용해 년도 입력 받기.
		//4. 입력 받은 년도를 int로 바꿈
		//5. 2021-년도+1
		//6. 출력
		
		System.out.print("생년 입력: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String year = reader.readLine();
		int intYear = Integer.parseInt(year);
		int age = 2021 - intYear + 1;
		
		System.out.printf("%s년생은 올해 %d살 입니다.%n", year, age);

	}

}
