package com.xworkz.Technical;

public class ThirdLargest {

	
		
	static int third(int[] array,int total) {
		int temp;
		for(int i=0;i<total;i++) {
			for(int j=i+1;j<total;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array[total-3];
	
	}
	
	public static void main(String[] args) {
		
		int array[]= {4,67,34,69,23,87};
		
		System.out.println("3rd largest number:"+third(array,6));
	}

	}


