package com.jspiders.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	public void closeDB()throws SQLException 
	{
	  con.close();
	}



	@Override
	public void insert(int id, String name) throws SQLException {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void update(int id, String name) throws SQLException {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void delete(String deleteQuery) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void select() throws SQLException {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void selectUser(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	

}
