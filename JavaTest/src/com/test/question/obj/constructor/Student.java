package com.test.question.obj.constructor;

public class Student {
	/*
	설계>
	1. 멤버 변수; 이름, 나이, 학년, 반, 번호
	2. 생성자 메소드
		>기본 생성자; 미정, 0, 0, 0, 0
		>오버로딩 매개변수(이름, 나이, 학년, 반, 번호)
		>오버로딩 매개변수(이름, 나이)
		>오버로딩 매개변수(학년, 반, 번호)
	3. info 메소드
	 */
	
	private String name;
	private int age;
	private int grade;
	private int classNumber;
	private int number;
	
	public Student() {
		this("미정", 0, 0, 0, 0);
	}
	
	public Student(String name, int age, int grade, int classNumber, int number) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.classNumber = classNumber;
		this.number = number;
	}
	
	public Student(String name, int age) {
		this(name, age, 0, 0, 0);
	}
	
	public Student(int grade, int classNumber, int number) {
		this("미정", 0, grade, classNumber, number);
	}
	
	public String info() {
		String temp = this.name + 
				"(나이 : " + this.age + "세" +
				", 학년 : " + this.grade + 
				", 반 : " + this.classNumber + 
				", 번호 : " + this.number + ")"; 
		return temp; //0 -> 미정으로
	}
}
