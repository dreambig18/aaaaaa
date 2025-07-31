<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
        /* Define your CSS styles here */
        h1 {
            color: blue; /* Example text color */
            font-size: 24px; /* Example font size */
            
        }
    </style>
</head>
<body>

<%! Integer iobj=null; %>
	<% iobj=(Integer)session.getAttribute("add"); %>
	<h1> Add <%= iobj %></h1>
</body>
</html>