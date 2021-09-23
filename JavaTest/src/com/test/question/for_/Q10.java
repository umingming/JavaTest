package com.test.question.for_;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10 {

	public static void main(String[] args) throws Exception{
//		숫자를 N개 입력 받아 4 - 7 + .. - 15 + 12 = 1XX 와 같이 출력
//		-누적값을 사용자가 입력 후 넘어가는 순간 루프 종료
//		-짝수는 더하고 홀수는 빼기
		
//		설계>
//		1. BufferedReader 사용
//		2. 종료값 int로 입력 받음
//		3. 숫자 int로 입력 받음
//		4. int와 String으로 sum 변수 선언
//		5. for문 무한루프
//			>int로 숫자 입력 받음
//			> if문 
//				>입력받은 숫자가 홀수면 빼고
//				>짝수면 더하는데 누적값을 초과하면 종료
//		6. 결과 출력

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("루프를 종료할 누적값 : ");
		int end = Integer.parseInt(reader.readLine());
		System.out.print("숫자 : ");
		int initial = Integer.parseInt(reader.readLine());
		
		int sum = initial;
		String process = initial + "";
		
		for(;;) {
			System.out.print("숫자 : ");
			int num = Integer.parseInt(reader.readLine());
			if(num % 2 == 0) {
				sum += num;
				process = process + " + " + num;
				if(sum > end) {
					break;
				}
			} else {
				sum -= num;
				process = process + " - " + num;
			}
		}
		
		System.out.println(process + " = " + sum);
	}

}
