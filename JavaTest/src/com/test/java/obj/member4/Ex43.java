package com.test.java.obj.member4;

public class Ex43 {
	public static void main(String[] args) {
		Family family = new Family();
		
		Person mother = new Person();
		mother.setName("유재분");
		mother.setAge(55);
		mother.setHometown("이천");

		Person father = new Person();
		father.setName("이상태");
		father.setAge(56);
		father.setHometown("파주");
		
		Person daughter = new Person();
		daughter.setName("이유미");
		daughter.setAge(27);
		daughter.setHometown("수원");
		
		Person son = new Person();
		son.setName("이민섭");
		son.setAge(23);
		son.setHometown("수원");
		
//		Person[] parent = new Person[2];
//		parent[0] = father;
//		parent[1] = mother;
//		
//		family.setParent(parent);

		Person[] children = new Person[2];
		children[0] = son;
		children[1] = daughter;
		
		family.setChildren(children);
		
		family.setFather(father);
		family.setMother(mother);
		
		System.out.println(family.getParentName());
		
		User user = new User();
		user.addFriend(son);
		
	}

}

class Person{
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

class Family {
//	private Person mother;
//	private Person father;
//	
//	private Person daughter;
//	private Person son;
	
	private Person[] parent = new Person[2];
	private Person[] children;
	
//	public Person[] getParent() {
//		return parent;
//	}
//	public void setParent(Person[] parent) {
//		this.parent = parent;
//	}
	public Person[] getChildren() {
		return children;
	}
	public void setChildren(Person[] children) {
		this.children = children;
	}
	
	public void setFather(Person father) {
		this.parent[0] = father;
	}
	
	public Person getFather() {
		return this.parent[0];
	}

	public void setMother(Person mother) {
		this.parent[1] = mother;
	}
	
	public Person getMother() {
		return this.parent[1];
	}
	
	public String getParentName() {
		String temp = "";
		for(int i=0; i<this.parent.length; i++) {
			temp += this.parent[i].getName() + ",";
		}
		
		return temp;
	}
}

class User {
	
	private Person[] friend = new Person[2];
	
	public void addFriend(Person p) {
		this.friend[0] = p;
		
	}
	
}