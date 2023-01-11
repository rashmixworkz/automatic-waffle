package com.xworkz.customexception.boot;

import com.xworkz.customexception.dto.ExampleOfCustomException;
import com.xworkz.customexception.exception.ArraySizeOverException;

public class ExampleOfCustomExceptionRuuner {

	public static void main(String[] args) {
		
		
		ExampleOfCustomException ref=new ExampleOfCustomException();
		
		ref.method1();
		try {
		ref.method2();
		}
		catch (ArraySizeOverException e) {
			System.out.println("running catch");
		}
		ref.method3();

	

}
}
