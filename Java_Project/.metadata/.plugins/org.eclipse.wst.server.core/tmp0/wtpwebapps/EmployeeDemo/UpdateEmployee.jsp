<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

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
Employee ID <input type="text" name="id" value="<%=id %>" readonly ><br>
Employee Name <input type="text" name="name" value ="<%=name %>"><br>
Employee Address <input type="text" name="address" value ="<%=address %>"><br>
Employee Phone Number <input type="text" name="phone" value ="<%=phonenumber %>"><br>
Employee Email <input type ="text" name="email" value="<%=email %>"><br>
Employee Designation <input type="text" name="designation" value="<%=designation %>"><br>
Employee Birthday <input type="text" name="birthday" value="<%=birthday %>"><br>
Employee User Name <input type="text" name="username" value="<%=username %>"><br>
Employee Password <input type="password" name="password" value="<%=password %>"><br>

<input type="submit" name="submit" value="Update My Data"><br>

</form>

</body>
</html>