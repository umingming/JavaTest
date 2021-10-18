package com.test.java.file;

import java.io.File;
import java.util.Calendar;

public class Ex71_File {
	
	public static void main(String[] args) {
		/*
		파일, 디렉토리 조작
		파일 입출력
		
		
		 */
		
//		m1();
//		m2();
//		m3();
//		m4();
		m5();
		
	}

	private static void m5() {
		File file = new File("C:\\class\\java\\file\\data.txt");
		if(file.exists()) {
			System.out.println(file.delete());
		} else {
			System.out.println("파일이 없습니다.");
		}
	
		
	}

	private static void m4() {
		String path = "C:\\class\\java\\file\\hello.txt";
		File file = new File(path);
		if(file.exists()) {
			File moveFile = new File("C:\\class\\java\\file\\move\\hello.txt"); 
			file.renameTo(moveFile);
			System.out.println("완료");
		} else {
			System.out.println("파일이 없습니다.");
		}
	}

	private static void m3() {
		/*
		파일 조작
		생성, 복사, 이동, 파일명 수정, 삭제
		파일명 수정하기
		 */
		String path = "C:\\class\\java\\file\\data.txt";
		File file = new File(path);
		if(file.exists()) {
			File renameFile = new File("C:\\class\\java\\file\\hello.txt"); 
			file.renameTo(renameFile);
			System.out.println("완료");
		} else {
			System.out.println("파일이 없습니다.");
		}
		
	}

	private static void m2() {
		/*
		디렉토리는 파일의 한 종류로 부피가 없는 파일
		디렉토리의 크기는 모든 파일의 합
		통상적인 디렉토리의 크기는 개발자가 직접 계산함.
		 */
		String path = "C:\\class\\java\\file";
		File dir = new File(path);
		
		if(dir.exists()) {
			
		}else {
			System.out.println("없습니다.");
		}
		
	}

	private static void m1() {
		String path = "C:\\class\\java\\file\\data.txt";
		File file = new File(path);
		System.out.println(file.exists());
		System.out.println(file.lastModified());
		
		Calendar c2 = Calendar.getInstance();
		c2.setTimeInMillis(file.lastModified());
		System.out.printf("%tF %tT", c2, c2);
		System.out.println(file.canRead());
		
		
	}

}
