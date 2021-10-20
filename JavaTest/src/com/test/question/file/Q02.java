package com.test.question.file;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		/*
		특정 폴더의 특정 파일만을 출력하시오.
		-확장자 대소문자 구분없이
		
		설계>
		1. Scanner
		2. 폴더와 확장자 변수 선언 후 입력된 값으로 초기화함.
		3. 폴더 경로를 참조해 File 객체 생성.
		4. listFiles()로 File 배열 선언함.
		5. for문으로 배열 반복
			>if문 해당 파일이 입력 받은 확장자와 일치하는지?
				>파일명 출력함.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("폴더 선택 : ");
		String path = scan.nextLine();
		System.out.print("파일 확장자 : ");
		String extention = scan.nextLine();
		
		File dir = new File(path);
		File[] list = dir.listFiles();
		
		for(int i=0; i<list.length; i++) {
			String name = list[i].getName();
			if(list[i].isFile() && 
					(name.substring(name.lastIndexOf(".") + 1).equalsIgnoreCase(extention))){
				System.out.print(name);
			}
		}
	}

}