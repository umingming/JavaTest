package com.test.question.obj.constructor;

public class Student {
	/*
	설계>
	1. 멤버 변수; 이름, 나이, 학년, 반, 번호
	2. 생성자 메소드
		>기본 생성자; 미정, 0, 0, 0, 0
		>오버로딩 매개변수(이름, 나이, 학년, 반, 번호)
			>유효성 검사 이름 한글인지, 그 외 매개값이 음수가 아닌지
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
		if(!isValid(name) || age < 0 || grade < 0 || classNumber < 0 || number < 0) {
			System.out.println("다시 입력해주세요.");
			return;
		}//유효성
		
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.classNumber = classNumber;
		this.number = number;
	}
	
	private boolean isValid(String name) {
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i) < '가' || name.charAt(i) > '힣') {
				return false;
			}
		}
		return true;
	}

	public Student(String name, int age) {
		this(name, age, 0, 0, 0);
	}
	
	public Student(int grade, int classNumber, int number) {
		this("미정", 0, grade, classNumber, number);
	}
	
	public String info() {
		String temp = this.name + "(";
		temp += "나이 : " + (this.age == 0 ? this.age + "세" : "미정");
		temp += ", 학년 : " + (this.grade == 0 ? this.grade : "미정");
		temp += ", 반 : " + (this.classNumber == 0 ? this.classNumber : "미정");
		temp += ", 번호 : " + (this.number == 0 ? this.number : "미정") + ")";
		return temp; 
	}
}
