package com.project.user;

import java.util.Scanner;

import com.project.data.UserVoice;

public class user {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean loop = true;
		while(loop) {
			
			try {
				menu();
				System.out.print("π");
				String sel = scan.nextLine();
				
				if(sel.equals("1")) {
				}else if(sel.equals("2")){
					
				}else {
					loop = false;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static void menu() {
		System.out.println("μ¬μ©μ νμ΄μ§μλλ€.");
		System.out.println("1. μ€λ¬Έμ‘°μ¬");
		System.out.println("2. κ³ κ°μ μλ¦¬");
		
	}
}
