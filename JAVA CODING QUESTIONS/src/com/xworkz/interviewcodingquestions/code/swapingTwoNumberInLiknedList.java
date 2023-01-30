package com.xworkz.interviewcodingquestions.code;

import java.util.LinkedList;

public class swapingTwoNumberInLiknedList {
	public static void main(String[] args) {
		
	
	LinkedList<Integer> number=new LinkedList<Integer>();
	
	
	number.add(14);
	number.add(15);
	
	
	int elements1=14;
	int elements2=15;
	
	System.out.println("Linked List Before Swapping :-");
	  
    for (int i :number ) {
        System.out.print(i + " ");
    }
    
    swap(number, elements1, elements2);
    System.out.println();
    System.out.println();

    System.out.println("Linked List After Swapping :-");

    for (int i : number) {
        System.out.print(i + " ");
    }
	}
    public static void swap(LinkedList<Integer> list,
            int ele1, int ele2)
{

// Getting the positions of the elements
int index1 = list.indexOf(ele1);
int index2 = list.indexOf(ele2);

// Returning if the element is not present in the
// LinkedList
if (index1 == -1 || index2 == -1) {
return;
}

// Swapping the elements
list.set(index1, ele2);
list.set(index2, ele1);
    
}
}
