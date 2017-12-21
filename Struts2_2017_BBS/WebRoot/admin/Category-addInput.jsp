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
    <form action="admin/Category-add" method="post">
    	name:<input name="category.name"/>
    	description:<textarea name="category.description"></textarea>
    	<input type="submit" value="add" /> 
    	
    </form>
  </body>
</html>
