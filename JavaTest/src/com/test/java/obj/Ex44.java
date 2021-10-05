package com.test.java.obj;

public class Ex44 {

	public static void main(String[] args) {
		
		PencilCase pcase = new PencilCase();
		pcase.init();
		pcase.list();
		
		Pencil p = new Pencil();
		p.setColor("white");
		p.setThickness(20);
		System.out.println();
		
		pcase.add(p);
		pcase.list();
		System.out.println();
		
		pcase.get(2);
		
	}

}

class PencilCase{
	private Pencil[] list = new Pencil[10];
	private int index = 5;
	
	public void init() {
		for(int i=0; i<5; i++) {
			Pencil p = new Pencil();
			p.setColor("black");
			p.setThickness(10);
			
			this.list[i] = p;
		}
	}
	
	public void add(Pencil p) {
		
		if(this.index >= this.list.length) {
			System.out.println("필통이 꽉 찼습니다.");
			return;
		}
		this.list[index] = p;
		this.index++;
	}
	
	public void list() {
		for(int i=0; i<index; i++) {
			System.out.printf("%s(%d)\r\n"
					,this.list[i].getColor()
					,this.list[i].getThickness());
			
		}
	}
	
	public void get(int index) {
		System.out.printf("%s(%d)\r\n"
				,this.list[index].getColor()
				,this.list[index].getThickness());
	}
}

class Pencil{
	private String color;
	private int thickness;
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
