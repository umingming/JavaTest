package com.test.question.collection;

import java.util.Arrays;

public class MyHashMap {
	/*
	HashMap 구현
	
	설계>
	1. Item 클래스 생성
		>멤버 변수; key, value (private)
		>생성자(String, String); 멤버 변수에 String 값 대입함.
		>getter 메소드; 멤버 변수를 리턴함.
	2. 멤버 변수; item 배열, index, keyIndex 선언,
	3. 기본 생성자; 배열의 길이 4로 지정, index 0, keyIndex -1로 초기화
	4. void put(String key, Sting value); 추가/수정
		>Item 객체 생성 후 생성자의 매개값으로 key, value 사용
		>if문 key값이 있는지?(containsKey 메소드 호출)
			>배열의 keyIndex번째 요소에 객체 저장
			>doubleList() 호출
				>index번째 요소에 객체 저장		
				>index++
	5. void doubleList(); 요소가 가득 찼으면 배열을 두 배로 늘림.
		>index와 배열의 길이가 같은지?
			>원래 배열의 2배인 temp 배열 생성
			>for문 원래 배열의 길이 반복
				>temp에 요소 대입
			>배열을 temp로 초기화함.
	6. boolean containsKey(String key)
		>for문 배열의 길이 반복
			>if문 배열 중 key가 있는지?
				>keyIndex에 i 저장
				>return true
	7. String get(String key)
		>if containsKey ?
			>keyIndex번째 요소의 value 리턴함. 
	8. int size();
		>index를 리턴함.
	9. void remove(String key)
		>if containsKey ?
			>제거해야 하므로 this.index를 감소시킴.
			>for문 keyIndex부터 this.index 전까지
				>list[i] = list[i+1]
	10. boolean containsValue(String value)
		>for문 배열의 길이
			>if문 배열 중 value가 있는지?
				>return true
	11. void clear()
		>index에 0저장.
	 */
	
	private Item[] list;
	private int index;
	private int keyIndex;
	
	public MyHashMap() {
		this.list = new Item[4];
		this.index = 0;
		this.keyIndex = -1;
	}
	
	void put(String key, String value) {
		Item item = new Item(key, value);
		if(containsKey(key)) {
			this.list[keyIndex] = item;
		} else {
			doubleList();
			this.list[this.index] = item;
			this.index++;
		}
	}
	
	private void doubleList() {
		if(this.index == list.length) {
			this.list = Arrays.copyOf(this.list, list.length * 2);
//			Item[] temp = new Item[list.length * 2];
//			for(int i=0; i<this.index; i++) {
//				temp[i] = this.list[i];
//			}
//			this.list = temp;
		}
	}

	boolean containsKey(String key) {
		for(int i=0; i<this.index; i++) {
			if(this.list[i].getKey().equals(key)) {
				keyIndex = i;
				return true;
			}
		}
		return false;
	}
	
	String get(String key) {
		if(containsKey(key)) {
			return list[keyIndex].getValue();
		}
		return null;
	}
	
	int size() {
		return index;
	}
	
	void remove(String key) {
		if(containsKey(key)) {
			this.index--;
			for(int i=keyIndex; i<this.index; i++) {
				list[i] = list[i+1];
			}
		}
	}
	
	boolean containsValue(String value) {
		for(int i=0; i<this.index; i++) {
			if(this.list[i].getValue().equals(value)) {
				return true;
			}
		}
		return false;
	}
	
	void clear() {
		this.index = 0;
	}

	@Override
	public String toString() {
		return Arrays.toString(list) + "\r\nindex= " + index + ", keyIndex= " + keyIndex;
	}

}

class Item {
	private String key;

	private String value;
	
	public Item(String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}
	
	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return key + ": " + value + "\r\n";
	}
}
