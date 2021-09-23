package com.test.question.for_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		숫자 2개를 입력 받아 시작 숫자에서 종료 숫자까지 1씩 증가하며 출력하시오.
		
//		설계>
//		1. BufferedReader 사용
//		2. 시작과 종료 숫자, 증가치를 입력 받음
//		3. for문>시작부터 종료까지 증가치만큼 증가 후 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("시작 숫자 : ");
		int start = Integer.parseInt(reader.readLine());
		System.out.print("종료 숫자 : ");
		int end = Integer.parseInt(reader.readLine());
		System.out.print("증가치 : ");
		int add = Integer.parseInt(reader.readLine());
		
		for(int i=start; i<=end; i+=add) {
			System.out.println(i);
		}

	}

}
