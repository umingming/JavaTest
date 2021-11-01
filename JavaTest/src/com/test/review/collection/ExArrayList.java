package com.test.review.collection;

import java.util.ArrayList;

public class ExArrayList {
	static ArrayList<Item> list1 = new ArrayList<Item>();
	static ArrayList<Test> list2 = new ArrayList<Test>();

	public static void main(String[] args) {
		
		Item i1 = new Item("1", "black1");
		Item i2 = new Item("2", "black2");
		Item i3 = new Item("3", "black3");
		
		list1.add(i1);
		list1.add(i2);
		list1.add(i3);
		
		Test t1 = new Test("1", "size1");
		Test t2 = new Test("2", "size2");
		Test t3 = new Test("3", "size3");
		
		list2.add(t1);
		list2.add(t2);
		list2.add(t3);
		
		for(int i=0; i<list1.size(); i++) {
			System.out.println(change(list1.get(i)));
		}
	}
	
	public static String change(Item i) {
		for(Test t : list2) {
			if(i.getNum().equals(t.getNum())) {
				return t.getSize();
			}
		}
		return null;
	}

}

class Test {
	private String num;
	private String size;
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Test(String num, String size) {
		super();
		this.num = num;
		this.size = size;
	}
	
	
}

class Item {
	private String num;
	private String color;
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Item(String num, String color) {
		this.num = num;
		this.color = color;
	}
	public Item() {
		super();
	}
	
}
