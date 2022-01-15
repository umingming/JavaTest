package com.test.java.project.goguma;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class DataEmployee {

	public static void main(String[] args) throws Exception{
		
		String path = "C:\\유미\\goguma\\tblUserInfo.txt";
		BufferedWriter writer = new BufferedWriter(new FileWriter(path));
		
		Random rnd = new Random();
		
		String[] name1 =  { "김", "이", "박", "최", "정", "강", "한", "주", "임", "유", "안", "진"};
		String[] name2 =  { "수", "준", "선", "희", "하", "영", "정", "진",
							"유", "미", "민", "섭", "지", "성", "연", "재", "형", "안", "진"};
		
		String[] address1 = { "신", "한빛마을 ", "행복마을 ", "주공 ", "예당마을 ", "바람마을 ", "호수마을 " };
//		String[] address1 = { "세종시", "거창시", "서산시", "청주시", "익산시", "여수시", "창원시", 
//								"이천시", "용인시", "오산시", "화성시", "천안시", "하남시", "서울시", 
//								"인천시", "부산시", "대전시", "광주시", "나주시", "목포시", "밀양시"};
		String[] address2 = { "현대", "래미안", "삼성", "힐스테이트", "프루지오", "자이", "롯데캐슬", "E편한세상", "포레나", "더샵", "아이파크" };
//		String[] address2 = { " 중구", " 북구", " 남구", " 서구", " 동구", " 서북구", " 팔달구", " 종로구",
//								" 덕양구", " 은평구", " 강북구", " 강남구", " 성북구", " 동대문구", " 광진구",
//								" 구로구", " 부평구", " 마포구", " 노원구", " 도봉구"};
		String[] address3 = { " 쌍문", " 자바", " 호호", " 가나", 
							" 오잉", " 정보", " 망포", " 하나", " 영통", " 신한", " 쌍용", " 용용"
							, " 가정", " 서인", " 청라", " 회관", " 인가", " 북성", " 반촌", " 갈산", " 송내", " 동죽", " 인산"};
		String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "x"};
		String[] mail = { "naver.com", "gmail.com", "daum.net" };
		
		String[] location = { "푸드코트A", "푸드코트B", "푸드코트C", "도미노피자", "홍콩반점", "물품보관함A", "물품보관함B", "의료실A", "의료실B"
							  ,"미정", "회전바구니", "정글탐험보트", "월드모노레일", "파아로의 분노", "제네바유람선", "거울미로", "게임팩토리", "전망대 게임장", "게임빌리지", "좀비프리즌", "고스트하우스", "톰 오브 호러","어크로스다크","환상의숲","자이로드롭","자이로스윙","자이로스핀","아트란티스","번지드롭","회전그네","스페인해적선"
							  ,"후룸라이드","플레이벤처","후렌치레볼루션","혜성특급","머킹의 회전목마","신밧드의모험","드래곤 와일드슈팅","로티트레인","키즈토리아","쁘띠빵빵","환타지드림","언더씨킹덤","와일드 정글","와일드 윙","어린이 동화극장"};
		
		
		for(int i=0; i<100; i++) {
			int yy = rnd.nextInt(100);
			int mm = rnd.nextInt(12) + 1;
			int dd = rnd.nextInt(30) + 1;
			int gender = rnd.nextInt(2) + 1;
			int etc = rnd.nextInt(90000) + 10000;
			String member = String.format("insert into tblUserInfo (id, address_seq, name, address, tel, email, birth, gender, since) values ('%s', %d, '%s', '%s', '%s', '%s', '%02d-%02d-%02d', '%s', '%02d-%02d-%02d')"
							, "user" + (i+1)
							, rnd.nextInt(30) + 1
							, name1[rnd.nextInt(name1.length)]
								+ name2[rnd.nextInt(name2.length)]
								+ name2[rnd.nextInt(name2.length)]
							, address1[rnd.nextInt(address1.length)]
								+ address2[rnd.nextInt(address2.length)] + "아파트 "
								+ (rnd.nextInt(800)+101) +"동 "
								+ (rnd.nextInt(16)+1)+(rnd.nextInt(16)+1) +"호"
							, "010" + (rnd.nextInt(9000)+1000) + (rnd.nextInt(9000)+1000)
							, "user" +(i+1) + "@" + mail[rnd.nextInt(mail.length)]
							, rnd.nextInt(100)
							, rnd.nextInt(11) + 1
							, rnd.nextInt(28) + 1
							, rnd.nextBoolean() == true ? 'f' : 'm'
							, rnd.nextInt(10) + 11
							, rnd.nextInt(11) + 1
							, rnd.nextInt(28) + 1);
								
							
			System.out.println(member);
			writer.write(member);
			writer.newLine();
			
		}
		writer.close();
		System.out.println("작성 완료");
	}
}
