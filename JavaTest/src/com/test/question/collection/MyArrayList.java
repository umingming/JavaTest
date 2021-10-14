package com.test.question.collection;

public class MyArrayList {
	/* 
	ArrayList 사용자 정의 클래스
	
	설계>
	1. 멤버 변수; index, String 배열 선언
	2. 기본 생성자; 배열의 길이 4, index는 0으로 초기화함.
	3. void add; 배열에 요소를 추가함
		>full 메소드
			>if문 배열이 가득 차 있는지?
				>temp 배열 선언
				>for문 배열의 길이
					>temp 배열에 요소 복사
				>this.배열에 temp값 저장
		>index번째 요소에 string값 넣음
		>index++
	4. String get(int index); 원하는 위치의 요소 가져옴
		>if문 index가 this.index보다 작은지?
			>배열[index]값 리턴함.
	5. int size(); 요소의 개수 반환
		>index 리턴함
	6. void set(int index, String value); 원하는 위치의 요소를 다른 값으로 수정함.
		>배열[index] = value
	7. void remove(int index); 원하는 위치의 요소 삭제함.
		>for문 index부터 this.index까지
			>배열[i] = 배열[i+1]
		>this.index--; 배열의 길이가 감소해야 함.
	8. void add(int index, String value); 원하는 위치에 요소를 삽입함.
		>full 메소드
		>for문 마지막 요소(this.index)부터 index 전까지 반복
			>배열[i] = 배열[i-1] 
		>index번째 요소에 value 값 저장.
		>this.index++; 배열의 길이가 증가해야 함.
	9. int indexOf(String value); 원하는 요소가 몇 번째 위치에 있는지 값을 반환
		>for문 this.index 반복
			>if문 요소와 value가 같은지?
				>i를 리턴함.
	10. int lastIndexOf; 원하는 요소가 몇 번째 위치에 있는지 위치 값을 반환함
		>for문 this.index부터 반복
		 	>8번과 동일함.
	11. void clear(); 배열의 모든 요소 삭제
		>this.index = 0
	 */
	
	private String[] list;
	private int index;
	
	public MyArrayList() {
		this.list = new String[4];
		this.index = 0;
	}
	
	
	void add(String s) {
		full();
		list[index] = s;
		index++;
	}
	
	void full() {
		if(list.length == this.index) {
			String[] temp = new String[list.length * 2];
			for(int i=0; i<list.length; i++) {
				temp[i] = list[i];
			}
			this.list = temp;
		}
	}
	
	String get(int index) {
		if(index < this.index) {
			return list[index];
		}
		return null;
	}
	
	int size() {
		return this.index;
	}
	
	void set(int index, String value) {
		list[index] = value;
	}
	
	void remove(int index) {
		for(int i=index; i<this.index; i++) {
			list[i] = list[i+1];
		}
		this.index--;
	}
	
	void add(int index, String value) {
		full();
		for(int i=this.index; i>index; i--) {
			list[i] = list[i-1];
		}
		list[index] = value;
		this.index++;
	}
	
	int indexOf(String value) {
		for(int i=0; i<this.index; i++) {
			if(list[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}
	
	int lastIndexOf(String value) {
		for(int i=this.index-1; i>-1; i--) {
			if(list[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}
	
	void clear() {
		this.index = 0;
	}
}
