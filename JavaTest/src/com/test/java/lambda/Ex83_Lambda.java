package com.test.java.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex83_Lambda {

	public static void main(String[] args) {
		/*
		익명 객체의 활용 
		 */
		
		List<Integer> nums = new ArrayList<Integer>();
		List<String> names = new ArrayList<String>();
		List<User> users = new ArrayList<User>();
		
		nums.add(200);
		nums.add(300);
		nums.add(500);
		nums.add(100);
		nums.add(400);
		
		names.add("황길동");
		names.add("아무개");
		names.add("김자바");
		names.add("이유미");
		names.add("유재석");
		
		users.add(new User("홍길동",20));
		users.add(new User("아무개",24));
		users.add(new User("유재석",25));
		users.add(new User("강호동",21));
		users.add(new User("이유미",23));
		System.out.println(nums);
		System.out.println(names);
		
		nums.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});
		
		nums.sort((Integer o1, Integer o2) -> {return o2 - o1;});
		nums.sort((o1, o2) -> o2 - o1);
		
		names.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
			
		});
		
		users.sort(new Comparator<User>() {
			@Override
			public int compare(User o1, User o2) {
				return o2.getName().compareTo(o1.getName());
			}
		});
		
		users.sort((o1, o2) -> o2.getName().compareTo(o1.getName()));
		System.out.println(users);
		System.out.println(nums);
		System.out.println(names);
		
		Collections.sort(nums);
		System.out.println(nums);
//		Collections.sort(names);
//		System.out.println(names);
//		Collections.sort(users);
//		System.out.println(users);
//		nums.sort(null);

	}

}

class User {
	private String name;
	private int age;
	@Override
	public String toString() {
		return "[" + name + ", " + age + "]";
	}
	
	public User() {
		super();
	}
	public User(String name, int age) {
		super();
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
}
