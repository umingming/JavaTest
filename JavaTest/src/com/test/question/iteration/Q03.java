package com.test.question.iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		숫자 1개를 입력 받아 1부터 입력한 숫자까지의 합을 출력하시오.
		
//		설계>
//		1. BufferedReader 사용
//		2. 숫자를 int로 입력 받음
//		3. int sum을 0으로 초기화함.
//		4. for문 > 1부터 입력한 값까지 sum에 더함
//		5. sum 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 : ");
		int num = Integer.parseInt(reader.readLine());
		int sum = 0;
		
		for(int i=0; i<=num; i++) {
			sum += i;
		}
		
		System.out.printf("1 ~ %,d = %,d", num, sum);
	}

}
