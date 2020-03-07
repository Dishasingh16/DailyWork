package com.cts.training;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TargetServlet")
public class TargetServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("from doget Target servlet");
		String customerName = (String) req.getAttribute("CustomerName");
		Integer term = (Integer) req.getAttribute("Termrequired");
		Integer Premium = (Integer) req.getAttribute("premium");
		double sum = (Premium * term) + (Premium * term) * 20 / 100;
		System.out.println("Amount after maturity== " + sum);
		
		
		PrintWriter pw =resp.getWriter();
		pw.write("<h1>amount after maturity &nbsp;&nbsp;"+sum+"</h1>");
	}
}
