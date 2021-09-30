package com.test.question.obj;

public class Q01 {

	public static void main(String[] args) {
		Book book = new Book();
		book.setTitle("Java의 정석");
		System.out.println(book.getTitle());
		
		book.setPrice(30000);
		System.out.println(book.getPrice());
		
		book.setAuthor("남궁성");
		System.out.println(book.getAuthor());
		
		book.setPage(980);
		System.out.println(book.getPage());
		
		book.setPublisher("도우출판");
		
		System.out.println(book.getPubYear());
		
		book.setIsbn("978-89-94492-03-2");
		System.out.println(book.getIsbn());
		
		System.out.println(book.info());
	}

}
