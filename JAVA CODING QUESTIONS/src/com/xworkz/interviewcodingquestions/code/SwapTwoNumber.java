package com.xworkz.interviewcodingquestions.code;

public class SwapTwoNumber {

	public static void main(String[] args)
	{
		int first=234;
		int second=123;
		
		System.out.println("berfore swap");
		System.out.println("first number:"+first);
		System.out.println("second number:"+second);
		
		first=first-second;
		second=first+second;
		first=second-first;
		
		System.out.println("after swap");
		System.out.println("first number:"+first);
		System.out.println("second number:"+second);

	}

}
