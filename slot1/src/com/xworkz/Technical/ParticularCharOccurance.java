package com.xworkz.Technical;

public class ParticularCharOccurance {
public static void main(String[] args) {
	

	
String inputString = "coderolls";

	        char ch = 'l';

	        int count = 0;

	        for (int i = 0; i < inputString.length(); i++) {

	            if (inputString.charAt(i) == ch) {
	                count++;
	            }
	        }

	        System.out.println("The character '" + ch + "' found " + count + " times in a string '" + inputString + "'.");
	    }

	}


