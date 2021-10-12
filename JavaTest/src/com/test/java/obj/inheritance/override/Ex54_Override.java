package com.test.java.obj.inheritance.override;

import java.util.Random;

public class Ex54_Override {

	public static void main(String[] args) {
		/*
		메소드 오버라이드
		-메소드 재정의
		-상속 시 발생
		 */
		
		Hong hong = new Hong();
		hong.name = "홍길동";
		
		Son son = new Son();
		son.name = "홍재석";
		
		Daughter daughter = new Daughter();
		daughter.name = "홍나래";
		
		hong.hello();
		son.hi();
		daughter.hello();
		

	}

}

class Hong {
	public String name;
	
	public void hello() {
		System.out.printf("안녕하세요. 저는 %s입니다.\r\n", this.name);
	}
	
}

class Son extends Hong {
	public void hi() {
		System.out.printf("안녕. 나는 %s야.\r\n", this.name);
	}
	
}

class Daughter extends Hong {
	
	public void hello() {
		System.out.printf("방가링! 난 %s! \r\n", this.name);
	}
	
}

class MyRandom extends Random {
	@Override
	public int nextInt() {
		return (int)this.nextInt(10) + 1;
	}
} 