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


@WebServlet("/DeleteKPIServlet")
public class DeleteKPIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String username = request.getParameter("username");
			
			boolean isTrue;
			
			isTrue = EmployeeDBUtil.DeleteKPI(username);
			
			if(isTrue == true) {
				RequestDispatcher disp = request.getRequestDispatcher("AddKPI.jsp");
				disp.forward(request, response);
			}else {
				List<KPIDetails> kpidetails = EmployeeDBUtil.getKPIDetails(username);
				request.setAttribute("kpidetails", kpidetails);
				
				RequestDispatcher disp = request.getRequestDispatcher("EmployeeKPIDashboard.jsp");
				disp.forward(request, response);
			}

	}

}
