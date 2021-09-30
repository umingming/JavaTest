package com.test.question.obj;

public class Book {
	/*
	Book 클래스를 설계하시오.
	
	설계>
	1. 멤버 변수 선언 
	2. 접근을 위한 멤버 메소드 선언
		1)set/getTitle
			>if문 50자 이내?
				>for문 ch변수 선언
					>if문 charAt 사용해 한글, 영어, 숫자인지 확인
					>맞으면 ch ++
				>if문 length = ch? this.title = title
		2)set/getPrice
			>if문 0~1,000,000? this.price = price
		3)set/getAuthor
		4)set/getPage
			>if문 1이상? this.page = page
		5)setPublisher
		6)getPubYear
		7)set/getIsbn
	3. 문자열로 반환하는 메소드 생성
		>info 변수 선언 getter 메소드 호출해 저장함
	 */
	
	private String title;
	private int price;
	private String author;
	private int page;
	private String publisher;
	private String pubYear = "2019";
	private String isbn;
	
	public void setTitle(String title) {
		if(title.length() <= 50) {
			int rightChar = 0;

			for(int i=0; i<title.length(); i++) {
				if((title.charAt(i) >= '0' && title.charAt(i) <= '9') || 
				(title.charAt(i) >= '가' && title.charAt(i) <= '힣') || 
				(title.charAt(i) >= 'A' && title.charAt(i) <= 'Z') || 
				(title.charAt(i) >= 'a' && title.charAt(i) <= 'z') ||
				(title.charAt(i) == ' ')) {
					rightChar++;
				}
			}
			
			this.title = (rightChar == title.length()) ? title : "잘못된 제목";
		}
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setPrice(int price) {
		this.price = (price >= 0 && price <= 1000000) ? price : 0;
	}

	public int getPrice() {
		return this.price;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public void setPage(int page) {
		if(page > 0) {
			this.page = page;
		}
	}
	
	public int getPage() {
		return this.page;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String getPubYear() {
		return this.pubYear;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getIsbn() {
		return this.isbn;
	}
	
	public String info() {
		String info = "제목 : " + getTitle()
				+ "\n가격 : " + getPrice()
				+ "\n저자 : " + getAuthor()
				+ "\n페이지수 : " + getPage()
				+ "\n출판사 : " + this.publisher
				+ "\n발행년도 : " + getPubYear()
				+ "\nISBN : " + getIsbn();
		return info;
	}
}
