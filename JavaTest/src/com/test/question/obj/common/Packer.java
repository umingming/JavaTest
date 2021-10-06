package com.test.question.obj.common;

public class Packer {
	/*
	설계>
	1. 클래스 생성; 연필, 지우개, 볼펜, 자
		>if문 적합한지? this로 변수 저장
		>info 메소드 String 리턴
	2. 멤버 변수 선언(static); 각 사무용품 포장 개수 
	3. packing 메소드
		>info메소드 사용해 출력 	>출력문 단순화시키는 방법은 없을까
		>count++
	4. 카운트 메소드
		>swith문 사용해 int값에 따른 결과 출력 >0일 때 하나하나 나열해서 출력하는 게 답인가
	 */
	
	private static int pencilCount;
	private static int eraserCount;
	private static int ballPointPenCount;
	private static int rulerCount;
	
	public void packing(Pencil pencil) {
		System.out.printf("포장 전 검수 : %s입니다.%n", pencil.info());
		Packer.pencilCount++;
		System.out.println("포장을 완료했습니다.");
	}

	public void packing(Eraser eraser) {
		System.out.printf("포장 전 검수 : %s입니다.%n", eraser.info());
		Packer.eraserCount++;
		System.out.println("포장을 완료했습니다.");
	}
	
	public void packing(BallPointPen ballPointPen) {
		System.out.printf("포장 전 검수 : %s입니다.%n", ballPointPen.info());
		Packer.ballPointPenCount++;
		System.out.println("포장을 완료했습니다.");
	}
	
	public void packing(Ruler ruler) {
		System.out.printf("포장 전 검수 : %s입니다.%n", ruler.info());
		Packer.rulerCount++;
		System.out.println("포장을 완료했습니다.");
	}
	
	public void countPacking(int type) {
		System.out.println("\n=====================");
		System.out.println("포장 결과");
		System.out.println("=====================");
		
		switch(type) {
		case 0 : 
			System.out.printf("연필 : %d회\n", Packer.pencilCount);
			System.out.printf("지우개 : %d회\n", Packer.eraserCount);
			System.out.printf("볼펜 : %d회\n", Packer.ballPointPenCount);
			System.out.printf("자 : %d회\n", Packer.rulerCount);
			break;
		case 1 : 
			System.out.printf("연필 : %d회\n", Packer.pencilCount);
			break;
		case 2 : 
			System.out.printf("지우개 : %d회\n", Packer.eraserCount);
			break;
		case 3 : 
			System.out.printf("볼펜 : %d회\n", Packer.ballPointPenCount);
			break;
		case 4 : 
			System.out.printf("자 : %d회\n", Packer.rulerCount);
			break;
		}
		
		System.out.println();
	}
	
}

class Pencil{
	private String hardness;

	public void setHardness(String hardness) {
		if(!(hardness.equals("4B") 
				|| hardness.equals("3B") 
				|| hardness.equals("2B") 
				|| hardness.equals("B") 
				|| hardness.equals("HB") 
				|| hardness.equals("H") 
				|| hardness.equals("2H") 
				|| hardness.equals("3H") 
				|| hardness.equals("4H"))) {
			return;
		}
		this.hardness = hardness;
	}
	
	public String info() {
		return String.format("%s 진하기 연필", this.hardness);
	}
	
}

class Eraser{
	private String size;

	public void setSize(String size) {
		if(!(size.equals("Large") 
				|| size.equals("Medium") 
				|| size.equals("Small"))) {
			return;
		}
		this.size = size;
	}
	
	String info() {
		return String.format("%s 사이즈 지우개", this.size);
	}
	
}

class BallPointPen{
	private double thickness;
	private String color;
	
	public void setThickness(double thickness) {
		if(!(thickness == 0.3 
				|| thickness == 0.5 
				|| thickness == 0.7 
				|| thickness == 1.0 
				|| thickness == 1.5)){ 
			return;
		}
		this.thickness = thickness;
	}
	
	public void setColor(String color) {
		if(!(color.equals("red") 
				|| color.equals("blue") 
				|| color.equals("green") 
				|| color.equals("black"))) { 
			return;
		}
		this.color = color;
	}

	String info() {  
		return String.format("%s 색상 %.1fmm 볼펜", this.color, this.thickness);
	}
	
}

class Ruler{
	private int length;
	private String shape;

	public void setLength(int length) {
		if(!(length == 30
				|| length == 50
				|| length == 100)) {
			return;
		}
		this.length = length;
	}

	public void setShape(String shape) {
		if(!(shape.equals("줄자") 
				|| shape.equals("운형자") 
				|| shape.equals("삼각자"))) {
			return;
		}
		this.shape = shape;
	}

	String info() {
		return String.format("%dcm %s", this.length, this.shape);
	}

}

