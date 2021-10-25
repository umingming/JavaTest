package com.test.review.lambda;

import java.util.ArrayList;
import java.util.Comparator;

public class ArraySort {

	public static void main(String[] args) {
		ArrayList<User> list = new ArrayList<User>(); 
		list.add(new User("이유미", 27));
		list.add(new User("김상만", 32));
		list.add(new User("정정정", 25));
		
		System.out.println(list);
		
//		list.sort(new Comparator<User>() {
//			@Override
//			public int compare(User o1, User o2) {
//				return o1.getAge() - o2.getAge();
//			}
//		});
		list.sort((o1, o2) -> 
						o1.getAge() - o2.getAge());
		System.out.println(list);
	}

}

class User{
	String name;
	int age;
	
	
	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public User() {
		this.name = "";
		this.age = 0;
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

	@Override
	public String toString() {
		return "[" + name + ", " + age + "]";
	}
	
	
}
