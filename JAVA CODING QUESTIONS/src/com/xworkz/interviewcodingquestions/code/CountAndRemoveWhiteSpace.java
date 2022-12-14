package com.xworkz.interviewcodingquestions.code;

public class CountAndRemoveWhiteSpace {

	public static void main(String[] args) {
	
		
		String str="Hands on learning happen here";
		String s="";
		int count=0;
		for(char ch:str.toCharArray()) {
			if(ch==' ') {
				count+=1;  //count=count+1
			}else {
				s+=ch;  //s=s+ch;
				
			}
		}
		System.out.println("number of whiteSpace:"+count);
		System.out.println("string without space:"+s);

	}

}













