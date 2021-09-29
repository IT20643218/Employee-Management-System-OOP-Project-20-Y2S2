<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Account Delete Page</title>
</head>
<body>
<h1>Employee Account Delete Page</h1>
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

<form action="delete" method ="post">
<table>
<tr>
<td>Employee ID</td>
<td><input type="text" name="id" value="<%=id %>" readonly ></td>
</tr>

<tr>
<td>Employee Name</td> 
<td><input type="text" name="name" value ="<%=name %>" readonly></td>
</tr>

<tr>
<td>Employee Address</td> 
<td><input type="text" name="address" value ="<%=address %>" readonly></td>
</tr>

<tr>
<td>Employee Phone Number</td>
<td><input type="text" name="phone" value ="<%=phonenumber %>" readonly></td>
</tr>

<tr>
<td>Employee Email</td>
<td><input type ="text" name="email" value="<%=email %>" readonly></td>
</tr>

<tr>
<td>Employee Designation</td>
<td><input type="text" name="designation" value="<%=designation %>" readonly></td>
</tr>

<tr>
<td>Employee Birthday</td>
<td><input type="text" name="birthday" value="<%=birthday %>" readonly></td>
</tr>

<tr>
<td>Employee User Name</td>
<td><input type="text" name="username" value="<%=username %>" readonly></td>
</tr>


</table>
<input type="submit" name="submit" value="Delete Employee Details"><br>

</form>
</body>
</html>