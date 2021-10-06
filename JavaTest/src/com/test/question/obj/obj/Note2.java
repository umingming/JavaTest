package com.test.question.obj;

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

	public void setSize(String size) {
		if(size.length() <= 2 && isValidSize(size)) {
			this.size = size;
		}
	}
	
	private boolean isValidSize(String size) {
		if(size.charAt(0) == 'A' || size.charAt(0) == 'B') {
			if(size.charAt(1) >= '3' && size.charAt(1) <= '5') {
				return true;
			}
		}
		return false;
	}
	
	public void setColor(String color) {
		if(isValidColor(color)) {
			this.color = color;
		}
	}
	
	private boolean isValidColor(String color) {
		String[] validColor = {"검정색", "흰색", "노란색", "파란색"};
		for(int i=0; i<validColor.length; i++) {
			if(color.equals(validColor[i])) {
				return true;
			}
		}	
		return false;
	}

	public void setPage(int page) {
		if(page >= 10 && page <= 200) {
			this.page = page;
		}
	}
	
	private String getVolum(int page) {
		if(page >= 10 && page <= 50) {
			return "얇은";
		} else if(page >= 51 && page <= 100) {
			return "보통";
		} else if(page >= 101 && page <= 200) {
			return "두꺼운";
		} else {
			return "";
		}
	}

	public void setOwner(String owner) {
		if(owner.length() >= 2 && owner.length() <= 5 && isValidName(owner)) {
			this.owner = owner;
		} 
	}

	private boolean isValidName(String name) {
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i) >= '가' && name.charAt(i) <= '힣') {
				return true;
			}
		}
		return false;
	}
	
	private String getTotalPrice() {
		int totalPrice = 500 + getAddPriceSize(size)
					+ getAddPriceColor(color)
					+ getAddPricePage(this.page);
		String result = totalPrice + "원";
		
		if(totalPrice >= 1000) {
			result = result.substring(0,1) + "," + result.substring(1);
		}
		
		return result;
	}

	private int getAddPriceSize(String size) {
		int addPriceSize = 0;
		switch(size) {
		case "A3" : addPriceSize += 400; break;
		case "A4" : addPriceSize += 200; break;
		case "B3" : addPriceSize += 500; break;
		case "B4" : addPriceSize += 300; break;
		case "B5" : addPriceSize += 100; break;
		}
		return addPriceSize;
	}
	
	private int getAddPriceColor(String color) {
		int addPriceColor = 0;
		switch(color) {
		case "검정색" : addPriceColor += 100; break;
		case "노란색" : addPriceColor += 200; break;
		case "파란색" : addPriceColor += 200; break;
		}
		return addPriceColor;
	}

	private int getAddPricePage(int page) {
		int addPricePage = 0;

		for(int i=0; i<page-10; i++) {
			addPricePage += 10;
		}
		return addPricePage;
	}
	
	public String info() {
		String temp = "■■■■■■ 노트 정보 ■■■■■■\n";
		if(this.owner != null) {
			temp += "소유자 : " + this.owner
					+ "\n특성 : " + this.color + " " 
					+ getVolum(this.page) + " " 
					+ this.size + "노트"
					+ "\n가격 : " + getTotalPrice();
		} else {
			temp += "주인 없는 노트";
		}
		
		temp += "\n■■■■■■■■■■■■■■■■■■■■■■\n";
		return temp;
	}
	
}
