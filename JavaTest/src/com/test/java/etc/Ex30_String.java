package com.test.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex30_String {

	public static void main(String[] args) throws Exception{
//		m1();
//		m2();
//		m4();
//		m5();
//		m6();
//		m7();
//		m8();
//		m9();
//		m10();
//		m11();
//		m12();
//		m13();
//		m14();
//		m15();
		

	}

	private static void m15() {
		String txt = "안녕하세요. 홍길동입니다. 저를 홍길동이라고 부르세요.";
		System.out.println(txt.replace("홍길동", "아무개"));
		
		String content = "게시판에 글을 작성합니다. 바보야!!";
		String word = "바보";
		
		System.out.println(content.replace(word, "**"));
		
		txt = "     하나     둘     셋     ";
		System.out.printf("[%s]%n", txt);
		System.out.printf("[%s]%n", txt.replace(" ", ""));
		
	}

	private static void m14() {
		//lastindexOf()
		//substring()
		//length()
		//파일면 추출> Ex10.java
		//확장자 없는 파일면 추출> Ex10
		//확장자 추출? .java
		String path = "D:\\class\\java\\JavaTest\\src\\Ex10.java";
		int index = path.lastIndexOf("\\");
		String filename = path.substring(index + 1, path.length());
		System.out.println(filename);
		
		index = path.lastIndexOf(".");
		String filenameWithoutExt = filename.substring(0, index);
		System.out.println(filenameWithoutExt);

		String ext = filename.substring(index);
		System.out.println(ext);
	}

	private static void m13() {
		
	}

	private static void m12() {
//		String txt = "홍길동님 안녕하세요?";
//		System.out.println(txt.startsWith("홍"));
//		System.out.println(txt.endsWith("?"));
//		System.out.println(txt.charAt(txt.length() - 1) == '?');
//		System.out.println(txt.indexOf('?') == txt.length() - 1);
		String path = "D:\\class\\java\\.jpg\\dog.jpg";
		
		if (path.indexOf(".jpg") == path.length() - 4) {
			System.out.println("이미지 파일 입니다.");
		} else {
			System.out.println("잘못");
		}
	}

	private static void m11() {
		String txt = "Hello Java";
		System.out.println(txt);
		System.out.println(txt.toUpperCase());
		System.out.println(txt.toLowerCase());
		
	}

	private static void m10() {
		String word = "바보";
		String content = "안녕하세요. 자바보를 배우는 학생입니다.";
		
		if(content.indexOf(word) == -1) {
			//올바른 경우
			System.out.println("글쓰기 완료");
		} else {
			//금지어 발견
			System.out.println("경고!!");
		}
		
		String jumin = "123456-1234567";
		
		if(jumin.indexOf("-") == 6) {
			System.out.println("Success");
		} else {
			System.out.println("Failed");
		}
		
		if(jumin.charAt(6) == '-') {
			System.out.println("Success");
		} else {
			System.out.println("Failed");
		} 
		
	}

	private static void m9() {
		String txt = "안녕하세요. 홍길동입니다.";
		int index = -1;
		index = txt.indexOf('하');
		System.out.println(index);
		
		index = txt.indexOf("홍길순");
		System.out.println(index);
		
		index = txt.indexOf('가');
		System.out.println(index);
	}

	private static void m8() {
		String txt = "   하나   둘   셋   ";
		System.out.printf("[%s]%n", txt);
		System.out.printf("[%s]%n", txt.trim());
		
	}

	private static void m7() throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("주민등록번호 : ");
		String jumin = reader.readLine();
		
		if(isValidJumin(jumin)) {
			System.out.println("올바른 주민등록번호입니다.");
		} else {
			System.out.println("올바르지 않은 주민등록번호입니다.");
		}
		
		
	}

	private static boolean isValidJumin(String jumin) {
		if(jumin.charAt(6) != '-') {
			return false;
		}
		
		return true;
	}

	private static void m6() throws Exception{
		//이름 입력 + 길이 (2~5글자) + 구성(한글만)
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("이름 : ");
		String name = reader.readLine();

		if(isValid(name)) {
			System.out.println("업무 진행 하세요.");
		} else {
			System.out.println("이름을 올바르게 입력하세요.");
		}
		
	}

	private static boolean isValid(String name) {
		//길이 검사. 한글 검사
		
		if(name.length() < 2 || name.length() > 5) {
			return false;
		}
		
		for(int i=0; i<name.length(); i++) {
			char c = name.charAt(i);
			if(c < '가' || c > '힣') {
				return false;
			}
		}
		return true;
	}

	private static void m5() throws Exception{
		//아이디 입력 + 영어 소문자
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("아이디 입력 : ");
		String id = reader.readLine();

		for(int i=0; i<id.length(); i++) {
			char c = id.charAt(i);
			
			if(c < 'a' || c > 'z') {
				System.out.println("잘못 입력했습니다.");
				break;
			} 
			
		}
		System.out.println("종료");
		
		
	}

	private static void m4() {
		String txt = "안녕하세요. 홍길동입니다.";
		char c = txt.charAt(3);
		System.out.println(c);
		
	}

	private static void m2() throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			
			System.out.print("이름 입력 : ");
			String name = reader.readLine();
			
			if(name.length() < 2 || name.length() > 5) {
				System.out.println("이름은 2~5자 이내로 입력하시오.");
			} else {
				break;
			}
		}
		
		System.out.println("올바른 이름입니다.");
		
	}

	private static void m1() throws Exception{
//		//문자열 길이
//		String txt = "ABCDE";
//		
//		System.out.println(txt.length());
//		
//		txt = "english, 한글, 012345, !@#$%";
//		System.out.println(txt.length());
//		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("숫자 입력 : ");
		double num1 = Double.parseDouble(reader.readLine());

		System.out.print("숫자 입력 : ");
		int num2 = Integer.parseInt(reader.readLine());

		
		System.out.printf("입력한 문장은 총 %d개의 문자로 구성되어 있습니다.", statement.length());
	}

}
