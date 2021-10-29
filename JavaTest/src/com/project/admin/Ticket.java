package com.project.admin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import com.project.data.TicketReservation;
import com.project.data.Voice;

public class Ticket {
	static final String PATH = "data\\티켓예매정보.txt";
	private static ArrayList<TicketReservation> list;
	static {
		list = new ArrayList<TicketReservation>(3100);
	}
	
	public static void main(String[] args) {
		System.out.println("당일 티켓 예매자 목록");
		

	}
	public void load() throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(PATH));

		String line = null;
		while ((line = reader.readLine()) != null) {
			String[] temp = line.split("■");
			TicketReservation t = new TicketReservation();
			
			v.setSeq(temp[0]);
			v.setDate(temp[1]);
			v.setContent(temp[2]);
			
			list.add(v);
			
		}

		reader.close();
		
	}
	public void list() throws Exception {
		load();
		list.stream()
			.filter(voice -> voice.getContent().contains("회전"))
			.forEach(s -> System.out.println(s.getContent()));
	}

}
