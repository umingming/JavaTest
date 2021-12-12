package com.test.java.project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class OSData {

	public static void main(String[] args) throws Exception{
		
		String path = "C:\\class\\oracle\\tblOpenSubject.sql";
		BufferedWriter writer = new BufferedWriter(new FileWriter(path));
		
		Random rnd = new Random();
		
		for(int i=0; i<80; i++) {
			String member = String.format("insert into tblOpenSubject (os_seq, subject_seq, oc_seq, os_startdate, os_enddate)");
			writer.write(member);
			writer.newLine();
			int yy = rnd.nextInt(22);
			int mm = rnd.nextInt(12)+1;
			int dd = rnd.nextInt(30)+1;
			int dd2 = rnd.nextInt(30)+1;
			member = String.format("    values (os_seq.nextVal, %d, %d, '%02d-%02d-%02d', '%02d-%02d-%02d');"
							, rnd.nextInt(60) + 1
							, rnd.nextInt(20) + 1
							, yy
							, mm
							, dd
							, yy
							, mm + 1
							, dd2);
			writer.write(member);
			writer.newLine();
			
		}
		writer.close();
		System.out.println("작성 완료");
	}
}
