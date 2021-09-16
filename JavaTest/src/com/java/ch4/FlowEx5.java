package com.java.ch4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FlowEx5 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.println("점수를 입력해주세요.>");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		score = Integer.parseInt(reader.readLine());
		
		System.out.printf("당신의 점수는 %d입니다.%n", score);
		
		if (score >= 90) {
			grade = 'A';
			if (score >= 98) {
				opt = '+';
			} else if (score < 94) {
				opt = '-';
			}
		} else if (score >= 80) {
			grade = 'B';
			if(score >= 88) {
				opt = '+';
			} else if (score < 84) {
				opt = '-';
			}
		} else {
			grade = 'C';
		}
		System.out.printf("당신의 학점은 %c%c입니다.", grade, opt);
	}

}
