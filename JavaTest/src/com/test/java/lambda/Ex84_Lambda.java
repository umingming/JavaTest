package com.test.java.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex84_Lambda {

	public static void main(String[] args) {
		Employee e1 = new Employee("홍길동", "과장");
		Employee e2 = new Employee("아무개", "대리");
		Employee e3 = new Employee("하하하", "사원");
		
		List<Employee> l1 = new ArrayList<Employee>();
		l1.add(e1);
		l1.add(e3);
		l1.add(e2);
		
		Department d1 = new Department("영업부", "200", l1);
		
		Employee e4 = new Employee("홍뫄뫄", "과장");
		Employee e5 = new Employee("아저씨", "사원");
		Employee e6 = new Employee("다호호", "사원");
		
		List<Employee> l2 = new ArrayList<Employee>();
		l2.add(e5);
		l2.add(e4);
		l2.add(e6);
		Department d2 = new Department("총무부", "300", l2);

		Employee e7 = new Employee("호햐햐", "과장");
		Employee e8 = new Employee("어혀혀", "사원");
		Employee e9 = new Employee("다료러", "부장");
		Employee e10 = new Employee("라조러", "사원");
		
		List<Employee> l3 = new ArrayList<Employee>();
		l3.add(e7);
		l3.add(e8);
		l3.add(e10);
		l3.add(e9);
		Department d3 = new Department("개발부", "300", l3);
		
		List<Department> dlist = new ArrayList<Department>();
		dlist.add(d1);
		dlist.add(d2);
		dlist.add(d3);
		
		dlist.sort(new Comparator<Department>() {
			@Override
			public int compare(Department o1, Department o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		dlist.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
		
		for(Department d : dlist) {
			d.getList().sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
		}
		
		for(Department d : dlist) {
			d.getList().sort(new Comparator<Employee>() {
				@Override
				public int compare(Employee o1, Employee o2) {
					if(o1.getPosition().equals("부장") 
							&& o2.getPosition().equals("과장")) {
						return -1;
					} else if(o1.getPosition().equals("부장") 
							&& o2.getPosition().equals("대리")) {
						return -1;
					} else if(o1.getPosition().equals("부장") 
							&& o2.getPosition().equals("사원")) {
						return -1;
					} else if(o1.getPosition().equals("과장") 
							&& o2.getPosition().equals("대리")) {
						return -1;
					} else if(o1.getPosition().equals("과장") 
							&& o2.getPosition().equals("사원")) {
						return -1;
					} else if(o1.getPosition().equals("대리") 
							&& o2.getPosition().equals("사원")) {
						return -1;
					} else if(o1.getPosition().equals("사원") 
							&& o2.getPosition().equals("부장")) {
						return 1;
					} else if(o1.getPosition().equals("사원") 
							&& o2.getPosition().equals("과장")) {
						return 1;
					} else if(o1.getPosition().equals("사원") 
							&& o2.getPosition().equals("대리")) {
						return 1;
					} else if(o1.getPosition().equals("대리") 
							&& o2.getPosition().equals("과장")) {
						return 1;
					} else if(o1.getPosition().equals("대리") 
							&& o2.getPosition().equals("부장")) {
						return 1;
					} else if(o1.getPosition().equals("과장") 
							&& o2.getPosition().equals("부장")) {
						return 1;
					}
					return 0;
				}
			});
		}
		
		output(dlist);
		

	}

	private static void output(List<Department> dlist) {
		for(Department d : dlist) {
			System.out.printf("[%s]%n", d.getName());
			for(Employee e : d.getList()) {
				System.out.println(e.toString());
			}
		}
		
	}

}

class Department {
	private String name;
	private String tel;
	private List<Employee> list;
	
	public Department(String name, String tel, List<Employee> list) {
		super();
		this.name = name;
		this.tel = tel;
		this.list = list;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public List<Employee> getList() {
		return list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}

}

class Employee {
	private String name;
	private String position;
	private int positionIndex;

	public Employee(String name, String position) {
		this.name = name;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return String.format("[name=%s, position=%s]", name, position);
	}
}
