package com.test.java.homework;

public class No1_DataType {

	public static void main(String[] args) {
		
		 //byte
	      System.out.println("-----------byte-----------");
	      
	      //1.내 몸무게
	      byte myWeight;
	      myWeight = 40;
	      System.out.printf("%s\t[%3d]kg\n", "내 몸무게", myWeight);
	      
	      //2.우리 가족
	      byte myFamily;
	      myFamily = 4;
	      System.out.printf("%s\t[%3d]명\n", "우리 가족", myFamily);
	      
	      //3.내 생월
	      byte birthMonth;
	      birthMonth = 1;
	      System.out.printf("%s\t[%3d]월%n", "내 생월", birthMonth);
	      
	      //4.이번 달
	      byte thisMonth;
	      thisMonth = 9;
	      System.out.printf("%s\t[%3d]월%n", "이번 달", thisMonth);
	      
	      //5.수소 분자량
	      byte h2Mole;
	      h2Mole = 2;
	      System.out.printf("%s\t[%3d]g%n", "수소 분자량", h2Mole);
	      
	      //6. 수업 시간
	      byte totalClassHour;
	      totalClassHour = 8;
	      System.out.printf("%s\t[%3d]시간%n" ,"수업 시간", totalClassHour);
	      
	      //7. 점심 시간
	      byte lunchTime;
	      lunchTime = 1;
	      System.out.printf("%s\t[%3d]시%n", "점심 시간", lunchTime);
	      
	      //8. 센터 문 닫는 시간
	      byte closeTimeOfCenter;
	      closeTimeOfCenter = 10;
	      System.out.printf("%s\t[%3d]pm%n", "close", closeTimeOfCenter);
	      
	      //9. 내 나이
	      byte myAge;
	      myAge = 27;
	      System.out.printf("%s\t[%3d]살%n", "내 나이", myAge);
	      
	      //10. 1다스
	      byte oneDozen;
	      oneDozen = 12;
	      System.out.printf("%s\t[%3d]자루%n", "한 다스", oneDozen);
	      
	      //short
	      System.out.println();
	      System.out.println("----------short-----------");
	      
	      //1. 내 키
	      short myHeight;
	      myHeight = 155;
	      System.out.printf("%s\t[%,6d]cm%n", "내 키", myHeight);
	      
	      //2. ADA
	      short ada;
	      ada = 3080;
	      System.out.printf("%s\t[%,6d]원%n", "ADA", ada);
	      
	      //3. 전세계 국가
	      short worldCountry;
	      worldCountry = 249;
	      System.out.printf("%s\t[%,6d]국%n", "전세계 국가", worldCountry);
	      
	      //4. 연어 가격
	      short salmonPrice;
	      salmonPrice = 14000;
	      System.out.printf("%s\t[%,6d]원%n", "연어 가격", salmonPrice); 
	      
	      //5. 월간 출생아수
	      short monthlyBirthRate;
	      monthlyBirthRate = 21526;
	      System.out.printf("%s\t[%,6d]명%n", "월간 출생아", monthlyBirthRate);
	      
	      //6. 1atm
	      short atm;
	      atm = 760;
	      System.out.printf("%s\t[%,6d]mmHg%n", "1atm", atm);
	      
	      //7. 버스 요금
	      short busFare;
	      busFare = 1450;
	      System.out.printf("%s\t[%,6d]원%n", "버스 요금", busFare);
	      
	      //8. 1시간
	      short oneHour;
	      oneHour = 3600;
	      System.out.printf("%s\t[%,6d]sec%n", "한 시간", oneHour);
	      
	      //9. 아메리카노
	      short americano;
	      americano = 3500;
	      System.out.printf("%s\t[%,6d]원%n", "아메리카노", americano);

	      //10. 햄버거
	      short burger;
	      burger = 4500;
	      System.out.printf("%s\t[%,6d]원%n", "햄버거", burger);
	      
	      //int
	      System.out.println();
	      System.out.println("-----------int------------");
	      
	      //1. 대한민국 인구수
	      int korNum;
	      korNum = 51821669;
	      System.out.printf("%s\t[%,11d]명%n", "한국 인구수", korNum );
	      
	      //2. 연간 출생아수
	      int annualBirthRate;
	      annualBirthRate = 272337;
	      System.out.printf("%s\t[%,11d]명%n", "연간 출생아", annualBirthRate);
	      
	      //3. 비트코인
	      int bitcoin;
	      bitcoin = 56321000;
	      System.out.printf("%s\t[%,11d]krw%n", "비트코인", bitcoin);
	      
	      //4. 재난지원금
	      int emergencyGrant;
	      emergencyGrant = 250000;
	      System.out.printf("%s\t[%,11d]원%n", "재난지원금", emergencyGrant);
	      
	      //5. 1atm
	      int atm2;
	      atm2 = 101325;
	      System.out.printf("%s\t[%,11d]Pa%n", "1atm", atm2);
	      
	      //6. 수강료
	      int tuitionFee;
	      tuitionFee = 120000;
	      System.out.printf("%s\t[%,11d]원%n", "수강료", tuitionFee);

	      //7. 입장료
	      int entranceFee;
	      entranceFee = 50000;
	      System.out.printf("%s\t[%,11d]원%n", "입장료", entranceFee);
	      
	      //8. 응시인원
	      int applicants;
	      applicants = 632500;
	      System.out.printf("%s\t[%,11d]명%n", "응시인원", applicants);
	      
	      //9. 보증금
	      int deposit;
	      deposit = 25000000;
	      System.out.printf("%s\t[%,11d]원%n", "보증금", deposit);
	      
	      //10. 월세
	      int monthlyRent;
	      monthlyRent = 300000;
	      System.out.printf("%s\t[%,11d]원%n", "월세", monthlyRent);
	            
	      //long
	      System.out.println();
	      System.out.println("-----------long-----------");

	      //1. 전세계 인구
	      long worldPopulation;
	      worldPopulation = 7874965732L;
	      System.out.printf("%s\t[%,20d]명%n", "전세계 인구", worldPopulation);

	      //2. 만수르 재산
	      long mansourWealth;
	      mansourWealth = 22500000000000L;
	      System.out.printf("%s\t[%,20d]원%n", "만수르 재산", mansourWealth);
	      
	      //3. 증여세
	      long giftTax;
	      giftTax = 33525330000L;
	      System.out.printf("%s\t[%,20d]원%n", "증여세", giftTax);
	            
	      //4. 미국 GDP
	      long usaGdp;
	      usaGdp = 21427700000000L;
	      System.out.printf("%s\t[%,20d]달러%n", "미국 GDP", usaGdp);
	      
	      //5. 중국 GDP
	      long chinaGdp;
	      chinaGdp = 14342902842916L;
	      System.out.printf("%s\t[%,20d]달러%n", "중국 GDP", chinaGdp);
	      
	      //6. 러시아 GDP 
	      long russiaGdp;
	      russiaGdp = 1699876578871L;
	      System.out.printf("%s\t[%,20d]달러%n", "러시아GDP", russiaGdp);
	      
	      //7. 한국 GDP
	      long korGdp;
	      korGdp = 1646300000000L;
	      System.out.printf("%s\t[%,20d]달러%n", "한국 GDP",korGdp);
	                           
	      //8. 한국 면적
	      long korArea;
	      korArea = 30360000000L;
	      System.out.printf("%s\t[%,20d]평%n", "한국 면적", korArea);
	                  
	      //9. 중국 면적
	      long chiArea;
	      chiArea = 2904000000000L;
	      System.out.printf("%s\t[%,20d]평%n", "중국 면적",chiArea);

	      //10. 미국 면적
	      long usArea;
	      usArea = 2974000000000L;
	      System.out.printf("%s\t[%,20d]평%n", "미국 면적", usArea);

	      //float
	      System.out.println();
	      System.out.println("----------float-----------");
	      
	      //1. 1달러
	      float usd;
	      usd = 1170.00f;
	      System.out.printf("%s\t[%,9.2f]원%n", "1달러", usd);

	      //2. 100엔
	      float jpy;
	      jpy = 1064.27f;
	      System.out.printf("%s\t[%,9.2f]원%n", "100엔", jpy);

	      //3. 1유로
	      float eur;
	      eur = 1382.36f;
	      System.out.printf("%s\t[%,9.2f]원%n", "1유로", eur);

	      //4. 1위안
	      float cny;
	      cny = 181.56f;
	      System.out.printf("%s\t[%,9.2f]원%n", "1위안", cny);
	      
	      //5. 1파운드
	      float gbp;
	      gbp = 1382.36f;
	      System.out.printf("%s\t[%,9.2f]원%n", "1파운드", gbp);
	      
	      //6. 1기압
	      float atm3;
	      atm3 = 14.696f;
	      System.out.printf("%s\t[%,9.2f]psi%n", "1기압", atm3);

	      //7. 1기압
	      float atm4;
	      atm4 = 1013.25f;
	      System.out.printf("%s\t[%,9.2f]hPa%n", "1기압", atm4);
	      
	      //8. 절대온도
	      float absoluteTemp;
	      absoluteTemp = 274.15f;
	      System.out.printf("%s\t[%,9.2f]K%n", "절대온도", absoluteTemp);
	         
	      //9. 1인치
	      float inch;
	      inch = 2.54f;
	      System.out.printf("%s\t[%,9.2f]cm%n", "1인치", inch);

	      //10. 1피트
	      float feet;
	      feet = 30.48f;
	      System.out.printf("%s\t[%,9.2f]cm%n", "1피트", feet);
	         
	      //double
	      System.out.println();
	      System.out.println("----------double----------");
	            
	      //1. PI
	      final double PI;
	      PI = 3.14159265358979323;
	      System.out.printf("%s\t[%,15.10f]%n", "원주율", PI);

	      //2. 자연로그
	      final double E;
	      E = 2.71828182846;
	      System.out.printf("%s\t[%,15.10f]%n", "자연로그", E);
	      
	      //3. 1Pa
	      final double PA;
	      PA = 0.0000098692;
	      System.out.printf("%s\t[%,15.10f]atm%n", "1Pa", PA);
	      
	      //4. 1평
	      final double PYEONG;
	      PYEONG = 0.000331;
	      System.out.printf("%s\t[%,15.10f]ha%n", "1평", PYEONG);

	      //5. 1리터
	      final double LITER;
	      LITER = 0.264172;
	      System.out.printf("%s\t[%,15.10f]gal%n", "1리터", LITER);
	      
	      //6. 1리터
	      final double LITER2 ;
	      LITER2 = 33.814022;
	      System.out.printf("%s\t[%,15.10f]oz%n", "1리터", LITER2);
	               
	      //7. 1리터
	      final double LITER3;
	      LITER3 = 0.554354;
	      System.out.printf("%s\t[%,15.10f]되%n", "1리터", LITER3);
	               
	      //8. 1온스
	      final double OZ;
	      OZ = 0.029574;
	      System.out.printf("%s\t[%,15.10f]L%n", "1온스", OZ);
	               
	      //9. 1그램
	      final double GRAM;
	      GRAM = 15.432358;
	      System.out.printf("%s\t[%,15.10f]gr%n", "1그램", GRAM);
	      
	      //10. 1bar
	      final double BAR;
	      BAR = 0.986923;
	      System.out.printf("%s\t[%,15.10f]atm%n", "1bar", BAR);
	      
	      //char
	      System.out.println();
	      System.out.println("-----------char-----------");
	      
	      //1. 내 성
	      char lastName;
	      lastName = '이';
	      System.out.printf("%s\t[%2c]씨%n", "내 성", lastName);

	      //2. 성별
	      char gender;
	      gender = '여';
	      System.out.printf("%s\t[%2c]성%n", "성별", gender);
	      
	      //3. 혈액형
	      char bloodType;
	      bloodType = 'O';
	      System.out.printf("%s\t[%2c]형%n", "혈액형", bloodType);

	      //4. 내 성적
	      char myScore;
	      myScore = 'A';
	      System.out.printf("%s\t[%2c]%n", "내 성적", myScore);
	      
	      //5. 느낌표
	      char exclamationPoint;
	      exclamationPoint = '!';
	      System.out.printf("%s\t[%2c]%n", "느낌표", exclamationPoint);

	      //6. 물음표
	      char questionMark;
	      questionMark = '?';
	      System.out.printf("%s\t[%2c]%n", "물음표", questionMark);

	      //7. 내 성
	      char lastName2;
	      lastName = '이';
	      System.out.printf("%s\t[%2c]씨%n", "내 성", lastName);

	      //8. 오늘
	      char today;
	      today = '일';
	      System.out.printf("%s\t[%2c]요일%n", "오늘", today);

	      //9. 남은 횟수
	      char leftTime;
	      leftTime = '2';
	      System.out.printf("%s\t[%2c]회%n", "남은 횟수", leftTime);

	      
	      //10. 현재 순위
	      char currentRank;
	      currentRank = '1';
	      System.out.printf("%s\t[%2c]위%n", "현재 순위", currentRank);

	      //boolean
	      System.out.println();
	      System.out.println("---------boolean----------");
	      
	      //1. 1+1=2
	      boolean onePlusOneEqualsTwo;
	      onePlusOneEqualsTwo = true;
	      System.out.printf("%s\t[%5b]%n", "1+1=2", onePlusOneEqualsTwo);

	      //2. 3+1=5
	      boolean threeAddOneIsFive;
	      threeAddOneIsFive = false;
	      System.out.printf("%s\t[%5b]%n", "3+1=5", threeAddOneIsFive);

	      //3. 3-2=3
	      boolean threeMinusTwoEqualsThree;
	      threeMinusTwoEqualsThree = false;
	      System.out.printf("%s\t[%5b]%n", "3-2=3", threeMinusTwoEqualsThree);

	      //4. 7-1=6
	      boolean oneFromSevenIsSix;
	      oneFromSevenIsSix = true;
	      System.out.printf("%s\t[%5b]%n", "7-1=6", oneFromSevenIsSix);

	      //5. 1*1=2
	      boolean oneTimesOneIsTwo;
	      oneTimesOneIsTwo = false;
	      System.out.printf("%s\t[%5b]%n", "1*1=2", oneTimesOneIsTwo);

	      //6. 2*3=6
	      boolean twoMultipliedByThreeEqualsSix;
	      twoMultipliedByThreeEqualsSix = true;
	      System.out.printf("%s\t[%5b]%n", "2*3=6", twoMultipliedByThreeEqualsSix);

	      //7. 1*3=3
	      boolean oneMultipliedByThreeIsthree;
	      oneMultipliedByThreeIsthree = true;
	      System.out.printf("%s\t[%5b]%n", "1*3=3", oneMultipliedByThreeIsthree);

	      //8. 9%3=6
	      boolean nineDividedByThreeIsSix;
	      nineDividedByThreeIsSix = false;
	      System.out.printf("%s\t[%5b]%n", "9%3=6", nineDividedByThreeIsSix);

	      //9. 4%2=2
	      boolean fourDividedByTwoEqualsTwo;
	      fourDividedByTwoEqualsTwo = true;
	      System.out.printf("%s\t[%5b]%n", "4%2=2", fourDividedByTwoEqualsTwo);

	      //10. PI=3.14
	      boolean pi;
	      pi = true;
	      System.out.printf("%s\t[%5b]%n", "PI=3.14", pi);

	      
	      //String
	      System.out.println();
	      System.out.println("----------String----------");

	      //1. 내 생일
	      String myBirthDay;
	      myBirthDay = "1월 12일";
	      System.out.printf("%s\t[%6s]%n", "내 생일", myBirthDay);
	      
	      //2. 좋아하는 색
	      String favoriteColor;
	      favoriteColor = "초록";
	      System.out.printf("%s\t[%6s]색%n", "좋아하는 색", favoriteColor);
	      
	      //3. 인생 영화
	      String favoriteMovie;
	      favoriteMovie = "해리포터";
	      System.out.printf("%s\t[%6s]%n", "인생 영화", favoriteMovie);

	      //4. 학력
	      String university;
	      university = "수원";
	      System.out.printf("%s\t[%6s]대학교%n", "학력", university);

	      //5. 전공
	      String major;
	      major = "화학공학";
	      System.out.printf("%s\t[%6s]과%n", "전공", major);
	      
	      //6. 내 취미
	      String myHobby;
	      myHobby = "클라이밍";
	      System.out.printf("%s\t[%6s]%n", "내 취미", myHobby);

	      //7. 최애 음식
	      String favoriteFood;
	      favoriteFood = "연어초밥";
	      System.out.printf("%s\t[%6s]%n", "최애 음식", favoriteFood);
	      
	      //8. 이번 역
	      String destination;
	      destination = "망포";
	      System.out.printf("%s\t[%6s]역%n", "이번 역", destination);
	      
	      //9.핸드폰 기종
	      String cellPhoneModel;
	      cellPhoneModel = "iPhone12";
	      System.out.printf("%s\t[%6s]%n", "핸드폰 기종", cellPhoneModel);
	      
	      //10. 강아지 이름
	      String pupName;
	      pupName = "랑이";
	      System.out.printf("%s\t[%6s]%n", "강아지 이름", pupName);
	            

	
		
	
	}

}
