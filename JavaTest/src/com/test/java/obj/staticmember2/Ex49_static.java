package com.test.java.obj.staticmember2;

public class Ex49_static {
	
	public static void main(String[] args) {
		
//		Pen p1 = new Pen();
//		
//		p1.setModel("153");
//		p1.setColor("검정");
//		
//		Pen p2 = new Pen("젤리펜", "빨강");
		/*
		int count = 0;
		
		Pen p1 = new Pen("153", "검정");
		count++;
		
		Pen p2 = new Pen("153", "검정");
		count++;
		
		Pen p3 = new Pen("153", "검정");
		count++;
		
		System.out.println("펜의 개수 : " + count);
		*/
		Pen p1 = new Pen("153", "검정");
//		Pen.count++;
		
		Pen p2 = new Pen("153", "검정");
//		Pen.count++;
		
		Pen p3 = new Pen("153", "검정");
//		Pen.count++;
		
		System.out.println("펜의 개수 : " + Pen.count);
		
		
	}

}

class Pen { 
	private String model;
	private String color;
	public static int count;
	
	static {
		Pen.count = 3;
	}
	
	public Pen() {
		this.model = "";
		this.color = "";
	}

	public Pen(String model, String color) {
		super();
		this.model = model;
		this.color = color;
		Pen.count = 10;
		Pen.count++;
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String info() {
		return String.format("%s, %s"
				, this.model	
				, this.color);
	}
}
