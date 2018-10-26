
import java.io.*;

import java.sql.*;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class LoginForm
 */
@WebServlet("/Login")
public class LoginForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("hsfj");
// my Branch comments.
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		// request.getRequestDispatcher("header.html").include(request, response);

		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String usertel = request.getParameter("usertel");

		//try {
			//Class.forName("com.mysql.jdbc.Driver");
			//Connection abc = DriverManager.getConnection("jdbc:mysql://localhost:3306/task", "root", "manisha@123"); // task-name
																														// of
																														// the
																														// database

			//PreparedStatement s = abc.prepareStatement("insert into userdetails values(?,?,?,?,?,?)");
			Map<Integer,String> data = new HashMap<Integer,String>();

			data.put(1, firstname);
			data.put(2, lastname);
			data.put(3, username);
			data.put(4, password);
			data.put(5, email);
			data.put(6, usertel);
			
			System.out.println(data.get(1));
			System.out.println(data.get(2));
			System.out.println(data.get(3));
			System.out.println(data.get(4)); 
			System.out.println(data.get(5));
			System.out.println(data.get(6));
			

			//s.executeUpdate();
			//int i = 1;
			/*if (i > 0) {
				out.println("you are registered");
			request.getRequestDispatcher("createAccount.html").include(request, response);
		}
			}
			catch (Exception e) {
			System.out.println(e);
		}

		out.close();	*/
}
	}
