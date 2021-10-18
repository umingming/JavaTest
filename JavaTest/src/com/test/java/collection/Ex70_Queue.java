package com.test.java.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex70_Queue {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.add("빨강");
		queue.add("노랑");
		queue.add("파랑");
		
		System.out.println(queue.poll());  //빨강
		System.out.println(queue.size());  //2
		System.out.println(queue.poll());  //빨강
		System.out.println(queue.poll());  //빨강
		System.out.println(queue.poll());  //빨강
		
	}

}
