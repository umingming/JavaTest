package com.test.question.fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Q02 {
	/*
	파일내 아라바인 숫자를 한글로 바꿔 다른 이름으로 저장하시오.
	- 0->영
	
	설계>
	1. String 변수를 수정할 파일의 경로로 초기화함.
	2. line 변수를 선언 후 null로 초기화함.
	3. BufferedReader, BufferedWriter 객체 생성
	4. while (line이 null이 아닐 때까지 반복함)
		>write()메소드 내에 변환메소드를 호출함.
		>newLine으로 enter추가함.
	5. 숫자를 한글로 변환하는 메소드
		>replace 이용해 숫자들을 한글로 바꿈.
	6. stream 종료
	 */

	public static void main(String[] args) {
		
		try {
			String newPath = Path.path + "\\숫자_변환.dat";
			String line = null;
			
			BufferedReader reader 
				= new BufferedReader(new FileReader(Path.Q02));
			BufferedWriter writer 
			= new BufferedWriter(new FileWriter(newPath));
			
			while((line = reader.readLine()) != null) {
				if(!line.equals("")) {
					writer.write(getKor(line));
				}
				
				writer.newLine();;
			}
			
			writer.close();
			reader.close();
			
			System.out.println("변환 후 다른 이름으로 저장하였습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String getKor(String line) {
		String temp = line.replace("0", "영");
		temp = line.replace("1", "일");
		temp = line.replace("2", "이");
		temp = line.replace("3", "삼");
		temp = line.replace("4", "사");
		temp = line.replace("5", "오");
		temp = line.replace("6", "육");
		temp = line.replace("7", "칠");
		temp = line.replace("8", "팔");
		temp = line.replace("9", "구");
		return line;
	}
}
