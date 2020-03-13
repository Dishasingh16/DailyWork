package com.cts;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 
 * @author admin
 *
 */

@WebServlet("/CookieHandler")
public class CookieHandler extends HttpServlet {
	/**
	 * para i----is an emp id
	 */
	
    
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	String CreditCardno=req.getParameter("CreditCardno");
	String password=req.getParameter("pwd");
	Cookie cookie=new Cookie(CreditCardno,password);
	cookie.setMaxAge(24);
	resp.addCookie(cookie);
	RequestDispatcher rd=req.getRequestDispatcher("/CookieHandler2");
	rd.forward(req, resp);
	}

}
