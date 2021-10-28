package com.project.ssc.user;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInfo {
	//회원의 정보 수정, 탈퇴
	
	private String ID;
	
	public UserInfo(String ID) {
		this.ID = ID;
	}

	//현재정보
	void currentInfo() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(".\\movie\\회원목록.txt"));
			
			String line = "";
			String result = "";
			
			while((line = reader.readLine()) != null) {
				String[] tempArray = line.split("■");
				
				if(tempArray[0].equals(ID)) {
					System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
					result = String.format("┃  회원 ID : %s			           ┃\r\n"
										+ "┃  회원 PW : %s		 	           ┃\r\n"
										+ "┃  회원 이름 : %s			           ┃\r\n"
										+ "┃  회원 나이 : %s			           ┃\r\n"
										+ "┃  회원 성별 : %s			           ┃\r\n"
										+ "┃  회원 전화번호 : %s	           ┃", tempArray[0], tempArray[1], tempArray[2], tempArray[3], tempArray[5], tempArray[4]);
				}
			}
			
			System.out.println(result);
			reader.close();
			
		} catch (Exception e) {
			System.out.println("UserInfo.currentInfo() : " + e.toString());
		}
	}
	
	//정보 수정(비밀번호와 전화번호 수정)
	void changeInfo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("                    ┏━━━━━━━━━┓");
		System.out.println("┏━━━━━━━━━━━━━━━━━━━┃정보 수정┃━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("┃                   ┗━━━━━━━━━┛                    ┃");
		System.out.println("┃ ┏━━━━━━━━━━━━━━━━━━━━━━┓┏━━━━━━━━━━━━━━━━━━━━━━┓ ┃");
		System.out.println("┃ ┃  [1] 비밀번호 수정   ┃┃  [2] 전화번호 수정   ┃ ┃");
		System.out.println("┃ ┗━━━━━━━━━━━━━━━━━━━━━━┛┗━━━━━━━━━━━━━━━━━━━━━━┛ ┃");
		System.out.println("┃ ┏━━━━━━━━━━━━━━━━━━━━━━━━┓                       ┃");
		System.out.println("┃ ┃[0] 전 페이지로 돌아가기┃                       ┃");
		System.out.println("┃ ┗━━━━━━━━━━━━━━━━━━━━━━━━┛                       ┃");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		
		System.out.print("입력 : ");
		String sel = scanner.nextLine();
		
		//1번 비밀번호 수정, 2번 전화번호 수정
		try {
			BufferedReader reader = new BufferedReader(new FileReader(".\\movie\\회원목록.txt"));
			
			String line = "";
			String result = "";
			
			while((line = reader.readLine()) != null) {
				String[] tempArray = line.split("■");
				
				if(tempArray[0].equals(ID)) {
					if(sel.equals("1")) {
						System.out.print("변경할 비밀번호 입력 : ");
						tempArray[1] = scanner.nextLine();
						
						String regex = "\\w{4,12}";
						Pattern pattern = Pattern.compile(regex);
						
						Matcher matcher = pattern.matcher(tempArray[1]);
						if(matcher.find()) {
							line = String.format("%s■%s■%s■%s■%s■%s■%s", tempArray[0], tempArray[1], tempArray[2], tempArray[3], tempArray[4], tempArray[5], tempArray[6]);
							System.out.println("┏━━━━━━━━━━━━━━━━━━┓");
							System.out.println("┃비밀번호 변경 완료┃");
							System.out.println("┗━━━━━━━━━━━━━━━━━━┛");
							System.out.println("진행 하려면 엔터를 누르세요");
							scanner.nextLine();
						}else {
							System.out.println("잘못된 형식의 비밀번호 입력");
							System.out.println("진행 하려면 엔터를 누르세요");
							scanner.nextLine();
						}
						
					}else if(sel.contentEquals("2")) {
						System.out.print("변경할 전화번호 입력 ('-'포함) : ");
						tempArray[4] = scanner.nextLine();
						
						String regex = "\\d{2,3}-(\\d{3,4})-(\\d{4})";
						Pattern pattern = Pattern.compile(regex);
						
						Matcher matcher = pattern.matcher(tempArray[4]);
						
						if(matcher.find()) {
							line = String.format("%s■%s■%s■%s■%s■%s■%s", tempArray[0], tempArray[1], tempArray[2], tempArray[3], tempArray[4], tempArray[5], tempArray[6]);
							System.out.println("┏━━━━━━━━━━━━━━━━━━┓");
							System.out.println("┃전화번호 변경 완료┃");
							System.out.println("┗━━━━━━━━━━━━━━━━━━┛");
							System.out.println("진행 하려면 엔터를 누르세요");
							scanner.nextLine();
						}else {
							System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
							System.out.println("┃잘못된 형식의 전화번호 입력┃");
							System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
							System.out.println("진행 하려면 엔터를 누르세요");
							scanner.nextLine();
						}
					}else {				
						System.out.println("전 페이지로 돌아갑니다.");
					}
				}
				
				result += line + "\r\n";
			}
			
			FileWriter writer = new FileWriter(".\\movie\\회원목록.txt", false);
			
			writer.write(result);
			reader.close();
			writer.close();
		} catch (Exception e) {
			System.out.println("UserInfo.changeInfo() : " + e.toString());
		}
	}
	
	//회원 탈퇴
	void withdrawal() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(".\\movie\\회원목록.txt"));
			Scanner scanner = new Scanner(System.in);
			
			String line = "";
			String result = "";
			
			while((line = reader.readLine()) != null) {
				String[] tempArray = line.split("■");
				
				if(tempArray[0].equals(ID)) {
					System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
					System.out.println("┃회원을 탈퇴하려면 비밀번호를 입력하시오┃");
					System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
					System.out.print("입력 : ");
					if(tempArray[1].equals(scanner.nextLine())) {
						System.out.println("┏━━━━━━━━━━━━━━┓");
						System.out.println("┃회원 탈퇴 완료┃");
						System.out.println("┗━━━━━━━━━━━━━━┛");
						System.out.println("처음 화면으로 돌아갑니다");
						System.out.println("진행 하려면 엔터를 누르세요");
						scanner.nextLine();
						User.isLogin = false;
						continue;
					}else {
						System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━┓");
						System.out.println("┃비밀번호가 틀렸습니다.┃");
						System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━┛");
						System.out.println("진행 하려면 엔터를 누르세요");
						scanner.nextLine();
					}
				}
				result += line +"\r\n";
			}
			
			FileWriter writer = new FileWriter(".\\movie\\회원목록.txt", false);
			
			reader.close();
			writer.write(result);
			writer.close();
			
		} catch (Exception e) {
			System.out.println("UserInfo.withdrawal() : " + e.toString());
		}
	}
}
