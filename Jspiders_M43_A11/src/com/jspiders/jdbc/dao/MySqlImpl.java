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
    public void insert(int id, String name) throws SQLException 
    {
    	String insertquery = "insert into usersdb.users values(?,?)";  
    	PreparedStatement ps = con.prepareStatement(insertquery);
    	ps.setInt(1,id);
    	ps.setString(2, name);
    	int count =  ps.executeUpdate();
    	
    	/*
    	 * Executes the SQL statement in this PreparedStatement object,
    	 *  which must be an SQL Data Manipulation Language (DML) statement, 
    	 *  such as INSERT, UPDATE or DELETE;
    	 *  or an SQL statement that returns nothing, such as a DDL statement.
    	 * */
    	
    	if(count > 0)
    	{
    		System.out.println(count+" data added");
    	}
    	else
    	{
    		System.out.println("ERROR while adding data");
    	}
    		
    }

	@Override
	public void update(int id,String name) throws SQLException
	{
		String updateQuery = "update usersdb.users set name = ? where id = ?";
		
	    PreparedStatement ps = con.prepareStatement(updateQuery);
	    
	    ps.setString(1, name);
	    ps.setInt(2, id);
	    	    
        int count =  ps.executeUpdate();
    	
    	if(count > 0)
    	{
    		System.out.println(count+" data updated");
    	}
    	else
    	{
    		System.out.println("ERROR while updating data");
    	}
		
	}

	@Override
	public void delete(String deleteQuery) 
	{
		
	}

	@Override
	public void select() throws SQLException 
	{
		String selectQuery = "select * from usersdb.users";
		Statement stm = con.createStatement();
		ResultSet rs= stm.executeQuery(selectQuery);
		
		while(rs.next() == true)
		{
			int id = rs.getInt(1);
			String name = rs.getString(2);
			System.out.println(id+" "+name);
		}
	}
	
	@Override
	public void selectUser(int id) throws SQLException 
	{
		String selectUserQuery = "select * from usersdb.users where id = "+id;
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(selectUserQuery);
		
		rs.next();
		int uid = rs.getInt(1);
		String name = rs.getString(2);
		System.out.println(uid+" "+name);
		
	}

	@Override
	public void closeDB()throws SQLException 
	{
	  con.close();
	}

	

}
