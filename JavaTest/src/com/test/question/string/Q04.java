package com.test.question.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws Exception{
		/*
		파일명 10개를 입력 받아 각 확장자별로 총 개수를 출력하시오.
		-확장자는 gif, jpg, png, hwp, doc로 제한함
		
		설계>
		1. 확장자 변수 선언
		2. for문 10 반복
			>BufferedReader
			>파일명 입력 받음
			>lastIndexOf로 .위치 확인
			>switch문으로 확장자에 따른 갯수 증가
		3. 결과 출력
		*/
		
		int gif = 0;
		int jpg = 0;
		int png = 0;
		int hwp = 0;
		int doc = 0;
		
		for(int i=0; i<10; i++) {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("파일명 : ");
			String filename = reader.readLine();
			
			int index = filename.lastIndexOf('.');
			
			switch(filename.substring(index + 1)) {
			case "gif" : gif++; break;
			case "jpg" : jpg++; break;
			case "png" : png++; break;
			case "hwp" : hwp++; break;
			case "doc" : doc++; break;
			}
		}
		
		System.out.printf("gif : %d개%n", gif);
		System.out.printf("jpg : %d개%n", jpg);
		System.out.printf("png : %d개%n", png);
		System.out.printf("hwp : %d개%n", hwp);
		System.out.printf("doc : %d개%n", doc);

	}

}
