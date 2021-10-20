package com.test.java.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex72_File {

	public static void main(String[] args) {
		m1();
		

	}

	private static void m1() {
		try {
			FileOutputStream stream 
			= new FileOutputStream("C:\\class\\java\\file\\list.txt");
			
			stream.write(65);
			stream.write(66);
			stream.write(67);
			
			stream.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} //프로그램 -> 파일
		
		
		
	}

}
