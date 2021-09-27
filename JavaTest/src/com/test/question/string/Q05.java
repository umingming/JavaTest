package com.test.question.string;

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
		
		String content = "안녕~ 길동아~ 잘가~ 길동아~";
		String word = "길동";
		int index = -1;
		int num = 0;
		
		for(int i=0; i<content.length(); i++) {
			int indexWord = content.indexOf("길동", i);
			if(index != indexWord && indexWord != -1) {
				num++;
			} 
			index = indexWord;
		}
		System.out.printf("'%s'를 총 %d회 발견했습니다.", word, num);
	}

}
