<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="customer-header.jsp"%>
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
						<br><br><br><h3>Customer Change Password</h3>
						<%String msg=(String)request.getAttribute("msg");
						if(msg!=null){%>
						<h3><%out.println(msg);%></h3>
						<%} %>
						<form class="row login_form"
							action="CustomerController"
							method="post" id="contactForm" novalidate="novalidate">
							<br>
							<div class="col-md-12 form-group">
								<input type="hidden" class="form-control" id="name" name="email"
									value="<%=c1.getEmail()%>">
							</div>
							<br><br>
							<div class="col-md-12 form-group">
								<input type="password" class="form-control" id="name" name="oldpassword"
									placeholder="Old Password" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Username'">
							</div>
							<br><br>
							<div class="col-md-12 form-group">
								<input type="password" class="form-control" id="name" name="newpassword"
									placeholder="New Password" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Password'">
							</div>
							<br><br>
							<div class="col-md-12 form-group">
								<input type="password" class="form-control" id="name" name="confirmpassword"
									placeholder="Confirm Password" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Password'">
							</div>
							<br><br>
							<div class="col-md-12 form-group">
								<button type="submit" name="action" value="changepswd" class="primary-btn">Change Password</button>
							</div>
						</form>
						<br>
					</div>
				</div>
			</div>
		</div>
	</section>

</body>
</html>