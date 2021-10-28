package com.project.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Load {
	
	public static BufferedReader reader;

	public static void load() throws Exception {
		
		List list = new List(userVoiceLoad());
		
	}
	
	
//	private static ArrayList attractionLoad() throws Exception {
//		reader = new BufferedReader(new FileReader("D:\\class\\project\\java-project\\DragonLand\\DragonLand\\data\\어트랙션정보.txt"));
//		ArrayList<UserB> list = new ArrayList<Attraction>();
//		
//		/* Create attraction list */
//		String line = null;
//		while((line = reader.readLine()) != null) {
//			String[] tmp = line.split("■");
//			list.add(new Attraction(
//					tmp[0], tmp[1], tmp[2], tmp[3], tmp[4], tmp[5], tmp[6], tmp[7]));
//		}
//		reader.close();
//		return list;
//	}
	
	private static ArrayList userVoiceLoad() throws Exception {
		reader = new BufferedReader(new FileReader("D:\\class\\project\\java-project\\DragonLand\\DragonLand\\data\\고객의소리.txt"));
		ArrayList<Voice> list = new ArrayList<Voice>();
		
		/* Create user-voice list */
		String line = null;
		while((line = reader.readLine()) != null) {
			String[] tmp = line.split("■");
			list.add(new Voice(tmp[0], tmp[1], tmp[2]));
		}
		reader.close();
		return list;
	}

}
