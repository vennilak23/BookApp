<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<title>Book Publishing System</title>
<link id="theme" rel="stylesheet" type="text/css" href="style.css"
	title="theme" />
<link rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Roboto+Condensed|Roboto+Condensed|Droid+Sans|Droid+Sans|Droid+Sans|Droid+Sans"
	type="text/css" />
<script type="text/javascript" lang="javascript"
	src="js/jquery-1.8.1.min.js"></script>
<script type="text/javascript" lang="javascript" src="js/scripts.js"></script>
<script type="text/javascript" lang="javascript" src="js/theme.js"></script>
<script type="text/javascript" lang="javascript" src="js/custom.js"></script>
</head>
<body>
	<%@ include file="../../layout/header.jsp"%>
	<div id="header-wrapper">
		<div class="bg"></div>
		<div class="row">
			<div id="header">
				<div id="tagline">
					<h1>Welcome to Online Book Store</h1>
					<br />
					<h2>Login to Shop</h2>
					<a href="../auth"><input type="button" class="cta pie"
						value="Login" /></a>
				</div>
			</div>
		</div>
	</div>
	<div class="bg"></div>
	<div class="row">
		<div id="container">
			<div id="main">
				<section class="home">
					<div>
						<h1>Pub Hub 200</h1>
						<p>Pub Hub 200 is a bootcamp project provided to the students
							to create a spring boot web application. This project involves
							understanding the concepts of spring boot application and
							creation of a book store application.</p>
						<h3>Book Publishing System</h3>
						<p>
							This is the created project for the bootcamp. <span
								style="font-weight: bold">Book Publishing System</span> includes
							the concept of Spring, Spring Data JPA, Spring MVC, SpringBoot,
							and front end platforms. This makes us a full stack web
							developer.
						</p>
					</div>
				</section>
			</div>
			<div class="clear" style="height: 30px"></div>
		</div>
	</div>
	<%@ include file="../../layout/footer.jsp"%>
</body>
</html>