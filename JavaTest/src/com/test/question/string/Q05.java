package com.test.question.string;

public class Q05 {

	public static void main(String[] args) throws Exception {
		/*
		특정 단어가 문장내에 몇 회 있는지 수를 세시오
		
		설계>
		1. content, word, index, num 변수 선언
		2. for문 content 길이 반복
			if문 indexof 사용해 word가 content에 있는지 확인
				>있으면 num++
		3. num 출력
		 */
		
		String content = "안녕~ 길동아~ 잘가~ 길동아~";
		String word = "길동";
		int index;
		int num = 0;
		
		for(int i=0; i<content.length(); i++) {
			index = -1;
			index = content.indexOf("길동", i);
			if(index != -1) {
				num++;
				System.out.println(num);
			} 
		}

	}

}
