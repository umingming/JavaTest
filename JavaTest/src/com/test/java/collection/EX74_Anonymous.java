package com.test.java.collection;

public class EX74_Anonymous {

	public static void main(String[] args) {
		BBB b1 = new BBB();
		b1.test();
		
	}

}

interface AAA{
	void test();
}

class BBB implements AAA{

	@Override
	public void test() {
		
		
	}
	
}