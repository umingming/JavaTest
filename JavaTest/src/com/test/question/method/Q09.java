package com.test.question.method;

import java.util.Date;

public class Q09 {

	public static void main(String[] args) {
		System.out.print("현재 시간 : ");
		nowTime();
		nowTime_AMPM();
		

	}

	private static void nowTime() {
		Date now = new Date();
		System.out.printf("%d시 %d분 %d초%n", now.getHours(), now.getMinutes(), now.getSeconds());
	}

	private static void nowTime_AMPM() {
		Date now = new Date();
		String amPm = now.getHours() >= 12 ? "오후" : "오전";
		int hours = now.getHours() >= 12 ? now.getHours() - 12 : now.getHours();
		System.out.printf("%s %d시 %d분 %d초%n", amPm, hours, now.getMinutes(), now.getSeconds());
	}
}
