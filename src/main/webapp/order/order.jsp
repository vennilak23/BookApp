<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="../order/addToCart" method="get">

		<table border="1">
			<tr>
				<th>User ID</th>
				<th>ISBN</th>
				<th>Title</th>
				<th>Price</th>
				<th>Quantity</th>
			</tr>
			<tr>
				<td>${USER_LOGGED.id}</td>
				<td>${SELECTED_BOOK.isbn}</td>
				<td>${SELECTED_BOOK.title}</td>
				<td>${SELECTED_BOOK.price}</td>
				<td><input type = "number" name = "quantity" placeholder = "Enter Quantity" required /></td>
				<td><a href="../order/checkout">Check Out</a></td>
			</tr>
		</table>
	</form>
</body>
</html>