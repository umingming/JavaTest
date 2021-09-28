package com.test.java;

import java.util.Calendar;

public class Ex27_for {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		
		
		output(year, month);

	}

	private static void output(int year, int month) {
		int lastDay = 0;
		int day_of_week = 0;
		lastDay = getLastDay(year, month);
		day_of_week = getDayOfWeek(year, month);
		
		System.out.println("=======================================================");
		System.out.printf("                      %d년 %d월%n", year, month);
		System.out.println("=======================================================");
		System.out.println("[월]\t[화]\t[수]\t[목]\t[금]\t[토]\t[일]\t");
		
		for (int i=0; i<day_of_week; i++) {
			System.out.print("\t");
		}
		
		for (int i=1; i<=lastDay; i++) {
			System.out.printf("%3d\t", i);
			
			if((i + day_of_week) % 7 == 0) {
				System.out.println();
			}
		}
	}

	private static int getDayOfWeek(int year, int month) {
		
		int date = 1;
		int totalDays = 0;
		
		for(int i=1; i<year; i++) {
			if (isLeapYear(year)) {
				totalDays += 366;
			} else {
	 		totalDays += 365;
			}
		}
		
		for(int i=1; i<month; i++) {
			totalDays += getLastDay(year, i);
		}
		
		totalDays += date;
		
		return totalDays % 7;
	}

	private static int getLastDay(int year, int month) {
		switch(month){
		case 1, 3, 5, 7, 8, 10, 12 : 
			return 31;
		case 4, 6, 9, 11 : 
			return 30;
		case 2 :
			if (isLeapYear(year)) {
				return 29;
			} else {
				return 28;
			}
		}
		return 0;
	}

	private static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0 ) {
				if (year % 400 == 0) {
					return true;
				}
			} else {
				return true;
			}
		}
		return false;
	}

}
