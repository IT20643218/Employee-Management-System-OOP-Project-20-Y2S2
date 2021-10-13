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
<body>
<img  src="im1.jpeg">
<table class="center">
<c:forEach var="kpi" items ="${kpidetails}">

<c:set var ="username" value="${kpi.username}"></c:set>
<c:set var ="password" value="${kpi.password}"></c:set>
<c:set var ="basicsalary" value="${kpi.basicsalary}"></c:set>
<c:set var ="monthlytarget" value="${kpi.monthlytarget}"></c:set>
<c:set var ="targetachivment" value="${kpi.targetachivment}"></c:set>
<c:set var ="monthlyincentive" value="${kpi.monthlyincentive}"></c:set>

<tr>
<td>Employee ID :</td>
<td>${kpi.username}</td>
</tr>

<tr>
<td>Employee Name :</td>
<td>${kpi.password}</td>
</tr>

<tr>
<td>Employee Basic Salary :</td>
<td>${kpi.basicsalary}</td>
</tr>

<tr>
<td>Employee Monthly Target :</td>
<td>${kpi.monthlytarget}</td>
</tr>

<tr>
<td>Employee Target Achievement :</td>
<td>${kpi.targetachivment}</td>
</tr>

<tr>
<td>Employee Incentive :</td>
<td>${kpi.monthlyincentive}</td>
</tr>

</c:forEach>
</table>



<c:url value="UpdateKPI.jsp" var="kpidash">

<c:param name="username" value="${username}"></c:param>
<c:param name="password" value="${password}"></c:param>
<c:param name="basicsalary" value="${basicsalary}"></c:param>
<c:param name="monthlytarget" value="${monthlytarget}"></c:param>
<c:param name="targetachivment" value="${targetachivment}"></c:param>
<c:param name="monthlyincentive" value="${monthlyincentive}"></c:param>
 
</c:url>

<c:url value="DeleteKPI.jsp" var="Delete_KPI">

<c:param name="username" value="${username}"></c:param>
<c:param name="password" value="${password}"></c:param>
<c:param name="basicsalary" value="${basicsalary}"></c:param>
<c:param name="monthlytarget" value="${monthlytarget}"></c:param>
<c:param name="targetachivment" value="${targetachivment}"></c:param>
<c:param name="monthlyincentive" value="${monthlyincentive}"></c:param>

</c:url>

<div class="sidenav">

<a href="AddKPI.jsp">Add EMP KPI</a>
<!--<input type="button",name="add" value="Add EMP KPI Details">
</a>-->

<a href="${kpidash}">Update EMP KPI</a>
<!-- <input type="button" name="update" value="Update EMP KPI">
</a> -->

<a href="${Delete_KPI}">Delete EMP KPI</a>
<!--  <input type="button" name="delete" value="Delete EMP KPI">
</a>-->

<a href="LoginKPIDashboard.jsp">Logout</a>
<!--<input type="button" name="back" value="Again Login">
</a>-->
<a href="login.jsp">Exit</a>
</div>

</body>
</html>