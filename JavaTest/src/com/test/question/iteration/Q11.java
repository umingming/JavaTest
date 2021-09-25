package com.test.question.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q11 {

	public static void main(String[] args) throws Exception{
//		사용자가 입력한 범위의 숫자까지 369게임의 결과를 출력
//		-최대 3자리까지만 입력
		
//		설계>
//		1. BufferedReader 사용
//		2. 최대 숫자 int로 입력 받기
//		3. if문 
//			> 숫자가 1000이상이면 "최대 3자리까지만 입력하시오" 출력
//			> 숫자가 1000미만이면 for문 최대 숫자만큼 반복
//				> 3, 6, 9가 들어가면 짝을 출력함.(if)
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("최대 숫자 : ");
		int max = Integer.parseInt(reader.readLine());
		
		if(max < 1000) {
			for(int i=1; i<=max; i++) {
				String num = i + " ";
				
				if(num.contains("3") || num.contains("6") || num.contains("9") ) {
					System.out.print("짝 ");
				} else {
					System.out.print(num);
				}
			}
		} else {
			System.out.println("최대 3자리까지만 입력하시오.");
		}
	}

}
