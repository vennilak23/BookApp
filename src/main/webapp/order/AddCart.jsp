<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Cart</title>
</head>
<body>
	<form action="../order/addToCart" method="get">

		<table border="1">
			<tr>
				<th>User ID</th>
				<th>ISBN</th>
				<th>Price</th>
				<th>Quantity</th>
				<th>Total Amount</th>
				<th>Order Date</th>
				<th>Status</th>
			</tr>
			<tr>
				<td>${USER_LOGGED.id}</td>
				<td>${SELECTED_BOOK.isbn}</td>
				<td>${SELECTED_BOOK.price}</td>
				<td></td>
				<td>${SELECTED_BOOK.price * Quantity}</td>
				<td>${SELECTED_BOOK.status}</td>
				<td><a href="../order/checkout">Check Out</a></td>
			</tr>
		</table>
	</form>
</body>
</html>