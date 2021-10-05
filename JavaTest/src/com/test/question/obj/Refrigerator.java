package com.test.question.obj;

import java.util.Calendar;

public class Refrigerator {
	/*
	설계>
	1. 길이가 100인 item 배열 선언
	2. item 클래스 생성
		>set유통기한(String)
			>replace로 - 제거
			>Calendar.set으로 날짜 수정 (substring 사용)
	3. add 메소드
		>for문 100
			>if문 items[i]가 비어있는지? 저장하고 break;
		>넣은 음식 출력
	4. item get메소드
		>item 객체 생성 
		>for문 100
			>if문 items[i] 이름과 같은지? 
				>item에 items[i] 저장
				>items[i] 초기화 후 break;
		>item 리턴
	5. count 메소드
		>count 변수 선언
		>for문 100
 			>if items[i]가 있는지? count++
 		>count 리턴
 	6. list 메소드
 		>for문 100
 			>if문 items[i] 있는지? printf 이용해 음식 정보 출력
	 */
	
	private Item[] items = new Item[100];
	
	public void add(Item item) {
		for(int i=0; i<items.length; i++) {
			if(items[i] == null) {
				items[i] = item;
				break;
			}
		}
		System.out.printf("'%s'를 냉장고에 넣었습니다.%n", item.getName());
	}
	
	public Item get(String name) {
		Item item = null; 
		
		for(int i=0; i<items.length; i++) {
			if(items[i].getName().equals(name)) {
				item = items[i];
				items[i] = null;
				System.out.println(); //유통기한 출력시 개행하기 위해
				break;
			}
		}
		return item;
	}
	
	public int count() {
		int count = 0;
		for(int i=0; i<items.length; i++) {
			if(items[i] != null) {
				count++;
			}
		}
		return count;
	}
	
	public void listItem() {
		System.out.println("\n[냉장고 아이템 목록]");
		for(int i=0; i<items.length; i++) {
			if(items[i] != null) {
				System.out.printf("%s(%tF)%n", items[i].getName(), items[i].getExpiration());
			}
		}
	}
	

}
