package master;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet_to_servlet_2
 */
public class servlet_to_servlet_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// RECEIVING FROM servlet_to_servlet_1
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("nm");
		String roll = request.getParameter("pass");
		out.println("name : " + name);
		out.println("<p>");
		out.println("name : " + roll);
		out.println("<p>");
	}

}
