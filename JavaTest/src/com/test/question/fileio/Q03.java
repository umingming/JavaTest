package com.test.question.fileio;

import java.io.BufferedReader;
import java.io.FileReader;

public class Q03 {
	/*
	파일 내의 성적을 확인 후 합격자, 불합격자 명단을 출력하시오.
	-합격 조건; 3과목 평균 60점 이상이고 40점 미만이 없음.
	
	설계>
	1. 필드; static으로 name 변수 선언
	2. pass, fail, line 변수를 공백과 null로 초기화함.
	3. BufferedReader 성적 파일의 경로 차조
	4. while문 line이 null이 아닐 때 까지 반복함.
		>if문 합격인가? 메소드 호출
			>결과에 따라 pass/fail에 name 추가함
	5. isPass? line을 매개로 하는 메소드
		>temp 배열에 split을 사용해 이름과 성적을 저장함.
		>name에 temp의 0번째 요소 저장함.
		>sum 변수 선언
		>for문 1부터 3까지
			>score 변수 선언 후 temp의 i번째 요소를 int로 형변환함.
			>if문 score가 40미만인지?
				>false로 리턴함
			>sum에 점수 추가
		>if문 평균이 60이상인가?
			>return true
	6. pass, fail 출력
	 */
	
	static String name;
	
	public static void main(String[] args) {

		try {
			String pass = "";
			String fail = "";
			String line = null;
			
			BufferedReader reader 
				= new BufferedReader(new FileReader(Path.Q03));
			
			while((line = reader.readLine()) != null) {
				if(isPass(line)) {
					pass += String.format("%s%n", name);
				} else {
					fail += String.format("%s%n", name);
				}
			}
			
			reader.close();
			
			System.out.println("[합격자]");
			System.out.println(pass);
			System.out.println("[불격자]");
			System.out.println(fail);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}//main

	private static boolean isPass(String line) {
		String[] temp = line.split(",");
		name = temp[0];
		int sum = 0;
		
		for(int i=1; i<temp.length; i++) {
			int score = Integer.parseInt(temp[i]);
			
			if(score < 40) {
				return false;
			}
			
			sum += score;
		}
		
		if((double)sum/(temp.length-1) >= 60){
			return true;
		}
		return false;
	}//합격 확인
}
