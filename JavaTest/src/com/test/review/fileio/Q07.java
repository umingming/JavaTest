package com.test.review.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Set;

public class Q07 {

	public static void main(String[] args) {
		/*
		직원들의 지각 횟수와 조퇴 횟수를 카운트해서 출력하시오.
		
		설계>
		1. HashMap late, early
		2. BufferedReader
		3. while문 읽기
			>","를 기준으로 line을 배열로 만듦.
			>2, 3번째 요소를 ":"기준으로 나누고 begin, end 변수로 조정함
			>if문 hashMape에서 이름을 갖고 있는지?
				>if문 시간이 적절한지?
				>없으면 0
				>
		5. Set 
		6. 향상된 for문 결과 출력
		 */
		
		HashMap<String, Integer> late = new HashMap<String, Integer>();
		HashMap<String, Integer> early = new HashMap<String, Integer>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(Path.Q07));

			String line = null;
			while ((line = reader.readLine()) != null) {
				String[] temp = line.split(",");
				String[] begin = temp[2].split(":");
				String[] end = temp[3].split(":");
				
				int beginMin = Integer.parseInt(begin[0]) * 60
								+ Integer.parseInt(begin[1]);
				int endMin = Integer.parseInt(end[0]) * 60
						+ Integer.parseInt(end[1]);
								
				if(!late.containsKey(temp[1])) {
					late.put(temp[1], 0);
				} 
				if(beginMin > 9 * 60) {
					late.put(temp[1], late.get(temp[1]) + 1);
				} 
				
				if(!early.containsKey(temp[1])) {
					early.put(temp[1], 0);
				} 
				if(endMin < 18 * 60) {
					early.put(temp[1], early.get(temp[1]) + 1);
				} 
			}

			Set<String> set = late.keySet();
			
			for(String key : set) {
				System.out.printf("%s\t%s\t%s%n", key, late.get(key), early.get(key));
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
