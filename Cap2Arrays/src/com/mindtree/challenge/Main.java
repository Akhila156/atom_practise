package com.mindtree.challenge;

import java.util.Scanner;

public class Main {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		//Asking user to enter the string
		System.out.println("Enter the string");
		String str = scan.nextLine();
		int count = stringSpaceCount(str);

		String arr[] = new String[count + 1];
		arr = concatLengthWithName(str, arr);
		for (int i = 0; i < arr.length; i++) {
			String temp = "";
			if (i % 2 == 1) {
				for (int j = 0; j < arr[i].length(); j++) {
					char c = arr[i].charAt(j);
					temp = temp + (char) (c - 32);
				}
				arr[i] = temp;
			}
		}
		for (String arr1 : arr) {
			System.out.print(arr1 + " ");
		}
		// scan.close();
	}

	private static String[] concatLengthWithName(String s, String[] arr) {
		int index = 0;
		String temp = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				temp = temp + s.charAt(i);

			} else {
				arr[index] = temp;
				index++;
				temp = "";
			}
		}
		arr[index] = temp;
		return arr;
	}

	private static int stringSpaceCount(String s) {
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				c++;
			}

		}
		return c;
	}

}
