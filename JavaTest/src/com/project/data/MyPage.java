package com.project.ssc.user;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Calendar;
import java.util.Scanner;

public class MyPage {
	//예매확인, 정보수정, 회원 탈퇴, 금액 조회, 충전
	
	private String ID;
	
	public MyPage(String ID) {
		this.ID = ID;
		
		myPageMain();
	}
	
	void myPageMain() {
		while(User.isLogin) {
			Scanner scanner = new Scanner(System.in);
			UserInfo userInfo = new UserInfo(ID);
			MovieMoney mm = new MovieMoney(ID);
			
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃                     회원정보                     ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			userInfo.currentInfo();
			System.out.println(mm);
			System.out.println("                     ┏━━━━━━━━━┓");
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━┃ MY PAGE ┃━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("┃                    ┗━━━━━━━━━┛                   ┃");
			System.out.println("┃ ┏━━━━━━━━━━━━━━━━━━━━━━┓┏━━━━━━━━━━━━━━━━━━━━━━┓ ┃");
			System.out.println("┃ ┃[1] 예매 확인         ┃┃[2] 정보 수정         ┃ ┃");
			System.out.println("┃ ┗━━━━━━━━━━━━━━━━━━━━━━┛┗━━━━━━━━━━━━━━━━━━━━━━┛ ┃");
			System.out.println("┃ ┏━━━━━━━━━━━━━━━━━━━━━━┓┏━━━━━━━━━━━━━━━━━━━━━━┓ ┃");
			System.out.println("┃ ┃[3] 회원 탈퇴         ┃┃[4] 무비머니 충전     ┃ ┃");
			System.out.println("┃ ┗━━━━━━━━━━━━━━━━━━━━━━┛┗━━━━━━━━━━━━━━━━━━━━━━┛ ┃");
			System.out.println("┃ ┏━━━━━━━━━━━━━━━━━━━━━━┓		           ┃");
			System.out.println("┃ ┃[5] 예매 취소 하기    ┃ 		           ┃");
			System.out.println("┃ ┗━━━━━━━━━━━━━━━━━━━━━━┛		           ┃");
			System.out.println("┃ ┏━━━━━━━━━━━━━━━━━━━━━━━━┓		           ┃");
			System.out.println("┃ ┃[0] 전 페이지로 돌아가기┃		           ┃");
			System.out.println("┃ ┗━━━━━━━━━━━━━━━━━━━━━━━━┛		           ┃");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			
			 System.out.print
			 ("번호 입력 : ");
	         String sel = scanner.nextLine();
	         
	         if(sel.equals("1")) {
	            checkTicketing(ID);
	         }else if(sel.equals("2")) {
	            userInfo.changeInfo();
	         }else if(sel.equals("3")) {
	            userInfo.withdrawal();
	         }else if(sel.equals("4")) {
	            mm.chargeMovieMoney();
	         }else if(sel.equals("5")) {
	            refund(ID);
	         }else {
	            System.out.println("전 페이지로 돌아갑니다.");
	            break;
	         }
	      }
	   }
	   
	   //회원의 예매 내역 확인
	   void checkTicketing(String ID){
	      try {
	         Scanner scanner = new Scanner(System.in);
	         BufferedReader reader = new BufferedReader(new FileReader(".\\movie\\예매.txt"));
	         
	         String line = "";
	         String result = "";
	         int n = 0;
	         
	         while((line = reader.readLine()) != null) {
	            String[] tempArray = line.split("■");
	            
	            if(tempArray[3].equals(ID)) {
	               n++;
	               result += String.format(n + ". 날짜 : %s - 시간 : %s\t영화 제목 : %s\t %s 좌석 : %s\t결제금액 : %,5d원\n", tempArray[1], tempArray[2], tempArray[0], tempArray[5], tempArray[6], Integer.parseInt(tempArray[4]));
	            }
	         }
	         reader.close();
	         
	         System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
	         System.out.println("┃                  예매 확인 결과                  ┃");
	         System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
	         
	         if(result.length() == 0) {
	            System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
	            System.out.println("┃               결제 내역이 없습니다.              ┃");
	            System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
	            System.out.println("진행 하려면 엔터를 누르세요");
	            scanner.nextLine();
	         }else {
	            System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□");
	            System.out.println(result);
	            System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□");
	            System.out.println("진행 하려면 엔터를 누르세요");
	            scanner.nextLine();
	         }
	         
	      } catch (Exception e) {
	         System.out.println("MyPage.checkTicketing() : " + e.toString());
	      }
	   }
	   
