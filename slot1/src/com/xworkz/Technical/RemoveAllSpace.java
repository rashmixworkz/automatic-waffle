package com.xworkz.Technical;

public class RemoveAllSpace {

	public static void main(String[] args) {
	
		String str=" Java is open source code  ";
		
		for(int i=0;i<=str.length();i++) {
		}
		System.out.println("original string:"+str);
		System.out.println("Returned value: ");
		System.out.println(str.replaceAll(" ", ""));
	}

}
