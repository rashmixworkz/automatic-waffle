package com.xworkz.Technical;

public class PaindromeNumber {

	public static void main(String[] args) {
	
		int r,sum=0,temp;
		int num=643;
		temp=num;
		
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
	}
		if(temp==sum)
			System.out.println("number is palindrome: "+sum);
		else
			System.out.println("number is not palaindrome: "+sum);

	}

}
