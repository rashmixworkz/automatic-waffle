package com.xworkz.Technical;

public class PalindromeString {

	public static void main(String[] args) {

		
		String name="Gadag";
		
		String rev="";
		
		int length=name.length();
		for(int i=length-1;i>=0;i--) 
			rev=rev+name.charAt(i);
		
if(name.equals(rev)) 
	System.out.println("Given String is palindrome");
else 
	System.out.println("Given String is not palindrome");
	
	}
	

}
