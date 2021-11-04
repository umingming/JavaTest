package com.test.java.etc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex89_RegEx {

	public static void main(String[] args) {
		/*
		 * 정규 표현식
		 * 정규식
		 * 문자열을 검색한다
		 * 문자열을 대상으로 찾고자 하는 패턴을 가지는 문자열을 검색한다.
		 * 자바와 상관없는 독립적인 표현식
		 * 
		 * 홍+길동 -> 홍홍길길동
		 */
//		m1();
//		m2();
//		m3();
//		m4();
		m5();
				
	}

	private static void m5() {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름: ");
		String name = scan.nextLine();
		String regex = "^[가-힣]{2,5}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(name);
		if(m.find()) {
			System.out.println("올바른 이름 입력");
		} else {
			System.out.println("올바르지 않은 이름 입력");
		}
		
		
	}

	private static void m4() {

		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\class\\java\\데이터\\naver.txt"));

			String line = null;
			String wholeText = "";
			while ((line = reader.readLine()) != null) {
				wholeText += line;
			}

			reader.close();
			Pattern p = Pattern.compile("(http|ftp|https):\\/\\/[\\w\\-_]+(\\.[\\w\\-_]+)+([\\w\\-\\.,@?^=%&amp;:/~\\+#]*[\\w\\-\\@?^=%&amp;/~\\+#])?");
			
			Matcher m = p.matcher(wholeText);
			int n = 1;
			while(m.find()) {
				System.out.printf("[%03d] %30s%n", n, m.group());
				n++;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void m3() {
		String txt = "안녕하세요. 홍길동입니다. 제 전화번호는 010-1234-5678입니다. "
				+ "\r 언제든지 연락주세요. 그리고 집 전화는 02-5145-5152입니다.";
		Pattern p = Pattern.compile("[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}");
		Matcher m = p.matcher(txt);
		while(m.find()) {
			System.out.println(m.group());
		}
		
		
	}

	private static void m2() {
		String names = "홍길동,아무개,,하하하.호호호";
//		String[] temp = names.split(",");
		String[] temp = names.split("[,\\.]{1,2}");
		
		for(int i=0; i<temp.length; i++) {
			System.out.printf("temp[%d] = %s%n"
								, i, temp[i]);
		}
		
	}

	private static void m1() {
		String txt = "안녕하세요. 홍길동입니다. 제 전화번호는 010-1234-5678입니다. "
					+ "\r 언제든지 연락주세요. 그리고 집 전화는 02-5145-5152입니다.";
		txt = txt.replaceAll("[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}", "***");
		System.out.println(txt);
	}

}
