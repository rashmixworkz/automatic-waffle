package com.xworkz.interviewcodingquestions.code;

public class PermutationofString {
	
	
	public static void result(String value,String ans) {
		if(value.length()==0) {
			System.out.println(ans+" ");
			return;
		}
			for (int i = 0; i < value.length(); i++) {
			char ch=value.charAt(i);
			
			
			String ros=value.substring(0,i)+value.substring(i+1);
			
			result(ros,ans+ch);
				
			}
		}
	
	
	
	public static void main(String[] args) {
		
		
		
		String str="abc";
		result(str," ");
		

	}
	}

	

		
	



