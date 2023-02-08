package com.xworkz.Technical;

public class Count {

	public static void main(String[] args) {
	int cCount=0,vCount=0;
	
	String name="Hands on learning happense here";
	name=name.toLowerCase();
	
	for(int i=0;i<name.length();i++) {
		if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') {
			vCount++;
		}
		else 
			if(name.charAt(i)>='a'&& name.charAt(i)<='z') {
				cCount++;
			}
		
	}
	System.out.println("no of vowels: "+vCount);
	System.out.println("no of consonents: "+cCount);


	}

}
