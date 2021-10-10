package admin.employee.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.employee.KPIDetails;
import admin.employee.Util.EmployeeDBUtil;


@WebServlet("/LoginKPIServlet")
public class LoginKPIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String username = request.getParameter("uid"); 
		String password = request.getParameter("pass");
				
		
		try {
			List<KPIDetails> kpidetails = EmployeeDBUtil.validate(username, password);
			request.setAttribute("kpidetails", kpidetails);
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("EmployeeKPIDashboard.jsp"); 
		dis.forward(request, response);
	}

}
