package com.test.question.obj.constructor;

public class Time {
	/*
	설계>
	1. 멤버 변수 선언; hour, minut, second (private)
	2. 생성자 메소드 오버로딩
		>매개변수가 (int hour, int minute, int second) 생성자
			>유효성 검사 매개값이 음수가 아닌지
			>if문 second>=60? minute + second/60, this.second = second%60
			>if문 minute>=60? hour + minute/60, this.minute = minute%60
			>this.hour=hour
		>기본 생성자; 0, 0, 0
		>매개변수가 (int minute, int second) 생성자
		>매개변수가 (int second) 생성자
	3. info메소드
		>hour:minute:second 형태의 String 리턴
	 */
	
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		this(0, 0, 0);
	}
	
	public Time(int hour, int minute, int second) {
		if(hour < 0 || minute < 0 || second < 0) {
			System.out.println("잘못된 입력입니다.");
			return;
		}//유효성
		
		if(second >= 60) {
			minute += second / 60;
			this.second = second % 60;
		} else {
			this.second = second;
		}

		if(minute >= 60) {
			hour += minute / 60;
			this.minute = minute % 60;
		} else {
			this.minute = minute;
		}
		
		this.hour = hour;
	}
	
	public Time(int minute, int second) {
		this(0, minute, second);
	}
	
	public Time(int second) {
		this(0, 0, second);
	}
	
	String info() {
		String temp = this.hour + ":" + this.minute + ":" + this.second;
		return temp;
	}

}
