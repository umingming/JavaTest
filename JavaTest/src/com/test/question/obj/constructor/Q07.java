package com.test.question.obj.constructor;

public class Q07 {

	public static void main(String[] args) {
		
		Student s1 = new Student(); 
		System.out.println(s1.info());

		Student s2= new Student("홍길동", 13); 
		System.out.println(s2.info());

		Student s3= new Student(3, 10, 30);
		System.out.println(s3.info());

		Student s4= new Student("아무개", 12, 1, 5, 11); 
		System.out.println(s4.info());

	}

}
