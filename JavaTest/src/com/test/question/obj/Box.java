package com.test.question.obj;

public class Box {
	/*
	설계>
	1. 길이가 10인 마카롱 배열 선언
	2. cook 메소드
		>for문 10
			>마카롱 객체 크기, 색상, 컬러 랜덤으로 저장
		>결과 출력
	3. check 메소드; 크기, 색상, 두께가 판매 유효한지 확인
		>isPass 메소드 생성
			>판매가 유효하지 않을 경우 false 리턴
		>int 합/불 변수 선언
		>for문 마카롱 갯수
			>if문 isPass? 불/합++
		>합/불 결과 출력
	4. list 메소드
		>for문 마카롱 갯수
			>printf로 마카롱 정보 출력 
				>합/불은 조건연산자 사용
	 */
	
	private Macaron[] list = new Macaron[10];
	
	public void cook() {
		for(int i=0; i<list.length; i++) {
			Macaron macaron = new Macaron();
			
			int size = (int)(Math.random() * (15 - 5 + 1)) + 5;
			macaron.setSize(size);
			
			String[] colorList = {"red", "blue", "yellow", "white", "pink", "purple", "green", "black"};
			String color = colorList[(int)(Math.random() * colorList.length)];
			macaron.setColor(color);
			
			int thickness = (int)(Math.random() * 20) + 1;
			macaron.setThickness(thickness);
			
			list[i] = macaron;
		}
		System.out.println("마카롱을 10개 만들었습니다.\n");
	}
	
	public void check() {
		int pass = 0;
		int fail = 0;
		
		for(int i=0; i<list.length; i++) {
			if(isPass(i)) {
				pass++;
			} else {
				fail++;
			}
		}
		
		System.out.println("[박스 체크 결과]");
		System.out.printf("QC 합격 개수 : %d개\n", pass);
		System.out.printf("QC 불합격 개수 : %d개\n\n", fail);
	}

	private boolean isPass(int i) {
		if(list[i].getSize() < 8 || list[i].getSize() > 14) {
			return false;
		}
		
		if(list[i].getColor().equals("black")) {
			return false;
		}
		
		if(list[i].getThickness() < 3 || list[i].getThickness() > 18) {
			return false;
		}
		
		return true;
	}
	
	public void list() {
		System.out.println("[마카롱 목록]");
		for(int i=0; i<list.length; i++) {
			System.out.printf("%d번 마카롱 : %dcm(%s, %dmm) : %s%n",
					i + 1, list[i].getSize(), list[i].getColor(), list[i].getThickness(),
					isPass(i) ? "합격" : "불합격");
		}
	
    }
	

}

class Macaron {
	private int size;
	private String color;
	private int thickness;
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getThickness() {
		return thickness;
	}
	public void setThickness(int thickness) {
		this.thickness = thickness;
	}
	
}