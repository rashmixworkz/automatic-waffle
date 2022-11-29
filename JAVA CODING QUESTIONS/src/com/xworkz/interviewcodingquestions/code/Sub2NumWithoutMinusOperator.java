package com.xworkz.interviewcodingquestions.code;

public class Sub2NumWithoutMinusOperator{

	static int subtract(int x, int y)
		{
			
		
		while (y != 0)
		{

			int borrow = (~x) & y;
			x = x ^ y;

		
			y = borrow << 1;
		}
		
		return x;
	}
		

		public static void main (String[] args)
		{
			int x = 100, y = 13;
			
			System.out.println("x - y is " +
							subtract(x, y));
		}
	}



