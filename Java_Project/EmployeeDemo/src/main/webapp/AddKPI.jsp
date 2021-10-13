<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 
   <link rel = "stylesheet"
   type = "text/css"
   href = "Lrequest.css" />
   
   <link rel = "stylesheet"
   type = "text/css"
   href = "Template.css" />
   
   <link rel = "stylesheet"
   type = "text/css"
   href = "profile.css" />
   

  
   
</head>
<body>

<div class="sidenav">
  <a href="LoginKPIDashboard.jsp">KPI DashBoard</a>
  <a href="UpdateKPI.jsp">Update EMP KPI</a>
  <a href="DeleteKPI.jsp">Delete EMP KPI</a>
  <a href="login.jsp">Exit</a>
</div>

<form action="Add" method="post">
<div class="container">
<h1>  <center>ADD KPI Details</center> </h1>

<lable for="ID"><br>ID:</br></lable>
<input type="text" name ="username" value="">

<lable for="Name"><br>Name:</br></lable>
<input type="text" name="password" value="">


<lable for="BasicSalary"><br>Basic Salary:</br></lable>
<input type="text" name="basicsalary" value="">


<lable for="MonthlyTarget"><br>Monthly Target:</br></lable>
<input type="text" name="monthlytarget" value="">


<lable for="MonthlyTargetAch"><br>Monthly Target Achievement:</br></lable>
<input type="text" name="targetachivment" value="">

<lable for="MonthlyEmployeeIncentive"><br>Monthly Employee Incentive:</br></lable>
<input type="text" name="monthlyincentive" value="">
<hr>
<button class="LeaveRequestButton" type="submit" name="submit" value="Add EMP KPI">Add EMP KPI</button>
</div>
</form>
</body>
</html>