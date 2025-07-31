<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Fast Neighbor Search Scheme</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            overflow-x: hidden;
        }
        
        .container {
            display: flex;
            
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-color: #f0f0f0;
            background-image: url('https://img.freepik.com/free-vector/medical-healthcare-blue-color_1017-26807.jpg?w=1060&t=st=1708401207~exp=1708401807~hmac=fe4ce393ed794f18cd942e8b963770d9fa7c9132b375e2acf058597b4317bccb');
            background-size: cover;
            background-position: center;
            position: relative;
        }
        
        .content {
            text-align: center;
            color: #fff;
            z-index: 1;
        }
        
        h1 {
            color: black;
            font-size: 3rem;
            margin-bottom: 20px;
        }
        
        p {
        	color: #023047;
            font-size: 1.2rem;
            margin-bottom: 30px;
        }
        
        .button {
            display: inline-block;
            background-color: #14213d;
            border: none;
            color: white;
            padding: 15px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            cursor: pointer;
            border-radius: 8px;
            transition: background-color 0.3s;
        }
        
        .button:hover {
            background-color: #132a13;
        }
        
        /* Add your custom animations here */
        @keyframes example {
            0% {background-color: red;}
            25% {background-color: yellow;}
            50% {background-color: blue;}
            100% {background-color: green;}
        }
        
        /* Add your custom hover effects here */
        .button:hover {
            box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24), 0 17px 50px 0 rgba(0,0,0,0.19);
        }
        
        @media screen and (max-width: 768px) {
            h1 {
                font-size: 2rem;
            }
            p {
                font-size: 1rem;
            }
        }
    </style>
</head>
<body>
<%@include file="/background.jsp"%>

<%@include file="/navbar.jsp"%>

    <div class="container">
        <div class="content">
            <h1>Welcome to Fast Neighbor Search Scheme</h1>
            <p>Find your neighbors quickly with our efficient search algorithm.</p>
            <a href="#" class="button">Get Started</a>
        </div>
    </div>
</body>
</html>
