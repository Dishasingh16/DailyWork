package com.cts.training;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/RequestHandlerServlet")
public class FirstFilter implements Filter {

	public FirstFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		if (request.getParameter("un").equals("disha")) {
			chain.doFilter(request, response);
		} else {
			response.getWriter().write("<h1>invalid user</h1>");
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("first init");
	}

}
