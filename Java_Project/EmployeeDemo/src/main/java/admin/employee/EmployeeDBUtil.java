package admin.employee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class EmployeeDBUtil {
	
	//link connection (DBConnect class)
	private static Connection con =null;
	private static Statement state=null;
	private static ResultSet results=null;
	private static boolean isSuccess;

	public static List<Employee> validate(String userName, String password){
		
		ArrayList<Employee> emp = new ArrayList<>();
						
		//validate database
		try {
			//create database connection			
			con = DBConnect.getConnection();
			state = con.createStatement();
			
			//sql quarry
			String sql = "select * from employee where username='"+userName+"'and password='"+password+"'";
			//run quarry
			results =state.executeQuery(sql);
			
			if (results.next()){
				int id = results.getInt(1);
				String name = results.getString(2);
				String address = results.getString(3);
				String phone = results.getString(4);
				String email = results.getString(5);
				String designation = results.getString(6);
				String birthday = results.getString(7); 
				String usernameU = results.getString(8);
				String passwordU = results.getString(9);
				
				Employee e = new Employee(id,name,address,phone,email,designation,birthday,usernameU,passwordU);
				emp.add(e);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		return emp;
		
	}
	
	//insert customer
	public static boolean insertemployee(String name,String address,String phone,String email,String designation ,String birthday,String username,String password ) {
		
		boolean isSuccess = false;
						
				try {
					
					//create database connection
					con = DBConnect.getConnection();
					state =con.createStatement();
					
					String sql = "insert into employee values (0,'"+name+"','"+address+"','"+phone+"','"+email+"','"+designation+"','"+birthday+"','"+username+"','"+password+"')";
					int rs = state.executeUpdate(sql);
					
					if(rs > 0) {
						isSuccess =true;
					}else {
						isSuccess =false;
					}
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
		
		return isSuccess;
	}
	
	//update customer
	public static boolean updatecustomer(String id,String name,String address,String phone,String email,String designation,
			String birthday,String username,String password) {
		
		try {
			//create database connection
			con = DBConnect.getConnection();
			state = con.createStatement();
			//Sql quary
			String sql ="update employee set name='"+name+"',address='"+address+"',phone='"+phone+"',email='"+email+"',designation='"+designation+"',username='"+username+"',password='"+password+"'"
					+"where id ='"+id+"'"; 
			//execute quary
			int rs = state.executeUpdate(sql);
			
			if (rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return isSuccess;
	}//end updatecustomer method
	
}//end EmployeeDBUtill class
