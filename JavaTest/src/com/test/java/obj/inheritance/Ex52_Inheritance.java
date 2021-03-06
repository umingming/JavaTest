package com.test.java.inheritance;

import java.util.Random;

public class Ex52_Inheritance {

	public static void main(String[] args) {
		
//		m1();
		m2();
		/*
		1. -21억 ~21억
		2. 1~10
		3. 색상; red, yellow, blue, orange, 
		 */
//		work1();
//		work2();
//		work3();
		work4();
		

	}

	private static void work4() {
		UtilRandom utilrnd = new UtilRandom();
		
		System.out.println(utilrnd.nextInt());
		System.out.println(utilrnd.nextInt());
		System.out.println(utilrnd.nextInt());
		System.out.println(utilrnd.nextInt());
		System.out.println(utilrnd.nextInt());
		
		System.out.println(utilrnd.nextTinyInt());
		System.out.println(utilrnd.nextTinyInt());
		System.out.println(utilrnd.nextTinyInt());
		System.out.println(utilrnd.nextTinyInt());
		System.out.println(utilrnd.nextTinyInt());
		
		System.out.println(utilrnd.nextColor());
		System.out.println(utilrnd.nextColor());
		System.out.println(utilrnd.nextColor());
		System.out.println(utilrnd.nextColor());
		System.out.println(utilrnd.nextColor());
		
		System.out.println(utilrnd.nextBoolean());
		System.out.println(utilrnd.nextBoolean());
		System.out.println(utilrnd.nextBoolean());
		System.out.println(utilrnd.nextBoolean());
		System.out.println(utilrnd.nextBoolean());
		
		
	}

	private static void work3() {
		MyRandom myrnd = new MyRandom();
		
		System.out.println(myrnd.nextInt());
		System.out.println(myrnd.nextInt());
		System.out.println(myrnd.nextInt());
		System.out.println(myrnd.nextInt());
		System.out.println(myrnd.nextInt());
		
		System.out.println(myrnd.nextTinyInt());
		System.out.println(myrnd.nextTinyInt());
		System.out.println(myrnd.nextTinyInt());
		System.out.println(myrnd.nextTinyInt());
		System.out.println(myrnd.nextTinyInt());
		
		System.out.println(myrnd.nextColor());
		System.out.println(myrnd.nextColor());
		System.out.println(myrnd.nextColor());
		System.out.println(myrnd.nextColor());
		System.out.println(myrnd.nextColor());
		
		
	}

	private static void work2() {
		Random rnd = new Random();
		MyRandom myrnd = new MyRandom();
		
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
		System.out.println(rnd.nextInt());
		
		System.out.println(myrnd.nextTinyInt());
		System.out.println(myrnd.nextTinyInt());
		System.out.println(myrnd.nextTinyInt());
		System.out.println(myrnd.nextTinyInt());
		System.out.println(myrnd.nextTinyInt());
		
		System.out.println(myrnd.nextColor());
		System.out.println(myrnd.nextColor());
		System.out.println(myrnd.nextColor());
		System.out.println(myrnd.nextColor());
		System.out.println(myrnd.nextColor());
		
	}

	private static void work1() {
		Random rnd = new Random();
		System.out.println(rnd.nextInt());			//1
		System.out.println(rnd.nextInt());			//1
		System.out.println(rnd.nextInt());			//1
		System.out.println(rnd.nextInt());			//1
		System.out.println(rnd.nextInt());			//1

		System.out.println(rnd.nextInt(10) + 1);	//2
		System.out.println(rnd.nextInt(10) + 1);	//2
		System.out.println(rnd.nextInt(10) + 1);	//2
		System.out.println(rnd.nextInt(10) + 1);	//2
		System.out.println(rnd.nextInt(10) + 1);	//2

		String[] colors = {"red", "yellow", "blue", "orange", "green"};
		System.out.println(colors[rnd.nextInt(colors.length)]);
		System.out.println(colors[rnd.nextInt(colors.length)]);
		System.out.println(colors[rnd.nextInt(colors.length)]);
		System.out.println(colors[rnd.nextInt(colors.length)]);
		System.out.println(colors[rnd.nextInt(colors.length)]);
		
	}

	private static void m2() {
		
	}

	private static void m1() {
		/*
		난수 생성
		1. Math.random()
		2. Random 클래스
		 */
		
		for(int i=0; i<10; i++) {
			System.out.println(getRandom(10));
		}
		
		Random random = new Random();
		for(int i=0; i<10; i++) {
			System.out.println(random.nextInt(20));;
		}
		
	}

	private static int getRandom(int max) {
		return (int)(Math.random() * max);
	}

}
