package com.test.question.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class check {
	public static void main(String[] args) throws NumberFormatException, IOException {			
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		
		System.out.print("숫자: ");		
		String num = reader.readLine();		
				
				
				
		for(int i = 0; i<num.length(); i++ ) {		
				
			if((num.length()-i)%3==0 && i!=0) {	
				System.out.print(",");
			}	
			System.out.print(num.charAt(i));	
		}		
				
	}			

}
