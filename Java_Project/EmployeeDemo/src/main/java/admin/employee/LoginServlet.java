package admin.employee;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//catch u_name and password from login page
		String username = request.getParameter("id");
		String password = request.getParameter("pass");
		
		try {
			//call employeeDButil validate
			List<Employee> EmployeeDetails = EmployeeDBUtil.validate(username, password);
			request.setAttribute("EmployeeDetails", EmployeeDetails);	
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("EmployeeAccount.jsp"); 
		dis.forward(request, response);
	}

}
