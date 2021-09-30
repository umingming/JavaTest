package com.test.java.obj;

import java.util.Calendar;

public class Student {
	
	//멤버 구성
	//멤버 변수
	public String name;
	public int kor;
	public int eng;
	public int math;
	
	public String[] tel;
	public Calendar birthady;
	
	//멤버 메소드
	public void printScore() {
		int total = kor + eng + math;
		double avg = total / 3.0;
		System.out.printf("%s: 총점 %d점, 평균 %.1f점%n"
							, name, total, avg);
	}
	
	public int getTotal() {
		int total = kor + eng + math;
		return total;
	}

	public double getAvg() {
		double avg = getTotal() / 3.0;
		return avg;
	}
}
