<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
						<%String msg=(String)request.getAttribute("msg");%>
						<%if(msg!=null){%>
						<h3><%out.println(msg); %></h3>
						<%} %>
						<form class="row login_form"
							action="SellerController"
							method="post" id="contactForm" novalidate="novalidate">
							
						
						
							<div class="col-md-12 form-group">
							<%String email=(String)request.getAttribute("email");%>
							<%out.print(email); %>
								<input type="hidden" class="form-control" id="name" name="email"
									value="<%=email%>">
							</div>
							<br><br>
							<div class="col-md-12 form-group">
								<input type="password" class="form-control" id="name" name="np"
									placeholder="New Password" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'New Password'">
							</div>
							<br><br>
							<div class="col-md-12 form-group">
								<input type="password" class="form-control" id="name" name="cnp"
									placeholder="Confirm Password" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Confirm New Password'">
							</div>
							<br><br>
							<div class="col-md-12 form-group">
								<button type="submit" name="action" value="up" class="primary-btn">Update Password</button>
								
							</div>
						</form>
</body>
</html>