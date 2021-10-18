package com.test.java.collection;

import java.util.Arrays;

public class Ex69_Stack {

	public static void main(String[] args) {
		//MyStack
		
		MyStack stack = new MyStack();
		System.out.println(stack);
		stack.push("홍길동");
		
		stack.clear();
		stack.push("홍길동");
		System.out.println(stack);
		
		stack.trimToSize();
		System.out.println(stack);
		

	}//main

}

class MyStack {
	
	private String[] list;
	private int index;
	
	public MyStack() {
		this.list = new String[4];
		this.index = 0;
	}
	
	public void trimToSize() {
		this.list = Arrays.copyOf(list, this.index);
		
	}

	public void clear() {
		this.index = 0;
	}
	
	public boolean contains(String s) {
		for(int i=0; i<this.index; i++) {
			if(list[i].equals(s)) {
				return true;
			}
		}
		return false;
	}
	public void push(String s) {
		//1. 공간 체크 2. 요소 추가
		
		if(this.index == this.list.length) {
			String[] temp = new String[this.list.length * 2];
			for(int i=0; i<this.index; i++) {
				temp[i] = this.list[i];
			}
			this.list = temp;
		}
		
		this.list[this.index] = s;
		this.index++;
		
	}
	
	public String pop() {
		String temp = this.list[this.index - 1];
		this.index--;
		
		return temp;
	}

	public String peek() {
		String temp = this.list[this.index - 1];
		
		return temp;
	}
	
	public int size() {
		return this.index;
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