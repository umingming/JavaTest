package com.test.question.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Q07 {

	public static void main(String[] args) {
		/*
		직원들의 지각 횟수와 조퇴 횟수를 카운트해서 출력하시오.
		-출근: 9am, 퇴근: 6pm
		
		설계>
		1. BufferedReader, ArrayList, HashMap 객체 생성
		2. line을 null로 초기화
		3. while문 line이 null이 아닐 때까지 반복
			>split으로 line을 요소화해 String 배열 생성함.
			>start와 end 변수 선언 후 2,3번째 요소를 조정해 초기화함.
				>String을 int로 바꾸고 subString 사용
			>if문 ArrayList 객체가 이름을 포함 안 하는지?
				>객체에 추가함
			>if 지각인지?
				>if key에 이름을 포함하는지?
					>지각 객체에 key는 이름, value는 get + 1 넣음 
			>if 조퇴인지? 지각과 같음
		4. Stream 종료
		5. for문 ArrayList 크기 반복
			>count변수를 0으로 초기화함.
			>if문 i번째 요소에 해당하는 key가 있는지?
				>count에 값 저장함.
		 	>결과 출력
		 */
		
		try {
			BufferedReader reader 
				= new BufferedReader(new FileReader(Path.Q07));
			ArrayList<String> list = new ArrayList<String>();
			HashMap<String, Integer> late = new HashMap<String, Integer>();
			HashMap<String, Integer> early = new HashMap<String, Integer>();
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
				String[] temp = line.split(",");
				int start = Integer.parseInt(temp[2].substring(0,temp[2].indexOf(":"))) * 60
							+ Integer.parseInt(temp[2].substring(temp[2].indexOf(":")+1));
				int end = Integer.parseInt(temp[3].substring(0,temp[3].indexOf(":"))) * 60
						+ Integer.parseInt(temp[3].substring(temp[3].indexOf(":")+1));
							
				if(!list.contains(temp[1])) {
					list.add(temp[1]);
				}
				
				if(start > 9 * 60) {
					if(late.containsKey(temp[1])) {
						late.put(temp[1], late.get(temp[1]) + 1);
					} else {
						late.put(temp[1], 1);
					}
				}
				
				if(end < 18 * 60) {
					if(early.containsKey(temp[1])) {
						early.put(temp[1], early.get(temp[1]) + 1);
					} else {
						early.put(temp[1], 1);
					}
				}
			}
			
			reader.close();
			
			System.out.println("[이름]\t[지각]\t[조퇴]");
			
			for(int i=0; i<list.size(); i++) {
				int lateCount = 0;
				int earlyCount = 0;
				String name = list.get(i);

				if(late.containsKey(name)) {
					lateCount = late.get(name);
				}
				
				if(early.containsKey(name)) {
					earlyCount = early.get(name);
				}
				
				System.out.printf("%s\t%d\t%d%n", name, lateCount, earlyCount);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
