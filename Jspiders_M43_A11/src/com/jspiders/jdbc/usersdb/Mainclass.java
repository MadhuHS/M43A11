package com.jspiders.jdbc.usersdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Mainclass 
{
	public static void main(String[] args) 
	{
		System.out.println("Program starts...");
        
		String url = "jdbc:mysql://localhost:3306/";
		String dbname = "usersdb";
		String dbusername = "root";
		String dbuserpwd = "root";
		try 
		{
			Connection con = DriverManager.getConnection(url+dbname,dbusername,dbuserpwd);
			System.out.println("connected to userdb");
			
			Statement stmt = con.createStatement();

			/*String insertQuery = "insert into usersdb.users values(3,'USER1')";
			stmt.execute(insertQuery);
			System.out.println("insert record success");*/
			
			
			String updateQuery = "update usersdb.users set name = 'madhu' where id=1";
			stmt.execute(updateQuery);
			System.out.println("update record success");
			
			String deleteQuery = "delete from usersdb.users where id = 1";
			stmt.execute(deleteQuery);
			System.out.println("delete record success");
			
			
			con.close();
			System.out.println("disconnected from userdb");
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}

		System.out.println("Program ends...");
	}
}
