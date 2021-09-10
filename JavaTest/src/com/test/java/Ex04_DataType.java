package com.test.java;

public class Ex04_DataType {

	public static void main(String[] args) {
		
		//byte
		byte b1;
		b1 = 10;
		b1 = -128;
		
		System.out.println("byte: " + b1);
		System.out.println();
		
		//short
		short s1;
		s1 = 10000;
		s1 = 32767;
		//s1 = 32768;
		s1 = -32768;
		//s1 = -32769;
		
		System.out.println("short: " + s1);
		
		//int
		int n1;
		n1 = 2100000000;
		n1 = Integer.MAX_VALUE;
		n1 = Integer.MIN_VALUE;
		
		System.out.println("int: " + n1);
		

		//long
		long l1;
		l1 = 100000000000l;
		l1 = Long.MAX_VALUE;
		l1 = 9223372036854775807l;
		l1 = Long.MIN_VALUE;
		
		
		System.out.println("long: " + l1);
		
		double d1 = 1.23456789901234567890;
		float f1 = 1.23456789901234567890f;
		
		System.out.println(d1);
		System.out.println(f1);
		
		char c1 = '5';
		System.out.println(c1);
		char n0 = '홍';
		char n2 = '길';
		char n3 = '동';
		System.out.println(n0 + n2 + n3);
		
		byte m1 = 10;
		short m2 = 10;
		int m3 = 10;
		long m4 = 10;
		
		//Serial Number : NA0125728
		String s = "NA0125728";
		String sn = "NA0125728";
		String serialNumber = "NA0125728";
		
		System.out.println(serialNumber);
		
		
		
		

	}

}
