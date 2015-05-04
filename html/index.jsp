<html>
	<head>
		<link rel="stylesheet" href="${pageContext.request.contextPath}\css\login.css" type="text/css" />
	</head>
	<body>
		<form id="login" action="${pageContext.request.contextPath}/user.htm?method=login" method="post">
			<h1>Log In</h1>
			<fieldset id="inputs">
				<input id="username" type="text" name="username" placeholder="Username" autofocus required>   
				<input id="password" type="password" name="password" placeholder="Password" required>
			</fieldset>
			<fieldset id="actions">
				<input type="submit" id="submit" value="Log in">
				<a href="">Forgot your password?</a><a href="">Register</a>
			</fieldset>
		</form>
	</body>
</html>