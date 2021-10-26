package com.test.java.lambda;

import java.util.Calendar;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.test.data.Data;

public class Ex85_Lambda {

	public static void main(String[] args) {
		
		/*
		n -> System.out.print(n + 10);
		 */
//		Test t = n -> System.out.println(n+10);
//		t.aaa(1);
//		m1();
//		m2();
//		m3();
//		m4();
//		m5();
		m6();
		

	}

	private static void m6() {
		com.test.data.User hong = Data.getUserArray()[0];
		
	}

	private static void m5() {
		Function<Integer, Boolean> f1 = age -> age >= 19;
		System.out.println(f1.apply(20));
		Predicate<Integer> f2 = age -> age >= 19;
		System.out.println(f2.test(20));
		
		BiPredicate<Integer, Integer> f3 = (a,b) -> a > b;
		System.out.println(f3.test(10, 20));
		
	}

	private static void m4() {
		BinaryOperator<Integer> f2 = (a,b) -> a + b;
		System.out.println(f2.apply(1, 2));
		
	}

	private static void m3() {
		Function<Integer, Boolean> f1 = age -> age >= 19 ? true : false;
		System.out.println(f1.apply(20));
		
		Function<String, Integer> f2 = txt -> txt.length();
		System.out.println(f2.apply("ddsgeawge3a"));
		
		BiFunction<Integer, Integer, Integer> f3 = (a,b) -> a + b;
		System.out.println(f3.apply(3, 3));
		
	}

	private static void m2() {
		/*
		Supplier ; 매개변수 없이 반환값만 돌려주는 역할
		 */
		
		Supplier<String> s1 = () -> "안녕";
		System.out.println(s1.get());
		
		Supplier<Integer> s2 = () -> {
			Calendar c = Calendar.getInstance();
			return c.get(Calendar.HOUR_OF_DAY);
		};
		System.out.println(s2.get());
		
		DoubleSupplier s5 = () -> Math.random();
		System.out.println(s5.getAsDouble());
		
		
		
	}

	private static void m1() {
		MyConsumer c1 = (name, num) -> System.out.println(name + num);
		c1.accept("이유미", 1);
		
		Consumer<Integer> c2 = n -> System.out.println(n);
		c2.accept(100);
		
		Consumer<String> c3 = txt -> System.out.println(txt);
		c3.accept("이유미");
		
		Consumer<Integer> c4 = count -> {
			for(int i=0; i<count; i++) {
				System.out.println(i);
			}
		};
		c4.accept(5);
		
		Consumer<User> c5 = user -> {
			System.out.println("이름 : " + user.getName());
			System.out.println("나이 : " + user.getAge());
		};
		
		c5.accept(new User("홍길동", 20));
		
		BiConsumer<String, Integer> bc = (name, age) -> {
			System.out.printf("이름 : %s, 나이 : %d%n", name, age);
		};
		bc.accept("홍길동", 20);
		
		IntConsumer ic = n -> System.out.println(n*2);
		ic.accept(100);
	}

}

interface MyConsumer{
	void accept(String name, int num);
}

@FunctionalInterface
interface Test{
	//추상 메소드 > 람다식으로 만들 예정인 실제 메소드의 부모 역할
	void aaa(int n);
}
