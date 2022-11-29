package com.xworkz.interviewcodingquestions.boot;

import com.xworkz.interviewcodingquestions.code.BasicOperation;

public class BasicOperationRunner {

	public static void main(String[] args) {
		
		
		int result = BasicOperation.operation('+',4,7);
		System.out.println(result);
		int operator = BasicOperation.operation('-',15,18);
		System.out.println(operator);
		int basic = BasicOperation.operation('*',5,5);
		System.out.println(basic);
		int cal = BasicOperation.operation('/',49,7);
		System.out.println(cal);
		
		

	}

}
