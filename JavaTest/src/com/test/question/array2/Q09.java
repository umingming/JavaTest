package com.test.question.array2;

public class Q09 {

	public static void main(String[] args) {
		/*
		1	2	3	4	5
		16	17	18	19	6
		15	24	25	20	7
		14	23	22	21	8
		13	12	11	10	9
		
		설계>
		1. 5행 5열인 이차원 배열 선언
		2. n, i, j, index 변수 선언
		3. for문 0 ~ nums.length/2
			>for문 오른쪽
			>for문 아래
			>for문 왼쪽
			>for문 위
		4. output 호출
		*/
		
		int[][] nums = new int[5][5];
		int num = 1, i = 0, j = 0;
		int jIndex = 0;
		int iIndex = 0;
		
		for(int n=0; n<=(nums.length/2); n++) {
			
			for(j=jIndex; j<nums[0].length-n; j++) {
				nums[iIndex][j] = num;
				num++;
				jIndex++;
			}
			System.out.println(jIndex);
			for(i=iIndex+1; i<nums.length-n; i++) {
				nums[i][jIndex-1] = num;
				num++;
				iIndex++;
			}
			System.out.println(iIndex);
			
			for(j=jIndex-2; j>=n; j--) {
				nums[iIndex][j] = num;
				num++;
				jIndex--;
			}
			System.out.println(jIndex);
			
			for(i=iIndex-1; i>n; i--) {
				nums[i][jIndex-1] = num;
				num++;
				iIndex--;
			}
			System.out.println(iIndex);
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
