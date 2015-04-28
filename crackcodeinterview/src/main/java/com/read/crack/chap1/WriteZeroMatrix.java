package com.read.crack.chap1;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an image represented by an NxN matrix, where each pixel in the image is 4 
 * bytes, write a method to rotate the image by 90 degrees Can you do this in place?
 * 
 * @author read
 *
 */
public class WriteZeroMatrix {
	public static void main(String[] args) {
		int[][] matrix = {{1,2}, {0, 3}, {4, 5}};
		test(matrix);
		int[][] matrix1 = {{1, 2}, {3, 4}, {5, 6}};
		test(matrix1);
	}
	
	private static void printArray(int[][] array) {
		if(array == null || array.length < 1) {
			return;
		}
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private static void test(int[][] matrix) {
		printArray(matrix);
		setZero(matrix);
		printArray(matrix);
	}
	private static void setZero(int[][] matrix) {
		if(matrix == null || matrix.length < 1) {
			return;
		}
		
		int M = matrix.length;
		int N = matrix[0].length;
		Set<Integer> markedRows = new HashSet<Integer>();
		Set<Integer> markedColumns = new HashSet<Integer>();
		
		for(int i = 0; i < M; i++) {
			for(int j = 0; j < N; j++) {
				if(matrix[i][j] == 0) {
					markedRows.add(i);
					markedColumns.add(j);
				}
			}
		}
		
		for(int r : markedRows) {
			for(int i = 0; i < matrix[i].length; i++) {
				matrix[r][i] = 0;
			}
		}
		
		for(int c : markedColumns) {
			for(int i = 0; i < matrix.length; i++) {
				matrix[i][c] = 0;
			}
		}
	}
}
