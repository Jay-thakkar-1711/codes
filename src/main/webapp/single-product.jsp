<%@page import="Dao.ProductDao"%>
<%@page import="model.Product"%>
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
			<%
			int pid = Integer.parseInt(request.getParameter("pid"));
			%>
			<%
			Product p = ProductDao.getProductByPid(pid);
			%>
			<div class="row">

				<div class="col-lg-6">
					<div class="login_form_inner">
						<br>
						<br>
						<h3>Seller Upload Product</h3>
						<form class="row login_form" action="ProductController"
							method="post" id="contactForm" novalidate="novalidate"
							enctype="multipart/form-data">
							<input type="hidden" name="pid" value="<%=p.getPid()%>">
							<div class="col-md-12 form-group">
								<img src="images/<%=p.getImage()%>">
							</div>
							<div class="col-md-12 form-group">
								<input type="file" class="form-control" id="name" name="image"
									placeholder="Name" onfocus="this.placeholder = ''"
									onblur="this.placeholder = 'Username'">
							</div>
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="name" name="pname"
									value="<%=p.getPname()%>">
							</div>
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="name" name="pprice"
									value="<%=p.getPprice()%>">
							</div>
							<div class="col-md-12 form-group">
								<input type="text" class="form-control" id="name"
									name="pcategory" value="<%=p.getPcategory()%>">
							</div>
							<div class="col-md-12 form-group">
								<input type="email" class="form-control" id="name" name="pdesc"
									value="<%=p.getPdesc()%>">
							</div>

							<div class="col-md-12 form-group">
								<button type="submit" name="action" value="update"
									class="primary-btn">Update</button>

							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</section>
</body>
</html>
