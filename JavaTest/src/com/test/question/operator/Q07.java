package com.test.question.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q07 {

	public static void main(String[] args) throws Exception{
//		섭씨 온도를 입력 받아서 화씨 온도로 변환하시오.
		
//		설계>
//		1. BufferedReader
//		2. 섭씨(℃) : 출력
//		3. 온도 입력
//		4. 온도를 double로 변환
//		5. 섭씨 ℃는 화씨 ℉입니다. 출력

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("섭씨(℃) : ");
		String input = reader.readLine();
		double degreeC = Double.parseDouble(input);
		double degreeF = degreeC * 1.8 + 32;
		System.out.printf("섭씨 %,.1f℃는 화씨 %,.1f℉입니다.%n", degreeC, degreeF);
		
	}

}
