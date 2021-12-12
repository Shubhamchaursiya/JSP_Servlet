<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand">Update Page</a>
			<form class="d-flex"></form>
		</div>
	</nav>
	<div class="container">
		<br>

		<form action="Update" method="post">
			<div class="form-row">


				<div class="form-group">
					<label for="inputAddress" name="firstName">FirstName</label> <input
						type="text" class="form-control" id="inputAddress"
						>
				</div>
				<div class="form-group">
					<label for="inputAddress" name="lastName">LastName</label> <input
						type="text" class="form-control" id="inputAddress"
						placeholder="LastName">
				</div>
				<div class="form-group col-md-4">
                						<label for="inputState" name="address">Address</label> <input
                							type="text" class="form-control" id="inputCity">
                					</div>
				<div class="form-group col-md-4">
                						<label for="inputState" name="state">State</label> <input
                							type="text" class="form-control" id="inputCity">
                					</div>
				<div class="form-row">
					<div class="form-group col-md-6">
						<label for="inputCity" name="city">City</label> <input type="text"
							class="form-control" id="inputCity">
					</div>
					<div class="form-group col-md-2">
						<label for="inputZip" name="zip">Zip</label> <input type="text"
							class="form-control" id="inputZip">
					</div>


					<div class="form-group">
						<label for="inputAddress" name="country">Country</label> <input
							type="text" class="form-control" id="inputAddress" placeholder="">
					</div>

					<div class="form-group col-md-2">
						<label for="inputZip">Phone</label> <input type="number"
							class="form-control" id="inputZip">
					</div>

					</br>

				</div>


				<button type="submit" class="btn btn-primary">Update</button>
		</form>
</body>
</html>