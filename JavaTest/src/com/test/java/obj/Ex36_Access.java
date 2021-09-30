package com.test.java.obj;

public class Ex36_Access {

	public static void main(String[] args) {
//		Book book = new Book();
//		
//		book.title = "자바의 정석";
//		book.author = "남궁성";
//		
//		book.info();
//		book.publish();
//		
//		Keyboard k1 = new Keyboard();
//		k1.model = "해피해킹";
//		k1.price = 450000;
//		
//		System.out.println(k1.model + " " + k1.price);
		
//		Keyboard k3 = new Keyboard();
//		
//		k3.aaa("삼성");
//		System.out.println(k3.bbb());
//		k3.ccc(3000000);
//		System.out.println(k3.ddd());
		
		Keyboard k4 = new Keyboard();
		
		k4.setModel("삼성");
		System.out.println(k3.bbb());
		
		
	}

}//Ex36_Access

class Book {
	
	public String title;
	private String author;
	
	public void info() {
		
	}
	private void publish() {
		
	}
	
}

class Keyboard {
	
//	public String model;	//모델명
//	public int price;		//가격
	
	private String model;
	private int price;
	
	public void setModel(String model) {
		this.model = model;
	}
	public String bbb() {
		return model;
	}
	
	public void ccc(int n) {
		if(n >= 0 && n <= 500000) {
			price = n;
		} else {
			System.out.println("잘못된 가격");
		}
	}

	public int ddd() {
		return price;
	}
	
}