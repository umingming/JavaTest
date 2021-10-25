package com.test.java.lambda;

public class Ex81_Lambda {
	
	public static void main(String[] args) {
		/*
		MyInterface를 구현하는 객체 만들기
		 */
		
		MyInterface m1 = new MyClass();
		m1.test();
		
		MyInterface m2 = new MyInterface() {
			public void test() {
				System.out.println("익명 객체에서 구현한 메소드");
			}
		};
		m2.test();
		
		MyInterface m3 = () -> {
			System.out.println("익명 객체에서 구현한 메소드");
		};
	}

}

interface MyInterface {
	void test();
}

class MyClass implements MyInterface {

	@Override
	public void test() {
		System.out.println("실명 객체에서 구현한 메소드");
	}
	
}