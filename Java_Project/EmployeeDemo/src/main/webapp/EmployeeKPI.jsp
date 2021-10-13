<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee KPI</h1>
<form action="Add" method="post">
<table>

<tr>
<td>ID:</td>
<td><input type="text" name ="id"></td>
</tr>

<tr>
<td>Name:</td>
<td><input type="text" name="name"></td>
</tr>

<tr>
<td>Basic Salary:</td>
<td><input type="text" name="basicsalary"></td>
</tr>

<tr>
<td>Monthly Salary:</td>
<td><input type="text" name="monthlytarget"></td>
</tr>

<tr>
<td>Monthly Target Achievement:</td>
<td><input type="text" name="targetachivment"></td>
</tr>

</table>
<input type="submit" name="sumbit" value="Add Employee KPI">
</form>

</body>
</html>