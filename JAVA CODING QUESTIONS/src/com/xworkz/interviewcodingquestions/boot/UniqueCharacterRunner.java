package com.xworkz.interviewcodingquestions.boot;

import com.xworkz.interviewcodingquestions.code.UniqueCharacter;

public class UniqueCharacterRunner {

	public static void main(String[] args) {
		UniqueCharacter uniqueCharacter=new UniqueCharacter();
		String input="RASHMI";
		if(uniqueCharacter.uniqueChar(input))
			System.out.println(input+"has all unique value");
		else
			System.out.println(input + "has duplicates values");

	}

}
