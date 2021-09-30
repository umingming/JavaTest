package com.test.java;

public class Ex28_for {

	public static void main(String[] args) {
//		m1();
//		m2();
//		m3();
//		m4();
		m5();
		

	}

	private static void m5() {
		//별 찍기
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i=0; i<5; i++) {
			for (int j=i; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i=0; i<5; i++) {
			for(int j=0; j<(4-i); j++) {
				System.out.print(" ");
			}
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	private static void m4() {
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				if(i == 5 || j == 3) {
					break;
				}
				System.out.printf("i: %d, j: %d%n", i, j);
			}
		}
		
	}

	private static void m3() {
		//구구단 2~9까지
		for(int i=2; i<10; i++) {
			System.out.println("============");
			System.out.printf("     %d단%n", i);
			System.out.println("============");
			for(int j=1; j<10; j++) {
				System.out.printf("%d * %d = %2d%n", i, j, i * j);
			}
			System.out.println();
		}
		
	}

	private static void m2() {
		for(int i=0; i<24; i++) {        
			for (int j=0; j<60; j++) {     
				for(int k=0; k<60; k++) {
						System.out.printf("%d시 %d분 %d초%n", i, j, k);
				}
			}
		}
	}

	private static void m1() {
		for(int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
//				System.out.println("안녕하세요.");
				System.out.printf("i: %d, j: %d%n", i, j);
			}
		}
		
	}

}