	   //환불기능
	   boolean refund(String ID) {
	      try {
	         Calendar calendar = Calendar.getInstance();
	         Calendar calendar2 = Calendar.getInstance();
	         
	         calendar.set(2019, 9, 8);

	         Scanner scanner = new Scanner(System.in);
	         BufferedReader reader = new BufferedReader(new FileReader(".\\movie\\예매.txt"));
	         
	         String line = "";
	         String result = "";
	         int n = 0;
	         
	         while((line = reader.readLine()) != null) {
	            String[] tempArray = line.split("■");
	            
	            
	            if(tempArray[3].equals(ID)) {
	               String[] tempCal = tempArray[1].split("-");
	               String[] tempTime = tempArray[2].split(":");
	               
	               int year = Integer.parseInt(tempCal[0]);
	               int month = Integer.parseInt(tempCal[1]) - 1;
	               
	               calendar2.set(year, month,
	                          Integer.parseInt((tempCal[2])) < 10 ? Integer.parseInt(tempCal[2].charAt(1) + "") : Integer.parseInt(tempCal[2]),
	                          Integer.parseInt((tempTime[0])) < 10 ? Integer.parseInt(tempTime[0].charAt(1) + "") : Integer.parseInt(tempTime[0]),
	                          Integer.parseInt((tempTime[1])) < 10 ? Integer.parseInt(tempTime[1].charAt(1) + "") : Integer.parseInt(tempTime[1]));
	               
	               n++;
	               if(calendar.getTimeInMillis() < calendar2.getTimeInMillis()) {
	                  result += String.format(n + ". 날짜 : %s - 시간 : %s\t영화 제목 : %s\t %s 좌석 : %s\t결제금액 : %,5d원\r\n", tempArray[1], tempArray[2], tempArray[0], tempArray[5], tempArray[6], Integer.parseInt(tempArray[4]));
	               }else {
	                  n--;
	               }
	            }
	         }
	         reader.close();
	         
	         if(result.length() == 0) {
	        	System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
	        	System.out.println("┃               결제 내역이 없습니다.              ┃");
	        	System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
	            System.out.println("진행 하려면 엔터를 누르세요");
	            scanner.nextLine();
	            return false;
	         }else {
	            System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□");
	            System.out.println(result);
	            System.out.println("■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□■□");
	         }
	         
	         System.out.print("환불할 예매 번호 선택 : ");
	         String selNum = scanner.nextLine();
	         System.out.println("선택한 예매를 환불하시겠습니까? (y/n)");
	         String sel = scanner.nextLine();
	         System.out.println("환불이 진행중입니다. 잠시만 기다려 주세요...");

	         if(sel.equalsIgnoreCase("y")) {
	            String[] tempResult = result.split("\r\n");
	            String deleteline = "";
	            for(String templine : tempResult) {
	               if(templine.startsWith(selNum)) {
	                  deleteline = String.format("%s■%s■%s■%s■%s■%s■%s", templine.substring(templine.indexOf("영화 제목 : ") + 8, templine.indexOf("\t", templine.indexOf("영화 제목 : "))), 
	                                                         templine.substring(templine.indexOf("날짜 : ") + 5, templine.indexOf(" -", templine.indexOf("날짜 : "))),
	                                                         templine.substring(templine.indexOf("시간 : ") + 5, templine.indexOf("\t", templine.indexOf("시간 : "))),
	                                                         this.ID,
	                                                         templine.substring(templine.indexOf("결제금액 : ") + 7, templine.indexOf("원", templine.indexOf("결제금액 : "))).equals("10,000") ? "10000" : "7000",
	                                                         templine.substring(templine.indexOf("관") -1, templine.indexOf("관") + 1),
	                                                         templine.substring(templine.indexOf("좌석 : ") + 5, templine.indexOf("\t", templine.indexOf("좌석 : ")))
	                                                         );
	               }
	            }
	            
	            reader = new BufferedReader(new FileReader(".\\movie\\예매.txt"));
	            result = "";
	            
	            while((line = reader.readLine()) != null) {
	               if(line.equals(deleteline)) {
	                  continue;
	               }
	               result += line + "\r\n";
	            }
	            reader.close();
	            
	            FileWriter writer = new FileWriter(".\\movie\\예매.txt", false);
	            System.out.println("환불이 진행중입니다. 잠시만 기다려 주세요...");
	            writer.write(result);
	            writer.close();
	            
	            String[] tempArray = deleteline.split("■"); 
	            reader = new BufferedReader(new FileReader(".\\movie\\상영관\\상영관_" + tempArray[5].charAt(0) + ".txt"));
	            result = "";
	            
	            while((line = reader.readLine()) != null) {
	               if(line.equals(deleteline)){
	                  continue;
	               }
	               result += line + "\r\n";
	            }
	            reader.close();
	            
	            writer = new FileWriter(".\\movie\\상영관\\상영관_" + tempArray[5].charAt(0) + ".txt", false);
	            writer.write(result);
	            System.out.println("환불이 진행중입니다. 잠시만 기다려 주세요...");
	            writer.close();
	            
	            reader = new BufferedReader(new FileReader(".\\movie\\회원목록.txt"));
	            result = "";
	            while((line = reader.readLine()) != null) {
	               String[] tempArray2 = line.split("■");
	               
	               if(tempArray2[0].equals(ID)) {
	                  tempArray2[6] = Integer.parseInt(tempArray2[6]) + Integer.parseInt(tempArray[4]) + "";
	                  line = String.format("%s■%s■%s■%s■%s■%s■%s", tempArray2[0], tempArray2[1], tempArray2[2], tempArray2[3], tempArray2[4], tempArray2[5], tempArray2[6]);
	               }
	               
	               result += line + "\r\n";
	            }
	            
	            writer = new FileWriter(".\\movie\\회원목록.txt" , false);            
	            System.out.println("환불이 진행중입니다. 잠시만 기다려 주세요...");
	            writer.write(result);
	            writer.close();
	            
	            System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━┓");
	            System.out.println("┃성공적으로 환불했습니다.┃");
	            System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━┛");
	            System.out.println("진행 하려면 엔터를 누르세요");
	            scanner.nextLine();
	            return true;

	         } else {
	            System.out.println("전 페이지로 돌아갑니다");
	            System.out.println("진행 하려면 엔터를 누르세요");
	            scanner.nextLine();
	            return true;
	         }
	         
	      } catch (Exception e) {
	         System.out.println("MyPage.checkTicketing() : " + e.toString());
	         return false;
	      }
	      
	      
	   }
}
	   
