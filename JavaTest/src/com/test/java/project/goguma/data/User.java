package com.test.java.project.goguma.data;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class User {

	public static void main(String[] args) throws Exception{
		
		String path = "C:\\유미\\goguma\\tblUser.txt";
		BufferedWriter writer = new BufferedWriter(new FileWriter(path));
		
		Random rnd = new Random();
		
		
		for(int i=0; i<100; i++) {
			String member = String.format("insert into tblUser (id, password, user_level) values ('%s', '%s', %d);"
					, "user" + (i+1)
					, "pw" + (rnd.nextInt(100000) + 1000)
					, 1);
								
							
			System.out.println(member);
			writer.write(member);
			writer.newLine();
			
		}
		writer.close();
		System.out.println("작성 완료");
	}
}
