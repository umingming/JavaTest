package com.test.parser;

import java.io.BufferedReader;
import java.io.FileReader;

public class Test2 {
	
	/*
		xml을 화면에 출력하는 프로그램
		
		1. xml 파일의 경로인 path를 매개로 print 메소드 호출
		2. print 메소드
			> path를 매개로 BufferedReader 생성
			> String으로 line 변수 선언
			> while문 line = reader.readLine() != null을 조건으로 사용
				> line 출력함.
	 */
	public static void main(String[] args) {
		try {
			print(Path.Mill_FDCData);
			print(Path.OPC_TagMap_Mill);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void print(String path) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(path));
		
		String line = null;
		while((line = reader.readLine()) != null) {
			System.out.println(line);
		}
	}
}
