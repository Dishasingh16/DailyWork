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

		System.out.println("do first");

		System.out.println("request pre processing logic");
		chain.doFilter(request, response);
		System.out.println("posttt logic");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("first init");
	}

}
