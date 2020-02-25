package com.cts.training.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cts.training.bean.Employee;

public  class EmployeeDAOImpl implements EmployeeDao {

	Connection conn = getConnection();
	PreparedStatement ps = null;
	Scanner sc = new Scanner(System.in);
	
	
	
	@Override
	public boolean updateEmployee(Employee emp) {
		String sql = "update employee set name = ? where id=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, emp.getName());
			ps.setInt(2, emp.getId());
			int rs = ps.executeUpdate();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean deleteEmployee(Employee emp1) {
		String sql = "delete from employee  where id=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, emp1.getId());
			int rs = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return false;
	}

	@Override
	public Employee getEmployeeById(int id) {
		String sql = "select* from employee where id=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			Employee emp3 = new Employee();
			while (rs.next()) {

				emp3.setId(rs.getInt("id"));
				emp3.setName(rs.getString("name"));
				emp3.setAge(rs.getInt("age"));
				emp3.setAddress(rs.getString("address"));
				emp3.setPhone(rs.getLong("phone"));

			}
			return emp3;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		String sql = "select*from employee";
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setAge(rs.getInt("age"));
				emp.setAddress(rs.getString("address"));
				emp.setPhone(rs.getLong("phone"));
				employees.add(emp);

			}
			return employees;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	private Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/ctspune";
			conn = DriverManager.getConnection(url, "root", "ROOT");
			return conn;
		} catch (Exception e) {

			e.printStackTrace();
			return null;
		}

	}






	
	

}