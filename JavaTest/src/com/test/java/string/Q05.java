package com.test.java.string;

public class Q05 {

	public static void main(String[] args) throws Exception {
		/*
		특정 단어가 문장내에 몇 회 있는지 수를 세시오
		
		설계>
		1. content, word, index, num 변수 선언
		2. for문 content 길이 반복
			>index2 변수 선언
			>if문 index1과 2가 다르고, index2가 -1이 인지 아닌지
				>아니면 num ++
			>index1 = index2
		3. num 출력
		 */
		
		String content = "안녕~ 길동아~ 잘가~ 길동아~ 길동이 바뵤";
		String word = "길동";
		int index = -1;
		int count = 0;
		
		while(index != -1) {
			index = content.indexOf(word, index);
			if(index > -1) {
				count++;
				index += word.length();
			} 
		}
		System.out.printf("'%s'를 총 %d회 발견했습니다.", word, count);
	}

}
