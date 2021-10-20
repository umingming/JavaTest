package com.test.question.file;

import java.io.File;
import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		특정 파일의 경로를 입력 받아 정보를 출력하시오.
		-파일 크기 단위 변환 출력(1024기준)
		
		설계>
		1. Scanner
		2. String 변수 선언 후 입력 받음
		3. File 객체에 참조 
		4. if 존재하는 "파일"인지?
			>파일명 출력 getName()
			>종류 출력 subString()
			>size 변수를 overThousand메소드의 리턴 값으로 초기화
			>swtich문 count
			>0~4 -> B~TB 변환
			>size 출력시 소수이하 1자리만
		5. void overThousand
			>count static 변수 선언
			>while (size > 1000)
				>size/1024
				>count++
			>size를 리턴함.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("파일 경로 : ");
		String path = scan.nextLine();
		File file = new File(path);
		
		if(file.exists() && file.isFile()) {
			String fileName = file.getName();
			System.out.printf("파일명 :%s%n", fileName);
			System.out.printf("종류 :%s 파일%n", fileName.substring(fileName.indexOf(".") + 1));
			
			double sizeNum = overthousand(file.length());
			String sizeStr = "";
			
			switch (count) {
			case 0 : sizeStr = "B"; break;
			case 1 : sizeStr = "KB"; break;
			case 2 : sizeStr = "MB"; break;
			case 3 : sizeStr = "GB"; break;
			case 4 : sizeStr = "TB"; break;
			}
			System.out.printf("파일 크기 : %.1f%s%n", sizeNum, sizeStr);
			
		} else {
			System.out.println("잘못된 파일 경로입니다.");
		}

	}
	
	private static int count;
	
	private static double overthousand(double size){
		while(size > 1000) {
			size /= 1024;
			count++;
		}	
		return size;
	}
}