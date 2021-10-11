package admin.employee.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.employee.Util.EmployeeDBUtil;


@WebServlet("/AddKPIServlet")
public class AddKPIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String username = request.getParameter("uid");
			String password = request.getParameter("pass");
			String basicsalary = request.getParameter("basicsalary");
			String monthlytarget = request.getParameter("monthlytarget");
			String targetachivement = request.getParameter("targetachivement");
			String monthlyincentive = request.getParameter("monthlyincentive");
			
			boolean ATrue;
			
			ATrue = EmployeeDBUtil.addkpi(username, password, basicsalary, monthlytarget, targetachivement, monthlyincentive);
			
			if(ATrue==true) {
				RequestDispatcher di = request.getRequestDispatcher("success.jsp");
				di.forward(request, response);
			}else {
				
				RequestDispatcher di2 = request.getRequestDispatcher("unsuccess.jsp");
				di2.forward(request, response);
			}
		}

}
