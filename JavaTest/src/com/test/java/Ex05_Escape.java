package com.test.java;

public class Ex05_Escape {

	public static void main(String[] args) {
	
		String str;
		str = "안녕하세요.\r홍길동";
		System.out.println(str);
		
		String str2 = "하나\t둘\t셋\t넷";
		String str3 = "하나	둘	셋	넷";
	    System.out.println(str2);
	    System.out.println(str3);
	    int a = 10;
	    int b = 20;
	    System.out.println( a + " + " + b + " = " + (a + b) ); 
	    System.out.println( a + " + " + b + " = " + (a + b) ); 

	    int jumin = 0x9ffcf;  
	    System.out.println("주민번호: " + jumin);
	}

}
