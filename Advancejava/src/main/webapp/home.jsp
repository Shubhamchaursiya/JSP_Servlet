
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page errorPage="error.jsp" %>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%

String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "servlet";
String userid = "root";
String password = "123456";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<html>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<head>
<%@include file="all_component/allcss.jsp"%>
</head>
<body>
<%@include file="all_component/navbar.jsp"%>
<h1>All User</h1>
<table border="1">
<tr>
<td>Id</td>
<td>First name</td>
<td>Last name</td>
<td>Address</td>
<td>State</td>
<td>City name</td>
<td>Zip</td>
<td>Country</td>
<td>Phone</td>
</tr>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from party";
resultSet = statement.executeQuery(sql);
int i=0;
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("partyId") %></td>
<td><%=resultSet.getString("firstName") %></td>
<td><%=resultSet.getString("lastName") %></td>
<td><%=resultSet.getString("address") %></td>
<td><%=resultSet.getString("state") %></td>
<td><%=resultSet.getString("city") %></td>
<td><%=resultSet.getString("zip") %></td>
<td><%=resultSet.getString("country") %></td>
<td><%=resultSet.getString("phone") %></td>
<td><a href="edit.jsp?id=<%=resultSet.getString("partyId")%>">Update</a></td>
<td><a href="delete.jsp?id=<%=resultSet.getString("partyId") %>"><button type="button" class="delete">Delete</button></a></td>
</tr>
<%
i++;
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</body>
</html>