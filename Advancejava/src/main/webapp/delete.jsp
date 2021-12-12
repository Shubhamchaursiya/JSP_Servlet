<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page errorPage="error.jsp" %>
<%@page import="java.sql.*,java.util.*"%>
<%
String id=request.getParameter("partyId");
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "123456");
Statement st=conn.createStatement();
int i=st.executeUpdate("DELETE FROM party WHERE partyId="+id);
out.println("Data Deleted Successfully!");
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>