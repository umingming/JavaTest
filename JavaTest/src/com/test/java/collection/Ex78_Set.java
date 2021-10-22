package com.test.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Ex78_Set {

	public static void main(String[] args) {
//		m1();
//		m2();
//		m3();
		m4();
//		m5();

	}

	private static void m5() {
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("아무개", 22);
		Person p3 = new Person("홍길동", 20);
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		
		System.out.println(("홍길동"+20).hashCode());
		System.out.println("홍길동20".hashCode());
		
		System.out.println(p1.equals(p2));
		
	}

	private static void m4() {
		List<Person> alist = new ArrayList<Person>();
		Set<Person> slist = new HashSet<Person>();
		
		alist.add(new Person("홍길동",20));
		alist.add(new Person("홍깅깅",21));
		alist.add(new Person("홍소사",23));
		alist.add(new Person("홍길동",20));

		slist.add(new Person("홍길동",20));
		slist.add(new Person("홍깅깅",21));
		slist.add(new Person("홍소사",23));
		slist.add(new Person("홍길동",20));
		
		System.out.println(alist);
		System.out.println(slist.size());
		
	}

	private static void m3() {
		Random rnd = new Random();
		List<String> box = new ArrayList<String>();
		box.add("홍길동");
		box.add("아무개");
		box.add("하하하");
		box.add("호호호");
		box.add("후후후");
		
		List<String> result = new ArrayList<String>();
		
		for(int i=0; i<3; i++) {
			result.add(box.get(rnd.nextInt(box.size())));
		}
		
		System.out.println(result);
	
//		Set<String> box2 = new HashSet<String>();
//		box2.add("홍길동");
//		box2.add("아무개");
//		box2.add("하하하");
//		box2.add("호호호");
//		box2.add("후후후");
		
		Set<String> result2 = new HashSet<String>();
		
		while(result2.size()<3) {
			result2.add(box.get(rnd.nextInt(box.size())));
		}
		
		System.out.println(result2);
		
		
	}

	private static void m2() {
		/*
		로또 추첨하기
		 */
		
		Random rnd = new Random();
		
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		
		for(int i=0; i<6; i++) {
			int n = rnd.nextInt(45) + 1;
			boolean flag = false;
			
			for(int j=0; j<i; j++) {
				if(n == lotto.get(j)) {
					flag = true;
					break;
				}
			}
			if(flag) {
				i--;
			} else {
				lotto.add(n);
			}
		}
		
		System.out.println(lotto);
		
		Set<Integer> lotto2 = new HashSet<Integer>();
		while(lotto2.size()<6) {
			int n = rnd.nextInt(45) + 1;
			lotto2.add(n);
		}	
		
		System.out.println(lotto2);
	}

	private static void m1() {
//		ArrayList<String> list = new ArrayList<String>();
//		HashSet<String> set = new HashSet<String>();
		List<String> list = new ArrayList<String>();
		Set<String> set = new HashSet<String>();
		
		list.add("사과");
		list.add("바나나");
		list.add("딸기");
		
		set.add("사과");
		set.add("바나나");
		set.add("딸기");
		System.out.println(list.add("딸기"));
		System.out.println(set.add("딸기"));
		
		System.out.println(list.size());
		System.out.println(set.size());
		
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next() );
		}
	}
}

class Person {
	private String name;
	private int age;

	
	
	public Person() {
		this("", 0);
	}



	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String toString() {
		return "name=" + name + ", age=" + age + "\r\n" ;
	}
	
	public int hashCode() {
		return (this.name+this.age).hashCode();
	}
	
	public boolean equals(Object obj) {
		return this.hashCode() == obj.hashCode();
	}
	
}
