package com.xworkz.Technical;

public class NumberOfDigits {

	public static void main(String[] args) {
int number=43567;
int count=0;
while(number!=0) {
	number/=10;
	++count;
}
System.out.println("number of digits:"+count);
	}

}
