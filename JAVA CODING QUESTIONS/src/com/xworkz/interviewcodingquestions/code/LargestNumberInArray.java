package com.xworkz.interviewcodingquestions.code;

public class LargestNumberInArray {

	public static int getLargest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[total-1];  
		}  
		public static void main(String args[]){  
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};  
		System.out.println("Largest: "+getLargest(a,6));  
		System.out.println("Largest: "+getLargest(b,7));  
		}}  
		Test it Now
		Output:

		Largest: 6
		Largest: 99

		Find Largest Number in Array using Arrays
		Let's see another example to get largest element in java array using Arrays.

		
		public class LargestInArrayExample1{  
		public static int getLargest(int[] a, int total){  
		Arrays.sort(a);  
		return a[total-1];  
		}  
		public static void main(String args[]){  
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};  
		System.out.println("Largest: "+getLargest(a,6));  
		System.out.println("Largest: "+getLargest(b,7));  
		}}  
		Test it Now
		Output:

		Largest: 6
		Largest: 99
		Find Largest Number in Array using Collections
		Let's see another example to get largest number in java array using collections.

		import java.util.*;  
		public class LargestInArrayExample2{  
		public static int getLargest(Integer[] a, int total){  
		List<Integer> list=Arrays.asList(a);  
		Collections.sort(list);  
		int element=list.get(total-1);  
		return element;  
		}  
		public static void main(String args[]){  
		Integer a[]={1,2,5,6,3,2};  
		Integer b[]={44,66,99,77,33,22,55};  
		System.out.println("Largest: "+getLargest(a,6));  
		System.out.println("Largest: "+getLargest(b,7));  
		}
}
