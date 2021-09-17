package com.test.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws Exception {
//		숫자 2개를 입력 받아 큰 수와 작은 수 출력

//		설계>
//		1. BufferedReader
//		2. int로 첫 번째 숫자와 두 번째 숫자를 입력 받음.
//		3. if 문으로 두 수를 비교하고 큰 수와 작은 수는 무엇인지 출력
//		4. 입력한 두 숫자의 차이를 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫 번째 숫자 : ");
		int num1 = Integer.parseInt(reader.readLine());

		System.out.print("두 번째 숫자 : ");
		int num2 = Integer.parseInt(reader.readLine());
		
		if(num1 > num2) {
			System.out.printf("큰 수는 %,d이고, 작은 수는 %,d입니다.%n", num1, num2);
			System.out.printf("입력한 두 숫자는 %,d 차이가 납니다.%n", num1 - num2);
		} else if (num1 < num2)	{
			System.out.printf("큰 수는 %,d이고, 작은 수는 %,d입니다.%n", num2, num1);
			System.out.printf("입력한 두 숫자는 %,d 차이가 납니다.%n", num2 - num1);
		} else {
			System.out.println("두 수가 같습니다.");
		}
		
	}

}
