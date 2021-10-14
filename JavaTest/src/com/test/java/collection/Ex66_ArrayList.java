package com.test.java.collection;

import java.util.ArrayList;

public class Ex66_ArrayList {

	public static void main(String[] args) {
		/*
		컬렉션, collection
		JCF, Java Collection Framework
		향상된 배열
		기존의 순수 배열을 성능이나 사용법에 버전 업한 클래스형태의 배열
		길이 가변
		1. 사용법
		2. 구조
		자료구조
		 */
		
		/*
		ArrayList 클래스
		 */
		
//		m1();
//		m2();
//		m3();
		ArrayList<Integer> list = new ArrayList<Integer>();
//		m4();
		
		for(int i=0; i<1025; i++) {
			list.add(i);
		}

	}

	private static void m4() {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<User> list3 = new ArrayList<User>();
		
		list3.add(new User("홍길동"));
		
		
	}

	private static void m3() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("빨강");
		list.add("노랑");		
		list.add("파랑");		
		list.set(0, "분홍");
		System.out.println(list.isEmpty());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println(list.size());
		System.out.println(list.get(list.size() - 1));
//		System.out.println(list.get(5));
	}

	private static void m2() {
		ArrayList nums1 = new ArrayList();
		
		nums1.add(10);
		System.out.println((Integer)nums1.get(0) * 2);

		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		nums2.add(10);
		System.out.println(nums2.get(0));
		
	}

	private static void m1() {
		
		int[] nums1 = new int[3];
		nums1[0] = 10;
		nums1[1] = 20;
		nums1[2] = 30;
		System.out.println(nums1.length);
		
		ArrayList nums2 = new ArrayList();
		nums2.add(10);
		nums2.add(20);
		nums2.add(30);		
		System.out.println(nums2.get(0));
		
		for(int i=0; i<nums2.size(); i++) {
			
		}
		
	}

}

class User {
	private String name;
	public User (String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
}

//class TestList {
//	private int[] list;
//	private int index;
//	
//	public TestList() {
//		this.list = new int[4];
//		this.index = 0;
//	}
//	
//	public void add(int n) {
//		
//		if() {
//			int[] temp = new int[this.list.length * 2];
//			
//			for(int i=0; i<this.list.length; i++) {
//				temp[i] = this.list[i];
//			}
//			
//			this.list = temp;
//		}
//		
//		this.list[this.index] = n;
//		this.index++;
//	}
//	
//}
