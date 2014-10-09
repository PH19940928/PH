<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'bookdetail.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
     <p>Bookdetail</p>
    <table border= 2 >
	<thead>
		<tr>
			<th><small>ISBN</small></th>
			<th><small>Title</small></th>
			<th><small>Publisher</small></th>
			<th><small>PublishDate</small></th>
			<th><small>Price</small></th>
		</tr>
	</thead>
	<tbody>
	<tr>
		   <td><small><s:property  value = "ISBN"/></small></td>
			<td><small><s:property value = "Title"/></small></td>
			<td><small><s:property value = "Publisher"/></small></td>
			<td><small><s:property value = "PublishDate"/></small></td>
			<td><small><s:property value = "Price"/></small></td>		
	</tr>
	</tbody>
    </table>   
  </body>
</html>
