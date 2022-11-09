package com.mindtree.challenge;

import java.util.Scanner;

public class InterchangingOfElements {
	;
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter rows");
		int rows = scan.nextInt();
		System.out.println("enter columns");
		int columns = scan.nextInt();
		int[][] arr = new int[rows][columns];
		getCreatedArray(arr, rows, columns);
		getDisplayedArray(arr, rows, columns);
		int[][] array = getInterchangedRowWithDiagonal(arr, rows, columns);
		System.out.println("The array after changing:::");
		getDisplayedArray(array, rows, columns);

	}

	private static void getDisplayedArray(int[][] arr, int rows, int columns) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("====================");
	}

	private static int[][] getInterchangedRowWithDiagonal(int[][] arr, int rows, int columns) {
		for (int i = 0; i <= arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					int temp = arr[0][j];
					arr[0][j] = arr[i][j];
					arr[i][j] = temp;
				}
			}
		}
		return arr;
	}

	private static void getCreatedArray(int[][] arr, int rows, int columns) {
		System.out.println("enter elements of an array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = scan.nextInt();
			}
		}

	}

}
