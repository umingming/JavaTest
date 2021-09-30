package com.test.java.obj;

import java.util.Calendar;

public class Ex37_Access {

	public static void main(String[] args) {

		Member m1 = new Member();
		m1.setName("홍길동");
		System.out.println(m1.getName());

		m1.setAge("55");
		System.out.println(m1.getAddress());
		System.out.println(m1.getBirthyear());
		
	}

}

class Member{
	private String name;
	private String age;
	private String address = "수원시";
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public int getBirthyear() {
		Calendar now = Calendar.getInstance();
		int age = Integer.parseInt(this.age);
		
		return now.get(Calendar.YEAR) - age + 1;
	}
}
