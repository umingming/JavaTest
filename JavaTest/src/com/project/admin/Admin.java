package com.project.admin;

import java.util.*;
import com.project.data.UserVoice;

public class Admin {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean loop = true;
		while(loop) {
			
			try {
				menu();
				System.out.print("선택: ");
				String sel = scan.nextLine();
				
				if(sel.equals("1")) {
				}else if(sel.equals("2")){
					UserVoice uv = new UserVoice();
					uv.list();
				}else {
					loop = false;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static void menu() {
		System.out.println("관리자 페이지입니다.");
		System.out.println("1. 설문조사");
		System.out.println("2. 고객의 소리");
		
	}

}
