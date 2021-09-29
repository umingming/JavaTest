package com.test.java.string;

public class Ex32_Array {

	public static void main(String[] args) {
		
//		int[][][] nums = new int[2][2][3];
//		nums[0][0][0] = 100;
//		nums[0][0][1] = 200;
//		nums[0][0][2] = 300;
//
//		nums[0][1][0] = 100;
//		nums[0][1][1] = 200;
//		nums[0][1][2] = 300;
//
//		nums[1][0][0] = 100;
//		nums[1][0][1] = 200;
//		nums[1][0][2] = 300;
//
//		nums[1][1][0] = 100;
//		nums[1][1][1] = 200;
//		nums[1][1][2] = 300;
//		
//		for(int i=0; i<2; i++) {
//			for(int j=0; j<2; j++) {
//				for(int k=0; k<3; k++) {
//					System.out.printf("nums3[%d][%d][%d] = %d%n"
//										, i, j, k
//										, nums[i][j][k]);	
//				}
//			}
////		}
//		int[] nums1 = new int[3];
//		int[][] nums2 = new int[2][3];
//		int[][][] nums3 = new int[2][2][3];
//		
//		System.out.println(nums1.length);		//1차원의 길이
//		System.out.println(nums2.length);		//2차원의 길이
//		System.out.println(nums2[0].length);	//1차원의 길이
//		System.out.println(nums3.length);		//3차원의 길이
//		System.out.println(nums3[0].length);	//2차원의 길이
//		System.out.println(nums3[0][0].length);	//1차원의 길이
//		
//		int[][][] nums4 = 
//			{ 
//					{ 
//						{ 10, 20, 30 }, 
//						{ 40, 50, 60 } 
//					}, 
//					{ 
//						{ 10, 20, 30 }, 
//						{ 40, 50, 60 } 
//					}, 
//					{ 
//						{ 10, 20, 30 }, 
//						{ 40, 50, 60 } 
//					} 
//			}
		m2();
		
	}

	private static void m2() {
		int[][] nums = new int[5][5];
		
		int n = 1;
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[0].length; j++) {
				nums[i][j] = n;
				n++;
			}
//			System.out.println();
		}
		
		output(nums);
		
	}

	private static void output(int[][] nums) {
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[0].length; j++) {
				System.out.printf("%3d", nums[i][j]);
			}
			System.out.println();
		}
		
	}

}
