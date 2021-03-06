package admin.employee.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.employee.Employee;
import admin.employee.Util.EmployeeDBUtil;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Display java script error
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//catch u_name and password from login page
		String username = request.getParameter("uid");
		String password = request.getParameter("pass");
		String usertype = request.getParameter("gender");
		boolean isTrue;
		
		//Catch DB details from Model class
		isTrue = EmployeeDBUtil.validate(username, password,usertype);
		
		
		if(isTrue == true) {
			List<Employee> EmployeeDetails = EmployeeDBUtil.getEmployee(username);
			request.setAttribute("EmployeeDetails", EmployeeDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("EmployeeAccount.jsp"); 
			dis.forward(request, response);
						
		}else {	
			out.println("<script type ='text/javascript'>");
			out.println("alert('Your Username or Password is incorrect');");
			out.println("location='login.jsp'");
			out.println("</script>");
		}
		
	}
}
