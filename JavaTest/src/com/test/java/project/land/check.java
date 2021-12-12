package com.test.java.project;

import java.util.Random;

public class check {
	
	public static void main(String[] args) {
		Random rnd = new Random();
		System.out.printf("%.1f", rnd.nextInt(4) + rnd.nextDouble());
	}

}
