package com.test.java.collection;

import java.util.HashMap;

public class Ex67_HashMap {

	public static void main(String[] args) {
		/*
		1. ArrayList
			- 요소 접근 > 첨자 사용
			- 순서가 있는 데이터 집합
			- 첨자; 정수 사용
			- 스칼라 배열
			- 방을 일괄 접근 용이 > for 루프
			- 요소끼리 구분이 모호함. 방 번호는 의미를 가지지 않기 때문에.
			
		2. HashMap
			- 요소 접근 > 키 사용
			- 방번호가 존재하지 않음. > 요소의 순서가 없음.
			- 순서가 없는 데이터 집합
			- 키와 값으로 (한쌍)데이터를 관리
			- 방을 일괄 접근 불리 > 루프 불가능
			- 요소의 의미를 알기 쉬움.
			ex) 강의실 6개 > 자바반, 파이썬반, DB반..
		
		 */
		
		m1();

	}//maind

	private static void m1() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("국어", 100);
		map.put("국어", 90);
		map.put("영어", 90);
		map.put("수학", 80);
		
		System.out.println(map.size());
		
		System.out.println(map.get("사회"));
		
		System.out.println(map.containsKey("국어"));
		System.out.println(map.containsKey(100));
		
		map.remove("사회");
		System.out.println(map);
		
		map.clear();
		System.out.println(map);  //{}
		
		
	}

}
