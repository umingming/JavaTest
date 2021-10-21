package com.test.java.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex77_Collection {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("노트북");
		list.add("마우스");
		list.add("키보드");
		list.add("모니터");
		list.add("웹캠");
		
		Iterator<String> iter = list.iterator();
		
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		System.out.println(iter.hasNext());
//		System.out.println(iter.next());
//		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		🎞

}
