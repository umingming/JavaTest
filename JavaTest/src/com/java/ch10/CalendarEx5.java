package com.java.ch10;

import java.util.Calendar;

public class CalendarEx5 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		
		date.set(2015, 0, 31);
		System.out.printf("%tF%n", date);
		date.roll(Calendar.MONTH, 1);
		System.out.printf("%tF%n", date);
	}

}
