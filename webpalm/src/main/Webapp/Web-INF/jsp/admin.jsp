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
<f:form action="userDetail" modelAttribute="ad" method="get">
<table>
<tr><td>id</td>
<td><f:input path="adminId"/></td>
</tr>

<tr><td>password</td>
<td><f:password path="password"/></td>
</tr>
<tr><td><input type="submit"></td></tr>


</table>


</f:form>

</body>
</html>