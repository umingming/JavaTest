package kr.co.aim.sorter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Main {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\YouMe\\업무 파일\\2207\\220727\\desktop.ini");
		System.out.println(file.exists());
		File newFile = new File("C:\\Users\\user\\OneDrive - AIM System, Inc\\바탕 화면\\desktop.ini");
		System.out.println(newFile.exists());
		System.out.println(file.renameTo(newFile));
		System.out.println(newFile);
		System.out.println(file);
	}

	private static int countFile(File dir) {
		int count = 0;
		File[] fileList = dir.listFiles();
		for(File file : fileList) {
			count++;
		}
		
		return count;
	}
}
