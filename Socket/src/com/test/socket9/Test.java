package com.test.socket9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
	/*
		문자열을 분석해 계산하기
		- +, -, *, / 있다고 가정함.
		- 숫자랑, 연산자를 분리해서 저장하면 어떨까?
		- ArrayList와 indexOf사용
		
		1. Scanner 생성
		2. 입력 값 input에 저장
		3. ArrayList로 numList과 operatorList 생성
		4. char 배열 생성해 연산자 값 초기화함.
		5. setList 호출
			> num 변수 선언
			> for문 input 길이 반복
		5. num 변수 선언
		6. for문 input 길이 반복
			> if문 i번째 글자가 연산자인지; Arrays.asList().contains() 사용
				> num을 numList에 저장
				> i번째 글자를 operatorList에 저장
		7. calculate 메소드            
			> switch문 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		ArrayList<Integer> numList = new ArrayList<>();
		ArrayList<Character> operList = new ArrayList<>();
		char[] operators = {'+', '-', '*', '/'};
		String num = "";
		int index = 0;
		int result = 0;
		
		for(int i=0; i<input.length(); i++) {
			char letter = input.charAt(i);
		
			if(Arrays.asList(operators).contains(letter)) {
				numList.add(Integer.parseInt(num));
				operList.add(letter);
			
			} else {
				num += letter;
			}
		}
		
		for(int i=0; i<operList.size(); i++) {
			if(operList.get(i) == '*') {
				
			}
		}
	}
}
