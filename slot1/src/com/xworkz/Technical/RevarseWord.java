package com.xworkz.Technical;

public class RevarseWord {

	public static void main(String[] args) {
		String word = "I am Rashmi";
		String a[] = word.split(" ");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");

		}

	}
}
