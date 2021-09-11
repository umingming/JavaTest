package com.java.ch2;

public class PrintfEx2 {

	public static void main(String[] args) {
		
		String url = "www.codechobo.com";
		
		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1); //f1=0.10, 1e-1,
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2); //f2=10.0, 1e1f, 
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3); //f3=3140.0, e.14e3f,
		System.out.printf("d=%f%n", d); //d=1.23456789
		System.out.printf("d=%14.10f%n",d); //d=  1.2345678900
		System.out.printf("[123456789]%n"); //[123456789]
		System.out.printf("[%s]%n", url); //[www.codechobo.com]
		System.out.printf("[%20s]%n", url); //[   www.codechobo.com]
		System.out.printf("[%-20s]%n", url); //[www.codechobo.com   ]
		System.out.printf("[%.8s]%n", url); //[www.codechobo.com]
		
	}

}
