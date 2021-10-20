package com.test.question.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Q07 {
	/*
	직원들의 지각 횟수와 조퇴 횟수를 카운트해서 출력하시오.
	-출근: 9am, 퇴근: 6pm
	
	설계>
	1. BufferedReader, Ar
	rayList, HashMap 객체 생성
	2. line을 null로 초기화
	3. while문 line이 null이 아닐 때까지 반복
		>split으로 line을 요소화해 String temp 배열 생성함.
		>temp 배열을 ":"기준으로 나눠 time 배열 만들기
		>startMin과 endMin 변수 선언 후 time 배열을 이용해 초기화함.
			>String -> int, 시간에 해당되는 값은 * 60
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

	public static void main(String[] args) {
		
		try {
			BufferedReader reader 
				= new BufferedReader(new FileReader(Path.Q07));
			ArrayList<String> list = new ArrayList<String>();
			HashMap<String, Integer> late = new HashMap<String, Integer>();
			HashMap<String, Integer> early = new HashMap<String, Integer>();
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
				String[] temp = line.split(",");
				String[] startTime = temp[2].split(":");
				String[] endTime = temp[2].split(":");
				
				int startMin = Integer.parseInt(startTime[0]) * 60
								+ Integer.parseInt(startTime[1]);
				int endMin = Integer.parseInt(endTime[0]) * 60
								+ Integer.parseInt(endTime[1]);
							
				if(!list.contains(temp[1])) {
					list.add(temp[1]);
				}
				
				if(startMin > 9 * 60) {
					if(late.containsKey(temp[1])) {
						late.put(temp[1], late.get(temp[1]) + 1);
					} else {
						late.put(temp[1], 1);
					}
				}
				
				if(endMin < 18 * 60) {
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
