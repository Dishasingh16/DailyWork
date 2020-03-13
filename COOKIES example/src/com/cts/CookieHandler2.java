package com.cts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieHandler2")
public class CookieHandler2 extends HttpServlet {
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		Cookie cookie[]=req.getCookies();
		if(cookie!=null) {
			for(Cookie cookie2 : cookie) {
				out.write("<h1>"+cookie2.getName()+";&nbsp;&nbsp;&nbsp;" +cookie2.getValue()+"<h1>");
			}
		}else {
			out.write("<h1>no cookies are associated with current session</h1>");
		}
	}

}
