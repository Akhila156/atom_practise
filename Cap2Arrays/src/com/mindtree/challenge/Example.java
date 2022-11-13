package com.mindtree.challenge;

import java.util.Scanner;

public class Example {
	private static Scanner scan = new Scanner(System.in);
// main class
	public static void main(String[] args) {
		System.out.println("Enter string");
		String str = scan.nextLine();
		int wordsCount = getCountOfString(str);
		System.out.println("No of Words " + wordsCount);
		System.out.println("============================");
		String temp[] = splitwords(str, wordsCount);
		for (int i = 0; i < wordsCount; i++) {
			System.out.println(temp[i]);
				System.out.println(temp[i]);
		}
	}

	private static int getCountOfString(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count = count + 1;
			}
		}
		count = count + 1;
		return count;
	}

	private static String[] splitwords(String str, int count) {
		String temp[] = new String[count];
		String array1 = "";
		int j = 0;
		for (int i = 0; i < str.length(); i++) { // hii hello world
			if (str.charAt(i) == ' ') {
				temp[j] = array1;
				j++;
				array1 = "";
			} else {
				array1 = array1 + str.charAt(i); // hii
			}
		}
		temp[j] = array1;
		return temp;
	}
}
