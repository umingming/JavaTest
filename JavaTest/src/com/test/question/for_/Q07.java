package com.test.question.for_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q07 {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		1 + 2 + 3 + 4 + 5 + ... + XX = 10XX
//		루프를 종료할 누적값을 사용자가 입력함.
		
//		설계>
//		1. BufferedReader 사용
//		2. 종료값 int로 입력
//		3. int와 String의 변수 생성 후 초기화
//		4. for문 무한루프
//			>변수 + i 반복
//			>sum이 종료값보다 커지면 종료
//		5. 결과 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("루프를 종료할 누적값 : ");
		int end = Integer.parseInt(reader.readLine());
		
		int sum = 0;
		String process = "";
		
		for(int i=1; ; i++) {
			sum +=i;
			process = process + i;
			
			if(sum > end) {
				break;
			}
			process = process + " + ";
		}
		System.out.println(process + " = " + sum);
	}

}
