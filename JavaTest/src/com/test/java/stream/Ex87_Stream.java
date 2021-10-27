package com.test.java.stream;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.test.data.Data;
import com.test.data.User;

public class Ex87_Stream {

	public static void main(String[] args) {
		/*
		람다식
		-(매개변수) -> {구현부}
		
		 */
		
//		m1();
		m2();
	}

	private static void m2() {
		/*
		배열, 컬렉션, 숫자범위, 파일, 디렉토리
		 */
		int[] nums = {10, 20, 30, 40, 50};
		Arrays.stream(nums).forEach(n
				-> System.out.println(n)
		);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		
		list.stream().forEach(n -> System.out.println(n));
		
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		
		list2.stream().forEach(n -> System.out.println(n));
		System.out.println();
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1000);
		set.add(2000);
		set.add(3000);
		
		set.stream().forEach(n -> System.out.println(n));
		
		IntStream.range(1, 11).forEach(n -> System.out.println(n));
		System.out.println();
		
		try {
			Path path = Paths.get("C:\\class\\java\\file\\memo.txt");
			System.out.println(path.toAbsolutePath());
			Files.lines(path).forEach(line -> System.out.println(line));
			
			Path dir = Paths.get("C:\\class\\java\\file");
			Files.list(dir).forEach(p -> System.out.println(p.toFile()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	private static void m1() {
		int[] nums = Data.getIntArray();
//		System.out.println(nums.length);
//		System.out.println(Arrays.toString(nums));
		
		int[] nums2 = Data.getIntArray(5);
//		System.out.println(nums2.length);
//		System.out.println(Arrays.toString(nums2));
		
		List<Integer> nums3 = Data.getIntList();
		List<Integer> nums4 = Data.getIntList(5);
		String[] txt1 = Data.getStringArray();
//		System.out.println(Arrays.toString(txt1));
		
		List<String> txt2 = Data.getStringList();
//		System.out.println(txt2);
		
		User[] users1 = Data.getUserArray();
//		System.out.println(Arrays.toString(users1));
		List<User> users2 = Data.getUserList();
//		System.out.println(users2);
		
		//for문
		for(int i=0; i<nums4.size(); i++) {
			System.out.printf("%4d", nums4.get(i));
		}
		System.out.println();
		
		//향상된 for문
		for(int num : nums4) {
			System.out.printf("%4d", num);
		}
		System.out.println();
		
		Iterator<Integer> iter = nums4.iterator();
		
		while(iter.hasNext()){
			System.out.printf("%4d", iter.next());
		}
		System.out.println();
		
		Stream<Integer> stream = nums4.stream();
//		stream.forEach(new AAA());
		
		stream.forEach(new Consumer<Integer>(){
			@Override
			public void accept(Integer t) {
				System.out.printf("%4d", t);
			}
		});
		
		System.out.println();
		
		stream = nums4.stream();
		stream.forEach(t -> System.out.printf("%4d", t));
		System.out.println();
		System.out.println("---------------------");
		
		txt2.stream().forEach(word -> System.out.println(word) );
		txt2.stream().forEach(word -> {
			System.out.print(word + ">");
			if(word.length() > 3) {
				System.out.println("긴단어");
			} else {
				System.out.println("짧은단어");
			}
		});
		
		users2.stream().forEach(user -> 
			System.out.println(user.getName()));
		System.out.println();
		Data.getUserList()
			.stream()
			.forEach(user -> System.out.println(user.getName()));
		
		users2.stream().forEach(user -> {
			System.out.println("[회원정보]");
			System.out.println("이름" + user.getName());
			System.out.println("나이" + user.getAge());
			System.out.println("성별" + (user.getGender() ==1? "남자" : "여자"));
		});
		
		Data.getItemList().stream().forEach(item -> {
			System.out.println(item.getName());
			System.out.println(item.getSize());
			System.out.println(item.getColor());
			System.out.printf("%tF%n", item.getDate());
			System.out.println();
		});
		
	}

}

//class AAA implements Consumer<Integer> {
//
//	@Override
//	public void accept(Integer t) {
//	}
//	
//}