package kr.co.aim.sorter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Main {
	public static void main(String[] args) throws IOException {
		File dir = new File("C:\\YouMe\\교육");
		System.out.println(countFile(dir));
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
