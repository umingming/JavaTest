package com.test.java.project.root;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class WrongAnswer {

	public static void main(String[] args) throws Exception{
		
		String path = "C:\\Users\\u_011\\git\\DeepRoot\\DeepRoot\\src\\com\\data\\오답_공책.txt";
		BufferedWriter writer = new BufferedWriter(new FileWriter(path));
		
		Random rnd = new Random();
		
		for(int i=0; i<100; i++) {
			String userNum = "U0001";
			String cateNum = "C" + (i/20 + 1);
			int qNum = i%20 + 1;
			int y = 20211201;
			String content = String.format("S%08d%s%sQ%03d■%d"
							, i*i*i+i+1
							, userNum
							, cateNum
							, qNum
							, y + i/10);
			
			System.out.println(content);
			writer.write(content);
			writer.newLine();
			
		}
		writer.close();
		System.out.println("작성 완료");
	}
}
