package com.test.java.obj;

public class Ex64_Wrapper {

	public static void main(String[] args) {
		
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Double.MIN_VALUE);
//		
//		System.out.println(Integer.parseInt("100") + 200);
//		
//		System.out.println(Integer.compare(5, 5));
//		System.out.println(compareInt(5, 5));
//		System.out.println(compareInt(10, 5));
//		System.out.println(compareInt(5, 10));
//		
//		System.out.println(Integer.max(5, 5));
		
//		System.out.println(Integer.compareUnsigned(-10, 5));
//		System.out.println(Integer.toBinaryString(10));
//		System.out.println(Integer.toOctalString(10));
//		System.out.println(Integer.toHexString(0));

//		System.out.println(compareString("홍길동", "홍길개"));
//		System.out.println("홍길동".compareTo("아무개"));
		String s1 = "JAVA";
		String s2 = "java";
		System.out.println(compareString(s1, s2));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
	}
	
	public static int compareInt(int a, int b) {
//		if(a > b) {
//			return a;
//		} else if (a < b) {
//			return -1;
//		} else {
//			return 0;
//		}
		
		return a - b;
	}
	
	public static int compareString(String s1, String s2) {
		int length = Integer.min(s1.length(), s2.length());
		for(int i=0; i<length; i++) {
//			System.out.printf("%c-%c%n", s1.charAt(i), s2.charAt(i));
			
			if(s1.charAt(i) > s2.charAt(i)) {
				return 1;
			} else if(s1.charAt(i) < s2.charAt(i)) {
				return -1;
			}
		}
		if(s1.length() > s2.length()) {
			return 1;
		} else if(s1.length() < s2.length()) {
			return -1;
		} else {
			return 0;
		}
	}
}
