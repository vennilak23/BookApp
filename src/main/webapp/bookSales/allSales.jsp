<!DOCTYPE html>
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table id="ordersTbl" border="1">
		<thead>
			<tr>
				<th width="10%">Order Id</th>
				<th>Order Items</th>
				<th>Amount</th>
				<th>Status</th>
				<th>Ordered Date</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${MY_ORDERS}" var="order">
				<tr>
					<td>${order.id}</td>
					<td>
						<ul>
							<c:forEach items="${order.orderItems}" var="item">
								<li>${item.book.name}(Quantity- ${item.quantity} )</li>
							</c:forEach>
						</ul>
					</td>
					<td>Rs. ${order.totalPrice }</td>
					<td>${order.status}</td>
					<td>${order.orderedDate }</td>
					<c:if test="${order.status == 'ORDERED'}">
						<td><a
							href="../bookSales/updateStatus?id=${order.id}&status=CANCELLED"
							class="btn btn-danger btn-sm">Cancel Order </a></td>
					</c:if>
				</tr>

			</c:forEach>
		</tbody>
	</table>
</body>
</html>