package com.test.java.obj.member2;

public class Ex41 {

	public static void main(String[] args) {
		Father father = new Father();
		

	}

}

class Family {
	private Father father;
	public Father getFather() {
		return father;
	}
	public void setFather(Father father) {
		this.father = father;
	}
	public Mother getMother() {
		return mother;
	}
	public void setMother(Mother mother) {
		this.mother = mother;
	}
	public Son getSon() {
		return son;
	}
	public void setSon(Son son) {
		this.son = son;
	}
	public Daughter getDaughter() {
		return daughter;
	}
	public void setDaughter(Daughter daughter) {
		this.daughter = daughter;
	}
	private Mother mother;
	private Son son;
	private Daughter daughter;
	
}

class Father {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	private int age;
	private String hometown;
}

class Mother {
	private String name;
	private int age;
	private String hometown;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
}

class Daughter {
	private String name;
	private int age;
	private String hometown;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
}

class Son {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHometown() {
		return hometown;
	}
	public void setHometown(String hometown) {
		this.hometown = hometown;
	}
	private String hometown;
}
