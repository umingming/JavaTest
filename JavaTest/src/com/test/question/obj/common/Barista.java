package com.test.question.obj.common;

public class Barista {
	/*
	설계>
	1. 클래스 생성
		>커피 클래스
			>원두, 물, 얼음, 우유, 원자재별 단가, 매출액, 판매 개수 static 변수 선언
			>static 메소드로 단가 초기화
			>setter/getter메소드
				>set/get원자재, 판매 개수; 매개값을 추가해 리턴함.
				>get판매액; 원자재 * 단가 리턴
		>에스프레소, 라떼, 아메리카노 클래스 
			>private 변수 선언
			>setter 메소드; 매개값 저장함.
			>drink 메소드
				>원자재, 판매개수 멤버 변수를 set메소드를 이용해 정적 변수에 추가함. 
				>커피를 마신다. 출력
	2. 바리스타 클래스
		>make 에스프레소, 라떼, 아메리카노 클래스
			>객체 생성
			>set메소드 이용해 매개값을 static 변수에 저장
			>객체 리턴
		>make 에스프레소, 라떼, 아메리카노 배열 클래스
			>count값을 길이로 하는 배열 생성
			>for문 객체 생성, 값 저장
			>객체 리턴
		>결과 메소드
			>판매 결과 get메소드 이용해 출력
				>소비량, 매출액의 경우 천 단위 표기
	 */
	
	public Espresso makeEspresso(int bean) {
		Espresso espresso = new Espresso();
		espresso.setBean(bean);
		return espresso;
	}

	public Espresso[] makeEspressoes(int bean, int count) {
		Espresso[] espressoes = new Espresso[count];
		
		for(int i=0; i<espressoes.length; i++) {
			espressoes[i] = new Espresso();
			espressoes[i].setBean(bean);
		}
		return espressoes;
	}
	
	public Latte makeLatte(int bean, int milk) {
		Latte latte = new Latte();
		latte.setBean(bean);
		latte.setMilk(milk);
		return latte;
	}
	
	public Latte[] makeLattes(int bean, int milk, int count) {
		Latte[] lattes = new Latte[count];
		
		for(int i=0; i<lattes.length; i++) {
			lattes[i] = new Latte();
			lattes[i].setBean(bean);
			lattes[i].setMilk(milk);
		}
		return lattes;
	}
	
	public Americano makeAmericano(int bean, int water, int ice) {
		Americano americano = new Americano();
		americano.setBean(bean);
		americano.setWater(water);
		americano.setIce(ice);
		return americano;
	}
	
	public Americano[] makeAmericanos(int bean, int water, int ice, int count) {
		Americano[] americanos = new Americano[count];
		
		for(int i=0; i<americanos.length; i++) {
			americanos[i] = new Americano();
			americanos[i].setBean(bean);
			americanos[i].setWater(water);
			americanos[i].setIce(ice);
		}
		return americanos;
	}
	
	public void result() {
		System.out.println("\n=================================");
		System.out.println("판매 결과");
		System.out.println("=================================");
		
		System.out.println("\n---------------------------------");
		System.out.println("음료 판매량");
		System.out.println("---------------------------------");
		System.out.printf("에스프레소 : %d잔%n", Coffee.getEspresso());
		System.out.printf("아메리카노 : %d잔%n", Coffee.getAmericano());
		System.out.printf("라테 : %d잔%n", Coffee.getLatte());
		
		System.out.println("\n---------------------------------");
		System.out.println("원자재 소비량");
		System.out.println("---------------------------------");
		System.out.printf("원두 : %,dg%n", Coffee.getBean());
		System.out.printf("물 : %,dml%n", Coffee.getWater());
		System.out.printf("얼음 : %,d개%n", Coffee.getIce());
		System.out.printf("우유 : %,dml%n", Coffee.getMilk());
		
		System.out.println("\n---------------------------------");
		System.out.println("매출액");
		System.out.println("---------------------------------");
		System.out.printf("원두 : %,d원%n", Coffee.getBeanTotalPrice());
		System.out.printf("물 : %,d원%n", (int)Coffee.getWaterTotalPrice());
		System.out.printf("얼음 : %,d원%n", Coffee.getIceTotalPrice());
		System.out.printf("우유 : %,d원%n", Coffee.getMilkTotalPrice());
	}
	
}//Barista

