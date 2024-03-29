package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dto.Users;

public class UserDAO
{
  private String jdbcURL;
  private String jdbcUsername;
  private String jdbcPassword;
  private Connection jdbcConnection;
  
  public UserDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) 
  {
      this.jdbcURL = jdbcURL;
      this.jdbcUsername = jdbcUsername;
      this.jdbcPassword = jdbcPassword;
  }
  
  public void connect() throws SQLException 
  {
      if (jdbcConnection == null || jdbcConnection.isClosed()) 
      {
          try 
          {
              Class.forName("com.mysql.jdbc.Driver");
          } 
          catch (ClassNotFoundException e) 
          {
              throw new SQLException(e);
          }
          jdbcConnection = DriverManager.getConnection(
                                      jdbcURL, jdbcUsername, jdbcPassword);
      }
  }
  
  protected void disconnect() throws SQLException 
  {
      if (jdbcConnection != null && !jdbcConnection.isClosed()) 
      {
          jdbcConnection.close();
      }
  }
  
  