package com.xworkz.interviewcodingquestions.boot;

public class CountWhiteSpace {

	public static void main(String[] args) {
		
		String str="HANDS ON LEARNING HAPPENS HERE";
		System.out.println(str.length());
		char[] ch=str.toCharArray();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if (ch[i]== ' ')
			{
				count++;
			}
		}
		System.out.println(" The number of white spaces are : "+ count);
		
	}

}
