package kr.co.aim.sorter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class BasicSorter {
	/*
	 	파일 분류
	 	1. 폴더 경로 지정 후 파일리스트 초기화
	 	2. 하위 파일 반복 확인
	 		> desktop.ini가 파일명이면 무시
	 		> 새로운 경로 지정
	 		> 수정 내역 확인
	 */
	public static void main(String[] args) throws IOException {
		File dir = new File("C:\\Users\\user\\Downloads");
		File[] fileList = dir.listFiles();
		
		for (File file : fileList) {
			if (file.getName().equals("desktop.ini")) continue;
			
			String newPath = String.format("%s\\%s"
											, createDirectory(file)
											, file.getName());
			System.out.printf("%s%n -> %s ", file, newPath);
			System.out.printf("[%s]%n", file.renameTo(new File(newPath)));
		}
	}
	
	/*
		create directory; 해당 파일의 상위 폴더 생성
		1. 파일 날짜 변수 선언
		2. 날짜를 토대로 경로에 해당하는 파일 생성
		3. 해당 파일을 반환함.
	 */
	public static File createDirectory(File file) throws IOException {
		String fileDate = getFileDate(file);
		String path = String.format("C:\\YouMe\\업무 파일\\%s\\%s"
										, fileDate.substring(0, 4) 
										, fileDate);
		File dir = new File(path);
		dir.mkdirs();
		
		return dir;
	}

	/*
	 	get file date
	 	1. 데이터 포맷 지정
		2. 파일 날짜 확인 후 변수에 초기화
	 */
	public static String getFileDate(File file) throws IOException {
		DateFormat format = new SimpleDateFormat("yyMMdd");

		BasicFileAttributes fileAttrs 
			= Files.readAttributes(file.toPath(), BasicFileAttributes.class);
		String fileDate = format.format(fileAttrs.lastModifiedTime().toMillis());

		return fileDate;
	}
}
