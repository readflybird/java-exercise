package com.read.crack.chap1;

/**
 * Given an image represented by an NxN matrix, where each pixel in the image is 4 
 * bytes, write a method to rotate the image by 90 degrees Can you do this in place?
 * 
 * @author read
 *
 */
public class RotateImage {
	public static void main(String[] args) {
		int[][] image = {{1, 2 ,3 ,4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		test(image);
		int[][] image1 = {{1, 2 ,3 ,4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
		test(image1);
		
		int[][] image2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
		printImage(image2);
		int[][] image3 = rotateNMImage(image2);
		printImage(image3);
	}
	
	private static void test(int[][] image) {
		//print origin image
		printImage(image);
		//rotate image
		rotate(image);
		//print new image
		printImage(image);
	}
	
	private static void printImage(int[][] image) {
		if(image == null || image.length < 1) {
			return;
		}
		for(int i = 0; i < image.length; i++) {
			for(int j = 0; j < image[i].length; j++) {
				System.out.print(image[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private static void rotate(int[][] image) {
		if(image == null || image.length < 1) {
			return;
		}
		int N = image.length;
		for(int level = 0; level < N/2; level++) {
			int max = N - level - 1;
			for(int i = level + 1; i <= max; i++) {
				int start = i - 1;
				//top->left
				int tmp = image[start][level];
				image[start][level] = image[level][N - i];
				//left->bottom
				int tmp2 = image[N - level - 1][start];
				image[N - level - 1][start] = tmp;
				//bottom->right
				tmp = image[N - i][N - level - 1];
				image[N - i][N - level - 1] = tmp2;
				//right->top
				image[level][N - i] = tmp;
			}
		}
	}
	
	private static int[][] rotateNMImage(int[][] image) {
		if(image == null || image.length < 1) {
			return image;
		}
		
		int N = image[0].length;
		int M = image.length;
		int[][] rImage = new int[N][M];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				rImage[i][j] = image[j][N - i - 1];
			}
		}
		
		return rImage;
	}
}
