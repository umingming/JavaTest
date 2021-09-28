package com.test.question.array;

public class Q03 {

	public static void main(String[] args) {
		/*
		int 배열을 매개변수로 받아 내용을 문자열로 반환하는 dump 메소드를 구현하시오.
		
		설계>
		1. 길이가 4인 int변수 초기화
		2. dump 메소드 생성
			>문자열 변수 선언
			>for문 배열의 길이
				>문자열에 요소값을 더함
			>마지막 , 전까지의 문자열 반환
		3.  결과 출력
		 */
		
		int[] list = new int[4];
		list[0] = 10;
		list[1] = 20;
		list[2] = 30;
		list[3] = 40;
		String result = dump(list);
		System.out.printf("nums = %s\n", result);
	}

	private static String dump(int[] list) {
		String result = "";
		for(int i=0; i<list.length; i++) {
			result += list[i] + ", ";
		}
		
		return "[ " + result.substring(0, result.lastIndexOf(",")) + " ]" ;
	}

}
