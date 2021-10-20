package com.test.question.file;

import java.io.File;
import java.util.ArrayList;

public class Q09 {

	public static void main(String[] args) {
		/*
		모든 폴더 내의 파일들을 한번에 크기를 비교하고 크기가 큰 순으로 정렬
		
		설계>
		1. 크기 정렬 디렉토리를 경로로 하는 File 객체 생성
		2. File을 매개로 하는 ArrayList 객체 생성
		3. addFile, bubbleFile 메소드 호출
		4. addFile 메소드 
			>File 객체로 File 배열 선언
			>향상된 for문으로 배열 반복
				>if file인가?
					>ArrayList에 저장
			>향상된 for문으로 배열 반복
				>if dir인가?
					>addFile 메소드 호출
		5. bubbleFile메소드 
			>for문 ArrayList의 크기 -1 반복
				>for문 ArrayList의 크기 -1 -i 반복
					>if j가 j+1번째 요소보다 큰지?
						>temp File 생성해 j번째 요소 저장
						>set메소드로 j번째에 j+1, j+1에 temp값 저장
		6. for문 ArrayList 객체 반복
			>파일명, 크기, 폴더 출력
				>크키는 KB로 바꿀 것.
		 */
		
		File dir = new File("C:\\java\\file\\파일_디렉토리_문제\\크기 정렬");
		ArrayList<File> file = new ArrayList<File>();
		
		addFile(dir, file);
		bubbleFile(file);
		
		System.out.println("[파일명]\t[크기]\t[파일이 들어있는 폴더]");
		for(int i=0; i<file.size(); i++) {
			System.out.printf("%s\t%.1fKB\t%s%n", 
					file.get(i).getName(), 
					((double)file.get(i).length()/1024), 
					file.get(i).getParent().substring(file.get(i).getParent().lastIndexOf("\\")+1));
		}

	}

	private static void bubbleFile(ArrayList<File> file) {
		for(int i=0; i<file.size()-1; i++) {
			for(int j=0; j<file.size()-1-i; j++) {
				if(file.get(j).length() < file.get(j+1).length()) {
					File temp = file.get(j);
					file.set(j, file.get(j+1));
					file.set(j+1, temp);
				}
			}
		}
	}

	private static void addFile(File dir, ArrayList<File> file) {
		File[] list = dir.listFiles();
		for(File subfile : list) {
			if(subfile.isFile()) {
				file.add(subfile);
			}
		}
		for(File subdir : list) {
			if(subdir.isDirectory()) {
				addFile(subdir, file);
			}
		}
	}
}