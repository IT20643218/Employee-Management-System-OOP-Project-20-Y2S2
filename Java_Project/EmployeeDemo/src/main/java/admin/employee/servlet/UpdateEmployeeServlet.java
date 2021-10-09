package admin.employee.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.employee.Employee;
import admin.employee.Util.EmployeeDBUtil;

@WebServlet("/UpdateEmployeeServlet")
public class UpdateEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String phonenumber = request.getParameter("phone");
		String email = request.getParameter("email");
		String designation = request.getParameter("designation");
		String birthday = request.getParameter("birthday");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		boolean isTrue;
		
		isTrue = EmployeeDBUtil.updatecustomer(id, name, address, phonenumber, email, designation, birthday, username, password);
		
		if(isTrue ==true) {
			List<Employee> EmployeeDetails = EmployeeDBUtil.getEmployeeDetails(id);
			request.setAttribute("EmployeeDetails" ,EmployeeDetails);
			
			RequestDispatcher di = request.getRequestDispatcher("EmployeeAccount.jsp");
			di.forward(request, response);
		}
		else {
			List<Employee> EmployeeDetails = EmployeeDBUtil.getEmployeeDetails(id);
			request.setAttribute("EmployeeDetails" ,EmployeeDetails);
			
			RequestDispatcher di2 = request.getRequestDispatcher("EmployeeAccount.jsp");
			di2.forward(request, response);
		}
	}

}
