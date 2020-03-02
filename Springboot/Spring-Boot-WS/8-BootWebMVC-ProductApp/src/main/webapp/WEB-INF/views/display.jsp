<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Display.jsp</h1> <hr/>

  

<table border="1">
<tr>
	<th>Product Id</th>
	<th>Product Name</th>
	<th>Price</th>
</tr>
<c:forEach var="prod" items="${products}">
<tr>
	<td> ${prod.productId }</td>
	<td> ${prod.productName }</td>
	<td> ${prod.price }</td>
</tr>
</c:forEach>
</table>
  

</body>
</html>