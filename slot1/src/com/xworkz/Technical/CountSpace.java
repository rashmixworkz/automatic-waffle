package com.xworkz.Technical;

public class CountSpace {

	public static void main(String[] args) {
		int sp=0;
String space="jnvo'eanvoeu  lkevvpAWJFW qklnd'pqn b;b;wnCONWL";
for(int i=0;i<space.length();i++) {
	char ch=space.charAt(i);
	if(ch==' ') {
		sp++;
	}
}
System.out.println("spaces: "+sp);
	}

}
