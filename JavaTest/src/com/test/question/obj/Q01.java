package com.test.question.obj;

public class Q01 {

	public static void main(String[] args) {
		Book book = new Book();
		book.setTitle("Java의 정석");
		book.setPrice(30000);
		book.setAuthor("남궁성");
		book.setPage(980);
		book.setPublisher("도우출판");
		book.setIsbn("978-89-94492-03-2");
		System.out.println(book.info());
	}

}
