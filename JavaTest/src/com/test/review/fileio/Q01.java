package com.test.review.fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Q01 {

	public static void main(String[] args) {
		/*
		파일내에서 특정 이름을 찾아 다른 이름으로 변환 후 해당 파일을 다른 이름으로 저장하시오.
		유재석 -> 메뚜기
		
		설계>
		1. 이름수정 파일을 경로로 하는 BuferredReader
		2. BufferedWriter
		3. line 변수 선언
		4. while문 line이 null이 아니면 반복
			>line 내 유재석을 메뚜기로 변경함
			>write로 쓰기
			>nextLine으로 개행
		5. stream 종료
		 */
		
		String s = "저는 홍길동입니다.";
		System.out.println(s.replace("홍길동", "길동이"));
		System.out.println(s);
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(Path.Q01));
			BufferedWriter writer = new BufferedWriter(new FileWriter(Path.path + "\\이름수정_변환.dat"));
			String line = null;
			while ((line = reader.readLine()) != null) {
				line.replace("유재석", "메뚜기");
				writer.write(line);
				writer.newLine();
			}
			
//			System.out.println("변환 후 다른 이름으로 저장하셨습니다.");
			
			writer.close();
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		

	}

}
