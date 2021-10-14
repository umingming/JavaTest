package com.test.question.collection;

public class Q01 {

	public static void main(String[] args) {
		//배열 생성
		MyArrayList list = new MyArrayList();

		//추가
		list.add("홍길동");
		list.add("아무개");
		list.add("하하하");

		//추가
		list.add("호호호");
		list.add("후후후");
		list.add("헤헤헤");
		list.add("히히히");
		
		//읽기
		System.out.println("list.get(0): " + list.get(0));
		System.out.println("list.get(1): " + list.get(1));
		System.out.println("list.get(2): " + list.get(2));
		System.out.println();
		
		//개수
		System.out.println("list.size(): " + list.size());
		System.out.println();
		
		//탐색 + 읽기
		for (int i=0; i<list.size(); i++) {
			System.out.printf("list.get(%d): %s\r\n", i, list.get(i));
		}
		System.out.println();

		//수정
		list.set(0, "우하하");
		System.out.println("0번째 방 수정, list.get(0): " + list.get(0));
		System.out.println();

		//삭제
		list.remove(1);
		for (int i=0; i<list.size(); i++) {
			System.out.printf("list.get(%d): %s\r\n", i, list.get(i));
		}
		System.out.println();

		//삽입
		list.add(1, "호호호");
		System.out.println("1번째 방 삽입");
		for (int i=0; i<list.size(); i++) {
			System.out.printf("list.get(%d): %s\r\n", i, list.get(i));
		}
		System.out.println();

		//검색
		if (list.indexOf("홍길동") > -1) {
		    System.out.println("홍길동 있음");
		} else {
		    System.out.println("홍길동 없음");
		}
		System.out.println();
		
		//초기화
		list.clear();
		System.out.println("배열 clear");
		System.out.println("list.size(): " + list.size());
	}
}
