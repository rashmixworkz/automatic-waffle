package com.xworkz.Technical;

import java.util.Arrays;

import sun.applet.Main;

public class CompareTwoArrayElements {
	
	public static boolean isEqual(int arr1[],int arr2[]) {
		int N=arr1.length;
		int M=arr2.length;
		
		if(N!=M) 
			return false;
			
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i=0;i<N;i++) {
			if(arr1[i]!=arr2[i])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		
	int arr1[]= {3,4,7,8};
	int arr2[]= {3,4,7,8};
	
	if(isEqual(arr1,arr2))
		System.out.println("yes");
	else
		System.out.println("No");
		
		
	
	}

}
