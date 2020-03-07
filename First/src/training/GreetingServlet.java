package training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/disha")
public class GreetingServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();

		String userName = req.getParameter("un");
		// System.out.println("welcome" +userName);
		// pw.write("<h1>welcome " +userName+"</h1>");
		String password = req.getParameter("pwd");
		String age = req.getParameter("age");
		pw.write("<h1>you are this years old" + age + "</h1>");
		if (userName.equals("disha") && password.equals("singh")) {
			pw.write("<h1>welcome " + userName + "</h1>");

		} else {
			pw.write("<h1>not validd</h1>");

		}

	}
}
