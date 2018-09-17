package master;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet_to_servlet_1
 */
public class servlet_to_servlet_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String password = request.getParameter("pass");
		if(password.equalsIgnoreCase("admin")) {
			RequestDispatcher rd = request.getRequestDispatcher("servlet_to_servlet_2"); //sending
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("NewFile1_for_servlet_2_servlet.html");
			rd.forward(request, response);
		}
	}

}
