package com.test.review.stream;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import com.test.data.Data;
import com.test.data.User;

public class StreanEx1 {

	public static void main(String[] args) {
		int[] nums = Data.getIntArray();
		int[] nums2 = Data.getIntArray(5);
		
		List<Integer> nums3 = Data.getIntList();
		List<Integer> nums4 = Data.getIntList(5);
		List<String> txt2 = Data.getStringList();
		User[] users1 = Data.getUserArray();
		List<User> users2 = Data.getUserList();
		Iterator<Integer> iter = nums4.iterator();
		
		Stream<Integer> stream = nums4.stream();
		stream.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.printf("%4d", t);
			}
		});
		txt2.stream().forEach(word -> System.out.println(word));
		users2.stream().forEach(user -> System.out.println(user.getName()));
		
	}

}
