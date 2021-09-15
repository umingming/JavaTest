package com.test.question.method;

public class Q01 {

	public static void main(String[] args) {
		//1.
		//2. 님자를 메소드에서 자동으로 붙여주도록
		//3. 숫자 하나를 입력 받으면 0000 요롷게 네자리로 출력하도록.
		//7. int getTime(int 역, int 환승역)
		//	 int getTime(int 역, int 환승역, int 시간대)
		//	 1(평상), 2(출근), 3(퇴근) 가정
		//	 getTime(15, 2, 3); 역을 13개 지나고 2번 환승하는데 퇴근시간임.
		//9. 하지마
//		호출하면 인사말을 출력하는 메소들 3개를 선언하고 호출하시오.
		
//		설계>
//		1. hello(), introduce(), bye() 메소드를 호출함.
//		2. hello() 메소드 생성 > 안녕하세요. 출력
//		3. introduc() 메소드 생성>  저는 홍길동입니다. 출력
//		4. byt() 메소드 생성 > 안녕하시가세요. 출력
		
		hello();
		introduce();
		bye();
		

	}
	private static void hello() {
		System.out.printf("안녕하세요.");
	}
	
	private static void introduce() {
		System.out.println("저는 홍길동입니다.");
	}
	
	private static void bye() {
		System.out.println("안녕히가세요.");
	}
	
}
