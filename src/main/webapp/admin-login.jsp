<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<section class="login_box_area section_gap">
		<div class="container">
			<div class="row">
				
				<div class="col-lg-6">
					<div class="login_form_inner">
						<br><br><br><h3>Admin Login</h3>
						<form class="row login_form"
							action="AdminController"
							method="post" id="contactForm" novalidate="novalidate">
							<br>
							<div class="col-md-12 form-group">
								<input type="email" class="form-control" id="name" name="email"
									placeholder="Email" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Username'">
							</div>
							<br><br>
							<div class="col-md-12 form-group">
								<input type="password" class="form-control" id="name" name="password"
									placeholder="Password" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Password'">
							</div>
							<br><br>
							<div class="col-md-12 form-group">
								<button type="submit" name="action" value="login" class="primary-btn">Log
									In</button>
							</div>
						</form>
						<br>
						<a href="seller-forgot-password.jsp">Forgot Password?</a>
					</div>
				</div>
			</div>
		</div>
	</section>

</body>
</html>