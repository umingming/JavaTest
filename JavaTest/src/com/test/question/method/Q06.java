package com.test.question.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q06 {

	public static void main(String[] args) throws Exception{
//		국어, 영어, 수학 점수를 전달하면 '합격' 혹은 '불합격'이라는 단어를 반환하는 메소드 선언하고 호출하시오.
		
//		설계>
//		1. BufferedReader
//		2. 국어 : 출력
//		3. 점수 입력하기
//		4. 2~3번을 영어와 수학 점수도 반복
//		5. 점수들을 int로 변환
//		6. test(int, int, int) 메소드 > 평균 점수 60점 이상이면 '합격', 아니면 '불합격'으로 반환.
//		7. (불)합격입니다. 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("국어 : ");
		String input1 = reader.readLine();
		System.out.print("영어 : ");
		String input2 = reader.readLine();
		System.out.print("수학 : ");
		String input3 = reader.readLine();
		
		int korScore = Integer.parseInt(input1);
		int engScore = Integer.parseInt(input2);
		int mathScore = Integer.parseInt(input3);
		
		System.out.printf("%s입니다.", test(korScore, engScore, mathScore));

	}

	private static String test(int korScore, int engScore, int mathScore) {
		int sum = korScore + engScore + mathScore;
		double avg = (double)sum/3;
		String result = (avg >= 60) && (korScore >= 40) && (engScore >= 40) && (mathScore >= 40)? "합격" : "불합격";
		return result;
	}

}
