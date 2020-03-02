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
<form:form  action="updateProduct" modelAttribute="product" method="get">
Id: <form:input path="productId" readonly="true"/> <br>
Name: <form:input path="productName"/> <br>
Price: <form:input path="price"/> <br>
<button type="submit">Update</button>
</form:form>

</body>
</html>