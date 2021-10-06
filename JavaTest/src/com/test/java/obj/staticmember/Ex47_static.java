package com.test.java.obj.staticmember;

public class Ex47_static {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setName("이유미");
		s1.setAge(27);
		s1.setSchool("수원대학교");
		System.out.println(s1.info());

		Student s2 = new Student();
		s2.setName("아무개");
		s2.setAge(24);
		s2.setSchool("수원대학교");
		System.out.println(s2.info());
		
		Student s3 = new Student();
		s3.setName("김뫄뫄");
		s3.setAge(28);
		s3.setSchool("수원대학교");
		System.out.println(s3.info());
		
	}

}

class Student{
	
//	private int a;
//	private static int b;
//	public void c() {}
//	public static void d() {}
	
	private String name;
	private int age;
	private String school;

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
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	public String info() {
		return String.format("이름: %s, 나이: %s, 학교: %s"
				, this.name
				, this.age
				, this.school);
	}
	
}
