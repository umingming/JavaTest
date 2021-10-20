package com.test.question.fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Q01 {

	public static void main(String[] args) {
		/*
		특정 이름을 찾아 다른 이름으로 변환 후 해당 파일을 다른 이름으로 저장.
		유재석 -> 메뚜기
		
		설계>
		1. String 변수 선언 후 이름수정_변환의 경로로 초기화
		2. String 변수 선언 후 null 로 초기화 
		3. BufferedReader 객체 생성(FileReader를 매개로 사용)
		4. BufferedWriter 객체 생성
		5. While문 (line이 null이 아닐 때까지 반복)
			>if문 line이 공백인지?
				>replace() 이용해 유재석을 메뚜기로 바꾸고 writer로 파일에 추가함
			>newLine으로 줄 바꿈.
		6. 스트림 닫기
		 */
		
		try {
			String newPath = Path.path + "\\이름수정_변환.dat";
			String line = null;
			String txt = "";
			
			BufferedReader reader 
				= new BufferedReader(new FileReader(Path.Q01));
			BufferedWriter writer 
			= new BufferedWriter(new FileWriter(newPath));
			
			while((line = reader.readLine()) != null) {
				if(!line.equals("")) {
					writer.write(line.replace("유재석", "메뚜기"));
				}
				writer.newLine();
			}
			
			reader.close();
			writer.close();
			
			System.out.println("변환 후 다른 이름으로 저장하였습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
