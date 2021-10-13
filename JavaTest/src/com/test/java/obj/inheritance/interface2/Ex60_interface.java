package com.test.java.obj.inheritance.interface2;

public class Ex60_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class AAA {
		
}

class BBB extends AAA {
	
}

interface CCC {
	
}

class DDD implements CCC {
	
}

class EEE {
	
}

interface 사람 {
	void 숨쉬다();
}

interface 어른 extends 사람{
	void 걷는다();
}

interface 아기 extends 사람 {
	void 기어다닌다();
}

interface 직원 {
	void 출근한다();
	void 퇴근한다();
}

interface 간부 extends 직원 {
	void 결재한다();
}

interface 사원 extends 직원 {
	void 보고서작성한다();
}

interface 아빠 {
	void 일한다();
}

interface 엄마 {
	void 살림한다();
}


class 이상태 implements 아빠, 사원 {

	@Override
	public void 일한다() {
	}

	@Override
	public void 출근한다() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 퇴근한다() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 보고서작성한다() {
		// TODO Auto-generated method stub
		
	}
}