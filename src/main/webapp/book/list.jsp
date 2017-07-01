<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<h2>Welcome to book Management - List of Books Available</h2>
	<table border = "1">
		<tr>
			<th>Title</th>
			<th>Author</th>
			<th>Price</th>
			<th>View</th>
		</tr>
		<c:forEach items="${book}" var="book">
		<tr>
			<td>${book.title}</td>
			<td>${book.author}</td>
			<td>${book.price}</td>
			<td><a href="../book/${book.isbn}">View</a></td>
		</tr>
		</c:forEach>
	</table>	
</body>
</html>