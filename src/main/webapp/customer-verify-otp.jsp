<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
				<%String msg=(String)request.getAttribute("msg");
				if(msg!=null)
				{%>
				<h3><%out.println(msg); %></h3>
				<%} %>
							<form class="row login_form"
							action="CustomerController"
							method="post" id="contactForm" novalidate="novalidate">
							<br>
							<%String email=(String)request.getAttribute("email"); %>
							<%int otp=(Integer)request.getAttribute("otp"); %>
							<div class="col-md-12 form-group">
							<input type="hidden" name="email" value="<%=email%>">
							<input type="hidden" name="otp1" value=<%=otp %>>
								<input type="text" class="form-control" id="name" name="otp2"
									placeholder="Enter OTP" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Username'">
							</div>
							<br><br>
							<div class="col-md-12 form-group">
								<button type="submit" name="action" value="verify" class="primary-btn">Verify</button>
							</div>
						</form>
</body>
</html>