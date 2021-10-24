package com.test.review.fileio;import java.io.BufferedReader;
import java.io.FileReader;

public class Q03 {
	
	static String name;
	static String pass = "";
	static String fail = "";
	public static void main(String[] args) {
		/*
		파일 내의 성적을 확인 후 합격자/불합격자 명단을 출력하시오.
		
		설계>
		1. field; 합격자, 불합격자 변수 선언
		2. BufferedReader
		3. while문 line이 null이 아닐 때까지 반복
			>line을 매개로 하는 isPass() 호출
				>결과에 따라 합/불 변수에 추가함.
		4. isPass() 메소드
			>입력 받은 문자열을 "," 단위로 쪼개 배열로 만듦
			>name에 첫 번째 요소 넣음
			>sum변수 선언
			>for문으로 요소들이 40미만인지 확인함.
				>false 리턴함
			>if 평균 60 이상인지?
				>true 리턴함.
		5. 결과 출력
		 */

		try {
			BufferedReader reader = new BufferedReader(new FileReader(Path.Q03));

			String line = null;
			while ((line = reader.readLine()) != null) {
				if(isPass(line)){
					pass += String.format("%s%n", name);
				} else {
					fail += String.format("%s%n", name);
				}
			}

			System.out.printf("[합격자]%n%s", pass);
			System.out.printf("[불합격자]%n%s", fail);
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();	
		}

	}
	private static boolean isPass(String line) {
		String[] temp = line.split(",");
		name = temp[0];
		double sum = 0;
		
		for(int i=1; i<temp.length; i++) {
			int score = Integer.parseInt(temp[i]);
			if(score < 40) {
				return false;
			}
			sum += score;
		}
		
		if(sum / 3 >= 60){
			return true;
		}
		return false;
	}

}
