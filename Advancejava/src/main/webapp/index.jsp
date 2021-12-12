<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Home Page</title>
<%@include file="all_component/allcss.jsp"%>
</head>
<body>
<%@include file="all_component/navbar1.jsp"%>

<div class="text-center">
<h1 class="text-black"><i class="fa fa-users" aria-hidden="true"></i>Users</h1>
<a href="login.jsp" class="btn btn-light"><i class="fa fa-user" aria-hidden="true"></i>Login</a>
<a href="register.jsp" class="btn btn-light"><i class="fa fa-user-plus" aria-hidden="true"></i>Register</a>
</div>
</body>
</html>