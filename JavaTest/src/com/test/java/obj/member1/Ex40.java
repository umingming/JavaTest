package com.test.java.obj.member1;

public class Ex40 {

	public static void main(String[] args) {
		
		Family family = new Family();
		
		family.setFatherName("이상태");
		family.setFatherAge(56);
		family.setFatherHometown("파주");

		family.setMotherName("유재분");
		family.setMotherAge(55);
		family.setMotherHometown("이천");
		
		family.setDaughterName("이유미");
		family.setDaughterAge(27);
		family.setDaughterHometown("수원");
		
		family.setSonName("이민섭");
		family.setSonAge(23);
		family.setSonHometown("수원");
		
		Family2 family2 = new Family2();
		family2.setMother().name("이유미");

		
	}

}

class Information{
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

class Family2 {
	private Information mother;
	public Information getMother() {
		return mother;
	}
	public void setMother(Information mother) {
		this.mother = mother;
	}
	public Information getFather() {
		return father;
	}
	public void setFather(Information father) {
		this.father = father;
	}
	public Information getDaughter() {
		return daughter;
	}
	public void setDaughter(Information daughter) {
		this.daughter = daughter;
	}
	public Information getSon() {
		return son;
	}
	public void setSon(Information son) {
		this.son = son;
	}
	private Information father;
	private Information daughter;
	private Information son;
}
class Family {
	private String fatherName;
	private int fatherAge;
	private String fatherHometown;
	
	private String MotherName;
	private int motherAge;
	private String motherHometown;

	private String sonName;
	private int sonAge;
	private String sonHometown;

	private String daughterName;
	private int daughterAge;
	private String daughterHometown;
	
	
	
	public String getMotherName() {
		return MotherName;
	}
	
	public void setMotherName(String motherName) {
		MotherName = motherName;
	}
	
	public String getSonName() {
		return sonName;
	}
	
	public void setSonName(String sonName) {
		this.sonName = sonName;
	}
	
	public String getDaughterName() {
		return daughterName;
	}
	
	public void setDaughterName(String daughterName) {
		this.daughterName = daughterName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public int getFatherAge() {
		return fatherAge;
	}

	public void setFatherAge(int fatherAge) {
		this.fatherAge = fatherAge;
	}

	public String getFatherHometown() {
		return fatherHometown;
	}

	public void setFatherHometown(String fatherHometown) {
		this.fatherHometown = fatherHometown;
	}

	public int getMotherAge() {
		return motherAge;
	}

	public void setMotherAge(int motherAge) {
		this.motherAge = motherAge;
	}

	public String getMotherHometown() {
		return motherHometown;
	}

	public void setMotherHometown(String motherHometown) {
		this.motherHometown = motherHometown;
	}

	public int getSonAge() {
		return sonAge;
	}

	public void setSonAge(int sonAge) {
		this.sonAge = sonAge;
	}

	public String getSonHometown() {
		return sonHometown;
	}

	public void setSonHometown(String sonHometown) {
		this.sonHometown = sonHometown;
	}

	public int getDaughterAge() {
		return daughterAge;
	}

	public void setDaughterAge(int daughterAge) {
		this.daughterAge = daughterAge;
	}

	public String getDaughterHometown() {
		return daughterHometown;
	}

	public void setDaughterHometown(String daughterHometown) {
		this.daughterHometown = daughterHometown;
	}
	
	
}