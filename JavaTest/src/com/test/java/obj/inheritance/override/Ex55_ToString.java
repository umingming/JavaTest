package com.test.java.obj.inheritance.override;

import java.util.Arrays;
import java.util.Date;

public class Ex55_ToString {

	public static void main(String[] args) {
		
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println(d1.toString());

		Time t1 = new Time(2, 30);
		System.out.println(t1);
		System.out.println(t1.toString());

	}//main

}

class Time {
	private int hour;
	private int min;
	

	public Time(int hour, int min) {
		this.hour = hour;
		this.min = min;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", min=" + min + "]";
	}
	
//	public String toString() {
//		return String.format("%2d:%2d", this.hour, this.min);
//	}
//	
//	@Override
//	public String toString() {
//		return super.toString();
//	}
}

class Parent {
	public void test() {
		
	}
}

class Child extends Parent {
	@Override
	public void test() {
		// TODO Auto-generated method stub
		super.test();
	}
}
