package com.xworkz.Technical;

import java.util.Scanner;

public class CountVowelsAndConsonents {

	public static void main(String[] args) {
		
	int vCount=0,cCount=0;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter string here:");
	String sc=scan.nextLine();
	
	sc=sc.toLowerCase();
	for(int i=0;i<sc.length();i++) {
		
		if(sc.charAt(i)=='a' ||sc.charAt(i)=='e' ||sc.charAt(i)=='i' ||sc.charAt(i)=='o' ||sc.charAt(i)=='u' ) {
			vCount++;
		}
		else if(sc.charAt(i)>='a'&& sc.charAt(i)<='z'){
			cCount++;
			
		}
			}

		
System.out.println("number of vowels: "+vCount);
System.out.println("number of consonents: "+cCount);

	}

}
