package com.test.question.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws Exception {
//		숫자 2개 입력 받아 산술 결과를 반환하는 메소드 5개를 선언하고 호출하시오.
		
//		설계>
//		1. BufferedReader
//		2. 첫번째 숫자 : 출력
//		3. 숫자 입력
//		4. 두번째 숫자 : 출력
//		5. 숫자 입력
//		6. 입력 받은 숫자를 int로 변환
//		7. result = add(num1, num2)
//		8. add(num1, num2) 메소드 생성 > num1 + num2 = 결과값 반환
//		9. num1 + num2 = 결과 출력
//		10. 6~8번의 add대신 subtract, multiply, divide, mod에 해당하는 코드로 반복
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 숫자 : ");
		String input1 = reader.readLine();
		System.out.print("두번째 숫자 : ");
		String input2 = reader.readLine();
		
		int n1 = Integer.parseInt(input1);
		int n2 = Integer.parseInt(input2);
		
		int result = add(n1, n2);
		System.out.printf("%,d + %,d = %,d%n", n1, n2, result);
		System.out.printf("%,d + %,d = %,d%n", n1, n1, result);
		
		result = subtract(n1, n2);
		System.out.printf("%,d - %,d = %,d%n", n1, n2, result);
		
		result = multiply(n1, n2);
		System.out.printf("%,d * %,d = %,d%n", n1, n2, result);
		result = multiply(n1, n1);
		System.out.printf("%,d * %,d = %,d%n", n1, n1, result);
		
		double result2 = divide(n1, n2);
		System.out.printf("%,d / %,d = %,.1f%n", n1, n2, result2);
		
		result = mod(n1, n2);
		System.out.printf("%d %% %d = %d%n", n1, n2, result);
		
	}

	private static int mod(int n1, int n2) {
		int mod = n1 % n2;
		return mod;
	}

	private static double divide(int n1, int n2) {
		double divide = (double)n1 / n2;
		return divide;
	}

	private static int multiply(int n1, int n2) {
		int multiply = n1 * n2;
		return multiply;
	}

	private static int subtract(int n1, int n2) {
		int subtract = n1 - n2;
		return subtract;
	}

	private static int add(int n1, int n2) {
		int add = n1 + n2;
		return add;
	}

}
