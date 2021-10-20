package com.test.question.file;

import java.io.File;

public class Q10 {

	public static void main(String[] args) {
		/*
		각 파일들을 아래의 조건에 따라 폴더를 나누어 정렬하시오.
		-1차 : 직원 이름 폴더 생성
		-2차 : 년도별로 폴더 생성
		-3차 : 각 파일을 직원 > 년도 폴더에 이동
		
		설계>
		1. 직원을 경로를 참조하는 File 객체 생성
		2. 객체를 사용해 배열 선언
		3. for문 객체 반복
			>새로운 경로 선언 후 원 경로에 이름, 년도 추가
			>substring으로 경로에 이름 추가
			>새 경로를 참조하는 파일 생성 후 mkdirs로 디렉토리 만들기
			>새 경로에 파일명 추가
			>경로를 참조하는 객체 만들고 파일 이동함.
		 */
		
		String path = "C:\\java\\file\\파일_디렉토리_문제\\직원";
		File dir = new File(path);
		File[] file = dir.listFiles();
		
		for(int i=0; i<file.length; i++) {
			String newPath = String.format("%s\\%s\\%s",
						path,
						file[i].getName().substring(0,3),
						file[i].getName().substring(4,8));
					
			File newDir = new File(newPath);
			newDir.mkdirs();
			
			newPath += file[i].getName();
			File newFile = new File(newPath);
			file[i].renameTo(newFile);
		}
		
		System.out.println("분류가 완료되었습니다.");

	}
}