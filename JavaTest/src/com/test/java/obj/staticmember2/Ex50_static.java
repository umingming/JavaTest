package com.test.java.obj.staticmember2;

public class Ex50_static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		1. private + 변수 선언
			1.1 객체 병수 선정(개인 데이터)
			1.2 정적 변수 선정(공용 데이터)
			-> 사물함 -> 개인 사물함 + 공용 사물함
		2. 생성자
			2.1 기본 생성자 필수
			2.2 오버로딩 생성자
			2.3 정적 변수 존재 > 정적 생성자
		3. 메소드
			3.1 getter/setter
			3.2 업무용 메소드
		 */
		
		Keyboard k1 = new Keyboard("K800", 80000);
		System.out.println(k1.info());
		k1.m1();
		
		Keyboard.m2();
		
	

	}

}

//로지텍
class Keyboard {
	
	private String model;
	private int price;
	private static String brand;
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static String getBrand() {
		return brand;
	}

	public static void setBrand(String brand) {
		Keyboard.brand = brand;
	}
	
	public Keyboard() {
		this.model = model;
		this.price = price;
	}
	
	public Keyboard(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	static {
		Keyboard.brand = "로지텍";
	}
	
	public String info() {
		return String.format("%s, %s"
					, this.model
					, this.price);
	}
	
	public void m1() {
		System.out.println("객체 변수 : " + this.model);
		System.out.println("정적 변수 : " + Keyboard.brand);
	}
	
	public static void m2() {
//		System.out.println("객체 변수 : " + this.model);
		System.out.println("정적 변수 : " + Keyboard.brand);
		
	}
	
}
