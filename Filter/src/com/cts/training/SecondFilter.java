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
public class SecondFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("from dofilter of 2nd filter");
		System.out.println("request pre processing logic");
		chain.doFilter(request, response);
		System.out.println("posttt logic");
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("from init of second filter");
	}

}
