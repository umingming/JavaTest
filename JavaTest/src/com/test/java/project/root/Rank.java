package com.test.java.project.root;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class Rank {

	public static void main(String[] args) throws Exception{
		
		String path = "C:\\Users\\u_011\\git\\DeepRoot\\DeepRoot\\src\\com\\data\\학습량.txt";
		BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
		
		Random rnd = new Random();
		
		for(int i=0; i<1000; i++) {
			String cateNum = "C" + (i/100 + 1);
			int qNum = i%100 + 1;
			String content = String.format("%d■1■0■0■0■0■0■0■0"
							, i+1);
			
			System.out.println(content);
			writer.write(content);
			writer.newLine();
			
		}
		writer.close();
		System.out.println("작성 완료");
	}
}
