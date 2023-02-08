package com.xworkz.Technical;

public class DigitsAndSpaces {

	public static void main(String[] args) {

		int digits=0,spaces=0;
		String name="Long note3 5book";
		name=name.toLowerCase();
		for(int i=0;i<name.length();i++) {
		char ch=name.charAt(i);
		if(ch>='2' && ch<='9') {
			digits++;
		}
		if(ch==' ') {
			spaces++;	
		}
		}
		System.out.println("number of digits: "+digits);
		System.out.println("number of spaces: "+spaces);

	}

}
