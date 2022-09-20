package CRM.generic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility {
	 Connection connection;
	 
	public List<String> getDataFromDatatbase(String query, String columnName) throws SQLException{
		
		Statement statement=connection.createStatement();
		ResultSet result=statement.executeQuery(query);
		List<String> list=new ArrayList<>();
		while(result.next()) {
			list.add(result.getString(columnName));
		}
		
		return list;
		
	}
public void openDBConnection(String dburl, String dbUserName, String dbPassword) throws SQLException{
	Driver dbdriver=new Driver();
	DriverManager.registerDriver(dbdriver);
	
}
public void closeDB() throws SQLException{
	connection.close();
}

}
