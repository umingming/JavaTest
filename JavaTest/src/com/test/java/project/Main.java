package com.test.java.project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import com.github.lalyos.jfiglet.FigletFont;

public class Main {
	
	private static Scanner scan;
	private static ArrayList<Member> list;
	static {
		scan = new Scanner(System.in);
		list = new ArrayList<Member>();
	}

	public static void main(String[] args) throws Exception {
		/*
		1. 프로젝트 > 데이터
		2. UI
		3. 파일 읽기/쓰기 + 컬렉션 > 조합
		
		
		 */
		
		System.out.println(1+2+4+8+16+32);
		String asciiArt1 = FigletFont.convertOneLine("Welcome!");
		System.out.println(asciiArt1);
		
		boolean loop = true;
		while(loop) {
			
			load();
			System.out.println(list.size());
			menu();
			System.out.print("선택: ");
			String sel = scan.nextLine();
			
			if(sel.equals("1")) {
				add();
			}else if(sel.equals("2")){
				list();
			}else {
				loop = false;
			}
			save();
		}


	}
	
	private static void save() throws Exception {
		BufferedWriter writer = new BufferedWriter(new FileWriter("data\\memeber.dat"));
		
		for(Member m : list) {
			String line = String.format("%s,%s,%s,%s,%s,%s"
									, m.getSeq()
									, m.getName()
									, m.getAge()
									, m.getGender()
									, m.getTel()
									, m.getAddress());
			writer.write(line);
			writer.newLine();
		}
	}

	private static void load() throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("data\\member.dat"));

		String line = null;
		while ((line = reader.readLine()) != null) {
			String[] temp = line.split(",");
			
			Member m = new Member();
			
			m.setSeq(temp[0]);
			m.setName(temp[1]);
			m.setAge(temp[2]);
			m.setGender(temp[3]);
			m.setTel(temp[4]);;
			m.setAddress(temp[5]);
			
			list.add(m);
			
		}

		reader.close();

	}

	private static void list() throws Exception {
		
		for(Member m : list) {
			System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%n"
								, m.getSeq()
								, m.getName()
								, m.getAddress()
								, m.getGender()
								, m.getTel()
								, m.getAddress());
		}
		
	}

	private static void add() throws Exception {
		
		String seq = getSeq();
		
		System.out.print("이름: ");
		String name = scan.nextLine();
		
		System.out.print("나이: ");
		String age = scan.nextLine();
		
		System.out.print("성별: ");
		String gender = scan.nextLine();
		
		System.out.print("전화번호: ");
		String tel = scan.nextLine();
		
		System.out.print("주소: ");
		String address = scan.nextLine();
		
		
		Member m = new Member();
		
		m.setSeq(seq);
		m.setName(name);
		m.setAge(age);
		m.setGender(gender);
		m.setTel(tel);;
		m.setAddress(address);
		
		list.add(m);
		save();
		
		
	}

	private static String getSeq() {
		return list.size()+"";
	}

	private static void menu() {
		
	}

}
