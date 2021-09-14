package com.java.ch3;

public class OperatorEx22 {

	public static void main(String[] args) {
		float	f	=	0.1f;
		double	d	=	0.1;
		double	d2	=	(double)f;  //0.1
		
		System.out.printf("10.0 == 10.0f	%b%n", 10.0 == 10.0f); //t
		System.out.printf("0.1 == 0.1f	%b%n", d == f);	//t
		System.out.printf("f = %19.17f%n", f); // 0.10000000300000000
		System.out.printf("d = %19.17f%n", d); // 0.10000000000000000
		System.out.printf("d2 = %19.17f%n", d2); // 0.10000000000000000
		System.out.printf("d == f %b%n", d == f); //false
		System.out.printf("d == d2 %b%n", d == d2); //true
		System.out.printf("d2 == f %b%n", f == d2); //false
		System.out.printf("(float)d == f %b%n", (float)d == f); //true
		

	}

}
