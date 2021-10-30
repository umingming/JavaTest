package com.project.ssc.user;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import com.project.ssc.movie.ReservationList;
import com.project.ssc.movie.UserShowSeat;

public class Reservation {
   //회원이 예매할수 있는 기능
   
   private String ID;
   static boolean flag;
   
   public Reservation(String ID) {
      this.ID = ID;
      
      reservationMain();
   }
   
   void reservationMain() {
      UserShowSeat ml = new UserShowSeat();
      Scanner scanner = new Scanner(System.in);
      ReservationList nm = new ReservationList();
      flag = true;
      
      
      while(flag) {
//         ml.showList();
    	  nm.showReservationList();
    	  
    	  
         System.out.println("예매할 영화 - 관 선택");
         System.out.println("0. 전 페이지로 돌아가기");
         
         String theater = scanner.nextLine();
         
         if(theater.equals("0")) {
            flag = false;
            continue;
         }
         
         if('1' <= theater.charAt(0) && theater.charAt(0) <= '7') {
            try {
               BufferedReader reader = new BufferedReader(new FileReader(".\\movie\\회원목록.txt"));
               BufferedReader reader2 = new BufferedReader(new FileReader(".\\movie\\상영관\\상영관_" + Integer.parseInt(theater) + ".txt"));
               
               String line = "";
               String temp = reader2.readLine();
               int limitage = 0;
               
               String movieTitle = temp.substring(0,temp.indexOf("■"));
               
               BufferedReader reader3 = new BufferedReader(new FileReader(".\\movie\\영화리스트.txt"));
               
               while((line = reader3.readLine()) != null) {
                  String[] tempArray = line.split("■");
                  
                  if(tempArray[0].equals(movieTitle)) {
                     limitage = Integer.parseInt(tempArray[4]);
                     break;
                  }
               }
            
               int age = 0;
               line = "";
               
               while((line = reader.readLine()) != null) {
                  String[] tempArray = line.split("■");
                  
                  if(tempArray[0].equals(ID)) {
                     age = Integer.parseInt(tempArray[3]);
                     break;
                  }
               }
               
               if(age >= limitage) {
                  showTheaterCalendar(Integer.parseInt(theater));
               }else {
                  System.out.println("나이제한으로 관람할수 없습니다.");
               }
               
               reader.close();
               reader2.close();
               reader3.close();
               
            } catch (Exception e) {
               System.out.println("Reservation.reservationMain() : " + e.toString());
            }

         }else {
            System.out.println("올바른 영화를 선택하세요");
            System.out.println("진행 하려면 엔터를 누르세요");
            scanner.nextLine();

         }
      }
   }

