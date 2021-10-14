<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel = "stylesheet"
   type = "text/css"
   href = "login.css" />
   
</head>

<body>
    <div class="center">
      <h1>Login</h1>
	  
	  <!--Logging form-->
      <form action="log" method="post">
	  
        <div class="txt_field">
          <input type="text" name="uid" placeholder="Enter your username" >
          <span></span>
          <label>Username</label>
        </div>
		
        <div class="txt_field">
          <input type="password" name="pass" placeholder="Enter your password" >
          <span></span>
          <label>Password</label>
        </div>
        <p>
		
	  <label class="radio-inline">
		<input type="radio" style="width:25%" name="gender" value="Admin" required>Admin
		</label>
		
		<label class="radio-inline">
		<input type="radio" style="width:25%" name="gender" value="Employee"  required>Employee
		</label>
		</p>
		<br> 
		
        <input class="ab" type="submit" name="submit" value="Login">
        <div class="signup_link">
         We Work Together 
        </div>
      </form>
    </div>

  </body>
</html>