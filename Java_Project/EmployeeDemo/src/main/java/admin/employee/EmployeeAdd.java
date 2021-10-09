package admin.employee;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.employee.Util.EmployeeDBUtil;

@WebServlet("/EmployeeAdd")
public class EmployeeAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name =request.getParameter("name");
		String address =request.getParameter("address");
		String phone =request.getParameter("phone");
		String email =request.getParameter("email");
		String designation =request.getParameter("designation");
		String birthday =request.getParameter("birthday");
		String username =request.getParameter("username");
		String password =request.getParameter("password");
		
		boolean isTrue;
		isTrue = EmployeeDBUtil.insertemployee(name, address, phone, email, designation, birthday, username, password);
		
		if (isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
			
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
			
		}
	}

}
