package training;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dishaa")
public  class MyServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("FROM INIT-- IT GETS CALLED ONLY ONCE ALWAYS FIRST");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("FROM SERVICE IT GETS CALLED MULTIPLE TIMES ");
	}

	@Override
	public void destroy() {
		System.out.println("FROM DESTROY IT GETS CALLED ONLY ONCE ALWAYS LAST");

	}
}
