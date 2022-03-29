package com.test.socket5;

public class Test {
	public static void main(String[] args) {
		try {
			String name = null;
			System.out.println(name.length());
		} catch (NullPointerException e) {
			System.out.println("먄");
		}
		
	}
}
