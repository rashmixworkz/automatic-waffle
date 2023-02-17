package com.xworkz.Technical;

public class CountWhiteSpaces {

	public static void main(String[] args) {
	
		String str=" This is Rashmi ";
		String s="";
		int count=0;
	
	for(char ch:str.toCharArray()) 
	{
		if(ch==' ') {
			count++;
		}
		else {
			s+=ch;
		}
		
	}
	System.out.println("Number of whiteSpace:"+count);
	System.out.println("without space:"+s);

	}

}
