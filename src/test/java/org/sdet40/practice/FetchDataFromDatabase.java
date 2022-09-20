package org.sdet40.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class FetchDataFromDatabase {
	public static void main(String[] args) throws SQLException {
		Driver dbdriver=new Driver();
		
		DriverManager.registerDriver(dbdriver);
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss", "root", "root");
		
        Statement statement=connection.createStatement();	
         ResultSet result = statement.executeQuery("select * from ssdet40;");
         while(result.next()) {
        	 System.out.println(result.getString("emp_id"));
        	
         }	
	}
}

