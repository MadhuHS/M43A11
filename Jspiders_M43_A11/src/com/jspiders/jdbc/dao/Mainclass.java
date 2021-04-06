package com.jspiders.jdbc.dao;

import java.sql.SQLException;

public class Mainclass
{
	public static void main(String[] args) 
	{
		MySqlImpl ms = new MySqlImpl();

		try 
		{
			ms.initDB();
			System.out.println("CONNECTED TO DB");
			
		    //ms.insert(3,"user3");
			
			//ms.update(2,"madhu");
			
			//ms.select();
			ms.selectUser(3);
			
			ms.closeDB();
			System.out.println("DISCONNECTED FROM DB");
			
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
