package com.cts.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SourceServlet")
public class SourceServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("from doget source servlet");
		String custName = req.getParameter("customerName");
		int term = Integer.parseInt(req.getParameter("TermRequired"));
		int premiumamount = Integer.parseInt(req.getParameter("Premium"));

		req.setAttribute("CustomerName", custName);
		req.setAttribute("Termrequired", term);
		req.setAttribute("premium", premiumamount);
		System.out.println("your paid amount===" + (premiumamount * term));

		PrintWriter pw = resp.getWriter();
		pw.write("<h1>ur paid amount &nbsp;&nbsp;" + (premiumamount * term) + "</h1>");
		resp.sendRedirect("https://www.amazon.in/");
//		RequestDispatcher dispatcher = req.getRequestDispatcher("http://localhost:8080/Second/Form.html");
//		dispatcher.include(req, resp);
	}
}
