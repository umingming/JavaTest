package com.test.java.obj.inheritance;

import java.util.Calendar;

public class Ex56_final {

	public static void main(String[] args) {
		int a = 10;
		final int b = 20;
		a = 30;
		
		System.out.println(a);
		System.out.println(b);
		
		final double PI = 3.14;
		
		System.out.println(Calendar.YEAR);
		
		User u1 = new User();
		System.out.println(u1.AGE);
		System.out.println(u1.school);
		

	}

}

class User {
	final public int AGE = 20;
	final public String GENDER = "Female";
	public String name;
	static final public String school = "역삼중학교";
	public static final String HOMETOWN = "서울";
	
}

class FinalParent {
	final public void test() {
		System.out.println("부모 메소드");
	}
}

class FinalChild extends FinalParent {
	@Override
	public void test() {
		System.out.println("메소드 재정의");
	}
}

final class FinalUser {
	
}

class FinalAdministrator extends FinalUser {
	
}