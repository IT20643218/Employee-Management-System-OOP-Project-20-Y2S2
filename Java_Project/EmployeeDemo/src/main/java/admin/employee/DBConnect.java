package admin.employee;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	//DB connection
	private static String url ="jdbc:mysql://localhost:3306/employee";
	private static String username = "root";
	private static String password = "1234";
	private static Connection con;

	public static Connection getConnection() {
		
		//Exception Handling
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, username, password);
		}
		catch (Exception e ) {
			System.out.println("Database Connection is not success!!!!");
		}
		
		return con;
	}
}//End DB connect class
