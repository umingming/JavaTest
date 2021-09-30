package com.test.java;

public class Ex29_while {

	public static void main(String[] args) {
		// 숫자 1~10 출력하시오
		for(int i=1; i<1; i++) {
			System.out.printf("%3d", i);
		}
		
//		m2();
//		m3();
		m4();

	}

	private static void m4() {
		int n = 20;
		
		do {
			System.out.println(n);
			n++;
		} while (n <= 10);
		
	}

	private static void m3() {
		int sum = 0;
		for (int i=1; ; i++) {
			
			sum += i;
			if (sum > 1000) {
				break;
			}
		}
		System.out.println(sum);
		
		sum = 0;
		for (int i=1; sum<1000; i++) {
			
			sum += i;
			if (sum > 1000) {
				break;
			}
		}
		System.out.println(sum);
		
		sum = 0;
		int n = 1;
		
		while(true) {
			sum += n;
			
			if(sum >= 1000) {
				System.out.println(sum);
				break;
			}
			
			n++;
		}
		
		sum = 0;
		n = 1;
		
		while(sum < 1000) {
			sum += n;
			n++;
		}
		
		System.out.println(sum);
	}

	private static void m2() {
		//구구단 출력
		int dan = 5;
		int i = 1;
		
		while (i<=9) {
			System.out.printf("%d x %d = %d%n", dan, i, dan * i);
			i++;
		}
		
	}

}
