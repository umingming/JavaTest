package com.test.java.project.root;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class WrongAnswer {

	public static void main(String[] args) throws Exception{
		
		String path = "C:\\Users\\u_011\\git\\DeepRoot\\DeepRoot\\src\\com\\data\\오답.txt";
		BufferedWriter writer = new BufferedWriter(new FileWriter(path));
		
		Random rnd = new Random();
		
		for(int i=0; i<300; i++) {
			String userNum = "U0001";
			String cateNum = "C" + (i/20 + 1);
			int qNum = i%20 + 1;
			int y = 20211201;
			String content = String.format("%d■%d■%d■%d"
							, i+1
							, i/30+1
							, i%30+1
							, y+(i%30)/3);
			
			System.out.println(content);
			writer.write(content);
			writer.newLine();
			
		}
		writer.close();
		System.out.println("작성 완료");
	}
}
