package com.test.question.iteration;

public class check {

	public static void main(String[] args) {
		int x = 100;
		int y = 0;
		for(int i=0; i<10; i++) {
			if(x % i == 0) {
				y += 1;
			}
		}
//		System.out.println(y);
	}

}
