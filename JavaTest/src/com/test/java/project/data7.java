package com.test.java.project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class data3 {

	public static void main(String[] args) throws Exception{
		
		String path = "C:\\class\\oracle\\tblScorePercent.sql";
		BufferedWriter writer = new BufferedWriter(new FileWriter(path));
		
		Random rnd = new Random();
		String[] name =  { "CSS", "JDBC", "react.js", "오라클", "네트워크", "보안", "HTML", "C언어", "Python", "SQL", "UML", "JavaScript", "Java", "클라우드", "데이터베이스", "Front-end", "AWS", "Back-end", "Spring"};
		String[] name1 = { "기반", "기초", "활용", "설계", "전문", "구현"};
		String[] name2 = { "프로그래밍", "실습", "개론", "및 응용", "과목", "특강", "1", "2"};
		
		for(int i=0; i<50; i++) {
			String member = String.format("insert into tblScorePercent (os_seq, sp_seq, exam_per, skill_per, attendance_per)");
			writer.write(member);
			writer.newLine();
			int a = rnd.nextInt(20) + 20;
			int b = rnd.nextInt(20) + 30;
			int c = 100 - a - b;
			int num = rnd.nextInt(30);
			String file = "https://www.sycenter.net/document/";
			member = String.format("    values (%d, %d, %d, %d, %d);"
							, i+1
							, i+1
							, b
							, c
							, a);
			writer.write(member);
			writer.newLine();
			
		}
		writer.close();
		System.out.println("작성 완료");
	}
}
