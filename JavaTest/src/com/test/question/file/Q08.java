package com.test.question.file;

import java.io.File;

public class Q08 {
	
	private static int count;
	private static int dcount;

	public static void main(String[] args) {
		/*
		delete 폴더 삭제하시오.
		
		설계>
		1. field; 삭제 폴더와 파일의 count 변수 선언
		2. delete 메소드 선언
			>매개값을 이용해 파일 배열 선언
			>향상된 for문으로 배열 반복
				>if 파일인지?
					>delete, count++
			>향상된 for문으로 배열 반복
				>if 폴더인지?
					>delete, count++
					>다시 delete 메소드 호출
		3. 폴더 삭제 디렉토리를 경로로 하는 File 객체 생성
		4. delete 메소드 호출
		5. 결과 출력
		 */
		
		File dir = new File("C:\\java\\file\\파일_디렉토리_문제\\폴더 삭제");
		delete(dir);
		System.out.println("폴더를 삭제했습니다.");
		System.out.printf("삭제된 폴더는 %d개이고, 파일은 %d개입니다. %n", dcount, count);

	}
	
	private static void delete(File dir) {
		File[] list = dir.listFiles();
		
		for(File subfile : list) {
			if(subfile.isFile()) {
				subfile.delete();
				count++;
			}
		}
		
		for(File subdir : list) {
			if(subdir.isDirectory()) {
				subdir.delete();
				dcount++;
				delete(subdir);
			}
		}
	}
}