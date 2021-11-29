package com.test.java.project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class data3 {

	public static void main(String[] args) throws Exception{
		
		String path = "C:\\class\\oracle\\tblBook.sql";
		BufferedWriter writer = new BufferedWriter(new FileWriter(path));
		
		Random rnd = new Random();
		String[] n1 =  { "모두의 ", "기초 ", "쉬운 " , "응용 ", ""};
		String[] n2 = { "CSS", "JDBC", "react.js", "오라클", "네트워크", "보안", "HTML", "C언어", "Python", "SQL", "UML", "JavaScript", "Java", "클라우드", "데이터베이스", "AWS", "Spring"};
		String[] n3 = { " 수업", "", " 정석", " 개론", " 실습", " 지식", " 이해하기", " 공부", " 노트", "의 모든 것"};
		
		String[] p1 = { "(주)", ""};
		String[] p2 = { "한", "명", "국", "사", "장", "갑", "당", "미", "유"};
		String[] p3 = { "청", "월", "꿈", "사", "빛", "갑", "당", "미", "유", ""};
		String[] p4 = { "출판사", "출판", "북스", "아카데미", "미디어", "책방", "라이프"};
		
		
		for(int i=0; i<50; i++) {
			String member = String.format("insert into tblBook (book_seq, book_name, book_publisher, book_price, subject_seq)");
			writer.write(member);
			writer.newLine();
			int a = rnd.nextInt(20) + 20;
			int b = rnd.nextInt(20) + 30;
			int c = 100 - a - b;
			int num = rnd.nextInt(30);
			String file = "https://www.sycenter.net/document/";
			member = String.format("    values (book_seq.nextVal, '%s', '%s', %d, %d);"
							, n1[rnd.nextInt(n1.length)]
							 + n2[rnd.nextInt(n2.length)]
							 + n3[rnd.nextInt(n3.length)]
							, p1[rnd.nextInt(p1.length)]
							 + p2[rnd.nextInt(p2.length)]
							 + p3[rnd.nextInt(p3.length)]
							 + p4[rnd.nextInt(p4.length)]
							, rnd.nextInt(30) * 1000 + 10000
							, rnd.nextInt(50)+1);
			writer.write(member);
			writer.newLine();
			
		}
		writer.close();
		System.out.println("작성 완료");
	}
}
