package com.test.java.collection;

import java.util.*;

public class Ex68_Stack {

	public static void main(String[] args) {
//		m1();
//		m2();
		m3();
		
		
	}

	private static void m3() {
		/*
		되둘리기와 다시하기
		워드 프로세스 작업 중..
		1. "안넝하세요." 타이핑
		2. "안녕" -> "안녕" 수정
		3. "." -> "," 수정
		4. "홍길동님!" 추가
		 */

		Stack<String> history = new Stack<String>();
		Stack<String> redo = new Stack<String>();
		System.out.println("안녕하세요.");
		history.push("안넝하세요.");
		
		System.out.println("안녕하세요.");
		history.push("안녕으로 수정");

		System.out.println("안녕하세요,");
		history.push("쉼표로 교체");
		
		System.out.println("안녕하세요, 홍길동님!");
		history.push("홍길동님! 추가");
		
		String temp = history.pop();
		redo.push(temp);
		System.out.println("되돌리기 대상: " + temp);
		System.out.println("다시하기 대상: " + redo.pop());
		
		
	}

	private static void m2() {
		Stack<String> stack = new Stack<String>();
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");
		stack.push("주황");
		stack.push("녹색");
		
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.contains("노랑"));
		System.out.println(stack.get(0));
		
	}

	private static void m1() {
		Stack<String> stack = new Stack<String>();
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");
		
		System.out.println(stack.size());
		
		System.out.println(stack.pop());
		System.out.println(stack.size());
		
		System.out.println(stack.pop());
		System.out.println(stack.size());

		System.out.println(stack.pop());
		System.out.println(stack.size());
		
		System.out.println(stack.isEmpty());
	
		
	}

}
