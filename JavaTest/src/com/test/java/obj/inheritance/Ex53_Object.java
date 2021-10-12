package com.test.java.obj.inheritance;

public class Ex53_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestAAA a = new TestAAA();
		a.a = 10;
		
		TestBBB b = new TestBBB();
		b.a = 10;
		b.b = 20;
		
		MyRandom rnd = new MyRandom();
		rnd.getClass();
		
		UtilRandom rnd2 = new UtilRandom();
		rnd2.getClass();
		
	}

}

class TestAAA {
	public int a;
}

class TestBBB extends TestAAA{
	public int b;
}

class TestCCC extends TestBBB {
	public int c;
}