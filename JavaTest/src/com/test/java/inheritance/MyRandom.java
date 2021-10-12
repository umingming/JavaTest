package com.test.java.inheritance;

import java.util.Random;

public class MyRandom {
	
	public int nextTinyInt() {
		Random rnd = new Random();
		
		return rnd.nextInt(10) + 1;
	}

}
