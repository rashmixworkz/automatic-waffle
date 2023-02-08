package com.xworkz.Technical;

public class FistLargest {

	public static void main(String[] args) {
    int[] first=new int[] {1,65,34,2,5};
    
    int max=first[0];
    for(int i=0;i<first.length;i++) {
    if(first[i]>max)	
    	max=first[i];
    }
    System.out.println("Largest number in array: "+max);
	}

}
