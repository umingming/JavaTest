package com.test.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws Exception{
		/*
		숫자를 입력 받아 각 자릿수 수의 합을 구하시오.
	
		설계>
		1. BufferedReader
		2. 숫자 입력
		3. sum, num, process 변수 선언
		4. for문 숫자의 길이만큼 반복
			>num에 charAt(i) 저장
			>num을 int로 바꾸고 sum에 더함 
			>if문 i가 마지막 글자가 아니면 process += " + "
		5. 결과 출력
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("숫자 : ");
		String input = reader.readLine();

		int sum = 0;
		String num = "";
		String process = "";
		
		for(int i=0; i<input.length(); i++) {
			num = "" + input.charAt(i);
			sum += Integer.parseInt(num);
			
			if(i == input.length() - 1) {
				process += num + "";
			} else {
				process += num + " + ";
			}
		}
		
		System.out.printf("결과 : %s = %d", process, sum);
	}

}
