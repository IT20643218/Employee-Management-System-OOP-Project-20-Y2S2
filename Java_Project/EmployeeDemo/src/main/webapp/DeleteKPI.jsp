<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
  <a href="AddKPI.jsp">Add EMP KPI</a>
  <a href="login.jsp">Exit</a>
</div>


<%
String username = request.getParameter("username");
String password = request.getParameter("password");
String basicsalary = request.getParameter("basicsalary");
String monthlytarget = request.getParameter("monthlytarget");
String targetachivment = request.getParameter("targetachivment");
String monthlyincentive = request.getParameter("monthlyincentive");
%>

<form action="delete_KPI" method="post">	
<div class="container">
<h1><center>Delete KPI Details</center></h1>

<lable for="ID"><br>ID:</br></lable></td>
<input type="text" name ="username" value="<%=username %>" readonly>

<lable for="Name"><br>Name:</br></lable>
<input type="text" name="password" value="<%=password %>" readonly>

<lable for="basicSalary"><br>Basic Salary:</br></lable>
<input type="text" name="basicsalary" value="<%=basicsalary %>" readonly>

<lable for="MonthlyTarget"><br>Monthly Target:</br></lable>
<input type="text" name="monthlytarget" value="<%=monthlytarget %>" readonly>

<lable for="MonthlytargetAchievement>"><br>Monthly Target Achievement:</br></lable>
<input type="text" name="targetachivment" value="<%=targetachivment %>" readonly>

<lable for="MonthlyIncentive"><br>Monthly Incentive:</br></lable>
<input type="text" name="monthlyincentive" value="<%=monthlyincentive %>" readonly>
<hr>
<button class="LeaveRequestButton" type="submit" name="submit" value="Delete KPI">Delete KPI</button>
</div>
</form>

</body>
</html>