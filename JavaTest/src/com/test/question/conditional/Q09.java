package com.test.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q09 {

	public static void main(String[] args) throws Exception{
//		년도를 입력 받아 해당 년도가 평년인지 윤년인지 출력하시오.
		
//		설계>
//		1. BufferedReader
//		2. int로 년도를 입력 받음.
//		3. if> 년도를 4로 나눠 평년 여부 출력
//		4. if> 년도를 100으로 나눠 윤년 여부 출력
//		5. if> 년도를 400으로 나눠 윤년/평년 출력
//		평년: 년도 % 4 != 0 , 
//			 년도 % 4 == 0 && 년도 % 100 ==  0 && 년도 % 400 != 0
//		윤년: 년도 % 4 == 0 && 년도 % 100 != 0, 
//			 년도 % 4 == 0 && 년도 % 100 ==  0 && 년도 % 400 == 0

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("년도 입력 : ");
		int year = Integer.parseInt(reader.readLine());
		String result = "";
		
		switch (year % 4) {
		case 0 :
			switch (year % 100) {
			case 0 : 
				switch (year % 400) {
				case 0 :
					result = "윤년";
					break;
				default :
					result = "평년";
					break;
				}
				break;
			default :
				result = "윤년";
				break;
			}
			break;
		default : 
			result = "평년";
			break;
		}
		System.out.printf("%d는 '%s'입니다.%n", year, result);
		
		if (year % 4 == 0) {
			if (year % 100 == 0 ) {
				if (year % 400 == 0) {
					result = "윤년";
				} else {
					result = "평년";
				}
			} else {
				result = "윤년";
			}
		} else {
 		result = "평년";
		}
		System.out.printf("%d는 '%s'입니다.%n", year, result);
	}
}
