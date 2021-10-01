package com.test.java.obj;

public class Ex38_this {

	public static void main(String[] args) {
		
		Mouse m1 = new Mouse();
		
		m1.setModel("A001");
		m1.setPrice(10000);

		Mouse m2 = new Mouse();
		
		m2.setModel("A002");
		m2.setPrice(20000);
		

	}

}

class Mouse {
	private String model;
	private int price;
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
}
