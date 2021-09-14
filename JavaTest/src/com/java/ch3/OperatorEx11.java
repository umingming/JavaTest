package com.java.ch3;

public class OperatorEx11 {

	public static void main(String[] args) {
		char a = 'a';
		char d = 'd';
		char zero = '0';
		char two = '2';
		
		System.out.printf("'%c' - '%c' = %d%n", d, a, d-a); //a - d = 3
		System.out.printf("'%c' - '%c' = %d%n", two, zero, two-zero); //2 - 0 = 2
		System.out.printf("'%c' = %d%n", a, (int)a); //a = 97
		System.out.printf("'%c' = %d%n", d, (int)d); //d = 101
		System.out.printf("'%c' = %d%n", zero, (int)zero); //d = 48
		System.out.printf("'%c' = %d%n", two, (int)two); //d = 50
		

	}

}
