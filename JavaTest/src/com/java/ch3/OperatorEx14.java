package com.java.ch3;

public class OperatorEx14 {

	public static void main(String[] args) {
		char c = 'a';
		for(int i=0; i<26; i++) {
			System.out.print(c++); //b, c, ... , z
		}
		System.out.println();
		
		c = 'A';
		for(int i=0; i<26; i++) {
			System.out.print(c++); //B, C, ... , Z
		}
		System.out.println();
		
		c = '0';
		for(int i=0; i<10; i++) {
			System.out.print(c++); //1, 2, ... , 10
		}
		System.out.println();
		
		

	}

}
