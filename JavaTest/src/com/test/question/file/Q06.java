package com.test.question.file;

import java.io.File;

public class Q06 {
	public static void main(String[] args) {
	/*
	파일의 크기가 0byte면 삭제하시오.
	
	설계>
	1. 파일 제거 디렉토리의 경로를 참조하는 File 객체 생성
	2. listFiles로 File 배열 선언
	3. Count 변수 선언
	4. for문 배열 반복
		>if 0byte 파일인지?
			>delete
	5. 몇 개 삭제했는지 출력
	 */
	
		File dir = new File("C:\\java\\file\\파일_디렉토리_문제\\파일 제거");
		File[] list = dir.listFiles();
		int count = 0;
		
		for(int i=0; i<list.length; i++) {
			if(list[i].isFile() && list[i].length() == 0) {
				list[i].delete();
				count++;
			}
		}
		
		System.out.printf("총 %d개의 파일을 삭제했습니다.%n", count);
	}
}