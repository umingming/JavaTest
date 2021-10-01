package com.test.question.obj2;

public class Book {

	private String title;
	private int price;
	private String author;
	private String publisher;
	private String pubYear = "2021";
	private String isbn;
	private int pages;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getPubYear() {
		return pubYear;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	
	public void setTitle(String title) {
		if(isValid(title) && title.length() <= 50) {
			this.title = title;
		} else {
			System.out.println("제목을 올바르게 입력하세요.");
		}
	}
	
	private boolean isValid(String title) {
		
		for(int i=0; i<title.length(); i++){
			char c = title.charAt(i);
			if((c < '가' || c > '힣') 
				&& (c < 'A' || c > 'Z') 
				&& (c < 'a' || c > 'z') 
				&& (c < '0' || c > '9')
				&& (c != ' ')) { 
				return false;
			}
		}
		return true;
	}

	public String getTitle() {
		return this.title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String info() {
		String temp = "";
		temp += "제목 " + this.title;
		temp += ", 가격 " + this.price;
		temp += ", 저자 " + this.author;
		temp += ", 출판사 " + this.publisher;
		temp += ", 출판년도 " + this.pubYear;
		temp += ", 페이지 " + this.isbn;
		
		return temp;
	}
}
