package com.test.java.obj.member1;

public class Ex39 {

	public static void main(String[] args) {
		//클래스 멤버 변수의 자료형
		
		User hong = new User();
		hong.setAge(20);
		hong.setName("이유미");
		String[] nick = new String[3];
		nick[0] = "유밍밍";
		nick[1] = "유밍";
		nick[2] = "밍밍";
		hong.setNick(nick);
		User test = new User();
		
		test.setAge(20);
		test.setName("홍길동");
		test.setFriend(hong);
		
		System.out.printf("%s", test.getFriend().getName());

	}

}

class User {
	private String name;
	private int age;
	private String[] nick = new String[3];
	private User friend;

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
	public String[] getNick() {
		return nick;
	}
	public void setNick(String[] nick) {
		this.nick = nick;
	}
	public User getFriend() {
		return friend;
	}
	public void setFriend(User friend) {
		this.friend = friend;
	}
	
}
