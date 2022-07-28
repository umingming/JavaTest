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
			if (file.getName().indexOf('o') > 0) continue;
			System.out.println(file);
			BasicFileAttributes fileAttrs = null;
			fileAttrs = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
			DateFormat format = new SimpleDateFormat("yyMMdd");
			String creationTime = format.format(fileAttrs.lastModifiedTime().toMillis());
			
			String newDirPath = String.format("C:\\YouMe\\업무 파일\\%s\\%s\\" 
												, creationTime.substring(0, 4) 
												, creationTime);
			File newDir = new File(newDirPath);
			newDir.mkdirs();
			File newFile = new File(newDirPath + file.getName());
			System.out.println(newFile);
			System.out.println(file.renameTo(newFile));
		}
	}
}
