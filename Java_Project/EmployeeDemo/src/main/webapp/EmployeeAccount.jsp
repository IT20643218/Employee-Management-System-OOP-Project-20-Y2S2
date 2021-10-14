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
   href = "profile.css" />
   
<link rel = "stylesheet"
   type = "text/css"
   href = "Template.css" />
      
   
</head>
<h1> <center> EMP Management System </center></h1>

<body>
<img  src="im1.jpeg">

	<table class="center">
	
<c:forEach var="emp" items ="${EmployeeDetails}">

<c:set var="id" value="${emp.id}"/>
<c:set var="name" value="${emp.name}"/>
<c:set var="address" value="${emp.address}"/>
<c:set var="phone" value="${emp.phone}"/>
<c:set var="email" value="${emp.email}"/>
<c:set var="designation" value="${emp.designation}"/>
<c:set var="birthday" value="${emp.birthday}"/>
<c:set var="username" value="${emp.username}"/>
<c:set var="password" value="${emp.password}"/>

	
<tr>
<td>Employee ID :</td>
<td>${emp.id}</td>
</tr>

<tr>
<td>Employee Name :</td>
<td>${emp.name}</td>
</tr>

<tr>
<td>Employee Address :</td>
<td>${emp.address}</td>
</tr>

<tr>
<td>Employee Phone :</td>
<td>${emp.phone}</td>
</tr>

<tr>
<td>Employee Email :</td>
<td>${emp.email}</td>
</tr>

<tr>
<td>Employee Designation :</td>
<td>${emp.designation}</td>
</tr>

<tr>
<td>Employee Birthday :</td>
<td>${emp.birthday}</td>
</tr>

</c:forEach>
</table>

<c:url value="UpdateEmployee.jsp" var="employeeupdate" >
	<c:param name="id" value="${id}"/>
	<c:param name="name" value="${name}"/>
	<c:param name="address" value="${address}"/>
	<c:param name="phone" value="${phone}"/>
	<c:param name="email" value="${email}"/>
	<c:param name="designation" value="${designation}"/>
	<c:param name="birthday" value="${birthday}"/>
	<c:param name="username" value="${username}"/>
	<c:param name="password" value="${password}"/>
	<c:param name="usertype" value="${usertype}"/>
</c:url>

<%--=detect update page--%>

<div class="sidenav">

<a href ="${employeeupdate}">Update EMP Details</a>
<a href="EmployeeAdd.jsp">Add Employee</a>
<a href="${empdelete}">Remove Employee</a>
<a href="LoginKPIDashboard.jsp">KPI Dash Board</a>
<a href="Request Leaving.jsp">Request Leaving</a>
<a href="Search My Leaving.jsp">Search My Leaving</a>
<a href="login.jsp">Login</a>

</a>-->

<br>
</div>


<%--Delete account --%>
<c:url value="DeleteEmployee.jsp" var="empdelete">
	<c:param name="id" value="${id}"/>
	<c:param name="name" value="${name}"/>
	<c:param name="address" value="${address}"/>
	<c:param name="phone" value="${phone}"/>
	<c:param name="email" value="${email}"/>
	<c:param name="designation" value="${designation}"/>
	<c:param name="birthday" value="${birthday}"/>
	<c:param name="username" value="${username}"/>
	<c:param name="password" value="${password}"/>
	<c:param name="usertype" value="${usertype}"/>
</c:url>




</body>
</html>