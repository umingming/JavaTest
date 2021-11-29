package com.test.java.project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class data3 {

	public static void main(String[] args) throws Exception{
		
		String path = "C:\\class\\oracle\\tblTest.sql";
		BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
		
		Random rnd = new Random();
		String[] type =  { "필기", "실기" };
		
		for(int i=0; i<120; i++) {
			String member = String.format("insert into tblTest (test_seq, test_file, os_seq, test_type, test_date)");
			writer.write(member);
			writer.newLine();
			int yy = rnd.nextInt(22);
			int mm = rnd.nextInt(12) + 1;
			int dd = rnd.nextInt(30) + 1;
			int dd2 = rnd.nextInt(30);
			String file = "https://www.sycenter.net/document/";
			member = String.format("    values (test_seq.nextVal, '%s%05d', %d, '%s', '%02d-%02d-%02d');"
							, file
							, rnd.nextInt(1000) + 20
							, rnd.nextInt(60) + 1
							, type[rnd.nextInt(type.length)]
							, yy
							, mm
							, dd);
			writer.write(member);
			writer.newLine();
			
		}
		writer.close();
		System.out.println("작성 완료");
	}
}
