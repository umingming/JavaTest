package com.test.question.obj;

import java.util.Calendar;

public class Refrigerator {
	/*
	설계>
	1. 길이가 100인 item 배열 선언
	2. add 메소드
		>for문 100
			>if문 items[i]가 비어있는지? 저장하고 break;
		>넣은 음식 출력
	3. item get메소드
		>item 객체 생성 
		>for문 100
			>if문 items[i] 이름과 같은지? null 저장 break;
		>item 리턴
	4. count 메소드
		>count 변수 선언
		>for문 100
 			>if items[i]가 있는지? count++
 	5. list 메소드
 		>for문 100
 			>if문 안 비어있는지? 해당 음식 정보 출력
	 */
	
	private Item[] items = new Item[100];
	
	public void add(Item item) {
		for(int i=0; i<items.length; i++) {
			if(items[i] == null) {
				item.setName(item.getName());
				item.setExpiration(item.getExpiration());
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
				System.out.println();
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

class Item {
	private String name;
	private Calendar expiration;
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Calendar getExpiration() {
		return  this.expiration;
	}
	
	public void setExpiration(String date) {
		date = date.replace("-", "");
		Calendar expiration = Calendar.getInstance();
		
		expiration.set(Integer.parseInt(date.substring(0, 4)),
				Integer.parseInt(date.substring(4, 6)) -1,
				Integer.parseInt(date.substring(6)));
		
		this.expiration = expiration;
	}
	
	public void setExpiration(Calendar date) {
		this.expiration = expiration;
	}
}