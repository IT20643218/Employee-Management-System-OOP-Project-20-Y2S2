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


@WebServlet("/UpdateKPIServlet")
public class UpdateKPIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//UpdateKPIServlet
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String basicsalary = request.getParameter("basicsalary");
		String monthlytarget = request.getParameter("monthlytarget");
		String targetachivment = request.getParameter("targetachivment");
		String monthlyincentive = request.getParameter("monthlyincentive");
		
		boolean istrue;
		
		istrue=EmployeeDBUtil.updatekpi(username, password, basicsalary, monthlytarget, targetachivment, monthlyincentive);
		
		//validate and checked
		if (istrue == true) {
			List<KPIDetails> kpidetails = EmployeeDBUtil.getKPIDetails(username);
			request.setAttribute("kpidetails", kpidetails);
			
			RequestDispatcher di = request.getRequestDispatcher("EmployeeKPIDashboard.jsp");
			di.forward(request, response);
		}else{
			List<KPIDetails> kpidetails = EmployeeDBUtil.getKPIDetails(username);
			request.setAttribute("kpidetails", kpidetails);
			
			RequestDispatcher di = request.getRequestDispatcher("EmployeeKPIDashboard.jsp");
			di.forward(request, response);
		}
	}

}//End UpdateKPIServlet
