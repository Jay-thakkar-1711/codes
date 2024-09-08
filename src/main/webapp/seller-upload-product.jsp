<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="seller-header.jsp"%>
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
					<br><br>
						<h3>Seller Upload Product</h3>
						<form class="row login_form"
							action="ProductController"
							method="post" id="contactForm" novalidate="novalidate" enctype="multipart/form-data">
							<input type ="hidden" name="sid" value="<%=s1.getId()%>">
							<div class="col-md-12 form-group">
								<input type="file" class="form-control" id="name" name="image"
									placeholder="Name" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Username'">
							</div>
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="name" name="pname"
									placeholder="Product Name" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Username'">
							</div>
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="name" name="pprice"
									placeholder="Product Price" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Username'">
							</div>
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="name" name="pcategory"
									placeholder="Product Category" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Username'">
							</div>
							<div class="col-md-12 form-group">
								<input type="email" class="form-control" id="name" name="pdesc"
									placeholder="Product Description" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Username'">
							</div>
							
							<div class="col-md-12 form-group">
								<button type="submit" name="action" value="upload" class="primary-btn">Upload</button>
								
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>
