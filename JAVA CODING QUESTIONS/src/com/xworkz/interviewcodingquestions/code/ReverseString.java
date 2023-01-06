package com.xworkz.interviewcodingquestions.code;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter String here::");
		Scanner scan=new Scanner(System.in) ;
		String string=scan.nextLine();
		String reverseString="";
		System.out.println("length of the given string is "+string.length());
		for (int i = string.length()-1; i>=0; i--) {
			
			reverseString=reverseString+string.charAt(i);//charAt=converts string to char.we can get single char using index value
		}
		System.out.println("original string:"+string);
		System.out.println("reverse string is:"+reverseString);

	}



}

