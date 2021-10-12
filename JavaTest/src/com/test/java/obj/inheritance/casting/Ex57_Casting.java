package com.test.java.obj.inheritance.casting;

public class Ex57_Casting {

	public static void main(String[] args) {
		Parent p1 = new Parent();
		System.out.println(p1.a);
		System.out.println(p1.b);

		Child c1 = new Child();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.c);
		System.out.println(c1.d);
		
		Parent p2;
		Child c2 = new Child();
		
		p2 = c2;
		c2.a = 50;
		
		System.out.println(p2.a);
		System.out.println(p2.b);
		
//		Parent p3 = new Parent();
//		Child c3;
//		
//		c3 = (Child)p3;
//		System.out.println(c3.a);
//		System.out.println(c3.b);
		
		Parent p4;
		Child c4 = new Child();
		
		p4 = c4;
		
		Child c5;
		c5 = (Child)p4;
		
		System.out.println(c5.a);
		System.out.println(c5.b);
		System.out.println(c5.c);
		System.out.println(c5.d);
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