package admin.employee;

//KPIDetails class -Using Encapsulation OOP Concept
public class KPIDetails {
	private String username;
	private String password;
	private String basicsalary;
	private String monthlytarget;
	private String targetachivment;
	private String monthlyincentive;
	
	//full args constructor
	public KPIDetails(String username, String password, String basicsalary, String monthlytarget,
			String targetachivment,String monthlyincentive) {
		
		this.username = username;
		this.password = password;
		this.basicsalary = basicsalary;
		this.monthlytarget = monthlytarget;
		this.targetachivment = targetachivment;
		this.monthlyincentive = monthlyincentive;
	}

	//Setters
	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getBasicsalary() {
		return basicsalary;
	}

	public String getMonthlytarget() {
		return monthlytarget;
	}

	public String getTargetachivment() {
		return targetachivment;
	}

	public String getMonthlyincentive() {
		return monthlyincentive;
	}

}
