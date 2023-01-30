package com.xworkz.interviewcodingquestions.code;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class AxisBankCodingQuestion {

	public static void main(String[] args) {
		int count = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements in first list: ");
		int length1 = scan.nextInt();
		ArrayList<Integer> list1 = new ArrayList<Integer>(length1);
		System.out.println("enter the elements of list1: ");
		for (int i = 0; i < length1; i++) {
			int k = scan.nextInt();
			list1.add(k);

		}
		System.out.println(list1);

		System.out.println("Enter the number of elements in second list: ");
		int length2 = scan.nextInt();
		ArrayList<Integer> list2 = new ArrayList<Integer>(length2);
		System.out.println("enter the elements of list2: ");
		for (int i = 0; i < length2; i++) {
			int j = scan.nextInt();
			list2.add(j);

		}
		System.out.println(list2);

		if(list1.equals(list2)) {
			System.out.println("length of 2 list must be different");
		}
		else {
		
		for (int i = 0; i < length1; i++) {
			for (int j = i + 1; j < length2; j++) {
				if (list1.get(i).equals(list2.get(j))) {
					System.out.println("both elements are same");
				} else {
					
					count++;

				}
			}
		}
		System.out.println("count :" + count);
		}
	}

}
