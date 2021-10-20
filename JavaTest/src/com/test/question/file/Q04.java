package com.test.question.file;

import java.io.File;

public class Q04 {

	public static void main(String[] args) {
		/*
		음악 파일명 앞에 일련 번호를 붙이시오.
		
		설계>
		1. 음악 디렉토리 경로를 참조하는 파일 객체 생성
		2. 파일 변수 선언 후 객체의 리스트로 초기화
		3. for문 배열의 길이
			>printf로 일련번호와 함께 출력 %03d사용
		 */

		File dir = new File("C:\\java\\file\\파일_디렉토리_문제\\음악 파일\\Music");
		File[] list = dir.listFiles();

		for(int i=0; i<list.length; i++) {
			System.out.printf("[%03d]%s%n", i+1, list[i].getName());
		}
	}
}