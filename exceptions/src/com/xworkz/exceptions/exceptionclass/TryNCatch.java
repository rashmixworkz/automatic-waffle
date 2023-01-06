package com.xworkz.exceptions.exceptionclass;

public class TryNCatch {

	public static void main(String[] args) {
	int a,b;
	try {
		a=0;
		b=20/a;
		System.out.println("this block not printed");
	}
	catch(ArithmeticException e){
		System.out.println("this block will print");
		
	}
	System.out.println("After catch statement");

	}

}
