<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table id="ordersTbl" border="1"
		class="table table-striped table-bordered">
		<thead>
			<tr>
				<th>Order Id</th>
				<th>User Name</th>
				<th>Items</th>
				<th>Order Amount</th>
				<th>Status</th>
				<th>Ordered Date</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${BookSales_LIST}" var="bookSales">
				<tr>
					<td>${bookSales.salesId}</td>
					<td>${bookSales.user.name}</td>
					<td>
						<ul>
							<c:forEach items="${bookSales.bookSalesItems}" var="item">
								<li>${item.book.title}(Quantity-${item.quantity})</li>
							</c:forEach>
						</ul>
					</td>
					<td>Rs. ${order.totalAmount}</td>
					<td>${order.status}</td>
					<td>${order.orderDate}</td>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>