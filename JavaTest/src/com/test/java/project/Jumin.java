package com.test.java.project;

import java.util.Random;

public class Jumin {

	public static void main(String[] args) {
		for(int i=0; i<100; i++) {
			Random rnd = new Random();
			int yy = rnd.nextInt(100);
			int mm = rnd.nextInt(12) + 1;
			int dd = rnd.nextInt(30) + 1;
			int gender = rnd.nextInt(2) + 1;
			int etc = rnd.nextInt(90000) + 10000;
			String jumin = String.format("%02d%02d%02d%d%05d"
							,yy,mm,dd,gender,etc);
			int sum = 0;

			for(int j=0; j<jumin.length()-1; j++) {
				sum += Integer.parseInt(jumin.charAt(j)+"") * (j % 8 + 2);
			}
			while(sum>=10) {
				sum %= 11;
				sum = 11 - sum;
			}
			jumin += sum + "";
			System.out.println(jumin);
		}
	}
}
