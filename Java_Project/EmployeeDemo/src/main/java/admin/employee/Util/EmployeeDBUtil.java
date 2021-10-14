package admin.employee.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import admin.employee.DBConnect;
import admin.employee.Employee;
import admin.employee.KPIDetails;



public class EmployeeDBUtil {
	
	//link connection (DBConnect class)
	private static Connection con =null;
	private static Statement state=null;
	private static ResultSet results=null;
	private static boolean isSuccess;
	private static ResultSet rs;
	
	public static boolean validate (String username, String password,String usertype) {
		
		//validate database
		//Exception Handling
		try {
			//create database connection
			con = DBConnect.getConnection();
			state = con.createStatement();
			
			//sql quarry
			String sql = "select * from employee where username='"+username+"'and password='"+password+"'and usertype='"+usertype+"'";
			
			//run quarry
			results =state.executeQuery(sql);
			
			//check connection
			if (results.next()){
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}//end validate 
	
	//Data call to interface
	public static List<Employee> getEmployee(String username){
		
		ArrayList<Employee> emp = new ArrayList<>();
		
		//Exception Handling
		try {
			//create database connection
			con = DBConnect.getConnection();
			state = con.createStatement();
			
			String sql = "select * from employee where username='"+username+"'";
			rs =state.executeQuery(sql);
			
			while(rs.next()) {
				int id = results.getInt(1);
				String name = results.getString(2);
				String address = results.getString(3);
				String phone = results.getString(4);
				String email = results.getString(5);
				String designation = results.getString(6);
				String birthday = results.getString(7); 
				String usernameU = results.getString(8);
				String passwordU = results.getString(9);
				String usertype = results.getString(10);
				
				Employee e = new Employee(id,name,address,phone,email,designation,birthday,usernameU,passwordU,usertype);
				emp.add(e);
			}
		}
		catch(Exception e){
			
		}
		return emp;
	}//end class


	//insert customer to database
	public static boolean insertemployee(String name,String address,String phone,String email,String designation ,String birthday,String username,String password,String usertype ) {
		
		boolean isSuccess = false;//condition
				
				//Exception Handling
				try {
					
					//create database connection
					con = DBConnect.getConnection();
					state =con.createStatement();
					
					String sql = "insert into employee values (0,'"+name+"','"+address+"','"+phone+"','"+email+"','"+designation+"','"+birthday+"','"+username+"','"+password+"','"+usertype+"')";
					int rs = state.executeUpdate(sql);
					
					//check and validate connection
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
			String sql ="update employee set name='"+name+"',address='"+address+"',phone='"+phone+"',email='"+email+"',designation='"+designation+"',birthday='"+birthday+"',username='"+username+"',password='"+password+"'"
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
	}//end update method
	
	
	//data retrieve method
	public static List<Employee> getEmployeeDetails(String id){
		ArrayList<Employee> emp = new ArrayList<>();//array list
		
		//convert String ID to integer ID -Helper class
		int convertedID = Integer.parseInt(id);
		
		//Exception Handling
		try {
			//database connection
			con = DBConnect.getConnection();
			state = con.createStatement();
			
			//Sql quarry
			String sql = "select * from employee where id = '"+convertedID+"'";
			rs =state.executeQuery(sql);
			
			while(rs.next()) {
				int id1 = rs.getInt(1);
				String name = rs.getString(2);
				String address =rs.getString(3);
				String phone = rs.getString(4);
				String email = rs.getString(5);
				String designation = rs.getString(6);
				String birthday = rs.getString(7);
				String username = rs.getString(8);
				String password = rs.getString(9);
				String usertype = rs.getString(10);
				
				Employee e = new Employee(id1,name,address,phone,email,designation,birthday,username,password,usertype);
				emp.add(e);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return emp;
	}//end data retrieve class
	
	//delete employee
	public static boolean DeleteEmployee(String id) {
		
		//convert String ID to integer ID - Helper class
		int convertID = Integer.parseInt(id);
		
		//Exception Handling
		try {
			//database connection
			con = DBConnect.getConnection();
			state = con.createStatement();
			
			//Sql Quarry
			String sql = "delete from employee where id ='"+convertID+"'";
			int rs = state.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}//end delete class
	
	
	//Employee KPI
	public static List<KPIDetails> validate(String userName,String passWord){
				
		ArrayList<KPIDetails> kpi = new ArrayList<>();
				
				//Exception Handling
				try {
					//database connection
					con = DBConnect.getConnection();
					state = con.createStatement();
					
					//Sql Quarry
					String sql ="select * from empkpi where username='"+userName+"' and password='"+passWord+"'";
					ResultSet rs = state.executeQuery(sql);
					
					//Calling data from database
					if(rs.next()) {
						String username = rs.getString(1);
						String password = rs.getString(2);
						String basicsalary = rs.getString(3);
						String monthlytarget = rs.getString(4);
						String targetachivment = rs.getString(5);
						String monthlyincentive = rs.getString(6);
						
						KPIDetails k = new KPIDetails(username,password,basicsalary,monthlytarget,targetachivment,monthlyincentive);
						kpi.add(k);
					}
				}catch(Exception e) {
					
					e.printStackTrace();
				}
				
				return kpi;
	}//end KPI class
	
	//Add employee KPI
	public static boolean addkpi(String username,String password,String basicsalary,String monthlytarget,String targetachivment,String monthlyincentive) {
			
			//check condition
			boolean Success = false;
			
					//Exception Handling					
					try {
						//Database connection
						con= DBConnect.getConnection();
						state=con.createStatement();
						
						//Sql Quarry
						String sql = "insert into empkpi values ('"+username+"','"+password+"','"+basicsalary+"','"+monthlytarget+"','"+targetachivment+"','"+monthlyincentive+"')";
						int rs = state.executeUpdate(sql);
						
						if(rs > 0) {
							Success =true;
						}else {
							Success =false;
						}
						
					}
					catch(Exception e) {
						e.printStackTrace();
					}
			
			return Success;
		}//end class
	
	//Update KPI
	public static boolean updatekpi(String username,String password,String basicsalary,String monthlytarget,String targetachivment,String monthlyincentive) {
		
		//Exception Handling
		try {
			//database Connection
			con=DBConnect.getConnection();
			state = con.createStatement();
			
			//sql quarry
			String sql ="update empkpi set password='"+password+"',basicsalary='"+basicsalary+"',monthlytarget='"+monthlytarget+"',targetachivment='"+targetachivment+"',monthlyincentive='"+monthlyincentive+"'"
					+"where username ='"+username+"'"; 
			
			int ab = state.executeUpdate(sql);
			
			if (ab >0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}
		return isSuccess;
	}//end class
	
	//KPI data retrieve method
	public static List<KPIDetails> getKPIDetails(String username){
		
		ArrayList<KPIDetails> kp = new ArrayList<>();
		
		//Exception Handling
		try {
			//database connection
			con = DBConnect.getConnection();
			state =con.createStatement();
			
			//sql quarry
			String sql = "select * from empkpi where username='"+username+"'";
			rs = state.executeQuery(sql);
			
			while(rs.next()) {
				String username1 = rs.getString(1);
				String password = rs.getString(2);
				String basicsalary = rs.getString(3);
				String monthlytarget = rs.getString(4);
				String targetachivment = rs.getString(5);
				String monthlyincentive = rs.getString(6);
				
				KPIDetails k = new KPIDetails(username1,password,basicsalary,monthlytarget,targetachivment,monthlyincentive);
				kp.add(k);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return kp;
	}//end class
	
	//Delete KPI Details
	public static boolean DeleteKPI(String username){
	
		//int convert = Integer.parseInt(username);
		
		//Exception Handling
		try {
			//Database connection
			con = DBConnect.getConnection();
			state = con.createStatement();
			
			//sql quarry
			String sql = "delete from empkpi where username='"+username+"'";
			int rs = state.executeUpdate(sql);
			
			if (rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			
		}
		return isSuccess;
	}//end class
	
}//end EmployeeDBUtill class
