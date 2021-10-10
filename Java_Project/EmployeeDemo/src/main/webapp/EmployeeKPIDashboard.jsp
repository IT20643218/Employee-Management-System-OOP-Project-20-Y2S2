<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<c:forEach var="kpi" items ="${kpidetails}">

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


</table>


</c:forEach>
</body>
</html>