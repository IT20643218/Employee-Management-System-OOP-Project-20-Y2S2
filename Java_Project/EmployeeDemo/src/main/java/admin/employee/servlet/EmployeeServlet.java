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


@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id =request.getParameter("id");
		String name =request.getParameter("name");
		String basicsalary =request.getParameter("basicsalary");
		String monthlytarget =request.getParameter("monthlytarget");
		String targetachivement =request.getParameter("targetachivement");
		
		boolean ATrue;
		
		ATrue = EmployeeDBUtil.addemployee(0, name, basicsalary, monthlytarget, targetachivement);
	
		if(ATrue==true) {
			RequestDispatcher di = request.getRequestDispatcher("EmployeeAccount.jsp");
			di.forward(request, response);
		}else {
			
			RequestDispatcher di2 = request.getRequestDispatcher("unsuccess.jsp");
			di2.forward(request, response);
		}
	}
}
	


