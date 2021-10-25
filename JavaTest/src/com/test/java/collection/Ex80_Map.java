package com.test.java.collection;

import java.util.Hashtable;
import java.util.Properties;
import java.util.TreeMap;

public class Ex80_Map {

	public static void main(String[] args) {
		
		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("white", "하앙");
		map.put("black", "검정");
		map.put("red", "빨강");
		map.put("blue", "파랑");
		map.put("yellow", "노랑");
		
//		System.out.println(map.size());
//		System.out.println(map);
//		
//		System.out.println(map.firstKey());
//		System.out.println(map.lastKey());
//		System.out.println(map.headMap("m"));
//		System.out.println(map.tailMap("r"));
//		System.out.println(map.subMap("m", "w"));
		
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		
		ht.put("국어", 100);
		ht.put("영어", 90);
		ht.put("수학", 80);
		
//		System.out.println(ht.size());
//		System.out.println(ht);
//		System.out.println(ht.get("국어"));
//		System.out.println(ht.get("미술"));
//		System.out.println(ht.containsKey("미술"));
//		System.out.println(ht.containsValue(100));
		
		Properties prop = new Properties();
		

	}

}
