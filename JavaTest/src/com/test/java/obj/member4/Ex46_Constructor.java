package com.test.java.obj.member4;

public class Ex46_Constructor {

	public static void main(String[] args) {
		Developer hong = new Developer();
		
		hong.setName("홍길동");
		hong.setLanguage("Java");
		
		Developer lee = new Developer("이유미", "Java")
	}

}

class Developer {
	
	private String name;
	private String language;
	
	public Developer() {
		this("익명", "미정");
	}
	
	public Developer(String name, String language) {
		this.language = language;
		this.name = name;
	}
	
	public Developer(String name) {
		this(name, "미정");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
}
