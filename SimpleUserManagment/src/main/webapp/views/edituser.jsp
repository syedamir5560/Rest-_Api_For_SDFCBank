<%@ taglib uri="http://www.springframework.org/tags/form" 
prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="red">
<h1>edit user data..........</h1>
<form:form action="/edit" method="GET"/>
<table>
<tr>
<td></td>
<td><form:hidden path="id"/></td>
</tr>

<tr>
<td>name</td>
<td><form:input path="name"/></td>
</tr>
<tr>
<td>password</td>
<td><form:input path="password"/></td>
</tr>

<tr>
<td><input type="submit" value="editsave"/></td>
</tr>
</table>

<form:form/>
<a href="/viewUsers">view all user</a>
<a href="/">add new  user</a>


</body>
</html>