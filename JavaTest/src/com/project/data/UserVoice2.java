package com.project.data;

import java.io.*;
import java.util.*;

public class UserVoice{
	private final String PATH = "C:\\Users\\u_011\\git\\JavaTest\\JavaTest\\data\\고객의소리.txt";
	private static Scanner scan = new Scanner(System.in);
	private static ArrayList<Voice> list;
	static {
		list = new ArrayList<Voice>(3100);
	}
	
	public void save() throws Exception {
		BufferedWriter writer = new BufferedWriter(new FileWriter(PATH));
		
		for(Voice v : list) {
			String line = String.format("%s■%s■%s"
									, v.getSeq()
									, v.getDate()
									, v.getContent());
			writer.write(line);
			writer.newLine();
		}
		
	}

	public void load() throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(PATH));

		String line = null;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
			String[] temp = line.split("■");
			list.add(new Voice(temp[0],temp[1],temp[2]));
		}

		reader.close();
		
	}
	public void list() throws Exception {
		load();
		list.stream()
			.forEach(s -> System.out.println(s.getContent()));
	}

	public void add() throws Exception {
		load();
		String seq = getSeq();
		Calendar c = Calendar.getInstance();
		String Date = String.format("%tF", c).replace("-", "");

		System.out.print("👉");
		String Content = scan.nextLine();
		
		Voice v = new Voice();
		
		v.setSeq(seq);
		v.setDate(Date);
		v.setContent(Content);
		
		list.add(v);
		save();
	}

	private String getSeq() {
		return String.format("W%4d", list.size() + 1);
	}
}
