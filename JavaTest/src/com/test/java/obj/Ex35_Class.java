package com.test.java.obj;

import java.util.Calendar;

public class Ex35_Class {

	public static void main(String[] args) {
		//자바에선 물리적인 파일 1개에 클래스 1개를 선언함.
		
		Student s1 = new Student();
		
		s1.name = "홍길동";
		s1.kor = 100;
		s1.eng = 90;
		s1.math = 80;
		int total = s1.kor + s1.eng + s1.math;
		double avg = total / 3.0;
		s1.tel = new String[] {"010-2145-2541", "031-847-9343"};
		s1.birthady = Calendar.getInstance();
		s1.birthady.set(1995, 12, 10);
		
		System.out.printf("%s: 총점 %d점, 평균 %.1f점%n", s1.name, total, avg);

		Student s2 = new Student();
		
		s2.name = "이유미";
		s2.kor = 100;
		s2.eng = 99;
		s2.math = 98;
		s2.printScore();
		
		System.out.println(s1.getAvg());
		
	
	}

}
