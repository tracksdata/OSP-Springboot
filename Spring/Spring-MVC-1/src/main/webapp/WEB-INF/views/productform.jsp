<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<form action="saveProduct_v1" method="post">
 
Select Store: <select name="store.storeLocation">
<option>Hyderabad</option>
<option>Pune</option>
<option>Chennai</option>
<option>Bangalore</option>

</select> <br>
 Product Id: <input type="text" name="prodId">   <br>
 Name: <input type="text" name="prodName">  <br>
 Price: <input type="text" name="price">  <br>
 <button type="submit">Save Product</button>
 
</form>


</body>
</html>