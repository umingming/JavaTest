package com.test.question.datetime;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q03 {

	public static void main(String[] args) throws Exception{
//		태어난 년도를 입력하면 나이를 출력하시오.
		
//		설계>
//		1. BufferedReader 
//		2. 태어난 년도 : 출력
//		3. 년도 입력
//		4. 년도 int로 변환
//		5. Calendar
//		6. 현재 나이 계산
//		7. 나이 : 세 출력

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("태어난 년도 : ");
		String input = reader.readLine();
		int year = Integer.parseInt(input);
		
		Calendar now = Calendar.getInstance();
		int age = now.get(Calendar.YEAR) - year + 1;
		
		System.out.printf("나이 : %d세", age);
	}

}
