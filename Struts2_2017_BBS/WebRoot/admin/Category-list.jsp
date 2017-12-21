<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="/struts-tags" prefix="s" %>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML>
<html>
  <head>
  <base href="<%=basePath%>">
    <title>列表页面</title>
  </head>
  
  <body>
    category-list
    <a href="admin/Category-addInput">添加</a>
    <a href="admin/Category-updateInput">更新</a>
    <a href="admin/Category-delete">删除</a><br/>
    iterator'debug测试：
  <s:iterator value="{'aaa', 'bbb', 'ccc'}" var="x">
			<s:property value="#x.toUpperCase()"/> |
		</s:iterator>
		<s:debug/>
  
  <s:iterator value="categories" var="y"><!-- ???数据没有出来 -->
		<s:property value="#y.name"/> |
		<s:property value="#y.description"/> |
		<a href="admin/Category-delete?id=<s:property value="#y.id"/>">删除Category</a> |
		<a href="admin/Category-updateInput?id=<s:property value="#y.id"/>">更新Category</a>
	<br/>
</s:iterator>
  </body>
</html>
