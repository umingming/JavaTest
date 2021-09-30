package com.test.java.obj;

public class Ex34_Class {

	public static void main(String[] args) {
		
		User u1 = new User();
		u1.name = "홍길동";
		u1.hello();


	}//main
}//Ex34_Class

class User{
	public void info() {
		System.out.println("유저입니다.");
	}
	
	public String name = "";
	public void hello() {
		System.out.printf("안녕하세요. 저는 %s입니다.%n", name);
	}
}
