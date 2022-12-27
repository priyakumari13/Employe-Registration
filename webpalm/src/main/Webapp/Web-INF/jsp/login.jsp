<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:form action="logdata" modelAttribute="lg" method="post">
<table border="3" bgcolor="yellow">
<tr>
<td>Enter your email</td>
<td><f:input path="email"/></td>
</tr>

<tr>
<td>Enter your Company</td>
<td><f:input path="company"/></td>
</tr>

<tr>
<td>Enter  your Loaction</td>
<td><f:input path="location"/></td>

</tr>
<tr>
<td>write about your project</td>
<td><f:textarea path="project"/></td>
</tr>

<tr><td><input type="submit"></td></tr>

</table>
</f:form>

</body>
</html>