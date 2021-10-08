<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee Table</title>
</head>
<body>
<h1>Update Employee Table</h1>
<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String address = request.getParameter("address");
	String phonenumber = request.getParameter("phone");
	String email = request.getParameter("email");
	String designation = request.getParameter("designation");
	String birthday = request.getParameter("birthday");
	String username = request.getParameter("username");
	String password = request.getParameter("password");
%>

<form action="update" method ="post">
<table>
<tr>
<td>Employee ID</td>
<td><input type="text" name="id" value="<%=id %>" readonly ></td>
</tr>

<tr>
<td>Employee Name</td> 
<td><input type="text" name="name" value ="<%=name %>"></td>
</tr>

<tr>
<td>Employee Address</td> 
<td><input type="text" name="address" value ="<%=address %>"></td>
</tr>

<tr>
<td>Employee Phone Number</td>
<td><input type="text" name="phone" value ="<%=phonenumber %>"></td>
</tr>

<tr>
<td>Employee Email</td>
<td><input type ="text" name="email" value="<%=email %>"></td>
</tr>

<tr>
<td>Employee Designation</td>
<td><input type="text" name="designation" value="<%=designation %>"></td>
</tr>

<tr>
<td>Employee Birthday</td>
<td><input type="text" name="birthday" value="<%=birthday %>"></td>
</tr>

<tr>
<td>Employee User Name</td>
<td><input type="text" name="username" value="<%=username %>"></td>
</tr>

<tr>
<td>Employee Password</td>
<td><input type="password" name="password" value="<%=password %>"></td>
</tr>


</table>
<input type="submit" name="submit" value="Update My Data"><br>

</form>

</body>
</html>