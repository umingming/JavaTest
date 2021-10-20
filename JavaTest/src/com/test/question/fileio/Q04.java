package com.test.question.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		/*
		검색할 이름을 입력 받아 해당 회원의 모든 정보를 출력하시오.
		
		설계>
		1. path 변수 선언 후 단일검색의 경로로 초기화함.
		2. line 변수 null로 초기화함.
		3. BufferedWriter 
		4. Scanner
		5. 이름 입력받음.
		6. while문 line이 끝날 때까지 반복
			>String 배열 선언 후 split로 line을 요소화함.
			>if문 temp의 1번째 요소가 입력값인지?
				>번호, 주소, 전화 출력함
		 */

		try {
			String path = Path.Q04;
			String line = null;
			
			BufferedReader reader 
				= new BufferedReader(new FileReader(path));

			Scanner scan = new Scanner(System.in);
			String name = scan.nextLine();
			
			while((line = reader.readLine()) != null) {
				String[] temp = line.split(",");
				
				if(temp[1].equals(name)) {
					System.out.printf("[%s]%n", temp[1]);
					System.out.printf("번호 : %s%n", temp[0]);
					System.out.printf("주소 : %s%n", temp[2]);
					System.out.printf("전화 : %s%n", temp[3]);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		

	}

}
