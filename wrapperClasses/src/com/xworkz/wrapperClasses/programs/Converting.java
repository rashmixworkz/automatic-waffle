package com.xworkz.wrapperClasses.programs;

public class Converting {

	public static void main(String[] args) {
		int x=46;
		byte bit=12;
		short small=15;
		long l=145;
		boolean bool=false;
		char ch='a';
		double d=123.56D;
		float flow=12.45F;
		
		System.out.println("AUTO BOXING:primitive data type to corrsponding object");
		
		Byte value=bit;
		Short value2=small;
		Long value3=l;
		Boolean value4=bool;
		Character value5=ch;
		Double value6=d;
		Float value7=flow;
	    Integer i=x;
	    System.out.println(value);
	    System.out.println(value2);
	    System.out.println(value3);
	    System.out.println(value4);
	    System.out.println(value5);
	    System.out.println(value6);
	    System.out.println(value7);
	    System.out.println(i);
	    
	    System.out.println("UNBOXING:Object to corrsponding primitive data types");
	    
	    
	    byte byteValue=value;
	    int intValue=i;
	    short shortValue=value2;
	    long longvalues=l;
	    boolean booleanvalues=bool;
	    char charvalue=value5;
	    double value1=value6;
	    float floatValue=value7;
	    
	    
	    System.out.println(byteValue);
	    System.out.println(intValue);
	    System.out.println(shortValue);
	    System.out.println(longvalues);
	    System.out.println(booleanvalues);
	    System.out.println(charvalue);
	    System.out.println(value1);
	    System.out.println(floatValue);
	    
	    
	    
	    
		

	}

}