   //상영관의 달력 출력
   //날짜는 10월 8일로 가정
   void showTheaterCalendar(int n) {
      try {
         BufferedReader reader = new BufferedReader(new FileReader(".\\movie\\상영관\\상영관_" + n + ".txt"));
         Calendar calendar = Calendar.getInstance();
         Scanner scanner = new Scanner(System.in);
         String movieName = "";
         String theater = "";
         
         calendar.set(2019, 9, 8);
          
         System.out.println(calendar.get(Calendar.DATE));
         System.out.println("--------------------- "+calendar.get(Calendar.YEAR)+"-"+ (calendar.get(Calendar.MONTH) + 1) + " ---------------------");
         System.out.printf("[일]\t[월]\t[화]\t[수]\t[목]\t[금]\t[토]");
         System.out.println();
         int end = calendar.getActualMaximum(Calendar.DATE); //해당 월 마지막 날짜 
         int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK); //해당 날짜의 요일(1:일요일 … 7:토요일)
         
         for(int i=1; i<=end; i++) { 
            if(i==1) { 
               for(int j=1; j<dayOfWeek; j++) { 
                  System.out.print("\t"); 
               } 
            } 
            
            if(calendar.get(Calendar.DATE) <= i && i <= calendar.get(Calendar.DATE) + 7) {
               System.out.print(i+"\t"); 
            }else {
               System.out.print(" \t"); 
            }
            
            if(dayOfWeek%7==0) { //한줄에 7일씩 출력 
               System.out.println(); 
            } 
            dayOfWeek++;
         }
         
         System.out.println();

         System.out.println("날짜 선택");
         String month = "" + (calendar.get(Calendar.MONTH) + 1);
         int day = scanner.nextInt();
         
         if(calendar.get(Calendar.DATE) <= day && day <= calendar.get(Calendar.DATE) + 7) {
            System.out.println("------ 시간 선택 -------");
            System.out.println("1. 00시 ");
            System.out.println("2. 03시 ");
            System.out.println("3. 06시 ");
            System.out.println("4. 09시 ");
            System.out.println("5. 12시 ");
            System.out.println("6. 15시 ");
            System.out.println("7. 18시 ");
            System.out.println("8. 21시 ");
            System.out.println("------ 시간 선택 -------");
            
            int hour = (3*scanner.nextInt() - 3);
            if(!(0 <= hour && hour <= 21)){
               scanner.nextLine();
               System.out.println("잘못된 시간을 입력했습니다.");
               System.out.println("진행 하려면 엔터를 누르세요");
               scanner.nextLine();
            }else {
               String line = "";
               ArrayList<String> seats = new ArrayList<String>();
               
               while((line = reader.readLine()) != null) {
                  String[] tempArray = line.split("■");
                  movieName = tempArray[0]; 
                  theater = tempArray[5];
                  
                  String[] tempCalendar = tempArray[1].split("-");
                  
                  if(tempCalendar[1].equals(month) && tempCalendar[2].equals(day < 10 ? "0" + day : "" + day)) {
                     String[] tempTime = tempArray[2].split(":");
                     
                     if(tempTime[0].equals(hour < 10 ? "0" + hour : "" + hour)) {
                        tempArray = line.split("■");
                        seats.add(tempArray[6]);
                     }
                  }
               }
               
                  String[][] seatsArray = new String[7][15];
                  
                  for(int i = 0; i < seatsArray.length; i++ ) {
                     for(int j = 0; j < seatsArray[0].length; j++) {
                        for(String seat : seats) {
                           int row = (int)(seat.charAt(0)) - 65 ;
                           int col = Integer.parseInt(seat.substring(1,seat.length())) - 1;
                           
                           seatsArray[row][col] = "■";
                           
                        }
                     }
                  }
                  
                  for(int i = 0; i < seatsArray.length; i++ ) {
                     for(int j = 0; j < seatsArray[0].length; j++) {
                        if(seatsArray[i][j] == null) {
                           seatsArray[i][j] = "□";
                        }else {
                           continue;
                        }
                     }
                  }
                  
                  System.out.println("   1    2    3    4    5    6    7    8    9   10    11   12   13   14   15");
                  //좌석 보여주는 코드
                  for(int i = 0; i < seatsArray.length; i++ ) {
                     System.out.print((char)(i + 65) + "  ");
                     for(int j = 0; j < seatsArray[0].length; j++) {
                        System.out.printf(seatsArray[i][j] + "    ");
                     }
                     System.out.println();
                  }
               
                  scanner.nextLine();
                  
                  while(flag) {
                     System.out.println("----------좌석을 선택하기----------");
                     System.out.println("행 선택 : ");
                     
                     String insertCol = scanner.nextLine();
                     int col = (int)(insertCol.charAt(0)) - 65 ;
                     
                     if(!(0 <= col && col <= 7)) {
                        System.out.println("잘못된 행 입니다.");
                        continue;
                     }
                     
                     System.out.println("열 선택 : ");
                     
                     int row = Integer.parseInt(scanner.nextLine()) - 1;
                     
                     if(!(0 <= row && row <= 15)) {
                        System.out.println("잘못된 열 입니다.");
                        continue;
                     }
                     
                     if(seatsArray[col][row].equals("□")) {
                        FileWriter writer = new FileWriter(".\\movie\\상영관\\상영관_" + n + ".txt" , true);
                        FileWriter writer2 = new FileWriter(".\\movie\\예매.txt" , true);
                        
                        String result = String.format("%s■%s■%s■%s■%s■%s■%s\r\n", movieName, "2019-" + month + "-" + day, hour + ":00:00", ID, calculation() + "", theater, "" + ((char)(col + 65)) + (row + 1) );
                        
                        while(flag) {
                           writer.write(result);
                           writer2.write(result);
                           
                           writer.close();
                           writer2.close();
                           System.out.println("성공적으로 예매 하셨습니다.");
                           System.out.println("진행 하려면 엔터를 누르세요");
                           scanner.nextLine();
                           
                           flag = false;
                        }
                     }else {
                        System.out.println("이미 배정된 좌석 입니다.");
                     }
                  }
                  
                  reader.close();

            }
            
               
         }else {
            scanner.nextLine();
            System.out.println("잘못된 날짜를 입력했습니다.");
            System.out.println("진행 하려면 엔터를 누르세요");
            scanner.nextLine();

         }
         
      } catch (Exception e) {
         System.out.println("Reservation.showCalendar() : " + e.toString());
      }
   }
   
   //회원의 무비머니로 영화결제
   int calculation() {
      try {
         BufferedReader reader = new BufferedReader(new FileReader(".\\movie\\회원목록.txt"));
         MovieMoney mm = new MovieMoney(ID);
         
         String line = "";
         String result = "";
         
         int age = 0;
         int cost = 0;
         
         while((line = reader.readLine()) != null) {
            String[] tempArray = line.split("■");
            
            if(tempArray[0].equals(ID)) {
               age = Integer.parseInt(tempArray[3]);
               
               if(age >= 18 ) {
                  cost = 10000;
               }else {
                  cost = 7000;
               }
               
               if(mm.getmovieMoney() > cost) {
                  
                  line = String.format("%s■%s■%s■%s■%s■%s■%s", tempArray[0], tempArray[1], tempArray[2], tempArray[3], tempArray[4], tempArray[5], mm.getmovieMoney() - cost);
                  
               }else {
                  System.out.println("보유하신 무비머니가 모자랍니다.");
                  flag = false;
               }
            }
            result += line + "\r\n";
         }
         
         FileWriter writer = new FileWriter(".\\movie\\회원목록.txt");
         writer.write(result);
         writer.close();
         reader.close();
         
         return cost;
      } catch (Exception e) {
         System.out.println("Reservation.calculation() : " + e.toString());
         return 0;
      }
   }
   
}

