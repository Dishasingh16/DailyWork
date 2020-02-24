package com.cts.training.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBcdemo2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		//System.out.println("enter id ");
		//int id = Integer.parseInt(br.readLine());
		//System.out.println("enter name ");
		//String name = (br.readLine());
		//System.out.println("enter address ");
		//String addr = (br.readLine());
		//System.out.println("enter age ");
		//int age = Integer.parseInt(br.readLine());
		//System.out.println("enter phone ");
		//long phone = Long.parseLong(br.readLine());
		
		
		Class.forName("com.mysql.jdbc.Driver");
		String url= "jdbc:mysql://localhost:3306/ctspune";
		Connection conn = DriverManager.getConnection(url,"root","ROOT");
		//String query ="insert into employee values(?,?,?,?,?)";
		//String query ="delete from employee  where id=?";
		String query ="select * from employee";
		PreparedStatement ps=conn.prepareStatement(query);
		ResultSet rs = ps.executeQuery(query);
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String address = rs.getString(3);
			int age = rs.getInt(4);
			long phone=rs.getLong(5);
			System.out.println(id+" :"+name+" : "+address+" : "+age+" :"+phone);
		
		/*ps.setInt(1, id);
		ps.setString(2,name);
		ps.setString(3, addr);
		ps.setInt(4, age);
		ps.setLong(5, phone);*/
	
		//ps.setString(1, name);
		//ps.setInt(1, id);
		//ps.executeQuery(query);
		// result =ps.executeQuery(query);
		
		/*if(result>0) {
			System.out.println(" great");}
		else {
			System.out.println("tryy again");
		}*/
		}
	
	
	}}
	

