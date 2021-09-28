package com.test.java;

public class Ex31_Array {

	public static void main(String[] args) {
		//학생 3명의 국어점수 총점, 평균
//		m1();
//		m2();
//		m3();
//		m4();
//		m5();
//		m7();
//		m8();
//		m9();
		m10();
		

	}

	private static void m10() {
		// TODO Auto-generated method stub
		
	}

	private static void m9() {
		int num;
		int[] nums = new int[5];
		
//		System.out.println(num);
		System.out.println(nums[0]);
		
	}

	private static void m8() {
		int[] nums1 = new int[3];
		int[] nums2;
		int[] nums3 = new int[3];
		
		nums1[0] = 100;
		nums1[1] = 200;
		nums1[2] = 300;
		
		nums2 = nums1;
		
		for (int i=0; i<nums1.length; i++) {
			nums3[i] = nums1[i];
		}
		
		nums1[0] = 1000;
		
		System.out.println("nums1[0] : " + nums1[0]);
		System.out.println("nums2[0] : " + nums2[0]);
		System.out.println("nums3[0] : " + nums3[0]);
	}

	private static void m7() {
		int a = 10;
		int b;
		
		b = a;
		a = 20;
		
		System.out.println(a);
		System.out.println(b);
		
		int[] nums1 = new int[3];
		int[] nums2;
		
		nums1[0] = 100;
		nums1[1] = 200;
		nums1[2] = 300;
		
		for (int i=0; i<nums1.length; i++) {
			System.out.println(nums1[i]);
		}
		
		nums2 = nums1;
		
		for (int i=0; i<nums2.length; i++) {
			System.out.println(nums2[i]);
		}
		
		nums1[0] = 1000;
		for (int i=0; i<nums1.length; i++) {
			System.out.println(nums1[i]);
		}
		
		for (int i=0; i<nums2.length; i++) {
			System.out.println(nums2[i]);
		}
	}

	private static void output(int[] nums1) {
		
		// TODO Auto-generated method stub
		
	}

	private static void m5() {
		long[] array1 = new long[5];
		array1[0] = 100L;

		double[] array2 = new double[5];
		array2[0] = 3.14;
		
		char[] array3 = new char[5];
		array3[0] = 'A';
		
		boolean[] array4 = new boolean[5];
		array4[0] = true;
		
		String[] array5 = new String[5];
		array5[0] = "홍길동";
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("숫자 : ");
		int n = Integer.parseInt(reader.readLine());
		
		int[] nums = new int[n];
		
		
	}

	private static void m4() {
		
		int[] kors = new int[3];
		kors[0] = 100;
		kors[1] = 90;
		kors[2] = 80;
		
		for(int i=0; i<=kors.length; i++) {
			System.out.printf("kors[%d] = %d%n", i, kors[i]);
			
		}
		
	}

	private static void m3() {
		int[] kors = new int[3];
		int total = 0;
		
		for(int i=0; i<kors.length; i++) {
			kors[i] = 100 - (i * 10); //배열의 번호를 변수로 넣어도 돼.
		}
		
		for(int i=0; i<kors.length; i++) {
			total += kors[i];
		}
		
		double avg = total / kors.length;
		
		
	}

	private static void m2() {
		int[] kors = new int[3];
	
		kors[0] = 100;
		kors[1] = 90;
		kors[2] = 80;
		
		int total = kors[0] + kors[1] + kors[2];
		double avg = total / 3.0;
	}

	private static void m1() {
		int kor1;
		int kor2;
		int kor3;
		
		kor1 = 100;
		kor2 = 90;
		kor3 = 80;
		
		int total = kor1 + kor2 + kor3;
		double avg = total / 3.0;
		
		System.out.printf("총점: %d점, 평균: %.f점", total, avg);
	}

}
