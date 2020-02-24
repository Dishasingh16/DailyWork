package com.cts.training.jdbc;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		//1.load the db driver
			//1.1 by using forName() method
			//1.2 by creating reference of the driver
		
			Class.forName("com.mysql.jdbc.Driver");
		
			//Driver driver = new com.mysql.jdbc.Driver();
		
		//2. Establish the connection
			String url= "jdbc:mysql://localhost:3306/ctspune";
			Connection conn = DriverManager.getConnection(url, "root", "ROOT");
			System.out.println(conn.getClass().getName());
			Statement stmt = conn.createStatement();
			//execute sql queries
			//String query="insert into employee values(2,'Isha','pune',40,8870955529),(3,'trisha','chennai',23,9990955432)";
			//String query ="update employee set address ='thane' where id=2";
			//String query ="delete from employee  where id=2";
			String query = "select*from employee";
			stmt.executeQuery(query);
			ResultSet rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				int age = rs.getInt(4);
				long phone=rs.getLong(5);
				System.out.println(id+" :"+name+" : "+address+" : "+age+" :"+phone);
				//System.out.println(rs.getInt("id")+" : " +rs.getString("name")+" : " +rs.getInt(4)+);
			
			}
			
			
			//stmt.executeUpdate(query);
			//stmt.executedelete(query);
			//int result = stmt.executeUpdate(query);
			//if(result>0) {
				//System.out.println("succesfully inserted");
			//}else {
				//System.out.println("u messed up");}
				
			
				}
			
		
		
		
	}


