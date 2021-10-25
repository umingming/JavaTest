package com.test.java.lambda;

import java.util.Random;

public class Ex82_Lambda {

	public static void main(String[] args) {
		NoParameterNoReturn pr1 = new NoParameterNoReturn() {
			public void call() {
				System.out.println("pr1");
			}
		};
		pr1.call();
		
		NoParameterNoReturn pr2 = () -> {
			System.out.println("pr2");
		};
		pr2.call();
		
		ParameterNoReturn pr3 = (int num) -> {
			System.out.println(num);
		};
		pr3.call(100);
		pr3.call(200);
		
		ParameterNoReturn pr4 = num -> {
			System.out.println(num);
		};
		pr4.call(100);
		
		ParameterNoReturn pr5 = num -> System.out.println(num);
		pr5.call(100);
		
		MultiParameterNoReturn pr6 = (String name, int age) -> {
			System.out.printf("%s님은 %d세입니다.%n", name, age);
		};
		pr6.call("홍길동", 20);
		
		MultiParameterNoReturn pr7 = (name, age) ->
			System.out.printf("%s님은 %d세입니다.%n", name, age);
		pr7.call("홍길동", 20);
		
		NoParameterReturn pr8 = () -> {
			return 10;
		};
		System.out.println(pr8.call());
		
		NoParameterReturn pr9 = () -> {
			Random rnd = new Random();
			return rnd.nextInt(10);
		};
		System.out.println(pr9.call());
		
		NoParameterReturn pr10 = () -> (int)(Math.random() * 10);
		System.out.println(pr10.call());
		
		
		ParameterReturn pr12 = (a, b) -> a + b;
		System.out.println(pr12.call(10, 2));
		
		ParameterReturn pr13 = (a, b) -> a % b;
		System.out.println(pr13.call(2, 10));
		
		ParameterReturn2 pr14 = (int age) -> {
			return age >= 19 ? "어른" : "아이";
		};
		System.out.println(pr14.call(20));

		ParameterReturn2 pr15 = age -> (age >= 19 ? "어른" : "아이");
		System.out.println(pr15.call(20));
		
		
		

	}

}

interface NoParameterNoReturn {
	void call();
}

interface NoParameterReturn {
	int call();
}

interface ParameterNoReturn {
	void call(int num);
}

interface ParameterReturn {
	int call(int a, int b);
}

interface MultiParameterNoReturn {
	void call(String name, int age);
}

interface ParameterReturn2 {
	String call(int age);
}
