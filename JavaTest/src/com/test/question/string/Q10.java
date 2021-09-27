package com.test.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10 {

	public static void main(String[] args) throws Exception{
		/*
		입력 받은 금액을 한글로 출력하시오.
		-금액 최대 자릿수 5자리
		
		설계>
		1. BufferedReader
		2. 금액 입력
		3. output 변수 선언
		4. for문 금액 글자수 반복
			>i번째 값을 char로 저장
			>switch문 숫자 -> 한글
			>if문 ch가 '일' 이면 i=0과 끝자리일 때만 += output.
			>switch문 자릿수에 따라 만,천,백,십 추가
		5. 결과 출력
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("금액(원) : ");
		String input = reader.readLine();
		
		String output = "";
		
		for(int i=0; i<input.length(); i++) {
			String ch = "" + input.charAt(i);
			
			switch(ch) {
			case "1" : ch = "일"; break;
			case "2" : ch = "이"; break;
			case "3" : ch = "삼"; break;
			case "4" : ch = "사"; break;
			case "5" : ch = "오"; break;
			case "6" : ch = "육"; break;
			case "7" : ch = "칠"; break;
			case "8" : ch = "팔"; break;
			case "9" : ch = "구"; break;
			case "0" : ch = ""; break;
			}
			
			if(ch.equals("일") && ((i != 0) || (i != input.length() - 1))) {
				output += "";
			} else {
				output += ch;
			}
			
			switch(input.length() - i) {
			case 5 : output += "만"; break;
			case 4 : output += "천"; break;
			case 3 : output += "백"; break;
			case 2 : output += "십"; break;
			default : output += ""; break;
			}
		}
		System.out.printf("일금 %s원", output);
	}

}
