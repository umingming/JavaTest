package com.test.question.collection;

public class MyQueue {
	
	/*
	Queue 구현하기
	
	설계>
	1. 필드; String 배열, index 선언
	2. 기본 생성자; 배열의 길이를 4, index 0으로 초기화
	3. void add(String value); 
		>if문 배열의 길이가 index와 같은지?
			>원래 배열 길이의 두 배인 temp 배열 선언
			>for문 index 반복
				>temp 요소에 list 요소를 대입
			>list 배열에 temp 저장
		>index번째 요소에 value값 저장.
		>index++
	4. String poll();
		>길이가 0이 아닌지?
			>temp 변수 선언후 list[0]저장함.
			>for문 index-1반복
				>list[i] = list[i-1] 
			>index--
			>return temp
		>0이면 null을 return
	5. int size();
		>return index
	6. String peek();
		>if index가 0이 아닌지?
			>return list[0]
		>0이면 null리턴함.		
	7. void clear();
		>index에 0 저장함.
	8. void trimToSize();
		>index를 배열의 길이로 하는 String 배열 선언
		>for문 index 반복
			>임시 배열의 요소에 list 요소의 값 대입
		>list에 임시 배열을 저장함.
	 */
	
	private String[] list;
	private int index;
	
	public MyQueue() {
		this.list = new String[4];
		this.index = 0;
	}
	
	void add(String value) {
		if(this.list.length == this.index) {
			String[] temp = new String[this.list.length * 2];
			for(int i=0; i<this.index; i++) {
				temp[i] = this.list[i];
			}
			this.list = temp;
		}
		this.list[this.index] = value;
		this.index++;
	}
	
	String poll() {
		if(index != 0) {
			String temp = this.list[0];
			for(int i=0; i<this.index-1; i++) {
				this.list[i] = this.list[i+1];
			}
			this.index--;
			return temp;
		}
		return null;
	}
	
	int size() {
		return this.index;
	}
	
	String peek() {
		if(index != 0) {
			return this.list[0];
		}
		return null;
	}

	void clear(){
		this.index = 0;
	}
	
	void trimToSize() {
		String[] temp = new String[this.index];
		for(int i=0; i<this.index; i++) {
			temp[i] = this.list[i];
		}
		this.list = temp;
	}
	@Override
	public String toString() {
		String temp = "length : " + this.list.length;
		temp += "\r\nindex : " + this.index;
		temp += "\r\n[\r\n";
		for (int i=0; i<this.list.length; i++) {
			temp += i + ":" + this.list[i] +"\r\n";
		}
		temp += "]\r\n";
		return temp;
	}
	
}
