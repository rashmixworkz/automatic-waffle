package com.xworkz.Technical;

public class ReverseString {

	public static void main(String[] args) {
	String str="I am Rashmi";
	System.out.println("length of the string:"+str.length());
	for(int i=str.length()-1;i>=0;i--) {
		System.out.print(str.charAt(i));
	}

	}

}
