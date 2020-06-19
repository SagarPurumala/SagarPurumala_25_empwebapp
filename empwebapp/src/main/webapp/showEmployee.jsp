<%@page import="com.capg.empwebapp.dao.EmployeeDAOImple"%>
<%@page import="com.capg.empwebapp.dao.EmployeeDAO"%>
<%@page import="com.capg.empwebapp.bean.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Users List</title>
</head>
<body>
<form action="/show" method="get">
	<h1 style="text-align: centre;">Users List</h1>		
	<%
	EmployeeDAO dao = new EmployeeDAOImple();
	List<Employee> list = dao.viewEmployee();

		if (list != null && !list.isEmpty()) {
	%>
	

	<table style="background-color:silver;text-align: center;"border="1" cellpadding="2" cellspacing="2">
		<tr>
			<td>Id</td>
			<td>name</td>
			<td>Email ID</td>
			<td>Password</td>
			<td>Gender</td>
			<td>Country</td>
			<td>Edit</td>
			<td>Delete</td>
		</tr>
		<%
			for (Employee bean : list) {
		%>
		<tr>
			<td><%=bean.getId()%></td>
			<td><%=bean.getName()%></td>
			<td><%=bean.getEmailid()%></td>
			<td><%=bean.getPassword()%></td>
			<td><%=bean.getMobilenumber()%></td>
			<td><%=bean.getAge()%></td>
			<td><a href="./updateEmployee.html">edit</a></td>
			<td><a href="./deleteEmployeee.html">delete</a></td>
		</tr>
		<%
			}
		%>

	</table>
	<%
		} else {
	%>

	<h1>
		No Data Found</h1>
	<%
		}
	%>
	<a href="/addEmployee.html">Add new Employee</a>
	</form>
</body>
</html>