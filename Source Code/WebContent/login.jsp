<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Login Form</title>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<link href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="componet/style.css">
</head>
<body>
	<!--  Request me for a signup form or any type of help  -->
	<div class="login-form">
		<c:if test="${not empty succMsg }">
			<h4 class="text-center text-success fs-5">${succMsg}</h4>
			<c:remove var="succMsg" scope="session" />
		</c:if>
		<form action="login" method="post">
			<div class="avatar">
				<i class="material-icons">&#xE7FF;</i>
			</div>
			<h4 class="modal-title">Login to Your Account</h4>
			<div class="form-group">
				<input type="text" class="form-control" name="email"
					placeholder="Username" required>
			</div>
			<div class="form-group">
				<input type="password" class="form-control" name="password"
					placeholder="Password" required="required">
			</div>
			<div class="form-group small clearfix">
				<label class="checkbox-inline"><input type="checkbox">
					Remember me</label>

			</div>
			<input type="submit" class="btn btn-primary btn-block btn-lg"
				value="Login">
		</form>
		<div class="text-center small">
			Don't have an account? <a href="register.jsp">Sign up</a>
		</div>
	</div>
</body>
</html>




