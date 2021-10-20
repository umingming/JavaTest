package com.test.question.file;

import java.io.File;
import java.util.ArrayList;

public class Q07 {

	public static void main(String[] args) {
		/*
		양쪽 모두 존재하는 파일만을 출력하시오
		
		설계>
		1. musicA,B를 경로로 하는 File 객체 생성
		2. 1의 객체를 이용하여 File 배열 선언
		3. String을 매개로 하는 ArrayList 객체 생성(동일, A, B)
		4. for문 musicA 배열 반복
			>A객체에 요소의 데이터 추가
		5. for문 musicB 배열 반복
			>boolean 중복 확인 변수 선언 후 false로 초기화
			>for문 musicA 배열 반복
				>if문 B의 i번째 이름과 A의 j번째 이름이 같은가?
					>중복 변수에 true 저장
			>if A와 중복되는 이름인지?
				>동일 객체에 요소의 데이터 추가
				>A 객체에 j번째 요소의 데이터 삭제
			>같지 않으면 B객체에 요소의 데이터 추가
		6. for문 동일 객체 길의 반복
			>get메소드로 출력
		 */

		File dirA = new File("C:\\java\\file\\파일_디렉토리_문제\\동일 파일\\MusicA");
		File dirB = new File("C:\\java\\file\\파일_디렉토리_문제\\동일 파일\\MusicB");
		File[] listA = dirA.listFiles();
		File[] listB = dirB.listFiles();
		
		ArrayList<String> common = new ArrayList<String>();
		ArrayList<String> onlyA = new ArrayList<String>();
		ArrayList<String> onlyB = new ArrayList<String>();
		
		for(int i=0; i<listA.length; i++) {
			onlyA.add(listA[i].getName());
		}
		
		for(int i=0; i<listB.length; i++) {
			boolean isDuplicate = false;
			String name = listB[i].getName();
			
			for(int j=0; j<listA.length; j++) {
				if(name.equals(listA[j].getName())) {
					isDuplicate = true;
				}
			}

			if(isDuplicate) {
				common.add(name);
				onlyA.remove(onlyA.indexOf(name));
			}else {
				onlyB.add(name);
			}
		}
		
		System.out.println("========모두 존재하는 파일========");
		for(int i=0; i<common.size(); i++) {
			System.out.println(common.get(i));
		}
		
		System.out.println("========A에만 존재하는 파일========");
		for(int i=0; i<onlyA.size(); i++) {
			System.out.println(onlyA.get(i));
		}
		
		System.out.println("========B에만 존재하는 파일========");
		for(int i=0; i<onlyB.size(); i++) {
			System.out.println(onlyB.get(i));
		}
		
	}
}