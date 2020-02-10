<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Location: ${product.store.storeLocation }</h2>
<form:form action="" method="post" modelAttribute="product">
Store Name: <form:select path="store.storeLocation">
<form:option value="${product.store.storeLocation }">${product.store.storeLocation }</form:option>
</form:select> <br>
Product Id: <form:input path="prodId"/>  <br>
Product Name:  <form:input path="prodName"/> <br>
Price:  <form:input path="price"/> <br>

<button type="submit">Update</button>


</form:form>


</body>
</html>