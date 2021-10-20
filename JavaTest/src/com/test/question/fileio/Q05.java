package com.test.question.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Q05 {
	/*
	검색할 이름을 입력 받아 해당회원의 주문 정보를 출력하시오
	
	설계>
	1. String 변수로 번호, 이름, 상품명, 개수, 배송지, line 선언
	2. BufferedReaer 생성시 회원의 경로 참조함.
	3. Scanner
	4. 이름 입력 받음.
	5. while 파일의 끝까지 line 반복
		>String 배열에 line을 요소화해 저장함.
		>if문 1번째 요소가 input과 같은지?
			>번호, 이름에 해당 요소 저장.
	6. reader를 주문파일의 경로 참조로 변경
	7. while문 파일의 끝까지 line 반복
		>String 배열에 line을 요소화해 저장함.
		>if문 마지막 요소가 번호와 같은지?
			>개수, 제품명에 해당 요소 저장
			>결과 출력함.
	8. stream 종료
	 */

	public static void main(String[] args) {
		
		try {
			String num = null;
			String name = null;
			String product = null;
			String ea = null;
			String address = null;
			String line = null;
			
			BufferedReader reader 
				= new BufferedReader(new FileReader(Path.Q05User));
			
			Scanner scan = new Scanner(System.in);
			System.out.print("이름 : ");
			String input = scan.nextLine();
			
			System.out.println("==== 구매내역 ====");
			System.out.println("[번호]\t[이름]\t[상품명]\t[개수]\t[배송지]");
			
			while((line = reader.readLine()) != null) {
				String[] temp = line.split(",");
				
				if(temp[1].equals(input)) {
					num = temp[0];
					name = temp[1];
					address = temp[2];
				}
			}
			
			reader = new BufferedReader(new FileReader(Path.Q05Order));
			
			while((line = reader.readLine()) != null) {
				String[] temp = line.split(",");
				
				if(temp[temp.length-1].equals(num)) {
					product = temp[1];
					ea = temp[2];
					System.out.printf("%s\t%s\t%s\t%s\t%s%n"
							, num, name, product, ea, address);
				}
			}
			
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
