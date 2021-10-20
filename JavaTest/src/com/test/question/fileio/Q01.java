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
		1. String 변수 선언 후 이름수정 파일의 경로와 이름수정_변환의 경로로 초기화
		2. String 변수 선언 후 null 과 ""로 초기화 
		3. BufferedReader 객체 생성(FileReader를 매개로 사용)
		4. While문 (line이 null이 아닐 때까지 반복)
			>if문 line이 공백인지?
				>replace() 이용해 유재석을 메뚜기로 바꾸고 txt에 추가함.
			>txt에 엔터 추가함.
		5. BufferedWriter 객체 생성, 파일명은 이름수정_변환.dat
		6. writer로 text를 읽음.
		7. 스트림 닫기
		 */
		
		try {
			String path = Path.Q01;
			String newPath = Path.path + "\\이름수정_변환.dat";
			String line = null;
			String txt = "";
			
			BufferedReader reader 
				= new BufferedReader(new FileReader(path));
			
			while((line = reader.readLine()) != null) {
				if(!line.equals("")) {
					txt += line.replace("유재석", "메뚜기");
				}
				
				txt += "\r\n";
			}
			
			BufferedWriter writer 
				= new BufferedWriter(new FileWriter(newPath));
			
			writer.write(txt);
			
			reader.close();
			writer.close();
			
			System.out.println("변환 후 다른 이름으로 저장하였습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
