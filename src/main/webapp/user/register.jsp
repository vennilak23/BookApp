<!DOCTYPE html>
<html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
<meta charset="UTF-8">
<title>New User Registration</title>
<link rel="stylesheet" href="<c:url value="/login/css/style.css" />">
</head>
<body>
<body>
	<%@ include file="../../layout/header.jsp"%>
	<div class="container">
		<section id="content">
			<form action="../auth/register" method="post">
				<h1>Register</h1>
				<div>
					<input type="text" placeholder="Enter your Name" required
						name="name" />
				</div>
				<div>
					<input type="text" placeholder="Enter your Username" required
						name="username" />
				</div>
				<div>
					<input type="password" placeholder="Enter your Password" required
						name="password" />
				</div>
				<div>
					<input type="tel" name="mobileNumber"
						placeholder="Enter Mobile Number" />
				</div>
				<div>
					<input type="email" name="emailID" placeholder="Enter Email ID" />
				</div>
				<div>
					<select name="roleID">
						<option value=0>Choose Role ID</option>
						<option value=100>Admin</option>
						<option value=200>Author</option>
						<option value=300>User</option>
					</select>
				</div>
				<div>
					<input type="submit" value="Register" />
				</div>
			</form>
			<div class="button"></div>
		</section>
	</div>
</body>
<%@ include file="../../layout/footer.jsp"%>
<script src="login/js/index.js"></script>
</body>
</html>