package com.cts.training;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Form extends HttpServlet {
	String user, password, url, driver;
	Connection con;
	ServletContext context;
	@Override
	public void init(ServletConfig config) throws ServletException {
		context = config.getServletContext();
		user = context.getInitParameter("userName");
		password = context.getInitParameter("password");
		url = context.getInitParameter("url");
		driver = context.getInitParameter("driver");

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			System.out.println(con);
			System.out.println(config+"from cs1");
			System.out.println(context+"from cs1");
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doGet(req, resp);
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		String emp_id = req.getParameter("id");
		String emp_name = req.getParameter("empname");
		String dept_id = req.getParameter("deptid");
		String emp_salary = req.getParameter("salary");
		String insert_query = "insert into details values(?,?,?,?)";
		try {
			PreparedStatement ps;
			ps = con.prepareStatement(insert_query);
			ps.setString(2, emp_id);
			ps.setString(1, emp_name);
			ps.setString(3, dept_id);
			ps.setString(4, emp_salary);
			int insert_result = ps.executeUpdate();
			if (insert_result > 0) {
				pw.write("<h1>Employee details saved succesfully</h1>");
			} else {
				pw.write("<h1>Something went wrong</h1>");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
