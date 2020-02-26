package Array;

import java.io.*;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 6, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };
		int row = 4;
		int col = 4;
		row(arr, row, col);
		column(arr);
		daigonal(arr);
		divide(arr);
	}

	public static void row(int arr[][], int row, int col) {
		int i, j;int sum = 0;
		for (i = 0; i < row; i++) {
			sum=0;
			for (j = 0; j < col; j++) {

				sum = sum + arr[i][j];

			}
			
		}System.out.println(sum + " ");
	}

	public static void column(int arr[][]) {

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[j][i];
				
			}
		}System.out.println(sum);
	}

	public static void daigonal(int arr[][]) {

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) // this condition checks for diagonal
				{
					sum = sum + arr[i][j];
				}
				
			}
		}System.out.println(sum);
	}

	public static void divide(int arr[][]) {
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 2 == 0 && arr[i][j] % 3 == 0) {
					sum = sum + arr[i][j];
				}

			}

		}System.out.println(sum);

	}
}
