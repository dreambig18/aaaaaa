<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${requestScope.empList !=null and not empty requestScope.empLst}" >
	 <tr>
	 	<td> REG no </td>
	 	<td> First name </td>
	 	<td> User Name</td>
	 	<td> Password </td>
	 	<td> Account Balance </td>
	 	
	 	<td> &nbsp; </td>
	 	</tr>
	 	
	 	
	 </c:if>
	 
	 <c:forEach items="${requestScope.empList }" var="e">
	 	<tr>
	 	<td>${e.regNo}</td>
		<td>${e.custName}</td>
		<td>${e.username}</td>
	 	<td>${e.password}</td>
	 	<td>${e.accBal}</td>
	 	
		
	 </tr>
	 </c:forEach>



</body>
</html>