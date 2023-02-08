package com.xworkz.interviewcodingquestions.code;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		
		String str1="Race";
		String str2="Care";
		
		str1=	str1.toLowerCase();
	str2=	str2.toLowerCase();
		
		if(str1.length()==str2.length()) {
			
		char[] ana1=str1.toCharArray();
		char[] ana2=str2.toCharArray();
		
		Arrays.sort(ana1);
		Arrays.sort(ana2);
		
	boolean result=	Arrays.equals(ana1, ana2);
	if(result) {
		System.out.println(ana1+"and"+ana2+"are anagram");
	}
	else {
		System.out.println(ana1+"and"+ana2+"are not anagram");
	}
		}
		
		
		}

	}


