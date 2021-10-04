package com.test.question.obj;

public class Employee {
	/*
	설계>
	1. 멤버 변수 선언(private) 이름, 부서, 직책, 연락처, 직속상사
	2. Setter/Getter 메소드
		>set/get이름 
			>유효한 이름인지 확인 메소드 2~5 한글
		>set/get부서 영업부, 기획부, 총무부, 개발부, 홍보부
		>set/get직책 부장, 과장, 대리, 사원
		>set/get연락처 010-0000-0000형식인가?
			>-가 제대로 있는지 3, 8번째 charAt로 확인
			>010인지 substring.equals
			>-를 제외한 나머지 8자리가 숫자인지 for, charAt
		>set/get직속상사 같은 부서 다른 직원.
	3. info 메소드 
		>인적사항 출력
		>상사가 없는가? 있으면 상사 이름, 부서, 직위 출력
	 */
	

	private String name;
	private String department;
	private String position;
	private String tel;
	private Employee boss;
	
	public void setName(String name) {
		if(!isValidName(name)) {
			return;
		}
		this.name = name;
	}

	private boolean isValidName(String name) {
		if(name.length() < 2 || name.length() > 5) {
			return false;
		}
		
		for(int i=0; i<name.length(); i++) {
			if(name.charAt(i) < '가' || name.charAt(i) > '힣') {
				return false;
			}
		}
		return true;
	}//유효한 이름인지 확인

	public String getName() {
		return this.name;
	}
	
	public void setDepartment(String department) {
		if(!(department.equals("영업부") || department.equals("기획부") || 
				department.equals("홍보부") || department.equals("총무부"))) {
			return;
		}//유효성 검사
		this.department = department;
	}
	
	
	public String getDepartment() {
		return this.department;
	}
	
	public void setPosition(String position) {
		if(!(position.equals("부장") || position.equals("과장") ||
				position.equals("대리") || position.equals("사원"))) {
			return;
		}//유효성 검사
		this.position = position;
	}

	public String getPosition() {
		return this.position;
	}
	
	public void setTel(String tel) {
		if(!isValidTel(tel)) {
			return;
		}
		this.tel = tel;
	}
	
	private boolean isValidTel(String tel) {
		if(!(tel.charAt(3) == '-' && tel.charAt(8) == '-')){
			return false;
		}
		
		if(!tel.substring(0,3).equals("010")) {
			return false;
		}
		
		tel = tel.replace("-", "");
		if(!(tel.length() == 11)) {
			return false;
		}
		
		for(int i=3; i<tel.length(); i++) {
			if(tel.charAt(i) < '0' || tel.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}//번호 확인

	public String getTel() {
		return this.tel;
	}
	
	public void setBoss(Employee boss) {
		if(!(boss != null && boss.department.equals(this.department))) {
			return;
		}//유효성 검사
		this.boss = boss;
	}

	public Employee getBoss() {
		return this.boss;
	}
	
	public void info() {
		System.out.printf("[%s]\n- 부서 : %s\n- 직위 : %s\n- 연락처 : %s\n- 직속상사 : " 
				, this.name, this.department, this.position, this.tel);

		if(this.boss == null) {
			System.out.println("없음\n");
		} else {
			System.out.printf("%s(%s %s)\n\n", this.boss.name, this.boss.department, this.boss.position);
		}
	}
}
