package com.test.java.lambda2;

import java.util.function.Consumer;
import java.util.function.Function;

import com.test.data.Data;
import com.test.data.User;

public class Ex86_Lambda {

	public static void main(String[] args) {
//		m6();
		m1();
	}
	
	private static void m1() {
//		Function<Integer, String> f1 = num -> num > 0 ? "양수" : "양수 아님";
//		Function<String, Integer> f2 = str -> str.length();
//		Function<Integer, Integer> f3 = f2.compose(f1);
//		System.out.println(f3.apply(-1));
//		
		Function<Boolean, String> f1 = flag -> flag ? "앙수" : "음수";
		Function<Integer, Boolean> f2 = num -> num > 0;
		Function<Integer, String> f3 = f1.compose(f2);
		System.out.println(f3.apply(10));
		
	}

	private static void m6() {
		User hong = Data.getUserArray()[0];
		System.out.println(hong);
		Consumer<User> c1 = user -> System.out.println(user.getName());
		c1.accept(hong);
		Consumer<User> c2 = user -> System.out.println(user.getAge());
		c2.accept(hong);
		
		Consumer<User> c3 = c1.andThen(c2);
		c3.accept(hong);
		
		Function<Integer, Boolean> f1 = num -> num > 0;
		System.out.println(f1.apply(10));
		Function<Boolean, String> f2 = flag -> flag ? "앙수" : "음수";
		System.out.println(f2.apply(true));
		
		Function<Integer, String> f3 = f1.andThen(f2);
		System.out.println(f3.apply(10));
		
		Function<String, String> f4 = str -> str.substring(0, 1);
		Function<Integer, String> f5 = f3.andThen(f4);
		System.out.println(f5.apply(-1));
	}
}
