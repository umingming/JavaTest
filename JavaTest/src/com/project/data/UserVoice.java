package com.project.data;

import java.io.*;
import java.util.*;

public class UserVoice implements Data{
	private static ArrayList<Voice> list;
	private final String PATH = "C:\\Users\\u_011\\git\\DragonLand\\DragonLand\\data\\고객의소리.txt";
	static {
		list = new ArrayList<Voice>(3100);
	}
	
	@Override
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

	@Override
	public void load() throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(PATH));

		String line = null;
		while ((line = reader.readLine()) != null) {
			String[] temp = line.split("■");
			
			Voice v = new Voice();
			
			v.setSeq(temp[0]);
			v.setDate(temp[1]);
			v.setContent(temp[2]);
			
			list.add(v);
			
		}

		reader.close();
		
	}
	public void list() throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(PATH));
		
		String line = null;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
		
		reader.close();
		
	}

	@Override
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
