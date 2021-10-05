package com.test.question.obj;

import java.util.Calendar;

public class Item {
	private String name;
	private Calendar expiration;
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Calendar getExpiration() {
		return  this.expiration;
	}
	
	public void setExpiration(String date) {
		date = date.replace("-", "");
		Calendar expiration = Calendar.getInstance();
		
		expiration.set(Integer.parseInt(date.substring(0, 4)),
				Integer.parseInt(date.substring(4, 6)) -1,
				Integer.parseInt(date.substring(6)));
		
		this.expiration = expiration;
	}//매개변수가 String일 경우 Calendar로 변환해 저장
	
	public void setExpiration(Calendar date) {
		this.expiration = expiration;
	}
}