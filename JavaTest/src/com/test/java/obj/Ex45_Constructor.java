package com.test.java.obj;

public class Ex45_Constructor {

	public static void main(String[] args) {
		
		Bottle b1 = new Bottle();
		
		b1.setColor("white");
		b1.setCapacity(500);
		
		System.out.println(b1.getColor());
		System.out.println(b1.getCapacity());

		Bottle b2 = b1;

		System.out.println(b2.getColor());
		System.out.println(b2.getCapacity());
		
		Bottle b3 = new Bottle();
		
		Bottle b5 = new Bottle();
		b1.setColor("파랑");
		b1.setCapacity(550);
		
		
		
		
	}//main

}

class Bottle {
	private String color;
	private int capacity;
	
	public Bottle() {
		this.color = "노랑";
		this.capacity = 350;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
}
