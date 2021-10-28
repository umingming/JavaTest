package com.test.java.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.test.data.Data;

public class Ex88_Stream {

	private static List<Student> list;
	static {
		list = new ArrayList<Student>();
	}
	public static void main(String[] args) {
		
		load();
//		list.stream().forEach(s -> System.out.println(s.getName()));
//		m1();
//		m2();
//		m3();
		m4();

	}

	private static void m4() {
		/*
		매핑
		 */
//		Data.getStringList(10)
//			.stream()
//			.forEach(word -> System.out.println(word));
//		System.out.println();
//		Data.getStringList(10)
//			.stream()
//			.map(word -> word.length())
//			.forEach(num -> System.out.println(num));
//		System.out.println();
//		
//		Data.getStringList(10)
//			.stream()
//			.map(word -> word.substring(0, 2))
//			.forEach(word -> System.out.println(word));
		
//		list.stream()
//			.map(s -> (s.getKor() + s.getEng() + s.getMath())/3.0)
//			.filter(avg -> avg >= 60.0)
//			.forEach(s -> System.out.printf("%.1f%n", s));	
		
		list.stream()
			.filter(s -> ((s.getKor() + s.getEng() + s.getMath())/3.0)>=90)
			.map(s -> s.getName())
			.forEach(s -> System.out.println(s));
		
//		Data.getIntList(10)
//			.forEach(num -> System.out.println(num));
//		for(int i=0; i<=10; i++) {
//			int size = Data.getIntList(10).get(i);
//			Cup cup = new Cup(Cup.BLACK, size);
//			list.add(cup);
//		}
		
//		Data.getIntList(10)
//			.stream()
//			.map(num -> new Cup(Cup.BLACK, num))
//			.forEach(cup -> System.err.println(cup));
		
//		System.out.println(Data.getItemList());
		Data.getItemList()
			.stream()
			.filter(item -> item.getDate().get(Calendar.DAY_OF_WEEK) == 7)
			.map(item -> item.getName())
			.distinct()
			.forEach(item -> System.out.println(item));
		System.out.println();
	}

	private static void m3() {
		List<Cup> list = new ArrayList<Cup>();
		list.add(new Cup(Cup.BLACK, 350));
		list.add(new Cup(Cup.WHITE, 350));
		list.add(new Cup(Cup.RED, 250));
		list.add(new Cup(Cup.YELLOW, 500));
		list.add(new Cup(Cup.BLUE, 350));
		list.add(new Cup(Cup.YELLOW, 500));
		list.add(new Cup(Cup.YELLOW, 350));
		list.add(new Cup(Cup.BLUE, 700));
		list.add(new Cup(Cup.BLACK, 350));
		list.stream()
//			.filter(cup -> cup.getColor() == Cup.YELLOW)
//			.filter(cup -> cup.getSize() >= 500)
			.distinct()
			.forEach(cup -> System.out.println(cup));
		
		
		
		
	}

	private static void m2() {
		System.out.println(Data.getIntList().size());
		
		//1
		Set<Integer> set = new HashSet<Integer>();
		for(Integer n : Data.getIntList()) {
			set.add(n);
		}
		
		System.out.println(set.size());
		
		//2
		Set<Integer> set2 = new HashSet<Integer>(Data.getIntList());
		System.out.println(set2.size());
		
		//3 stream() + distinct()
		Data.getIntList().stream().distinct().forEach(num -> System.out.println(num));
		
//		Data.getIntList().stream().distinct().count()
		System.out.println(Data.getIntList().stream().count());
		System.out.println(Data.getIntList().stream().distinct().count());
		
//		String[] names = {"홍길동", "아무개", "하하하", "호호호", "후후후" };
		List<String> names = Arrays.asList("홍길동", "아무개", "홍길동","호호호","후후후");
		names.stream().distinct().forEach(name -> System.out.println(name));
				
	}

	private static void m1() {
//		Data.getIntList()
//		.stream()
//		.filter(num -> num > 50)
//		.filter(num -> num % 2 == 0)
//		.forEach(num -> System.out.println(num));
		List<Integer> nums = Data.getIntList(20);
//		System.out.println(nums);
//		nums.stream().filter(num -> num % 2 == 0).forEach(num -> System.out.println(num));
//		list.stream().filter(s -> {
//			int total = s.getKor() + s.getEng() + s.getMath();
//			return total >= 180 ? true : false;
//		}).forEach(s -> {
//			System.out.println(s.getName());
//		});
		Data.getUserList()
			.stream()
			.filter(user -> user.getHeight() >= 170 && user.getWeight() <= 75)
			.forEach(user -> System.out.println(user));
		System.out.println();
		
		Data.getUserList()
			.stream()
			.filter(user -> user.getHeight() >= 170)
			.filter(user -> user.getWeight() <= 75)
			.filter(user -> user.getWeight() == 2)
			.forEach(user -> System.out.println(user));
			
		
	}

	private static void load() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\u_011\\git\\JavaTest\\JavaTest\\src\\com\\test\\java\\stream\\student.txt"));

			String line = null;
			while ((line = reader.readLine()) != null) {
				//번호, 이름, 키, 몸무게, 국어, 영어, 수학
				String[] temp = line.split(",");
				Student s = new Student();
				s.setSeq(temp[0]);
				s.setName(temp[1]);
				s.setHeight(Integer.parseInt(temp[2]));
				s.setWeight(Integer.parseInt(temp[3]));
				s.setKor(Integer.parseInt(temp[4]));
				s.setEng(Integer.parseInt(temp[5]));
				s.setMath(Integer.parseInt(temp[6]));
				
				list.add(s);
			}

			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}


class Student {
	private String seq;
	private	String name;
	private int height;
	private int weight;
	private int kor;
	private int eng;
	private int math;
	
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
}

class Cup{
	public static final int BLACK = 1;
	public static final int WHITE = 2;
	public static final int RED = 3;
	public static final int YELLOW = 4;
	public static final int BLUE = 5;
	private int color;
	private int size;
	public Cup(int color, int size) {
		this.color = color;
		this.size = size;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "[color=" + color + ", size=" + size + "]";
	}
	
	//객체 비교
	/*
	1. HashCode() 재정의
	2. equals() 재정의
	 */
	
	public int hashCode() {
		return ("" + this.color + this.size).hashCode();
	}
	
	public boolean equals(Object obj) {
		return this.hashCode() == obj.hashCode();
	}
}