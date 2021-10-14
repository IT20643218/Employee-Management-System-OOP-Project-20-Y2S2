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
      <h1>Login <br>KPI Dash Board</h1>
	  
      <form action="KPI01" method="post">
	  
        <div class="txt_field">
          <input type="text" name="uid" placeholder="Enter EMP ID" >
          <span></span>
          <label>Employee ID</label>
        </div>
		
        <div class="txt_field">
          <input type="text" name="pass" placeholder="Enter EMP Name" >
          <span></span>
          <label>Employee Name</label>
        </div>
        <p>
        <input class="ab" type="submit" name="submit" value="Submit">
        <div class="signup_link">
         We Work Together 
        </div>
      </form>
    </div>

  </body>

</html>