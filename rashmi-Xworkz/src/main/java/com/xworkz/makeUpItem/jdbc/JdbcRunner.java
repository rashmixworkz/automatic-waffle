package com.xworkz.makeUpItem.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcRunner {

	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/conectvity", "root",
				"Xworkzodc@123");)//try with resources block-automatically close the connection
		{

			//Class.forName("com.mysql.cj.jdbc.Driver");// optional for java 1.8 or above
			
			String query = "insert into makeup_item_table value(0,'Eyeliner','Insight',125.85,'Rose',true)";
			Statement statement = con.createStatement();
			int rows = statement.executeUpdate(query);
			System.out.println("ROWS AFFECTED:" + rows);
			
		}/* catch (ClassNotFoundException e) {
			System.out.println("class not exception class name is not found");
		} */catch (SQLException event) {
			System.err.println("sql exception URL or US or PW is not correct");
		}
	}

}
