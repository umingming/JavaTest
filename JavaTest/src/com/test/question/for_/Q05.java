package com.test.question.for_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
				
//		설계>
//		1. BufferedReader 사용
//		2. 시작과 종료 숫자 입력 받음
//		3. int와 String으로 sum 변수 생성 후 초기화함.
//		4. for문 
//			> i가 시작부터 종료할 때까지 +1 증가
//			> int sum에 i값이 더해짐
//			> String sum은 종료 숫자되기 전까지만 더해짐
//		5. sum 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("시작 숫자 : ");
		int start = Integer.parseInt(reader.readLine());
		System.out.print("종료 숫자 : ");
		int end = Integer.parseInt(reader.readLine());
		
		int sum = 0;
		String strSum = "";
		
		for(int i=start; i<=end; i++) {
			sum += i;
			
			strSum = strSum + i;
					
			if(i == end) {
				break;
			}
			strSum = strSum + " + ";
		}
		
		System.out.println(strSum + " = " + sum);
	}

}
