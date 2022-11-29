package com.xworkz.interviewcodingquestions.code;

public class BasicOperation {
	public static int operation(char operator,int value1,int value2)
	{
		if(operator=='+')
		{
			return value1+value2;
		}
		if(operator=='-')
		{
			return value1-value2;
		}
		if(operator=='*')
		{
			return value1*value2;
		}
		
		if(operator=='/')
		{
			return value1/value2;
		}
		
		return 0;
	}
}


