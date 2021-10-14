package com.test.java.obj.inheritance;

public class Ex63_Generic {

	public static void main(String[] args) {
//		Item<String> i1 = new Item<String>();
//		i1.c = "문자열";
//		
//		Item<Integer> i2 = new Item<Integer>();
//		i2.c = 10;
		
		Monitor<Boolean, Double> m 
		= new Monitor<Boolean, Double>(false, 3.14);
		System.out.println(m.getA());

	}

}

class Item<T> {
	public int a;
	public String b;
	public T c;
}

class Mouse<T> {
	public T a;
	public T b;
	public T c;
	
}

class Keyboard<T> {
	public T a;
	public void test(T a) {
		
	}
	public T get() {
		return a;
	}
	
}

class Monitor<T, U> {
	public T a;
	public U b;

	public Monitor(T a, U b) {
		this.a = a;
		this.b = b;
	}
	
	public T getA() {
		return a;
	}

	public U getB() {
		return b;
	}
	
	
}