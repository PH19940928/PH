<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<title></title>
 </head>
  <body bgcolor="#FFFF00">
     <p><strong>作者信息及书目名称</strong></p>
   <table  border= 2 >
	 <thead>
		<tr>
			<th><small>Name</small></th>
			<th><small>Age</small></th>
			<th><small>Country</small></th>
		</tr>
	</thead>
	<tbody>
	<tr>
		   <td><small><s:property  value = "Name"/></small></td>
			<td><small><s:property value = "Age"/></small></td>
			<td><small><s:property value = "Country"/></small></td>		
	</tr>
	</tbody>
    </table>   
    <a href='bookdetail.action?Title=<s:property value="Title"/>'><s:property value="Title"/></a>
    <a href='deletebook.action?Title=<s:property value="Title"/>'>删除</a>
</body>
</html>