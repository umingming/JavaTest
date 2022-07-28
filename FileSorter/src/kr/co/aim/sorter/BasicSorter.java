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
	 	1. 폴더 경로 지정
	 	2. 하위 파일 존재 확인
	 		> 파일 생성날짜에 해당하는 폴더로 이동
	 */
	public static void main(String[] args) throws IOException {
		File dir = new File("C:\\Users\\user\\OneDrive - AIM System, Inc\\바탕 화면");
		File[] fileList = dir.listFiles();
		
		for (File file : fileList) {
			if(file.getName().indexOf('o') > 0) continue;
			
			BasicFileAttributes fileAttrs 
				= Files.readAttributes(file.toPath(), BasicFileAttributes.class);

			DateFormat format = new SimpleDateFormat("yyMMdd");
			String fileDate = format.format(fileAttrs.lastModifiedTime().toMillis());
			
			String newPath = String.format("C:\\YouMe\\업무 파일\\%s\\%s\\%s"
												, fileDate.substring(0, 4) 
												, fileDate
												, file.getName());
			File newFile = new File(newPath);
			newFile.mkdirs();
			
			System.out.println(newFile);
			System.out.println(file.renameTo(newFile));
		}
	}
	
	/*
		create directory; 해당 파일의 상위 폴더 생성
		1. 파일 날짜 확인 후, 변수에 초기화
		2. 날짜를 토대로 경로 선언 후, 파일 생성
		3. 해당 파일을 반환함.
	 */
	public static File createDirectory(File file) throws IOException {
		String fileDate = getFileDate(file);
		String path = String.format("C:\\YouMe\\업무 파일\\%s\\%s\\%s"
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
