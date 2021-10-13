package com.test.java.obj.inheritance;

public class Ex61_enum {

	public static void main(String[] args) {
		/*
		열거형 Enumeration
		-클래스의 일종
		-열거값을 가지는 자료형, 열거값 중 하나를 선택해서 사용하는 자료형
		
		
		 */

//		m1();
//		m2();
		m3();
	}

	private static void m3() {
		
//		Gender g1 = Gender.female;
//		System.out.println(g1);
//		if(g1 == Gender.female) { System.out.println("여자");}
		
		Color c = Color.blue;
		
	}

	private static void m2() {
		System.out.println("1.빨강, 2.파랑, 3.노랑 중 색상을 선택하세요.");
		String sel = "1";
		System.out.println(sel);
		
	}

	private static void m1() {
		System.out.println("빨강, 파랑, 노랑 중 색상을 선택하세요.");
		String color = "빨강";
		System.out.println("선택 : "+ color);
		
	}

}

class 클래스명{
	
}

interface 인터페이스명{
	
}

enum 열거형 {
	
}

enum Gender { male, female }

enum Color { red, yellow, blue }
