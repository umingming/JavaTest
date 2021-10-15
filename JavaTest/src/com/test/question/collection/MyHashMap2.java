package com.test.question.collection;

import java.util.Arrays;

public class MyHashMap2 {
	/*
	HashMap을 추가 클래스 정의없이 구현
	
	설계>
	1. 멤버 변수 선언; key, value 배열, keyIndex, index 변수 선언
	2. 생성자; 배열의 길이는 4, keyIndex는 -1, index는 0으로 초기화함.
	3. void put(String key, Sting value); 추가/수정
		>if문 key값이 있는지?(containsKey 메소드 호출)
			>value 배열의 keyIndex번째 요소에 value값 저장
			>doubleList() 호출
				>index번째 배열에 매개값 저장		
				>index++
	4. void doubleList(); 요소가 가득 찼으면 배열을 두 배로 늘림.
		>index와 key 배열의 길이가 같은지? (key와 value의 길이는 같으므로 하나의 배열만 비교)
			>원래 배열의 2배인 tempValue, tempKey 배열 생성
			>for문 원래 배열의 길이 반복
				>temp에 요소 대입
			>두 배열을 temp로 초기화함.
	5. boolean containsKey(String key)
		>for문 key 배열의 길이 반복
			>if문 배열 중 key가 있는지?
				>keyIndex에 i 저장
				>return true
	6. String get(String key)
		>if containsKey ?
			>value배열 keyIndex번째 요소 리턴함. 
	7. int size();
		>index를 리턴함.
	8. void remove(String key)
		>if containsKey ?
			>제거해야 하므로 this.index를 감소시킴.
			>for문 keyIndex부터 this.index 전까지
				>배열[i] = 배열[i+1]
	9. boolean containsValue(String value)
		>for문 배열의 길이
			>if문 배열 중 value가 있는지?
				>return true
	10. void clear()
		>index에 0저장.
	 */
	
	private String[] key;
	private String[] value;
	private int index;
	private int keyIndex;
	
	public MyHashMap2() {
		this.key = new String[4];
		this.value = new String[4];
		this.index = 0;
		this.keyIndex = -1;
	}
	
	void put(String key, String value) {
		if(containsKey(key)) {
			this.value[keyIndex] = value;
		} else {
			doubleList();
			this.key[this.index] = key;
			this.value[this.index] = value;
			this.index++;
		}
	}

	private void doubleList() {
		if(this.index == key.length) {
			String[] tempKey = new String[key.length * 2];
			String[] tempValue = new String[value.length * 2];
			
			for(int i=0; i<this.index; i++) {
				tempKey[i] = this.key[i];
				tempValue[i] = this.value[i];
			}
			this.key = tempKey;
			this.value = tempValue;
		}
	}

	boolean containsKey(String key) {
		for(int i=0; i<this.index; i++) {
			if(this.key[i].equals(key)) {
				keyIndex = i;
				return true;
			}
		}
		return false;
	}
	
	String get(String key) {
		if(containsKey(key)) {
			return value[keyIndex];
		}
		return null;
	}
	
	int size() {
		return this.index;
	}
	
	void remove(String key) {
		if(containsKey(key)) {
			this.index--;
			for(int i=keyIndex; i<this.index; i++) {
				this.key[i] = this.key[i+1];
				this.value[i] = this.value[i+1];
			}
		}
	}
	
	boolean containsValue(String value) {
		for(int i=0; i<this.index; i++) {
			if(this.value[i].equals(value)) {
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
		return Arrays.toString(key) + "\r\n" + Arrays.toString(value) 
		+ "\r\n index=" + index + ", keyIndex=" + keyIndex;
	}
}
