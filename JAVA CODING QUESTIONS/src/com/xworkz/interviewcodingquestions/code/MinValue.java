package com.xworkz.interviewcodingquestions.code;

public class MinValue {
	
	static void min(int[] array) {
		int min=array[0];
		for (int i = 1; i < array.length; i++) 
			
			if(min>array[i]) 
				min=array[i];
				System.out.println(min);
			}
	
	static void max(int[] array) {
		int maximum=0;
		for (int i = 1; i < array.length; i++) 
			if(maximum<array[i]) 
				maximum=array[i];
				System.out.println(maximum);
			}
		
	
	
	public static void main(String[] args) {
		
		int a[]= {23,15,65,34,945};
	min(a);
	max(a);
	}

}
