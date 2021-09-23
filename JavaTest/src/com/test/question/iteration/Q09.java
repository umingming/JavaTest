package com.test.question.for_;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q09 {

	public static void main(String[] args) throws Exception{
//		컴퓨터가 1~10 사이의 숫자 1개를 생각하면 사용자가 맞추는 프로그램 구현
		
//		설계>
//		1. BufferedReader 사용
//		2. random 변수 선언 후 1부터 10까지 저장되는 Math 메소드 사용
//		3. 컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다. 출력
//		4. count 변수 선언 
//		5. for문 무한루프
//			>숫자를 int로 입력 받고 count 하나씩 증가시킴
//			>if문
//				>틀리면 "틀렸습니다" 출력 
//				>맞으면 break
//		6. 종료멘트 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int random = (int)(Math.random() * 10) + 1;
		System.out.println("컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.\n");
		
		int count = 0;
		
		for(;;) {
			System.out.print("숫자 : ");
			int num = Integer.parseInt(reader.readLine());
			count++;
			if(num == random) {
				System.out.printf("맞췄습니다.%n%n"
						+ "컴퓨터가 생각한 숫자는 %d입니다.%n"
						+ "정답을 맞추는데 시도한 횟수는 %d입니다.%n%n", random, count);
				break;
			} else {
				System.out.println("틀렸습니다.\n");
			}
			
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
