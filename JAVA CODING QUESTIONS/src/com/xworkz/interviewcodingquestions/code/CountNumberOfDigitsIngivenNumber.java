package com.xworkz.interviewcodingquestions.code;

public class CountNumberOfDigitsIngivenNumber {

	public static void main(String[] args)
	{
	
int count=0;
int num=012345;

while(num!=0) {
	num/=10;
	count++;
}
System.out.println("no of digits in given sequence:"+count);

}
}