package com.xworkz.customexception.dto;

import java.sql.SQLException;

public class exception2 {
	public void method11() {
		System.out.println("11");
	}

	public	void method12() throws SQLException  {
		throw new SQLException();
		
	}
}
