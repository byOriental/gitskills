<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
  <head>
  <base href="<%=basePath%>">
  <title></title>
  </head>
  
  <body>
    <form action="admin/Category-update" method="post">
    	name:<input type="text" name="category.name"/> 
    	description:<input type="text" name="category.description"/>
    	<input type="submit" value="update"/>
    </form>
  </body>
</html>
