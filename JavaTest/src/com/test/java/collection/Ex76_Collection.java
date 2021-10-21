package com.test.java.collection;

import java.util.*;

public class Ex76_Collection {

	public static void main(String[] args) {
//		m1();
//		m2();
		m3();

	}

	private static void m3() {
		ArrayList<Integer> nums1 = new ArrayList<Integer>();
		LinkedList<Integer> nums2 = new LinkedList<Integer>();
		
		long begin = 0, end = 0;
		
//		System.out.println("[순차적으로 데이터를 추가하기]");
//		
//		begin = System.nanoTime();
//		
//		for(int i=0; i<1000000; i++) {
//			nums1.add(i);
//		}
//		
//		end = System.nanoTime();
//		
//		System.out.printf("ArrayList 작업 시간 : %,dns%n", end - begin);
//
//		begin = System.nanoTime();
//		
//		for(int i=0; i<1000000; i++) {
//			nums2.add(i);
//		}
//		
//		end = System.nanoTime();
//		
//		System.out.printf("LinkedList 작업 시간 : %,dns%n", end - begin);
//		
//		//2. 배열 중간에 데이터 추가하기
//		System.out.println("[배열 중간에 데이터를 추가하기]");
//		
//		begin = System.nanoTime();
//		
//		for(int i=0; i<1000; i++) {
//			nums1.add(0, i);
//		}
//		
//		end = System.nanoTime();
//		
//		System.out.printf("ArrayList 작업 시간 : %,dns%n", end - begin);
//		
//		begin = System.nanoTime();
//		
//		for(int i=0; i<1000; i++) {
//			nums2.add(0, i);
//		}
//		
//		end = System.nanoTime();
//		
//		System.out.printf("LinkedList 작업 시간 : %,dns%n", end - begin);
//		
//		System.out.println("[배열 중간에 데이터를 삭제하기하기]");
//		
//		begin = System.nanoTime();
//		
//		for(int i=0; i<10000; i++) {
//			nums1.remove(0);
//		}
//		
//		end = System.nanoTime();
//		
//		System.out.printf("ArrayList 작업 시간 : %,dns%n", end - begin);
//		
//		begin = System.nanoTime();
//		
//		for(int i=0; i<10000; i++) {
//			nums2.remove(0);
//		}
//		
//		end = System.nanoTime();
//		
//		System.out.printf("LinkedList 작업 시간 : %,dns%n", end - begin);
//		
//		System.out.println("[배열 끝 데이터를 삭제하기하기]");
//		
//		begin = System.nanoTime();
//		
//		for(int i=nums1.size()-1; i>=0; i--) {
//			nums1.remove(i);
//		}
//		
//		end = System.nanoTime();
//		
//		System.out.printf("ArrayList 작업 시간 : %,dns%n", end - begin);
//		
//		begin = System.nanoTime();
//		
//		for(int i=nums2.size()-1; i>=0; i--) {
//			nums2.remove(i);
//		}
//		
//		end = System.nanoTime();
//		
//		System.out.printf("LinkedList 작업 시간 : %,dns%n", end - begin);
//		
		System.out.println("[개별 요소 탐색하기]");
		
		
		for(int i=0; i<1000000; i++) {
			nums1.add(i);
		}
		
		for(int i=0; i<1000000; i++) {
			nums2.add(i);
		}
		
		begin = System.nanoTime();
		System.out.println(nums1.get(500000));		
		end = System.nanoTime();
		
		System.out.printf("ArrayList 작업 시간 : %,dns%n", end - begin);
		
		begin = System.nanoTime();
		System.out.println(nums2.get(500000));		
		end = System.nanoTime();
		
		System.out.printf("LinkedList 작업 시간 : %,dns%n", end - begin);
		
	}

	private static void m2() {
		ArrayList<Integer> nums1 = new ArrayList<Integer>();
		LinkedList<Integer> nums2 = new LinkedList<Integer>();
		
		nums1.add(10);
		nums1.add(20);
		nums1.add(30);
		
		nums2.add(10);
		nums2.add(20);
		nums2.add(30);
		
		for(int i=0; i<nums1.size(); i++) {
			System.out.println(nums1.get(i));
		}
		
		for(int i=0; i<nums2.size(); i++) {
			System.out.println(nums2.get(i));
		}
		
	}

	private static void m1() {
		ArrayList<String> list1 = new ArrayList<String>();
		Vector<String> list2 = new Vector<String>();
		
		list1.add("홍길동");
		list1.add("홍상순");
		list1.add("홍모모");
		
		list2.add("홍길동");
		list2.add("홍상순");
		list2.add("홍모모");
		
		System.out.println(list1.size());
		System.out.println(list2.size());
	}

}
