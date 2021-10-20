package com.test.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex73_File {
	
	private static Scanner scan;
	private static int num;
	
	static {
		scan = new Scanner(System.in);
		num = 0;
	}
	
	public static void main(String[] args) {
		
		/*
		회원 정보 관리 시스템
		1. 기능 설계
			a. 회원 정보 추가하기
			b. 회원 정보 목록하기
			c. 회원 정보 삭제하기
			d. 회원 정보 검색하기
			e. 회원 정보 수정하기
		2. 데이터 설계
			>어디? 어떤 파일?
			>데이터 포맷
			>회원 정보
			
		 */
		
		
		System.out.println("시작");
		
		boolean loop = true;
		
		while(loop) {
			menu();
			Scanner scan = new Scanner(System.in);
			
			System.out.print("선택 : ");
			String sel = scan.nextLine();
			
			try {
				if(sel.equals("1")) {
					add();
				} else if(sel.equals("2")) {
					list();
				} else if(sel.equals("3")) {
					delete();
				} else if(sel.equals("4")) {
					search();
				} else if(sel.equals("5")) {
					edit();
				} else {
					loop = false;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		System.out.println("종료");

	}//main

	private static void edit() {
		header("회원 수정하기");
		
		pause("회원을 수정했습니다.");
	}

	private static void search() {
		header("회원 검색하기");
		
		pause("회원을 검색했습니다.");
	}

	private static void delete() {
		header("회원 삭제하기");
		
		pause("회원을 삭제했습니다.");
		
		
	}

	private static void list() throws Exception {//main으로 처리 미루기
		header("회원 목록보기");
		
		BufferedReader reader 
			= new BufferedReader(new FileReader(MyPath.DATA));
		
		System.out.println("[번호]\t[이름]\t[나이]\t[주소]");
		String line = null;
		
		while((line = reader.readLine()) != null) {
			String[] temp = line.split(","); 
			System.out.printf("%4s\t%s\t%4s\t%s%n"
								, temp[0]
								, temp[1]
								, temp[2]
								, temp[3]);
		}
		
		reader.close(); //clean up code 미리 닫아놓기
		
		pause("회원 목록을 출력했습니다.");
	}

	private static void add() {
		header("회원 추가하기");
		num++;
		
		System.out.print("이름: ");
		String name = scan.nextLine();
		
		System.out.print("나이: ");
		String age = scan.nextLine();
		
		System.out.print("주소: ");
		String address = scan.nextLine();

		try {
			BufferedWriter writer 
					= new BufferedWriter(new FileWriter(MyPath.DATA, true));
			
			writer.write(String.format("%s,%s,%s,%s,%n"
									, num, name, age, address));
			
			writer.close();
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		pause("회원을 추가했습니다.");
	}

	private static void header(String title) {
		System.out.printf("[%s]\r\n", title);
	}
	
	private static void pause(String msg) {
		System.out.println(msg);
		System.out.println("계속하시려면 enter를 누르세요.");
		scan.nextLine();
	}//Refactor -> Extract method

	private static void menu() {
		System.out.println("===============================");
		System.out.println("            회원 관리");
		System.out.println("\t1. 회원 추가하기");
		System.out.println("\t2. 회원 목록보기");
		System.out.println("\t3. 회원 삭제하기");
		System.out.println("\t4. 회원 검색하기");
		System.out.println("\t5. 회원 수정하기");
		System.out.println("\t6. 종료");
		System.out.println("===============================");
	}

}