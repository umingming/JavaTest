package com.test.java.collection;

public class EX74_Anonymous {

	public static void main(String[] args) {
		BBB b1 = new BBB();
		b1.test();
		
		AAA a = new BBB();
		BBB b =  (BBB)a;
		b.call();
		((BBB)a).call();
		
		AAA b5 = new AAA() {
			public void test() {
				System.out.println("익명 객체 메소드");
			}
		};
		
		b5.test();
		
		AAA b6 = new AAA() {

			@Override
			public void test() {
				System.out.println("자신만의 구현 내용");
			}
			
		};
		
		b6.test();
		
	}

}

interface AAA{
	void test();
}

class BBB implements AAA{

	@Override
	public void test() {
		
		
	}
	
	void call() {
		
	}
	
}