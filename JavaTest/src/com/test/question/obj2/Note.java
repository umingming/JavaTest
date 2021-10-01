package com.test.question.obj2;

public class Note {
	/*
	설계>
	1. 멤버 변수(private) ; 크기, 색상, 페이지, 소유자이름, 가격
	2. Setter/Getter 메소드
		>set크기 
			>크기확인 메소드로 0번째가 A,B? 1번째가 3~5? 아니면 false
			>if문 두 글자 이내, 올바른 크기가 기입됐으면 this.size=size
		>set색상 검, 흰, 노, 파
		>set페이지 10~200 
			>10~50 얇은, 51~100 보통, 101~200 두꺼운
		>set소유자 한글 2~5
	3. 가격 메소드
		>가격 추가 메소드
			>크기 메소드 switch문 A5(0), A4(200), B3(500), B4(300), B5(100)
			>색산 변경 메소드 switch문 흰(0), 검(100), 노(200), 파(200)
			>페이지 메소드 for문 페이지-10 10원씩 추가
		>천단위 표기 substring 이용
	4. info 메소드 
		>소유자의 이름이 null일 경우 노트 정보를 출력하지 않음.
	 */
	
	private String size;
	private String color;
	private int page;
	private String owner;
	private int price;
	private String thickness;

	public void setSize(String size) {
		
		if(!(size.equals("A3") || size.equals("A4") || size.equals("A5")
				|| size.equals("B3") || size.equals("B4") || size.equals("B5"))) {
			return;
		}
		
		if(size.equals("A3")) {
			this.price += 400;
		} else if (size.equals("A4")) {
			this.price += 200;
		} else if (size.equals("B3")) {
			this.price += 500;
		} else if (size.equals("B4")) {
			this.price += 300;
		} else if (size.equals("B5")) {
			this.price += 100;
		}
		
		this.size = size;
	}
	
	public void setColor(String color) {
		if(!(color.equals("검정색") || color.equals("노란색") || color.equals("파란색") || color.equals("흰색"))){
			return;
		}
		
		if(color.equals("검정색")) {
			this.price += 100;
		} else if(color.equals("노란색")) {
			this.price += 200;
		} else if(color.equals("파란색")) {
			this.price += 200;
		}
		
		this.color = color;
	}

	public void setPage(int page) {
		if(page < 10 || page > 200) {
			return;
		}
		
		if(page >= 10 && page <= 50) {
			this.thickness = "얇은";
		} else if(page >= 51 && page <= 100) {
			this.thickness = "보통";
		} else if(page >= 101 && page <= 200) {
			this.thickness = "두꺼운";
		}

		this.price += (page - 10) * 10;
		this.page = page;
	}

	public void setOwner(String owner) {
		if(owner.length() < 2 || owner.length() > 5 || !isValidName(owner)) {
			return;
		} 
		this.owner = owner;
	}

	private boolean isValidName(String name) {
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i) >= '가' && name.charAt(i) <= '힣') {
				return true;
			}
		}
		return false;
	}
	
	public String info() {
		String temp = "■■■■■■ 노트 정보 ■■■■■■\r\n";
		if(this.owner != null) {
			temp += "소유자 : " + this.owner
					+ "\r\n특성 : " + this.color + " " 
					+ this.thickness + " " 
					+ this.size + "노트"
					+ "\r\n가격 : " + this.price + "원";
		} else {
			temp += "주인 없는 노트";
		}
		
		temp += "\r\n■■■■■■■■■■■■■■■■■■■■■■\r\n";
		return temp;
	}
	
}
