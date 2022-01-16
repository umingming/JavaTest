package com.test.java.project.goguma;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Stack;

public class SQL {

	public static void main(String[] args) {
		
		try {
			String path = "C:\\유미\\goguma\\순서.txt";
			Stack<String> stack = new Stack<String>();
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			String line = null;
			while ((line = reader.readLine()) != null) {
				stack.push(line);
			}

			reader.close();
			
			String newPath = "C:\\유미\\goguma\\순서2.txt";
			BufferedWriter writer = new BufferedWriter(new FileWriter(newPath));
			
			int size = stack.size();
			for(int i=0; i<size; i++) {
				String tmp = stack.pop();
				System.out.println(tmp);
				writer.write(tmp);
				writer.newLine();
			}
			writer.close();
			System.out.println("작성 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
