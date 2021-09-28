package admin.employee;

public class Employee {
	private int id;
	private String name;
	private String address;
	private String phone;
	private String email;
	private String designation;
	private String birthday;
	private String username;
	private String password;
	
	public Employee(int id, String name, String address ,String phone, String email, String designation,String birthday,String username,
			String password) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.designation = designation;
		this.birthday = birthday;
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getDesignation() {
		return designation;
	}

	public String getBirthday() {
		return birthday;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	
	
}//end class
