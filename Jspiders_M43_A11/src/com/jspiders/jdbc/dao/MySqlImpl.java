package com.jspiders.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlImpl implements Dao {

	private String url = "jdbc:mysql://localhost:3306/";
	private String dbname = "usersdb";
	private String dbusername = "root";
	private String dbuserpwd = "root";
	private Statement stmt;
	private Connection con;
	
	@Override
	public void initDB()throws SQLException
	{
		con  = DriverManager.getConnection(url+dbname,dbusername,dbuserpwd);
		stmt = con.createStatement();
	}

	@Override
	public void insert(String insertQuery) 
	{
		
	}

	@Override
	public void update(String updateQuery) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String deleteQuery) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void select(String selectQuery) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeDB()throws SQLException 
	{
	  con.close();
	}

}
