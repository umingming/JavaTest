package com.test.review.fileio;

import java.io.FileReader;
import java.util.Stack;

public class Q06 {

	public static void main(String[] args) {
		/*
		설계> 
		1. FileOutputReader
		2. Stack
		3. int = -1;
		4. while (int가 -1이면 끝)
			>if int가 {, (
				>Stack에 저장
			>if }, )
				>Stack에서 꺼내기.
		 */
		
		try {
			FileReader reader = new FileReader(Path.Q06);
			Stack stack = new Stack();
			int ch = -1;
			while((ch = reader.read()) != -1 ) {
				if(ch == '{' || ch == '(') {
					stack.push(ch);
				} else if (ch == '}' || ch == ')') {
					stack.pop();
				}
			}
			
			if(stack.size() == 0) {
				System.out.println("올바른 소스입니다.");
			} else {
				System.out.println("올바르지 않은 소스입니다.");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
