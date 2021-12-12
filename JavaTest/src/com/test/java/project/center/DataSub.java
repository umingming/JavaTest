package com.test.java.project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class data3 {

	public static void main(String[] args) throws Exception{
		
		String path = "C:\\class\\oracle\\tblSubject.sql";
		BufferedWriter writer = new BufferedWriter(new FileWriter(path));
		
		Random rnd = new Random();
		String[] name =  { "CSS", "JDBC", "react.js", "오라클", "네트워크", "보안", "HTML", "C언어", "Python", "SQL", "UML", "JavaScript", "Java", "클라우드", "데이터베이스", "Front-end", "AWS", "Back-end", "Spring"};
		String[] name1 = { "기반", "기초", "활용", "설계", "전문", "구현"};
		String[] name2 = { "프로그래밍", "실습", "개론", "및 응용", "과목", "특강", "1", "2"};
		
		for(int i=0; i<50; i++) {
			String member = String.format("insert into tblSubject (subject_seq, subject_name, subject_period)");
			writer.write(member);
			writer.newLine();
			int yy = rnd.nextInt(22);
			int mm = rnd.nextInt(12) + 1;
			int dd = rnd.nextInt(30) + 1;
			int dd2 = rnd.nextInt(30);
			String file = "https://www.sycenter.net/document/";
			member = String.format("    values (subject_seq.nextVal, '%s', %.1f);"
							, name[rnd.nextInt(name.length)] + " "
								+ name1[rnd.nextInt(name1.length)] + " "
								+ name2[rnd.nextInt(name2.length)]
							, rnd.nextInt(4) + rnd.nextDouble() + 0.5);
			writer.write(member);
			writer.newLine();
			
		}
		writer.close();
		System.out.println("작성 완료");
	}
}
