package com.test.java.inheritance;

import java.util.Random;

public class MyRandom extends Random {
	
	public int nextTinyInt() {
		Random rnd = new Random();
		return rnd.nextInt(10) + 1;
	}
	
	public String nextColor() {
		Random rnd = new Random();
		String[] colors = {"red", "yellow", "blue", "orange", "green"};
		return colors[rnd.nextInt(colors.length)];
	}
	
//	public int nextInt() {
//		Random rnd = new Random();
//		return rnd.nextInt();
//	}
//
//	public boolean nextBoolean() {
//		Random rnd = new Random();
//		return rnd.nextBoolean();
//	}

}
