package com.test.java.etc;

public class Ex21_Method {
	
	private static int a;
	private static int factorial = 1;
	
	public static void main(String[] args) {
//		m1();
//		m2();
		
		int n = 4;
		int result = factorial(n);
		int result2 = m3();
		System.out.printf("%d! = %d%n", n, result);
		System.out.printf("%d! = %d%n", n, result2);

	}

	private static int m3() {
		a++;
		factorial *= a;
		if(a < 4) {
			m3();
		}
		
		return factorial;
	}
	private static int factorial(int n) {
		if(n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	private static void m2() {
		System.out.println(a);
		a++;
		
		if(a<10) {
			m2();
		}
		
	}

	private static void m1() {
		System.out.println(System.currentTimeMillis());
		m1();
		
	}

}
