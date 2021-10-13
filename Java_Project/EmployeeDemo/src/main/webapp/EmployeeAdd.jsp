<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
		<form action="insert" method="post">
		<table>
		<tr>
		<td>Name:</td>
		<td><input type="text" name="name"></td>
		</tr>
		
		<tr>
		<td>Address:</td> 
		<td><input type="text" name="address"></td>
		</tr>
		
		<tr>
		<td>Phone Number:</td> 
		<td><input type="text" name="phone"></td>
		</tr>
		
		<tr>
		<td>Email:</td> 
		<td><input type="text" name ="email"></td>
		</tr>
		
		<tr>
		<td>Designation:</td> 
		<td><input type="text" name = "designation"></td>
		</tr>
		
		<tr>
		<td>Birthday:</td> 
		<td><input type="text" name="birthday"></td>
		</tr>
		
		<tr>
		<td>User Name:</td> 
		<td><input type="text" name="username"></td>
		</tr>
		
		<tr>
		<td>Password:</td> 
		<td><input type="password" name="password"></td>
		</tr>
		
		<tr>
		<td>UserType:</td> 
		<td><input type="usertype" name="usertype"></td>
		</tr>
		</table>
		<input type="submit" name="submit" value="Add New Employee">
		
		</form>
		

</body>
</html>