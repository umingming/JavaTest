package com.test.question.obj;

import java.util.Calendar;

public class Bugles {
	
	/* 
	설계>
	1. 멤버 변수(private) ; 가격, 용량, 생산일자, 유통기한
	2. Setter/Getter
		>set용량 
			>300, 500, 850? 맞으면 this.용량 저장
			>switch문
				>가격 300->850, 500->1200, 850->1950원
				>유통기한 300->7, 500->10, 850->15
		>get가격
		>set생산일자
			>replace 사용해 "-" 제거
			>입력 받은 값 유효한지 메소드로 확인, 8글자 다 숫자일 것.
			>Calendar.set으로 날짜 수정
		>get 남은 유통 기한
			>생산일자 + 유통기한 add로 날짜 수정
			>남은 날짜? (tick) 유통기한 - 현재 
	3. eat 메소드
		>먹을 수 있는 가? 유통기한이 -면 못먹음
	 */
	
	private int price;
	private int weight;
	private Calendar creationTime;
	private int expirationOfProduct;
	private int expiration;
    
	public void setWeight(int weight) {
		if(!(weight == 300 || weight == 500 || weight == 850)) {
			return;
		}//유효성 검사
    	
		switch(weight) {
		case 300 : 
			this.price = 850;
			this.expirationOfProduct = 7;
			break;
		case 500 : 
			this.price = 1200;
			this.expirationOfProduct = 10;
			break;
		case 850 : 
			this.price = 850;
			this.expirationOfProduct = 15;
			break;
		}
    	
		this.weight = weight;
	}//setWeight
    
	public int getPrice() {
		return this.price;
	}//getPrice
    
	public void setCreationTime(String date) {
		date = date.replace("-", "");
		
		if(!isValidDate(date)) {
			return;
		}//유효성 검사
		
		Calendar creationTime = Calendar.getInstance();
		creationTime.set(Integer.parseInt(date.substring(0, 4)),
		Integer.parseInt(date.substring(4, 6)) - 1,
		Integer.parseInt(date.substring(6)));
		
		this.creationTime = creationTime;
	}//setCreationTime
    
	private boolean isValidDate(String date) {
		if(date.length() != 8) {
			return false;
		}
		
		for(int i=0; i<date.length(); i++) {
			if(date.charAt(i) < '0' || date.charAt(i) > '9') {
				return false;
			}
		}
		
		return true;
	}//isValidDate
	
	public int getExpiration() {
		this.creationTime.add(Calendar.DATE, expirationOfProduct);
		
		Calendar today = Calendar.getInstance();
		long todayTick = today.getTimeInMillis();
		long creationTimeTick = this.creationTime.getTimeInMillis();
		
		this.expiration = (int)((creationTimeTick-todayTick) / 1000 / 60 / 60 / 24);
		
		return this.expiration;
	}//getExpriration
	
	public void eat() {
		if(this.expiration < 0) {
			System.out.println("유통기한이 지나 먹을 수 없습니다.\n");
		} else {
			System.out.println("과자를 맛있게 먹습니다.\n");
		}
	}//eat

}
