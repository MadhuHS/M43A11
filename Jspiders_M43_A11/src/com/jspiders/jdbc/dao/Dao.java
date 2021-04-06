package com.jspiders.jdbc.dao;

import java.sql.SQLException;

public interface Dao 
{
   public void initDB()throws SQLException;
   
   public void insert(int id,String name)throws SQLException ;
   public void update(int id,String name)throws SQLException;
   public void delete(String deleteQuery);
   public void select()throws SQLException ;
   public void selectUser(int id)throws SQLException ;
   
   public void closeDB()throws SQLException;
}
