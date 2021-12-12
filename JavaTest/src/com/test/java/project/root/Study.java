package com.test.java.project.root;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class Study {

	public static void main(String[] args) throws Exception{
		
		String path = "C:\\Users\\u_011\\git\\DeepRoot\\DeepRoot\\src\\com\\data\\학습.txt";
		BufferedWriter writer = new BufferedWriter(new FileWriter(path));
		
		Random rnd = new Random();
		
		for(int i=0; i<1000; i++) {
			String userNum = "U0004";
			String cateNum = "C" + (i/100 + 1);
			int qNum = i%100 + 1;
			String content = String.format("%d■%d■%d■%s"
							, i+1
							, i/100 + 1
							, i%100 + 1
							, "true");
//							, rnd.nextBoolean());
			
			System.out.println(content);
			writer.write(content);
			writer.newLine();
			
		}
		writer.close();
		System.out.println("작성 완료");
	}
}
