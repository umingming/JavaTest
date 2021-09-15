package com.test.question.method;

import java.util.Date;

public class Q09 {

	public static void main(String[] args) {
		System.out.print("현재 시간 : ");
		nowTime();
		

	}

	private static void nowTime() {
		Date now = new Date();
		System.out.printf("%d시 %분 %초%n", now.getHours(), now.getMinutes(), now.getSeconds());
		
	}

}
