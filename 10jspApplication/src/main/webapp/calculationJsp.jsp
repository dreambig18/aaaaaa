<%@ page import="org.apache.tomcat.jni.File" %>
<%@ page import="java.util.Date" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file= "today.jsp" %>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
int n1,n2,sum;%>
<%
	String str1=request.getParameter("num1");
	String str2=request.getParameter("num2");
	n1=Integer.parseInt(str1);
	
	n2=Integer.parseInt(str2);
	sum=n1+n2;
	
	session.setAttribute("add", sum);
	response.sendRedirect("result.jsp");
%>

<%
	d=(Date)request.getAttribute("date");
%>
<h1>Today Date <%= d %></h1>
</body>
</html>