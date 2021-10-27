package com.test.java.project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class DataEmployee {

	public static void main(String[] args) throws Exception{
		
		String path = "C:\\Users\\u_011\\git\\DragonLand\\DragonLand\\data\\직원정보.txt";
		BufferedWriter writer = new BufferedWriter(new FileWriter(path));
		
		Random rnd = new Random();
		
		String[] name1 =  { "김", "이", "박", "최", "정", "강", "한", "주", "임", "유", "안", "진"};
		String[] name2 =  { "수", "준", "선", "희", "하", "영", "정", "진",
							"유", "미", "민", "섭", "지", "성", "연", "재", "형", "안", "진"};
		
		String[] address1 = { "세종시", "거창시", "서산시", "청주시", "익산시", "여수시", "창원시", 
								"이천시", "용인시", "오산시", "화성시", "천안시", "하남시", "서울시", 
								"인천시", "부산시", "대전시", "광주시", "나주시", "목포시", "밀양시"};
		String[] address2 = { " 중구", " 북구", " 남구", " 서구", " 동구", " 서북구", " 팔달구", " 종로구",
								" 덕양구", " 은평구", " 강북구", " 강남구", " 성북구", " 동대문구", " 광진구",
								" 구로구", " 부평구", " 마포구", " 노원구", " 도봉구"};
		String[] address3 = { " 쌍문", " 자바", " 호호", " 가나", 
							" 오잉", " 정보", " 망포", " 하나", " 영통", " 신한", " 쌍용", " 용용"
							, " 가정", " 서인", " 청라", " 회관", " 인가", " 북성", " 반촌", " 갈산", " 송내", " 동죽", " 인산"};
		String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "x"};
		
		for(int i=0; i<100; i++) {
			int yy = rnd.nextInt(100);
			int mm = rnd.nextInt(12) + 1;
			int dd = rnd.nextInt(30) + 1;
			int gender = rnd.nextInt(2) + 1;
			int etc = rnd.nextInt(90000) + 10000;
			String member = String.format("E%03d■%s■%s■%s■%s■%s"
							, i+1
							, name1[rnd.nextInt(name1.length)]
								+ name2[rnd.nextInt(name2.length)]
								+ name2[rnd.nextInt(name2.length)]
							, rnd.nextInt(20)+20
							, address1[rnd.nextInt(address1.length)]
								+ address2[rnd.nextInt(address2.length)]
								+ address3[rnd.nextInt(address3.length)] +"동"
								+ address3[rnd.nextInt(address3.length)] 
								+ (rnd.nextInt(15)+1) + "로 "
								+ (rnd.nextInt(99)+1) + "번길"
								+ ( (rnd.nextInt(2) == 0 ? " " + (rnd.nextInt(100) + 1) : ""))	
							, "010" + (rnd.nextInt(9000)+1000) + (rnd.nextInt(9000)+1000)
							, "미정");
			System.out.println(member);
			writer.write(member);
			writer.newLine();
			
		}
		writer.close();
		System.out.println("작성 완료");
	}
}
