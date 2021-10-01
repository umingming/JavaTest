package com.test.question.obj;

public class Q04 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("홍길동3");
		e1.setDepartment("홍보부");
		e1.setPosition("대리");
		e1.setTel("010-1234-5678");
		e1.setBoss(null); 
		e1.info();

		Employee e2 = new Employee();
		e2.setName("아무개");
		e2.setDepartment("홍보부");
		e2.setPosition("사원");
		e2.setTel("010-2541-8569");
		e2.setBoss(e1); 
		e2.info();

	}

}
