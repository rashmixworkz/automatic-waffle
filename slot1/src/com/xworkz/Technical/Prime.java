package com.xworkz.Technical;

public class Prime {

	public static void main(String[] args) {
	int num=101,count=0;
	for(int i=2;i<=num/2;i++) {
		if(num%i==0) {
			count++;
			break;
		}
	}
	if(count==0)
System.out.println(num +" :Given number is prime");
	else
		System.out.println(num +" :Given number is not prime");
	}

}
