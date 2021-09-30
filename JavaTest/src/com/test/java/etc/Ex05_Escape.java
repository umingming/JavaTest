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
	    
	    System.out.println();
	    System.out.println();
	    System.out.println();
	    
	    String name = "홍길동";
	    System.out.println("안녕하세요. " + name + "님.");
	    System.out.println("안녕하세요. " + name + "님. 반갑습니다. " + name + "님.");
	    System.out.println("안녕하세요. " + name + "님. 반갑습니다. " + name + "님. 잘가세요. " + name + "님.");
	
	    //insert into tblMember (seq, name, age, address, tell) value (1, '홍길동', 20, '서울시 강남구 역삼동', '010-1234-5678');
	    String seq = "1";
	    String age = "20";
	    String address = "서울시 강남구 역삼동";
	    String tel = "010-1234-5678";
	    
	    System.out.println("insert into tblMember (seq, name, age, address, tell) value (" + seq + ", '" + name + "', " + age + ", '" + address + "', '" + tel + "')");
	    
	    //printf()
	    // %s : 형식 문자

	    System.out.printf("안녕하세요. %s님.\n", name);
	    System.out.printf("안녕하세요. %s님. 반갑습니다. %s님.\n", name, name);
	    
	    System.out.printf("insert into tblMember "
	    		+ "(seq, name, age, address, tell) value "
	    		+ "(%s, '%s', %s, '%s', '%s'",
	    		seq, name, age, address, tel);

	    System.out.println();
	    System.out.printf("문자열: %s\n", "홍길동");
	    System.out.printf("정수: %d\n", 100);
	    System.out.printf("실수: %f\n", 3.14);
	    System.out.printf("문자: %c\n", 'A');
	    System.out.printf("논리: %b\n", true);
	    
	    int num = 100;
	    System.out.printf("숫자: %5d입니다.\n", num);
	    System.out.printf("[%d]\n", num);
	    System.out.printf("[%5d]\n", num);
	    System.out.printf("[%-5d]\n", num);
	    
	    double d1 = 3.14;
	    System.out.printf("%f\n", d1);
	    
	    d1 = 3.1234567890;
	    System.out.printf("%f\n", d1);
	    System.out.printf("%.8f\n", d1);
	    System.out.printf("%.0f\n", d1);
	    
	    d1 = 3.14;
	    System.out.printf("[%10.2f]\n", d1);
	    
	    int price = 1000000;
	    System.out.printf("금액: %,d원\n", price);
	    
	    System.out.println("=======================");
	    System.out.println("        음료 가격");
	    System.out.println("=======================");
	    System.out.printf("1. 콜라: \t%6d원\n", 2500);
	    System.out.printf("2. 스무디: \t%6d원\n", 3500);
	    System.out.printf("3. 박카스: \t%6d원\n", 500);
	    System.out.printf("4. 아메리카노: \t%6d원\n", 12500);
	    System.out.printf("1. 콜라: \t%,6d원\n", 2500);
	    System.out.printf("2. 스무디: \t%,6d원\n", 3500);
	    System.out.printf("3. 박카스: \t%,6d원\n", 500);
	    System.out.printf("4. 아메리카노: \t%,6d원\n", 12500);
	    System.out.println("=======================");
	    System.out.printf("1. 콜라: \t%d원\n", 2500);
	    System.out.printf("2. 스무디: \t%d원\n", 3500);
	    System.out.printf("3. 박카스: \t%d원\n", 500);
	    System.out.printf("4. 아메리카노: \t%d원\n", 12500);

	    System.out.printf("1. 콜라: \t%,6d\n", 2500);
	    System.out.printf("2. 스무디: \t%,6d\n", 3500);
	    System.out.printf("3. 박카스: \t%,6d\n", 500);
	    System.out.printf("4. 아메리카노: \t%,6d\n", 12500);
	}

}
