package com.test.java;

public class Ex05_Escape {

	public static void main(String[] args) {
	
	    //성적표
	    String name1 = "홍길동";
	    int kor1 = 39;
	    int eng1 = 35;
	    int math1 = 35;
	    
	    String name2 = "아무개";
	    int kor2 = 39, eng2 = 35, math2 = 35;
	    
	    System.out.println("=============================");
	    System.out.println("            성적표");
	    System.out.println("=============================");
	    System.out.println("[이름]\t[국어]\t[영어]\t[수학]");
	    System.out.println("=============================");
	    System.out.print(name1+"\t");
	    System.out.print(kor1+"\t");
	    System.out.print(eng1+"\t");
	    System.out.println(math1);
	 
	    System.out.println(name2 + "\t" + kor2 + "\t" + eng2 + "\t" + math2 + "\t" );
	    
	}

}
