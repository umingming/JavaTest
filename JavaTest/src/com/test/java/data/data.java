package com.test.java.data;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class data {

	public static void main(String[] args) throws IOException {
		String[] name = {"홍길동", "아무개", "하하하"};
		BufferedWriter writer = new BufferedWriter(new FileWriter("member.sql"));
		
		for(int i=0; i<3; i++) {
			String sql = String.format("insert into values (memberSeq.nextVal, '%s')", name[i]);
			writer.write(sql+"\r\n");
			
		}
		

		writer.close();
	}
}
