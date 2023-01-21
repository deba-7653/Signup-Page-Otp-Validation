<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!DOCTYPE html>
<html>
<head>
<title>Register Form</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<style type="text/css">
label {
	font-weight: 600;
	color: #666;
}

body {
	background: #f1f1f1;
}

.box8 {
	box-shadow: 0px 0px 5px 1px #999;
}

.mx-t3 {
	margin-top: -3rem;
}
</style>
</head>
<body>

	<div class="container mt-3">
		<form action="register" method="post">
			<div class="row jumbotron box8">
				<div class="col-sm-12 mx-t3 mb-4">
					<h2 class="text-center text-info">Register</h2>
					<c:if test="${not empty msg }">
						<h4 class="text-center text-danger">${msg}</h4>
						<c:remove var="msg" scope="session" />
					</c:if>
						<c:if test="${not empty succMsg }">
							<h4 class="text-center text-success fs-5">${succMsg}</h4>
							<c:remove var="succMsg" scope="session" />
						</c:if>

						<c:if test="${not empty errorMsg }">
							<h4 class="text-center text-danger fs-5">${errorMsg}</h4>
							<c:remove var="errorMsg" scope="session" />
						</c:if>
				</div>

				<div class="col-sm-6 form-group">
					<label for="name-f">First Name</label> <input type="text"
						class="form-control" name="fname" id="name-f"
						placeholder="Enter your first name." required>
				</div>
				<div class="col-sm-6 form-group">
					<label for="name-l">Last name</label> <input type="text"
						class="form-control" name="lname" id="name-l"
						placeholder="Enter your last name." required>
				</div>
				<div class="col-sm-6 form-group">
					<label for="email">Email</label> <input type="email"
						class="form-control" name="email" id="email"
						placeholder="Enter your email." required>
				</div>
				<div class="col-sm-6 form-group">
					<label for="address-1">Address Line-1</label> <input type="address"
						class="form-control" name="Locality" id="address-1"
						placeholder="Locality/House/Street no." required>
				</div>

				<div class="col-sm-4 form-group">
					<label for="State">State</label> <input type="address"
						class="form-control" name="State" id="State"
						placeholder="Enter your state name." required>
				</div>
				<div class="col-sm-2 form-group">
					<label for="zip">Postal-Code</label> <input type="zip"
						class="form-control" name="Zip" id="zip"
						placeholder="Postal-Code." required>
				</div>
				<div class="col-sm-6 form-group">
					<label for="Country">Country</label> <input type="address"
						class="form-control" name="country" id="country"
						placeholder="Enter your country name." required>
				</div>
				<div class="col-sm-6 form-group">
					<label for="Date">Date Of Birth</label> <input type="Date"
						name="dob" class="form-control" id="Date" placeholder="" required>
				</div>
				<div class="col-sm-6 form-group">
					<label for="sex">Gender</label> <select id="sex"
						class="form-control browser-default custom-select" name="sex">
						<option value="Male">Male</option>
						<option value="Female">Female</option>
						<option value="Unspecified">Unspecified</option>
					</select>
				</div>


				<div class="col-sm-6 form-group">
					<label for="pass">Password</label> <input type="Password"
						name="password" class="form-control" id="pass"
						placeholder="Enter your password." required>
				</div>
				<div class="col-sm-6 form-group">
					<label for="pass2">Confirm Password</label> <input type="Password"
						name="cnf-password" class="form-control" id="pass2"
						placeholder="Re-enter your password." required>
				</div>
				<div class="col-sm-4 form-group">
					<label for="tel">Phone</label> <input type="tel" name="phone"
						maxlength="10" class="form-control" id="tel"
						placeholder="Enter Your Contact Number." required>
				</div>

				<div class="col-sm-12">
					<input type="checkbox" class="form-check d-inline" id="chb"
						required><label for="chb" class="form-check-label">&nbsp;I
						accept all terms and conditions. </label>
				</div>

				<div class="col-sm-12 form-group mb-0">
					<button class="btn btn-primary float-right">Send Otp</button>
				</div>
				<p class="text-center text-muted mt-5 mb-0">
					Have already an account? <a href="login.jsp"
						class="btn btn-success btn-sm ml-1"><u>Login here</u></a>
				</p>
			</div>
		</form>
	</div>
	</div>
</body>
</html>
