package com.test.question.obj.constructor;

public class Q08 {

	public static void main(String[] args) {
		
		Time t1 = new Time(); 
		System.out.println(t1.info());

		Time t2 = new Time(2, 30, 45); 
		System.out.println(t2.info());

		Time t3 = new Time(-1, 70, 30);
		System.out.println(t3.info());

		Time t4 = new Time(30, 10); 
		System.out.println(t4.info());

		Time t5 = new Time(90, 10); 
		System.out.println(t5.info());

		Time t6 = new Time(50);
		System.out.println(t6.info());

		Time t7 = new Time(10000); 
		System.out.println(t7.info());

	}

}
