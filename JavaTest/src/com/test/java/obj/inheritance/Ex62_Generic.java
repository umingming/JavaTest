package com.test.java.obj.inheritance;

public class Ex62_Generic {

	public static void main(String[] args) {
		/*
		int -> Integer.
		1. int값 1개를 중심으로 여러가지 작업을 하는 클래스를 정의하시오.
		2. String값 1개를 중심으로 여러가지 작업을 하는 클래스를 정의하시오.
		*/
		
		WrapperInt n1 = new WrapperInt(10);
		System.out.println(n1);
		
		WrapperString s1 = new WrapperString("이유미");
		System.out.println(s1);

		WrapperBoolean b1 = new WrapperBoolean(true);
		System.out.println(b1);
		
//		m1();
		m2();
		
		WrappObject n2 = new WrappObject(20);
		System.out.println(n2);
		System.out.println((int)n2.getData() * 2);
		
		WrappObject s2 = new WrappObject("아무개");
		System.out.println(s2);
		System.out.println(((String)s2.getData()).length());
		
		WrappObject b2 = new WrappObject(false);
		System.out.println(b2);
		System.out.println((Boolean)b2.getData()? "참" : "거짓");

	}

	private static void m2() {
		// TODO Auto-generated method stub
		
	}

	private static void m1() {
		Object o1 = new Object();
//		Object o2 = new Parent();
//		Object o3 = new Child();
		
		int n = 10;
		Object o4 = 10;
		
		Integer a = 30;
		
		System.out.println(n*2);
		System.out.println((int)o4 * 2);
		
	}

}

//class Parent {
//	
//}
//
//class Child extends Parent {
//	
//}

class WrapperInt {
	private int data;


	public WrapperInt(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	public String toString() {
		return this.data + "!";
	}

}

class WrapperString {
	private String data;
	
	
	public WrapperString(String data) {
		this.data = data;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public String toString() {
		return this.data + "!";
	}
	
}

class WrapperBoolean {
	private Boolean data;
	
	
	public WrapperBoolean(Boolean data) {
		this.data = data;
	}
	
	public Boolean getData() {
		return data;
	}
	
	public void setData(Boolean data) {
		this.data = data;
	}
	
	public String toString() {
		return this.data + "!";
	}
	
}

class WrappObject {
	private Object data;

	@Override
	public String toString() {
		return this.data + "";
	}

	public WrappObject(Object data) {
		super();
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	
}