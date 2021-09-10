package com.test.java;

import java.io.IOException;

public class Ex08_Input {

	public static void main(String[] args) throws IOException {
		
		//사용자에게 문자 1개를 키보드로 입력받아 그대로 화면에 출력하시오.
		//입력 A
		//출력 입력하신 문자는 A입니다.
		
		System.out.print("입력) ");
		
		//사용자로부터 키보드로 입력을 받는다.
		int data = System.in.read();
		//대기 상태. 블럭(Block) 걸림.
		System.out.println(data);
		System.out.printf("출력) 입력하신 문자는 %c입니다.\n", data);

		char A = 'A';
		System.out.println( );
		
				
	}

}
