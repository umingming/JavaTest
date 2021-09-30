package com.test.java.obj;

public class Ex33_Class {

	public static void main(String[] args) {
		/*
		클래스, Class 
		-설계도, 추상적
		-붕어빵 틀
		
		객체, Object 
		-사물, 제품
		-붕어빵
		
		인스턴스, Instace  
		-메모리상에 실체화된 객체
		-좁은 범위의 객체, 비슷하다고 생각하셈
		
		 */
		
//		지도 -> 우리집의 좌표 -> 저장 ->사용
		
//		case 1. >간편함, 설계가 필요 없음.
//				>경험에 근거
		
//		우리집 좌표
		int x = 100;
		int y = 200;

//		마트 좌표
		int x2 = 300;
		int y2 = 400;

		System.out.printf("우리 집은 (%d, %d)에 위치합니다.%n", x, y);

//		좌표를 신롸할 수 있는가? 다른 사람이 헷갈리지 않는가?		

//		case 2. >물리적 공간을 제공해 안정적
//				>데이터의 구체적인 성질을 알기 힘들다. 
//				>배열의 단점 ; 요소간의 성질을 구분하기 힘듦. 
		
		int[] a1 = new int[] { 100, 200 }; //우리집
		int[] a2 = new int[] { 300, 400 }; //마트
		
		System.out.printf("우리 집은 (%d, %d)에 위치합니다.%n", a1[0], a1[1]);
		
//		뭐가 뭔지 어떻게 알지? 좌표라 다행이지 성적의 경우 { 90, 39, 45 } 이면 구분 가능함?
		
//		case 3.
//		-Point : 클래스, 붕어빵틀, 설계도
//		-p1 : 객체, 붕어빵, 우리의 목적, 인스턴스
		
		Point p1 = new Point();
		
//		. < 멤버 접근 연산자, 요소에 이름을 붙일 수 있음 배열의 장점을 갖고 단점을 해결
		
		p1.x = 100;
		p1.y = 200;
		
		Point p2 = new Point();
		
		p1.x = 100;
		p1.y = 200;
		
		
//		사물의 크기 저장
//		width, height, name
		
		Size s1 =new Size();
		s1.name = "키보드";
		s1.width = 10;
		s1.height = 20;
		
		//성적 저장 단위
		//학생명, 국어점수, 영어점수, 수학점수
		
		Score hong = new Score();
		
		hong.name = "홍길동";
		hong.kor = 100;
		hong.eng = 70;
		hong.math = 100;
		
		System.out.printf("%s, %d, %d, %d"
							, hong.name
							, hong.kor
							, hong.eng
							, hong.math);
		
	}//main

}//Ex33_Class

//클래스 선언 위치
class Point{
	
	//내용물 -> 변수, 메소드
	public int x;
	public int y;
}

class Size{
	public int width;
	public int height;
	public String name;
}

class Score{
	public String name;
	public int kor;
	public int eng;
	public int math;
}
