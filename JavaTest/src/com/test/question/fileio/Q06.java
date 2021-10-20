package com.test.question.fileio;

import java.io.FileReader;
import java.util.EmptyStackException;
import java.util.Stack;

public class Q06 {
	/*
	모든 괄호가 서로 짝이 맞는지 검사하시오.
	
	1. FileReader, Stack 객체 생성
	2. int 변수 선언 후 초기화.
	3. while문 char가 -1이 아닐 때까지 반복함.
		>if char이 (, {인지? Stack에 추가함
		>if char이 ), }인지? Stack에서 꺼냄.
	4. stream 종료
	5. if Stack 크기가 0인지?
		>올바른/ 올바르지 않은 소스입니다.
	 */

	public static void main(String[] args) {
		
		try {
			FileReader reader = new FileReader("C:\\class\\java\\file\\check.txt");
			Stack<Integer> stack = new Stack<Integer>();
			
			int ch = 0;
			
			while((ch = reader.read()) != -1) {
				if(ch == '(' || ch == '{') {
					stack.push(ch);
				} else if (ch == ')' || ch == '}') {
					stack.pop();
				}
			}
			
			reader.close();
			
			if(stack.size() == 0) {
				System.out.println("올바른 소스입니다.");
			} else {
				System.out.println("올바르지 않은 소스입니다.");
			}
			
		} catch (EmptyStackException ee) {
			System.out.println("올바르지 않은 소스입니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
