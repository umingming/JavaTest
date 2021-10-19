package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;

class Memeber implements Comparable<Memeber>{
	private String name;
	private int age;
	private Calendar birthday;
	
	public int compareTo(Memeber user) {
		return this.name.compareTo(user.getName());
	}
	
	public Memeber(String name, int age, int year, int month, int date) {
		this.name = name;
		this.age = age;
		
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, date);
		this.birthday = c;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public Calendar getBirthday() {
		return birthday;
	}

	@Override
	public String toString() {
		return String.format("%s %d살 %tF%n", 
				this.name, this.age, this.birthday);
	}
	
	
	
	
	
}
public class Bubble {

	public static void main(String[] args) {
//		m1();
//		m2();
//		m3();
		m4();
	}

	private static void m4() {
		ArrayList<Memeber> users = new ArrayList<Memeber>(5);
		users.add(new Memeber("박효주", 28, 1994, 4, 30));
		users.add(new Memeber("이유미", 27, 1995, 1, 12));
		users.add(new Memeber("이민섭", 24, 1999, 5, 29));
		users.add(new Memeber("김상만", 32, 1990, 12, 30));
		users.add(new Memeber("정의창", 30, 1992, 7, 19));
		
		Collections.sort(users);
		
		for(int i=0; i<users.size(); i++) {
			System.out.println(users.get(i));
		}
		
		
	}

	private static void m3() {
		Memeber[] users = new Memeber[5];
		users[0] = new Memeber("박효주", 28, 1994, 4, 30);
		users[1] = new Memeber("이유미", 27, 1995, 1, 12);
		users[2] = new Memeber("이민섭", 24, 1999, 5, 29);
		users[3] = new Memeber("김상만", 32, 1990, 12, 30);
		users[4] = new Memeber("정의창", 30, 1992, 7, 19);
		
		for(int i=0; i<users.length-1; i++) {
			for(int j=0; j<users.length-1-i; j++) {
				if(users[j].compareTo(users[j+1]) > 0) {
					Memeber temp = users[j+1];
					users[j+1] = users[j];
					users[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(users));
		
		
	}
	

	private static void m2() {
		String[] names = {"박효주", "이유미", "이민섭", "양소라", "김상만"};
		for(int i=0; i<names.length-1; i++) {
			for(int j=0; j<names.length-1-i; j++) {
				if(names[j].compareTo(names[j+1]) > 0) {
					String temp = names[j+1];
					names[j+1] = names[j];
					names[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(names));
		
		
	}

	private static void m1() {
		/*
		배열을 오름차순으로 정렬해주는 버블 정렬을 만들어 보자.
		
		설계>
		1. int 배열 선언 후 랜덤 숫자로 초기화
		2. for문 배열의 길이 -1 반복
			>for문 배열의 길이 -1 -i 반복
				>j번째 요소가 j+1보다 큰지?
					>temp 변수 선언 후 j+1저장
					>j+1에 j 요소 저장
					>j에는 temp 값 저장
		3. 배열 출력해서 확인
		 */
		
		int[] nums =  {3, 2, 1, 4, 5};
		for(int i=0; i<nums.length-1; i++) {
			for(int j=0; j<nums.length-1-i; j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j+1];
					nums[j+1] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(nums));
		
	}

}
