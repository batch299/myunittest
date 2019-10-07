package com.DBex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB_setup 
{
  public static Connection cn;
  public static Statement st;
  public static ResultSet rs;
   
  public void initialize() throws Exception
  {
	  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
      cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databasename=pubs","sa","123");
      st = cn.createStatement();
  }
  
}
