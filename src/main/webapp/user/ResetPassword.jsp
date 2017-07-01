<html>
<head>
<title>Reset Password</title>
</head>
<style>
body {background-color: Moccasin; text-align: center}
h3   {color: MidnightBlue; text-align: center}
button {color : MidnightBlue}
</style>

<body>
<h3>Welcome to Book Management System - Reset Password</h3>

<form action="../auth/reset-password" method="POST">
	<input type="text" name="username" placeholder = "Enter Username" required><br>       
    <input type="password" name="newPassword" placeholder = "Enter New Password" required><br>       
    <input type="password" name="confirmNewPassword" placeholder = "Confirm New Password" required><br> 
<br>

<button type="submit">Update Password</button>

</form>
</body>
</html>