package com.jspiders.jdbc.dao;

import java.sql.SQLException;

public interface Dao 
{
   public void initDB()throws SQLException;
   
   public void insert(String insertQuery);
   public void update(String updateQuery);
   public void delete(String deleteQuery);
   public void select(String selectQuery);
   
   public void closeDB()throws SQLException;
}
