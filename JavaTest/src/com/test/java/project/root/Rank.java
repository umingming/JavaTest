package com.test.java.project.root;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class Rank {

	public static void main(String[] args) throws Exception{
		
		String path = "C:\\Users\\u_011\\git\\DeepRoot\\DeepRoot\\src\\com\\data\\회원_득점.txt";
		BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
		
		Random rnd = new Random();
		
		for(int i=0; i<1000; i++) {
			String cateNum = "C" + (i/100 + 1);
			int qNum = i%100 + 1;
			String content = String.format("U%04dC1Q1■S%08dU%04dC1Q1"
							, i+1
							, i*i+i
							, i+1);
			
			System.out.println(content);
			writer.write(content);
			writer.newLine();
			
		}
		writer.close();
		System.out.println("작성 완료");
	}
}
