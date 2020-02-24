package com.cts.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class NewDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		String url ="jdbc:mysql://localhost:3306/ctspune";
		Connection conn = DriverManager.getConnection(url, "root", "ROOT");
		System.out.println(conn.getClass().getName());
		Statement stmt=conn.createStatement();
		String query="insert into emp1 values(1,'abhi','pune',22,1234567),(2,'avi','delhi',24,9876543),(3,'ashi','thane',23,456789)";
		//String query="select*from emp1";
		//stmt.executeQuery(query);
		int result = stmt.executeUpdate(query);
		
		if(result>0) {
			System.out.println("great");}
			else {
				System.out.println("nah dude");}
			}
		
	}

