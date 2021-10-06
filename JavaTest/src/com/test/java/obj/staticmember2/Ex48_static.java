package com.test.java.obj.staticmember2;


public class Ex48_static {
	
	//프로그램 실행 순서
	//1 main 시작
	//2 나머지 코드
	//3 main 종료

	public static void main(String[] args) {
		
		Student.setSchool("수원대학교");
		Student s1 = new Student();
		s1.setName("이유미");
		s1.setAge(27);
		System.out.println(s1.info());
		
		Student s2 = new Student();
		s2.setName("아무개");
		s2.setAge(24);
		System.out.println(s2.info());
		
		Student s3 = new Student();
		s3.setName("김뫄뫄");
		s3.setAge(28);
		System.out.println(s3.info());

	}//main

}

class Student{
	
	private String name;
	private static String school;
	private int age;

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

	public static String getSchool() {
		return school;
	}

	public static void setSchool(String school) {
		Student.school = school;
	}

	
	public String info() {
		return String.format("이름: %s, 나이: %s, 학교: %s"
				, this.name
				, this.age
				, Student.school);
	}
	
}