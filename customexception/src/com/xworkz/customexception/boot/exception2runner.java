package com.xworkz.customexception.boot;

import java.sql.SQLException;

import com.xworkz.customexception.dto.exception2;

public class exception2runner {
	public static void main(String[] args) {
		
		
		exception2 exception=new exception2();
		
		exception.method11();
		try {
		exception.method12();
		}
		catch(SQLException e) {
			System.out.println("exception");
		}
	}

}
