package com.xworkz.interviewcodingquestions.code;

public class SwapGivenString {

	public static void main(String[] args) {
		String str1="Rashmi";
		String str2="Desai";
		
		System.out.println("Before swap");
		System.out.println("first string is:"+str1);
		System.out.println("second string is:"+str2);
		
		str1=str1+str2;
		str2=str1.substring(0,(str1.length()-str2.length()));
		str1=str1.substring(str2.length());
		
		
		System.out.println("String after swaping:"+str1+""+str2);

	}

}
