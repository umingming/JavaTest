package com.test.java.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex47_String {

	public static void main(String[] args) throws Exception{
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "홍";
		s3 += "길동";
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("입력 : ");
		String s4 = reader.readLine();

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		System.out.println(s3 == s4);
		
		System.out.println(equals(s1, s2));
		System.out.println(equals(s1, s3));
		System.out.println(equals(s1, s4));
		System.out.println(equals(s3, s4));

//		Ex47_String ex = new Ex47_String();
//		ex.aaa();
//		bbb();
		

	}//main
	
	public static boolean equals(String str1, String str2) {
		
		if(str1.length() != str2.length()){
			return false;
		}
		
		for(int i=0; i<str1.length(); i++) {
			char c1 = str1.charAt(i);
			char c2 = str2.charAt(i);
			
			if(c1 != c2) {
				return false;
			}
		}
		
		return true;
	}
	
	public void aaa() {
		
	}

	public static void bbb() {
		
	}

}
