<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 style="color:red;" align="center">Durga Software Solutions</h2>
<h3 style="color:blue" align="center">Student Registration Form</h3>
<form:form method="POST" action="reg"  commandName="student">
<center>
<table>

<tr>
<td> Student ID</td>
<td><form:input path="sid"/></td>
</tr>

<tr>
<td> Student Name</td>
<td><form:input path="sname"/></td>
</tr>

<tr>
<td> Student Marks</td>
<td><form:input path="smarks"/></td>
</tr>

<tr>
<td> Student Email ID</td>
<td><form:input path="semail"/></td>
</tr>


<tr>
<td> Student Mobile No</td>
<td><form:input path="smobile"/></td>
</tr>
<tr>
<td><input type="submit" value="Registration"/></td>
</tr>
</table>
</center>


</form:form>

</body>
</html>