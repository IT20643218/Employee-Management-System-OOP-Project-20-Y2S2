<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="style1.css">
<style>

</style>
<body>

<div>
	<form action="log" method="post">
	<table>
	<tr>
		<td>User Name</td>
		<td><input type="text" name="uid" placeholder="Enter your username" ></td>
	</tr>
	
	<tr>
		<td>Password</td>
		<td><input type="password" name="pass" placeholder="Enter your password" ></td>
	</tr>
	<tr>
		<td>Admin</td>
		<td><input type="radio" name="gender" value="Admin" required></td>
	 </tr>	
	 <tr>	
	 	<td>Employee</td>
	 	<td><input type="radio" name="gender" value="Employee" required></td>
	</tr>
	
	<tr>
	<td><input class="ab" type="submit" name="submit" value="Submit"></td>
	</tr>
	
	</table>
	</form>
</div>
</body>
</html>