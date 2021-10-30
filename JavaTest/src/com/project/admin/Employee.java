package com.project.admin;

import java.util.ArrayList;
import java.util.Scanner;

import com.project.data.*;
import com.project.main.*;

public class Employee {
	private static Scanner scan;
	private static int page;
	private static ArrayList<Staff> list;
	static {
		page = 0;
		scan = new Scanner(System.in);
	}
	
	public static void main(String[] args) throws Exception {
		
		boolean loop = true;
		while(loop) {
			menu();
			System.out.print("👉 ");
			String sel = scan.nextLine();
			System.out.println();
			
			if(sel.equals("1")) {		
				//직원 검색
			}else if(sel.equals("2")){	
				//직원 추가
			}else if(sel.equals("3")){	
				//직원 근무지 배치 및 수정
			}else if(sel.equals("4")){	
				//직원 삭제
			}else if(sel.equals("B")){	
				//뒤로 가기
				loop = false;
			}else {
				System.out.println("다시 입력해주세요.");
				pause();
			}
		}
	}
	

	private static void pause() {
		System.out.println("(엔터를 누르면 메뉴로 이동합니다.)");
		scan.nextLine();
	}

	private static void menu() throws Exception {
		System.out.println("============================");
		System.out.println("\t[직원 관리]");
		System.out.println("============================");
		list();
		System.out.println("< 이전 페이지 | 다음 페이지 > ");
		System.out.println("1. 직원 검색");
		System.out.println("2. 직원 추가");
		System.out.println("3. 직원 근무지 배치 및 수정");
		System.out.println("4. 직원 삭제");
		System.out.println("B. 뒤로 가기");
	}

	private static void list() throws Exception {
		list = Load.loadStaff();
		System.out.printf("%8s%8s%8s%8s%8s%8s%n"
						,"고유번호","이름","나이","주소","핸드폰 번호","근무지");
		for(int i=page; i<page+10; i++) {
			System.out.println(list);
		}
			
	}
}
