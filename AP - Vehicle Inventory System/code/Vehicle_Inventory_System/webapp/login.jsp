<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<nav role="navigation">
				
				<ul>

					<li><a href="./home">Home</a></li>
					<li class = "highlight"><a href="./login">Login</a></li>
				
				</ul>
			
	</nav>
	
	<main>
		<h1>Log In</h1>
		
		<form action = "login" method = "post">
			Enter Username: <input type = "text" name = "username"> 
			<br>
			Enter Password: <input type = "password" name = "password">
			<br>
			<input type = "submit" value = "Login">
		</form>
		
		<h2>Login Result : ${current.getLogin()}</h2>
		
	</main>
</body>
</html>