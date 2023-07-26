package com.Aryan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class connection_factory {
   private static Connection connection= null;
  private connection_factory(){

   }
   public static Connection getConnection(){
      if(connection ==null){
         ResourceBundle resourceBundle=ResourceBundle.getBundle("dbconfig");
         String url=resourceBundle.getString("url");
         String username=resourceBundle.getString("username");
         String password=resourceBundle.getString("password");

         try {
            connection= DriverManager.getConnection(url,username,password);
         }catch (SQLException e){
            throw new RuntimeException(e);
         }
      }
      return connection;
   }
}
class generate{
   Connection f1= connection_factory.getConnection();
}
