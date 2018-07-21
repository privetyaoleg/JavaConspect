package com.eis.conspect.java.db.jdbc;

import java.sql.*;
import java.util.List;

public class ProcessingRequest {

	public static void simpleStatement(Connection con, String expression) throws SQLException {
		Statement statement = con.createStatement();

	    ResultSet resultSet = statement.executeQuery(expression);
	    while(resultSet.next()) {
	    	System.out.println(resultSet.getInt("id"));
	    	System.out.println(resultSet.getString("name"));
	    	System.out.println(resultSet.getString(4));
	    	System.out.println("_____________________");   
	    	
	    }
	}
	
	public static void getInfoById(Connection con, String id) throws SQLException {
	    
	    PreparedStatement preStat = con.prepareStatement("SELECT * FROM test_table WHERE id = ?");
	    preStat.setString(1, id);
	//    preStat.setString(2, userName);
	    
	    ResultSet resultSet = preStat.executeQuery();
	    
	    while(resultSet.next()) {
	    	System.out.println("id:" + resultSet.getInt("id"));
	    	System.out.println("name: " + resultSet.getString("name"));
	    	System.out.println("phone: " + resultSet.getString(4));
	    	System.out.println("_____________________");  
	    }
	}
}
