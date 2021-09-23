package com.test.question.for_;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q12 {

	public static void main(String[] args) throws Exception {
//		숫자 10개 입력 받아 한글로 변환 후 출력
//		-2자리 이상 숫자 입력시 프로그램 중지
		
//		설계>
//		1. BufferedReader 사용
//		2. String result 변수 선언
//		3. for문 10 반복
//			>숫자 입력
//			>if문으로 1자리 수인지 판단, 2자리 숫자면 프로그램 중지
//				>switch문으로 숫자를 한글로 변환 후 result에 추가함.
//		4. result가 10글자면 결과 출력함.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String result = "";
		
		for(int i=0; i<10; i++) {
			System.out.print("숫자 : ");
			int num = Integer.parseInt(reader.readLine());
			if(num < 10) {
				switch(num){
				case 1 : result = result + "일"; break;
				case 2 : result = result + "이"; break;
				case 3 : result = result + "삼"; break;
				case 4 : result = result + "사"; break;
				case 5 : result = result + "오"; break;
				case 6 : result = result + "육"; break;
				case 7 : result = result + "칠"; break;
				case 8 : result = result + "팔"; break;
				case 9 : result = result + "구"; break;
				case 0 : result = result + "영"; break;
				}
			} else { 
				System.out.println("프로그램 중지");
				break;
			}
		}
		if(result.length() == 10) {
			System.out.printf("결과 : %s%n", result);
		}
	}

}
