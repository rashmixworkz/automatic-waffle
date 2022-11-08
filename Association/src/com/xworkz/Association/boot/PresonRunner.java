package com.xworkz.Association.boot;


import com.xworkz.Association.things.Email;
import com.xworkz.Association.things.Person;


public class PresonRunner {

	public static void main(String[] args) 
	{
		Email email=new Email("rashmi.xworkz@gmail.com",1234,8296122218L);
		//email.showOff();
		Email email1=new Email("rashmidesai@gmail.com",7654,9482753620L);
		//email1.showOff();
		 Email[] emails= {email,email1};
		 
		
		
Person person=new Person("Rashmi");
person.setEmail(emails);
person.showOff();



	}

}
