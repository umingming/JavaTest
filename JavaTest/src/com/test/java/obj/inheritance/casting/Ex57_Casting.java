package com.test.java.obj.inheritance.casting;

public class Ex57_Casting {

	public static void main(String[] args) {
//		P
//		Parent p3 = new Parent();
//		Child c3;
//		
//		c3 = (Child)p3;
//		System.out.println(c3.a);
//		System.out.println(c3.b);
//		
//		Parent p4;
//		Child c4 = new Child();
//		
//		p4 = c4;
//		
//		Child c5;
//		c5 = (Child)p4;
//		
//		System.out.println(c5.a);
//		System.out.println(c5.b);
//		System.out.println(c5.c);
//		System.out.println(c5.d);
		
		Daughter d = new Daughter();
		Parent p = d;
		
		
	}

}

class Parent {
	public int a = 10;
	public int b = 20;
	
}

class Child extends Parent {
	public int c = 30;
	public int d = 40;
	
}

class Son extends Parent {
	public int e = 50;
}

class Daughter extends Parent {
	public int f = 60;
	
}