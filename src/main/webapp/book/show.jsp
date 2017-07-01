<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Books</title>
</head>
<style>
body {background-color: Moccasin; text-align: center}
h2{color: MidnightBlue; text-align: center}
th{color: MidnightBlue; text-align: center}
</style>
<body>
	<h2>Welcome to book Management - Show Book</h2>
	<table border = "1">
		<tr>
			<th>ISBN</th>
			<th>Title</th>
			<th>Author</th>
			<th>Publish Date</th>
			<th>Content</th>
			<th>Price</th>
			<th>Status</th>
			<th>Order</th>
		</tr>
		<tr>	
			<td>${SELECTED_BOOK.isbn}</td>
			<td>${SELECTED_BOOK.title}</td>
			<td>${SELECTED_BOOK.author}</td>
			<td>${SELECTED_BOOK.publishDate}</td>
			<td>${SELECTED_BOOK.content}</td>
			<td>${SELECTED_BOOK.price}</td>
			<td>${SELECTED_BOOK.status}</td>
			<td><a href = "../order/addToCart">Add to Cart</a></td>
		</tr>
	</table>	
</body>
</html>