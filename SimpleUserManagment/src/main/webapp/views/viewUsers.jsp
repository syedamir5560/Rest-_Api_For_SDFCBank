<%@ taglib uri="http://www.springframework.org/tags/form" 
prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<h1>User Details</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr>
    <th>Id</th>
    <th>Name</th>
    <th>Password</th> 	
      <td>Delete</td>
      <td>Edit</td>     
    </tr>
   <c:forEach var="user" items="${users}">   
   <tr>  
   <td>${user.id}</td>  
   <td>${user.name}</td>   
   <td>${user.password}</td>
   <td><a href="/delete/${user.id}">delete</a>  
    <td><a href="/edit/${user.id}">Edit</a>
    </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   </body>