package com.test.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q06 {

	public static void main(String[] args) throws Exception{
		/*
		주민 등록 번호 유효성 검사
		- '-' 유무 상관 없이 검사
		
		설계>
		1. BufferedReader
		2. 주민번호 입력
		3. 앞자리, 뒷자리 확인 메소드 생성
			>for문 6글자, 7글자
			>charAt으로 저장
			>if문으로 숫자인지 확인
				>아니면 false로 리턴
		4. 생년, 생월, 생일 확인 메소드 생성
			>if문 앞자리 확인 메소드가 true
				>substring 글자 int로 변환, int값이 적합한지
				>맞으면 true 리턴
		6. 정상 주민 번호인지 확인 하는 메소드 생성
		7. 정상이면 유효성 검사
			>앞자리는 2~7 곱하기
			>뒷자리는 8,9,2~5 곱하기
			>모든 수를 더한 후 11로 나눔
			>11에서 나머지 를 뺀 값이 주민번호 마지막 글자가 맞으면 true
		 */

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("주민등록번호 : ");
		String jumin = reader.readLine().replace("-", "").trim();
		
		
		if(isValid(jumin)) {
			System.out.println("올바른 주민등록번호입니다.");
		} else {
			System.out.println("올바르지 않은 주민등록번호입니다.");
		}
	}

	private static boolean isValid(String jumin) {
		if(isRightJumin(jumin)) {
			int sum = 0;
			for(int i=0; i<jumin.length()-1; i++) {
				sum += Integer.parseInt(jumin.charAt(i)+"") * (i % 8 + 2);
			}
			sum %= 11;
			sum = 11 - sum;
			if (sum >= 10) {
				sum -= 10;
				System.out.println(sum);
				if(sum == Integer.parseInt(jumin.substring(jumin.length()-1))) {
					return true;
				} 
				return false;
			} else {
				System.out.println(sum);
				if(sum == Integer.parseInt(jumin.substring(jumin.length()-1))) {
					return true;
				} 
				return false;
			}
		}
		return false;
	}

	private static boolean isRightJumin(String jumin) {
		if(jumin.length() == 13) {
			if(isRightLast(jumin) && isRightYear(jumin) && isRightMonth(jumin) && isRightdate(jumin)) {
				return true;
			}
			return false;
		}
		return false;
	}

	private static boolean isRightFirst(String jumin) {
		for(int i=0; i<6; i++) {
			char ch = jumin.charAt(i);
			if(ch < '0' ||ch > '9') {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isRightLast(String jumin) {
		for(int i=6; i<jumin.length(); i++) {
			char ch = jumin.charAt(i);
			if(ch < '0' ||ch > '9') {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isRightdate(String jumin) {
		if(isRightFirst(jumin)) {
			int date = Integer.parseInt(jumin.substring(4, 6));
			
			if(date > 0 && date < 32) {
				return true;
			} 
			return false; 
		}
		return false;
	}
	
	private static boolean isRightMonth(String jumin) {
		if(isRightFirst(jumin)) {
			int month = Integer.parseInt(jumin.substring(2, 4));
			
			if(month >= 1 && month <= 12) {
				return true;
			} 
			return false; 
		}
		return false;
	}

	private static boolean isRightYear(String jumin) {
		if(isRightFirst(jumin)) {
			int year = Integer.parseInt(jumin.substring(0, 2));
			
			if(year >= 0 && year < 100) {
				return true;
			} 
			return false; 
		}
		return false;
	}

}
