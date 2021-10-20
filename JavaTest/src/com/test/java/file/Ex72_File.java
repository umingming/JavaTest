package com.test.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex72_File {

	public static void main(String[] args) {
//		m1();
//		m2();
//		m3();
//		m4();
//		m5();
//		m6();
//		m7();
		m8();

	}

	private static void m8() {
		try {
			String path = "C:\\Users\\u_011\\git\\JavaTest\\JavaTest\\src\\com\\test\\java\\etc\\Ex30_String.java";
			BufferedReader reader 
			= new BufferedReader(new FileReader(path));
			
			String line = "";
			int n = 1;
			
			while((line = reader.readLine()) != null) {
				System.out.printf("%03d: %s%n", n, line);
				n++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void m7() {

		try {
			String path = "C:\\class\\java\\file\\memo.txt";
			BufferedWriter writer = 
					new BufferedWriter(new FileWriter(path, true));
			
			writer.write("잘 부탁드립니다.");
			writer.newLine();
			writer.write("감사합니다.");

			writer.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	private static void m6() {
		try {
			
			String path = "C:\\class\\java\\file\\memo.txt";
			BufferedReader reader 
				= new BufferedReader(new FileReader(path));
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
//			
//			System.out.println(reader.readLine());
//			System.out.println(reader.readLine());
//			System.out.println(reader.readLine());
//			System.out.println(reader.readLine());
//			System.out.println(reader.readLine());
//			System.out.println(reader.readLine());
//			
			

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void m5() {
		try {
			FileReader reader = new FileReader("C:\\class\\java\\file\\memo.txt");
			
			int code = -1;
			while((code = reader.read()) != -1) {
				System.out.print((char)code);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void m4() {
		try {
			FileWriter writer = new FileWriter("C:\\class\\java\\file\\memo.txt");
			
			Scanner scan = new Scanner(System.in);
			
			for(int i=0; i<5; i++){
				System.out.println("입력:");
				String line = scan.nextLine();
				writer.write(line);
				writer.write("\r\n");
			}
			
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void m3() {
		
		try {
			FileWriter writer = new FileWriter("C:\\class\\java\\file\\list2.txt");
			writer.write(97);
			writer.write(98);
			writer.write(99);
			writer.write("안뇽");
			
			writer.close();
			writer = new FileWriter("C:\\class\\java\\file\\list2.txt");
			writer.write(99);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private static void m2() {
		
		try {
			FileInputStream stream 
			= new FileInputStream("C:\\class\\java\\file\\list.txt");
//			
//			int code = stream.read();
//			System.out.println((char)code);
//			
			int code = -1;
			while((code = stream.read()) != -1) {
				System.out.print((char)code);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

	private static void m1() {
		try {
			FileOutputStream stream 
			= new FileOutputStream("C:\\class\\java\\file\\list.txt", true);
			
//			stream.write(97);
//			stream.write(98);
//			stream.write(99);
			
			Scanner scan = new Scanner(System.in);
			System.out.println("쓰기 : ");
			String line = scan.nextLine();
			for(int i=0; i<line.length(); i++) {
				char c = line.charAt(i);
				stream.write(c);
			}
			
			stream.write('\r');
			stream.write('\n');
			
			stream.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} //프로그램 -> 파일
		
		
		
	}

}
