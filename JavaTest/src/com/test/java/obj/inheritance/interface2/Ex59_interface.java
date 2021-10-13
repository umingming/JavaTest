package com.test.java.obj.inheritance.interface2;

public class Ex59_interface {

	public static void main(String[] args) {
//		Gram lg = new Gram();
//		
//		lg.start();
//		lg.stop();
//		
//		MacBook mac = new MacBook();
//		
//		mac.start();
		
		Laptop lg = new Gram();
		lg.start();
		
		Laptop mac = new MacBook();
		

	}

}

interface Laptop {
	void start();
	void stop();
}
class Gram implements Laptop{
	public String model;
	public String color;
	
	@Override
	public void start() {
		System.out.println("전원을 켭니다.");
	}

	@Override
	public void stop() {
		System.out.println("전원을 끕니다.");
	}
}

class MacBook implements Laptop{
	
	public String model;
	public int weight;
	
	@Override
	public void start() {
		System.out.println("맥북 On");
	}

	@Override
	public void stop() {
		System.out.println("맥북 Off");
	}
	
}