package com.aim.test;

public class Temp implements Inf2 {
	public static void main(String[] args) {
		int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		int sum = 0;
		for(int number : numbers)
				sum += number;
		
		Inf2 obj = new Temp();
		obj.method2();
		obj.method3();
		
	}

	@Override
	public void method1() {
		System.out.println(a);
		
	}

	@Override
	public void method2() {
		System.out.println(a);
	}

}

interface Inf1 {
	int a = 10;
	public void method1();
}

interface Inf2 extends Inf1 {
	int a = 20;
	public void method2();
	default void method3() {
		System.out.println(a + Inf1.a);
	}
}