package com.test.java.project.root;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class UserData {

	public static void main(String[] args) throws Exception{
		
		String path = "C:\\Users\\u_011\\git\\DeepRoot\\DeepRoot\\src\\com\\data\\회원.txt";
		BufferedWriter writer = new BufferedWriter(new FileWriter(path));
		
		Random rnd = new Random();
		
		String[] name1 =  { "김", "이", "박", "최", "정", "강", "한", "주", "임", "유", "안", "진", "고", "민", "장", "호"};
		String[] name2 =  { "수", "준", "선", "희", "하", "영", "정", "진",
							"유", "미", "민", "섭", "지", "성", "연", "재", "형", "안", "진", "효", "주", "분", "상", "태"};
		
		String[] address1 = { "세", "거", "서", "청", "익", "여", "창", 
								"이", "용", "오", "화", "천", "하", "서", 
								"인", "부", "대", "시", "나", "목", "밀"};
		String[] address2 = { "중", "북", "남", "서", "동", "달", "종",
								"덕", "평", "강", "구", "성", "대", "진"};
		String[] address3 = { "초등", "중", "고등", "고등", "고등", "고등", "고등", "대"};
		String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "x"};
		
		for(int i=0; i<1000; i++) {
			String jumin = "";
			int yy = rnd.nextInt(100);
			int mm = rnd.nextInt(12) + 1;
			int dd = rnd.nextInt(31) + 1;
			int gender = yy <= 10 ? rnd.nextInt(2) + 3 : rnd.nextInt(2) + 1;
			int etc = rnd.nextInt(90000) + 10000;
			jumin = String.format("%02d%02d%02d%d%05d"
							,yy,mm,dd,gender,etc);
//			int sum = 0;
//
//			for(int j=0; j<jumin.length()-1; j++) {
//				sum += Integer.parseInt(jumin.charAt(j)+"") * (j % 8 + 2);
//			}
//				sum %= 11;
//				sum = 11 - sum;
//				if(sum >= 10) {
//					sum -= 10;
//				}
//			int sum = 0;
//			for(int j=0; j<jumin.length()-1; j++) {
//				sum += Integer.parseInt(jumin.charAt(j)+"") * (j % 8 + 2);
//			}
//			sum %= 11;
//			sum = 11 - sum;
//			if (sum >= 10) {
//				sum -= 10;
//			}
//			System.out.println(sum);
//				
			int[] juminNum = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };

			int check = 0;
			for (int j = 0; j < 12; j++) {

				check += (jumin.charAt(j) - '0') * juminNum[j];

			}

			int nmg = check % 11;
			int result = 11 - nmg;
			if(result>=10) result -= 10;
			jumin += result;
			String member = String.format("%d■%s■%s■%s■%s■%s■%s"
							, i+1
							, name1[rnd.nextInt(name1.length)]
								+ name2[rnd.nextInt(name2.length)]
								+ name2[rnd.nextInt(name2.length)]
							, alphabet[rnd.nextInt(alphabet.length)]
								+ alphabet[rnd.nextInt(alphabet.length)]
								+ alphabet[rnd.nextInt(alphabet.length)]
								+ alphabet[rnd.nextInt(alphabet.length)]
								+ rnd.nextInt(9999)		
							, alphabet[rnd.nextInt(alphabet.length)]
								+ alphabet[rnd.nextInt(alphabet.length)]
								+ alphabet[rnd.nextInt(alphabet.length)]
								+ alphabet[rnd.nextInt(alphabet.length)]
								+ rnd.nextInt(9999)
							, jumin
							, "010" + (rnd.nextInt(9000)+1000) + (rnd.nextInt(9000)+1000)
							, address1[rnd.nextInt(address1.length)]
								+ address2[rnd.nextInt(address2.length)]
								+ address3[rnd.nextInt(address3.length)] +"학교");
			
			System.out.println(member);
			writer.write(member);
			writer.newLine();
			
		}
		writer.close();
		System.out.println("작성 완료");
	}
}
