package com.test.java.homework;

public class No_Casting {

	public static void main(String[] args) {
		//형변환.
		
		//1. 명시적 형변환
		//작은 형 = (작은 형) 큰형
		
		//2. 암시적 형변환
		//큰 형 = 작은 형, 실제론 큰 형 = (큰 형) 작은 형인데 작업이 내부적으로 일어나 우리 눈에 안 보임
		
		//정수의 형변환
		byte b1 = 1;
		int i1;
		i1 = b1; 
		
		byte b2;
		int i2 = 1;
		b2 = (byte)i2; 
		
		i2 = 300;
		b2 = (byte)i2;
		System.out.println("b2: " + b2); //작은 자료형에 대입되면 범위를 벗어나 대입값과 다르게 출력되는  overflow가 일어남.
		
		//값형끼리 변환
		//1. 정수와 실수
		//byte<short<int<long<float<double
		float f1 = 3.14f;
		int i3;
		i3 = (int) f1; 
		
		//2. char 과 short 
		//둘 다 4바이트지만 범위가 다름.
		char c1 = 'A';
		short s1;
		s1 = (short) c1;
		
		char c2;
		short s2 = 65;
		c2 = (char) s2;
		System.out.println(c2);
		
		//3. boolean은 자바에서 형변환 불가능.
		
		double d = 1.0e100;
		float f = (float)d;

		System.out.println(f);
		double dd = 1.0e50;
		float ff = (float)dd;
		System.out.println(ff);
		float f2 = 9.1234567f;
		double d1 = 9.1234567;
		double d2 = (double)f2;
		System.out.printf("f = %20.18f%n", f2);
		System.out.printf("d = %20.18f%n", d1);
		System.out.printf("d2 = %20.18f%n", d2);

	}

}
