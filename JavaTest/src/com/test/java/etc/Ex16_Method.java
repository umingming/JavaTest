package com.test.java;

public class Ex16_Method {

	public static void main(String[] args) {
		//요구사항] '홍길동'에게 인사를 하는 메소드를 만드시오.
		hi("이유미");
		hi("이유미");
		hi("이유미");
		hi("이유미");
		hi("이유미");
		//수정사항] '아무개'에게 인사를 하는 메소드를 만드시오.
	} //변수는 초기화하지 않은 상태(null)로 사용이 불가능.
	public static void hello() {
		String name = "홍길동";
		System.out.println(name + "님 안녕하세요.");
	}
	public static void hello2() {
		String name = "아무개";
		System.out.println(name + "님 안녕하세요.");
	}
	public static void hi(String name) {
		System.out.println(name + "님 안녕하세요.");
		
	}

}
