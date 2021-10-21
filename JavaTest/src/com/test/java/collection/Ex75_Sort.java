package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Ex75_Sort {

	public static void main(String[] args) {
		
		Integer[] nums = {1, 5, 2, 4, 3};
		Arrays.sort(nums);
//		System.out.println(Arrays.toString(nums));
		
		Arrays.sort(nums, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		
		m1();
	}

	private static void m1() {
		ArrayList<Item> list = new ArrayList<Item>();
		list.add(new Item(10, "사과"));
		list.add(new Item(50, "귤"));
		list.add(new Item(20, "포도"));
		list.add(new Item(30, "파인애플"));
		list.add(new Item(40, "딸기"));
		
		System.out.println(list);
		
		list.sort(new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				return o1.getNum() - o2.getNum();
			}
			
		});
	
		
	}

}

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
	
}

class Item{// implements Comparable<Item>{
	int num;
	String txt;
	@Override
	public String toString() {
		return "[num=" + num + ", txt=" + txt + "]\r\n";
	}
	public Item(int num, String txt) {
		this.num = num;
		this.txt = txt;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTxt() {
		return txt;
	}
	public void setTxt(String txt) {
		this.txt = txt;
	}
//	@Override
//	public int compareTo(Item o) {
//		return this.getNum() - o.getNum();
//	}
}
