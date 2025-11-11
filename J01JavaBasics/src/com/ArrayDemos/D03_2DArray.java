package com.ArrayDemos;

public class D03_2DArray {

	public static void main(String[] args) {
		int[][]matrix = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		
		/*
		System.out.println(matrix[0][0]);
		System.out.println(matrix[0][1]);
		System.out.println(matrix[0][2]);
		System.out.println(matrix[0][3]);
		
		System.out.println(matrix[1][0]);
		*/
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
