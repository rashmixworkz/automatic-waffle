package com.xworkz.interviewcodingquestions.code;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter string here: ");
		String sc=scanner.nextLine();
		
		String rev=" ";
		
		for(int i=sc.length()-1;i>=0;i--) {
			rev=rev+sc.charAt(i);
			
			
		}
		
		
		System.out.println("original string: "+sc);
		System.out.println("reversed string: "+rev);

		
		

	}

}

