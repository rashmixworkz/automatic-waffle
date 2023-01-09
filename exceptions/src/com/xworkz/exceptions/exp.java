package com.xworkz.exceptions;

public class exp {
	
	public void checkage(int age) {
		if(age<18) {
			throw new ArithmeticException("Access denied");
		}else {
			System.out.println("acess succes");
		}
	}
	

}
