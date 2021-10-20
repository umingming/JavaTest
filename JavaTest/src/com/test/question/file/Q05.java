package com.test.question.file;

import java.io.File;
import java.util.HashMap;
import java.util.Set;

public class Q05 {

	public static void main(String[] args) {
		/*
		이미지 파일이 확장자별로 있다. 몇 개씩 있는지 세시오.
		
		설계>
		1. 확장자별 카운트 폴더의 경로로 File 객체 생성
		2. File 배열 선언
		3. HashMap 객체 생성 
		4. for문 배열의 길이
			>if 파일인지?
				>확장자 변수 선언 후 파일의 확장자명 저장
				>if 확장자를 key로 하는 value가 없는지?
					>1을 HashMap에 추가함
					>있으면 확장자에 따른 value값에 1을 더해 추가함.
		5. HashMap key 탐색하기 위해서 Set 객체 생성
		6. 향상된 for문 key값을 변수 사용
			>printf이용해 확장자별 count 출력
		 */
		
		File dir = new File("C:\\java\\file\\파일_디렉토리_문제\\확장자별 카운트");
		File[] list = dir.listFiles();
		HashMap<String,Integer> map = new HashMap<String,Integer>(4);
		
		for(int i=0; i<list.length; i++) {
			if(list[i].isFile()) {
				String extention = list[i].getName().substring(list[i].getName().lastIndexOf("."));
				
				if(!map.containsKey(extention)) {
					map.put(extention, 1);
				} else {
					map.put(extention, map.get(extention) + 1);
				}
			}
		}
		
		Set<String> set = map.keySet();
		for(String key : set) {
			System.out.printf("*%s : %d개%n", key, map.get(key));
		}
	}
}