package com.test.question.iteration2;

public class Q10 {

	public static void main(String[] args) {
		/*
		아래와 같이 출력하시오.
		1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 + 55 + 89 = 232
		-N < 100

		설계>
		1. sum, process, num1, 2, 3선언
		2. for문 무한 루프
			>int xy 변수 선언
			>x = y
			>y = xy
			>if문 (x > 100) >break
			>sum, process += y
		*/
		
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		int sum = 1;
		String process = "1";
		
		for(;;) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
					
			if(num3 > 100) {
				break;
			}

			sum += num2;
			process += " + " + num2;
		}
		
		System.out.println(process + " = " + sum);
	}

}
