package admin.employee;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteEmployeeServlet")
public class DeleteEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		boolean isTrue;
		
		isTrue = EmployeeDBUtil.deleteEmployee(id);
		
		if(isTrue == true) {
			RequestDispatcher dispa = request.getRequestDispatcher("EmployeeAdd.jsp");
			dispa.forward(request, response);
		}
		else {
			
			List<Employee> EmployeeDetails = EmployeeDBUtil.getEmployeeDetails(id);
			request.setAttribute("EmployeeDetails", EmployeeDetails);
			
			RequestDispatcher dispa = request.getRequestDispatcher("EmployeeAccount.jsp");
			dispa.forward(request, response);
		}
	}

}
