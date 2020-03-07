package com.cts.training;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {

	private void task2() {
		System.out.println("from task2");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service");
		task2();
	}

	@Override
	public void destroy() {
		System.out.println("destroyy");
	}

	public static void main(String[] args) {
		System.out.println("from main method");
	}
}
