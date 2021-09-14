package com.test.question.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q03 {
	
	public static void main(String[] args) throws Exception{
//		사각형의 너비와 높이를 입력 받아 넓이와 둘레를 출력하시오.

//		설계>
//		1. BufferedReader
//		2.  출력
//		3. 너비 입력
//		4. 높이(cm) : 출력
//		5. 둘레 입력
//		6. 너비와 높이를 int로 변환
//		7. 사각형의 넓이는 cm㎠입니다. 출력
//		8. 사각형의 둘레는 cm입니다. 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("너비(cm) : ");
		String input1 = reader.readLine();
		System.out.print("높이(cm) : ");
		String input2 = reader.readLine();
		
		int width = Integer.parseInt(input1);
		int height = Integer.parseInt(input2);
		
		System.out.printf("사각형의 넓이는 %,dcm㎠입니다.%n", width * height );
		System.out.printf("사각형의 둘레는 %,dcm입니다.%n", 2 * (width + height));
		
	}

}
