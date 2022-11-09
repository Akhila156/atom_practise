package com.mindtree.challenge;

import java.util.Scanner;

public class ReversingOfAString {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a String");
		String str = scan.nextLine();
		int count = wordsCount(str);
		getStringReversed(str, count);

	}

	private static String[] getChangedVowelCase(String[] arr, int count) {
		// System.out.println("Enter a String");
		// str = scan.nextLine();
		arr = new String[count];
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];
			for (int l = 0; i < s.length(); l++) {
				String change = " ";
				char c = s.charAt(l);
				if (c >= 97 || c <= 122) {
					change += (char) (c - 32);
				} else {
					change += (char) (c + 32);
				}
				arr[i] = change;
			}
		}
		return arr;
	}

	private static int wordsCount(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count = count + 1;
			}
		}
		count = count + 1;
		return count;
	}

	private static String[] splitWords(String str, int count) {

		String[] temp = new String[count];
		String array1 = "";
		int j = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				temp[j] = array1;
				j++;
				array1 = "";
			} else {
				array1 = array1 + str.charAt(i);
			}
		}
		temp[j] = array1;
		return temp;

	}

	private static void getStringReversed(String str, int count) {
		// String[] arr = getChangedVowelCase(str, count);
		String[] arr1 = splitWords(str, count);
		String[] arr = getChangedVowelCase(arr1, count);
		String reversedString = "";
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {

				reverseWord = reverseWord + word.charAt(j);
			}
			reversedString = reversedString + reverseWord + " ";

		}
		// String[] s = getChangedVowelCase(str, count);
		System.out.println(str);
		System.out.println(reversedString);
	}

}
