package com.test.review.stream;

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
		
		//Ex88_Stream.java
		//- JavaTest > "student.txt" 복사
				
		//스트림 + 배열,컬렉션
		
		//파일 -> (복사) -> 컬렉션(배열) -> (조작)
		//1. 텍스트 파일의 1줄을 담을 클래스를 만든다.
		//2. 파일 읽기
		
		load();
		
		//조작
		//save();
		
		
		//Java Stream
		//- 데이터 소스 -> 스트림 -> 조작
		
		//파이프 라인, Pipe Line
		//- 스트림을 처리하는 역할
		//- 스트림으로부터 여러개의 파이프를 연결해서 개발자 원하는 데이터 조작
		
		//1. 중간 처리(Intermediate Operation)
		//	- 필터링, 매핑, 정렬, 그룹핑, peek 등..
		//	- 중간 처리 파이프는 자신의 처리 후 만족하는 새로운 파이프를 반환한다.(100% X)
		
		//2. 최종 처리(Terminal Operation)
		//	- 합계, 평균, 카운팅, 최소, 최대, forEach 등..
		//	- ex) forEach
		
		//list.stream().forEach(s -> System.out.println(s.getName()));
		
		//m1();
		//m2();
		//m3();
		m4();
		
	}//main

	private static void m4() {
		
		//매핑
		//- map(), mapXXX()
		//- 중간 처리 파이프
		//- 앞의 스트림을 새로운 형태로 변환하는 역할
		//- 성형, 가공 역할
		
		
		//filter(), distinct()
		//Stream<Integer> -> 파이프 -> Stream<Integer>
		
		//map()
		//Stream<Integer> -> 파이프 -> Stream<String>
		//Stream<Integer> -> 파이프 -> Stream<Student>
		//Stream<Integer> -> 파이프 -> Stream<Boolean>
		
		Data.getStringList(10)
			.stream()
			.forEach(word -> System.out.println(word));
		System.out.println();
		
		Data.getStringList(10)
			.stream() //Stream<String>
			.map(word -> word.length()) //Stream<Integer>
			.forEach(num -> System.out.println(num));
		System.out.println();
		
		
		Data.getStringList(10)
			.stream()
			.map(word -> word.substring(0, 2))
			.forEach(word -> System.out.println(word));
		System.out.println();
		
		
		list.stream()
			.map(s -> (s.getKor() + s.getEng() + s.getMath()) / 3.0)
			.filter(avg -> avg >= 90.0)
			.forEach(avg -> System.out.println(avg));
		System.out.println();
		
		
		list.stream()
			.filter(s -> ((s.getKor()+s.getEng()+s.getMath()) / 3.0) >= 90)
			.map(s -> s.getName())
			.forEach(name -> System.out.println(name));
		System.out.println();
		
		
		//요구사항] 숫자 10개를 Cup의 size로 사용해서 Cup 10개를 만들어 주세요.
		Data.getIntList(10)
			.forEach(num -> System.out.println(num));
		System.out.println();
		
//		for (int i=0; i<=10; i++) {
//			int size = Data.getIntList(10).get(i);
//			Cup cup = new Cup(Cup.BLACK, size);
//			list.add(cup);
//		}
		
		Data.getIntList(10)
			.stream()
			.map(num -> new Cup(Cup.BLACK, num))
			.forEach(cup -> System.out.println(cup));
		System.out.println();
		
		
		
		//System.out.println(Data.getItemList());
		
		
		
		//요구사항] 모든 상품들 중 토요일 생산된 제품이 어떤 종류가 있는지 출력하시오?
		//- 모든 상품들 > .stream()
		//- 토요일 생산된 > .filter()
		//- 제품명 추출 > .map()
		//- 어떤 종류 > .distinct()
		Data.getItemList()
			.stream()
			.filter(item -> item.getDate().get(Calendar.DAY_OF_WEEK) == 7)
			.map(item -> item.getName())
			.distinct()
			.forEach(name -> System.out.println(name));
		
			//.forEach(item -> System.out.println(item));
		
		System.out.println();
		
		
	}

	private static void m3() {

		List<Cup> list = new ArrayList<Cup>();
		
		list.add(new Cup(Cup.BLACK	, 350));
		list.add(new Cup(Cup.WHITE	, 350));
		list.add(new Cup(Cup.RED	, 250));
		list.add(new Cup(Cup.YELLOW	, 500));
		list.add(new Cup(Cup.BLUE	, 350));
		list.add(new Cup(Cup.YELLOW	, 500));
		list.add(new Cup(Cup.YELLOW	, 350));
		list.add(new Cup(Cup.BLUE	, 700));
		list.add(new Cup(Cup.BLACK	, 350));
		
		list.stream()
			//.filter(cup -> cup.getColor() == Cup.YELLOW)
			//.filter(cup -> cup.getSize() >= 500)
			.distinct()
		 	.forEach(cup -> System.out.println(cup));
		
		
		System.out.println();
		
		
	}

	private static void m2() {
		
		//중복제거
		//- distinct()
		//- 중간 처리 파이프
		//- 앞의 스트림의 데이터 중 중복값을 배제하는 역할
		
		//중복값 포함
		System.out.println(Data.getIntList().size());
		
		//중복값 배제 -> Set
		//a. 첫번째 방법
		Set<Integer> set = new HashSet<Integer>();
		
		for (Integer n : Data.getIntList()) {
			set.add(n);
		}
		
		System.out.println(set.size());
		
		//ArrayList -> HashSet
		//b. 두번째 방법
		Set<Integer> set2 = new HashSet<Integer>(Data.getIntList());
		System.out.println(set2.size());
		
		
		
		//c. 세번째 방법
		//- stream() + distinct()
		//Data.getIntList().stream().distinct().forEach(num -> System.out.println(num));
		
		System.out.println(Data.getIntList().stream().count()); //100
		System.out.println(Data.getIntList().stream().distinct().count());
		
		
		//String[] names = {"홍길동", "아무개", "하하하", "호호호", "후후후"};
		List<String> names = Arrays.asList("홍길동", "아무개", "홍길동", "호호호", "후후후");
		
		names.stream().distinct().forEach(name -> System.out.println(name));
		System.out.println();
		
		
		
		
	}

	private static void m1() {
		
		//필터링
		//- filter()
		//- 중간 처리 파이프
		//- 조건에 맞는 데이터를 찾기 위한 역할
		//- 조건에 맞는 요소만을 남기고 불만족하는 요소들을 버린다.
		
		//- 스트림 -> filter -> 최종파이프(forEach)
		//- 스트림 -> filter -> filter -> 최종파이프(forEach)
		//- 스트림 -> filter -> filter -> filter -> 최종파이프(forEach)
		
		List<Integer> nums = Data.getIntList(20);
		System.out.println(nums);
		
		
		//nums.stream().filter(num -> num > 10 ? true : false).forEach(num -> System.out.println(num));
		
		//nums.stream().filter(num -> num % 2 == 0 ? true : false).forEach(num -> System.out.println(num));
		
		list.stream().filter(s -> {
			int total = s.getKor() + s.getEng() + s.getMath();
			return total >= 270 ? true : false;
		}).forEach(s -> {
			System.out.println(s.getName());
			System.out.println(s.getKor());
			System.out.println(s.getEng());
			System.out.println(s.getMath());
			System.out.println();
		});
		
		Data.getUserList()
			.stream()
			.filter(user -> user.getGender() == 2)
			.forEach(user -> System.out.println(user));
		System.out.println();
		
		Data.getUserList()
			.stream()
			.filter(user -> user.getHeight() >= 170 && user.getWeight() <= 75)
			.forEach(user -> System.out.println(user));
		System.out.println();
		
		
		Data.getUserList()
			.stream()
			.filter(user -> user.getHeight() >= 170)
			.filter(user -> user.getWeight() <= 75)
			.forEach(user -> System.out.println(user));
		System.out.println();
		
		
		Data.getUserList()
			.stream()
			.filter(user -> user.getHeight() >= 170)
			.filter(user -> user.getWeight() <= 75)
			.filter(user -> user.getGender() == 2)
			.forEach(user -> System.out.println(user));
		System.out.println();
		
		
		Data.getIntList()
			.stream()
			.filter(num -> num > 50)
			.filter(num -> num % 2 == 0)
			.forEach(num -> System.out.println(num));
		
	}

	private static void load() {
		
		try {
			
			BufferedReader reader 
				= new BufferedReader(new FileReader(".\\student.txt"));
			
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				//1줄 -> Student 객체 1개 생성
				//번호,이름,키,몸무게,국어,영어,수학
				
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

		} catch (Exception e) {
			System.out.println("Ex88_Stream.load()");
			e.printStackTrace();
		}		
		
	}

}

//번호,이름,키,몸무게,국어,영어,수학
//10,이동개,157,68,83,76,70

class Student {
	
	private String seq;
	private String name;
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


class Cup {
	
	//프로젝트 참고 > 가독성 향상, 오타 감소 등..
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
	
		return "{color=" + this.color + ",size=" + this.size + "}";
	}
	
	
	//개발자가 의도하는 객체 비교
	//1. hashCode() 재정의
	//2. equals() 재정의
	
	@Override
	public int hashCode() {
		
		//비교하려는 상태값이 동일하면 > 똑같은 해시코드값을 반환하게 재정의
		return ("" + this.color + this.size).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {

		return this.hashCode() == obj.hashCode();	
	}
	
}












