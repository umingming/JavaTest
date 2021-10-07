package com.test.java.string;

public class Ex48_StringBuilder {

	public static void main(String[] args) {
//		String s1 = "홍길동";
//		String s3 = new String("홍길동");
//		StringBuilder s2 = new StringBuilder("홍길동");
//		System.out.println(s2);
//		System.out.println(s2.substring(0,1));
		
		String txt1 = "홍길동";
		
		long begin = System.currentTimeMillis();
		for(int i=0; i<300000; i++) {
			txt1 += ".";
		}
		
		long end = System.currentTimeMillis();
		System.out.println(txt1.length());
		System.out.println(end-begin);
		
		System.out.println("[StringBuilder]");
		
		StringBuilder txt2 = new StringBuilder("홍길동");
		begin = System.currentTimeMillis();
		for(int i=0; i<300000; i++) {
			txt2.append("."); // txt2 = txt2 + "."
		}
		end = System.currentTimeMillis();
		
		System.out.println(txt2.length());
		System.out.println(end-begin);
		
	}//main

}
