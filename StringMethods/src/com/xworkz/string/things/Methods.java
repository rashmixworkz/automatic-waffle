package com.xworkz.string.things;

public class Methods {

	public static void main(String[] args) {
		
		String word="RASHMI DESAI";
		char result=word.charAt(8);
		System.out.println(result);
		
		String word2="Kuknoor";
		int result2=word2.codePointAt(2);
		System.out.println(result2);
		
		String word3="Xwork";
		int result3=word3.codePointBefore(1);
		System.out.println(result3);
		
		String word4="Rajajinagar";
		int result4=word4.hashCode();
		System.out.println(result4);
		
		
		String word5="Vijaynagar";
		int result5=word5.codePointCount(0,10);
		System.out.println(result5);
		
		String word6="Kantara";
		String word7="Kan";
        System.out.println(word6.compareTo(word7));
		
		
		String word8="Kantara";
		String word9="KANTARA";
        System.out.println(word8.compareToIgnoreCase(word9));
		
		String name="RASHMI";
		String name2="DESAI";
		System.out.println(name.concat(name2));
		
		
		String bool="book";
		System.out.println(bool.contains("book"));
		System.out.println(bool.contains("bok"));
		
		String copy="XWORKZ AT RAJAJINAGAR";
		System.out.println(copy.contentEquals("RAJAJIN"));
		System.out.println(copy.contentEquals("XWORKZ AT RAJAJINAGAR"));
		
		char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
		String myStr2 = "";
		myStr2 = myStr2.copyValueOf(myStr1, 0, 5);
		System.out.println("Returned String: " + myStr2);
		
		String cap="best place";
		System.out.println(cap.endsWith("ace"));
		System.out.println(cap.endsWith("st"));
		
		String toy="best friends";
		String toy2="forver";
		String toy3="best friends";
		System.out.println(toy.equals(toy2));
		System.out.println(toy.equals(toy3));
		
		
		String string="best friends";
		String string2="forver";
		String string3="FORVER";
		System.out.println(string2.equalsIgnoreCase(string3));
		System.out.println(string3.equalsIgnoreCase(string));
		
		String text="NVPTQOI4;WOO4PQMXIRC[QOPRi2aaRJp3vm9p";
		System.out.println(text.length());
		
		String msg="uuvntpawopitcujqoij2oipCJ";
		String msg1="";
		System.out.println(msg1.isEmpty());
		System.out.println(msg.isEmpty());
		
		
		


		
		
		
		

	}

}
