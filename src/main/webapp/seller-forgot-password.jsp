<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form class="row login_form" action="SellerController" method="post"
		id="contactForm" novalidate="novalidate">
		<br>
		<div class="col-md-12 form-group">
			<input type="email" class="form-control" id="name" name="email"
				placeholder="Email" onfocus="this.placeholder = ''"
				onblur="this.placeholder = 'Username'">
		</div>
		<br>
		<br>
		<div class="col-md-12 form-group">
			<button type="submit" name="action" value="getotp"
				class="primary-btn">Get OTP</button>
		</div>
	</form>
</body>
</html>