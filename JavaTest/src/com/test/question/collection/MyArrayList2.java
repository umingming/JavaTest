package com.test.question.collection;

public class MyArrayList2 {
	/* 
	ArrayList 사용자 정의 클래스
	
	plan>
	1. member variable; Declare index, array String  
	2. basic constructor; initailize length of array to 4, index to 0
	3. void add; add element to an array
		>full method
			>if Is an array empty?
				>Declare temp array
				>for loop a length of array
					>temp array is copied by an element of origin array 
				>store this.array for temp
		>store value to an element of index 
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
