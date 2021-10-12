package com.test.java.inheritance;

public class Ex51_Inheritance {

	public static void main(String[] args) {
		Child c = new Child();
		c.ccc();
		System.out.println(c.a);
		
		Son son = new Son();
		
		son.d = 10;
		son.e = 20;
		son.a = 30;
		son.b = 40;
		
		Daughter daughter = new Daughter();
		daughter.a = 10;
		daughter.b = 20;
		daughter.ccc();
		
		DDD d = new DDD();
		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println(d.c);
		

	}

}

class Parent {
	public int a;
	public int b;
	public void ccc() {
		System.out.println("ccc");
	}
	
}

class Child extends Parent {
	
}

class Son extends Parent {
	public int d;
	public int e;
	public void fff() {
		System.out.println("fff");
	}
}

class Daughter extends Parent {
	public int g;
	public int h;
	public void iii() {
		System.out.println("iii");
	}
}

class AAA {
	public int a = 10;
}

class BBB extends AAA {
	public int b = 20;
}

class CCC extends BBB {
	public int c = 30;
}

class DDD extends CCC {
	public int d = 40;
}