class Coffee {
	private static int water;
	private static int ice;
	private static int milk;
	
	private static int beanUnitPrice;
	private static double waterUnitPrice;
	private static int iceUnitPrice;
	private static int milkUnitPrice;
	
	private static int beanTotalPrice;
	private static double waterTotalPrice;
	private static int iceTotalPrice;
	private static int milkTotalPrice;
	
	private static int americano;
	private static int latte;
	private static int espresso;
	private static int bean;

	static {
		Coffee.beanUnitPrice = 1;
		Coffee.waterUnitPrice = 0.2; 
		Coffee.iceUnitPrice = 3; 
		Coffee.milkUnitPrice = 4; 
	}//단가 초기화

	public static int getBean() {
		return Coffee.bean;
	}

	public static void setBean(int bean) {
		Coffee.bean += bean;
	}

	public static int getWater() {
		return Coffee.water;
	}

	public static void setWater(int water) {
		Coffee.water += water;
	}

	public static int getIce() {
		return Coffee.ice;
	}

	public static void setIce(int ice) {
		Coffee.ice += ice;
	}

	public static int getMilk() {
		return Coffee.milk;
	}

	public static void setMilk(int milk) {
		Coffee.milk += milk;
	}//원자재

	public static int getBeanTotalPrice() {
		return Coffee.bean * Coffee.beanUnitPrice;
	}

	public static double getWaterTotalPrice() {
		return Coffee.water * Coffee.waterUnitPrice;
	}

	public static int getIceTotalPrice() {
		return Coffee.ice * Coffee.iceUnitPrice;
	}

	public static int getMilkTotalPrice() {
		return Coffee.milk * Coffee.milkUnitPrice;
	}//매출액

	public static int getAmericano() {
		return Coffee.americano;
	}

	public static void setAmericano(int americano) {
		Coffee.americano += americano;
	}

	public static int getLatte() {
		return Coffee.latte;
	}

	public static void setLatte(int latte) {
		Coffee.latte += latte;
	}

	public static int getEspresso() {
		return Coffee.espresso;
	}

	public static void setEspresso(int espresso) {
		Coffee.espresso += espresso;
	}//판매개수

}//Coffee

class Espresso {
	private int bean;

	public void setBean(int bean) {
		this.bean = bean;
	}

	void drink() {
		Coffee.setBean(this.bean);
		Coffee.setEspresso(1);
		System.out.printf("원두 %dg으로 만들어진 에스프레소를 마십니다.%n", this.bean);
	}
}//Espresso

class Latte {
	private int bean;
	private int milk;

	public void setBean(int bean) {
		this.bean = bean;
	}

	public void setMilk(int milk) {
		this.milk = milk;
	}
	
	void drink() {
		Coffee.setBean(this.bean);
		Coffee.setMilk(this.milk);
		Coffee.setLatte(1);
		System.out.printf("원두 %dg, 우유 %dml로 만들어진 라테를 마십니다.%n"
				, this.bean, this.milk);
	}
}//Latte

class Americano {
	private int bean;
	private int water;
	private int ice;

	public void setBean(int bean) {
		this.bean = bean;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public void setIce(int ice) {
		this.ice = ice;
	}
	
	void drink() {
		Coffee.setBean(this.bean);
		Coffee.setWater(this.water);
		Coffee.setIce(this.ice);
		Coffee.setAmericano(1);
		System.out.printf("원두 %dg, 물 %dml, 얼음 %d개로 만들어진 아메리카노를 마십니다.%n"
				, this.bean, this.water, this.ice);
	}
}//Americano