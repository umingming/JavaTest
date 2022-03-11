package com.aim.test;

import java.util.ArrayList;

public class Parser {
	
	public static void main(String[] args) {
		ItemDAO dao = new ItemDAO();
		ArrayList<ItemDTO> list = dao.list();
//		list.stream()
//			.forEach(item -> System.out.println(item.toString()));
	}
}
