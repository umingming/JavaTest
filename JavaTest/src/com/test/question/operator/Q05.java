package com.test.question.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws Exception {
//		사용자의 한달 수입을 입력 받아 세후 금액을 출력하시오.

//		설계>
//		1. BufferedReader 사용
//		2. 한달 수입 금액(원) : 출력
//		3. 수입 입력
//		4. 수입을 int로 변환
//		5. 세금 계산
//		6. 세후 금액(원) : 출력
//		7. 세금(원) : 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("한달 수입 금액(원) : ");
		String input = reader.readLine();
		int income = Integer.parseInt(input);
		double tax = income * 3.3 / 100;
		System.out.printf("세후 금액(원) : %,d원%n", (int)(income - tax));
		System.out.printf("세금(원) : %,d원%n", (int)tax);
		
	}

}
