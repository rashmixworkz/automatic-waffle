package com.xworkz.customexception.dto;

import com.xworkz.customexception.exception.ArraySizeOverException;

public class ExampleOfCustomException {

	public void method1() {
		System.out.println("method 1");

	}

	public void method2() throws ArraySizeOverException  {
		
		throw new ArraySizeOverException();

	}

	public void method3() {
		System.out.println("method 3");

	}
}
