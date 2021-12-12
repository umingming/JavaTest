package com.test.java.project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class data2 {

	public static void main(String[] args) throws Exception{
		BufferedWriter writer = new BufferedWriter(new FileWriter("data\\member.dat"));
		
		Random rnd = new Random();
		
		String[] name1 =  { "김", "이", "박", "최", "정", "강", "한", "주", "임"};
		String[] name2 =  { "수", "준", "선", "희", "하", "얀", "정", "진",
							"유", "미", "민", "섭"};
		
		String[] address1 = { "서울시", "인천시", "부산시", "대전시", "광주시"};
		String[] address2 = { " 중구", " 북구", " 남구", " 서구", " 동구"};
		String[] address3 = { " 쌍용동", " 자바동", " 호호동", " 뫄뫄동", " 오잉동"};
		
		
		for(int i=0; i<100; i++) {
			
			String member = String.format("%d,%s,%d,%s,%s,%s"
							, i+1 
							, name1[rnd.nextInt(name1.length)]
								+ name2[rnd.nextInt(name2.length)]
								+ name2[rnd.nextInt(name2.length)]
							, rnd.nextInt(60) + 10
							, rnd.nextBoolean() ? "F" : "M"
							, "010" + (rnd.nextInt(9000)+1000) + (rnd.nextInt(9000)+1000)
							, address1[rnd.nextInt(address1.length)]
								+ address2[rnd.nextInt(address2.length)]
								+ address3[rnd.nextInt(address3.length)]);
			writer.write(member);
			writer.newLine();
			
		}
		writer.close();
		System.out.println("작성 완료");

	}

}
