package com.xworkz.interviewcodingquestions.code;

public class FactorialNumber {

		
		static int factorial(int n) {
			if(n==0) {
				return 1;
			
		}else
			if(n!=0)
			{
			return	n*factorial(n-1);
			}
			return n;
		
	}
		public static void main(String[] args) {
			int i,fact=1,number=5;
			System.out.println("5:"+factorial(5));
		}
}


