package kr.co.aim.sorter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Main {
	public static void main(String[] args) throws IOException {
		File dir = new File("C:\\YouMe\\업무 파일\\220728");
		dir.mkdir();
		BasicFileAttributes attr = Files.readAttributes(dir.toPath(), BasicFileAttributes.class);
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh");
		System.out.println(format.format(attr.creationTime().toMillis()));
		System.out.println(attr.creationTime());
	}
}
