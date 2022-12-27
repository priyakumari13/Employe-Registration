<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2" bgcolor="pink">

<tr><td>Email</td> <td>Company</td> <td>Location</td> <td>project</td> </tr>
<c:forEach items="${l }" var="h">   
<tr>
<td><c:out value="${h.email }"></c:out></td>
<td><c:out value="${h.company }"></c:out></td>
<td><c:out value="${h.location }"></c:out></td>
<td><c:out value="${h.project }"></c:out></td>


</tr>

</c:forEach>

</table>

</body>
</html>