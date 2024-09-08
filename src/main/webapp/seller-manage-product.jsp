<%@page import="Dao.ProductDao"%>
<%@page import="model.Product"%>
<%@page import="java.util.List"%>
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
<br><br><br><br>
	<section class="cart_area">
		<div class="container">
			<div class="cart_inner">
				<div class="table-responsive">
					<table class="table">
						<thead>
							<tr>
								<th scope="col">Image</th>
								<th scope="col">Name</th>
								<th scope="col">Price</th>
								<th scope="col">Category</th>
								<th scope="col">Description</th>
								<th scope="col">Edit</th>
								<th scope="col">Delete</th>
							</tr>
						</thead>
						<tbody>
						<%List<Product> list = ProductDao.getProductBySid(s1.getId()); %>
						<%for(Product p :list){ %>
							<tr>
								<td>
									<div class="media">
										<div class="d-flex">
											<img src="images/<%=p.getImage()%>" height="200" width="200">
										</div>
									</div>
								</td>
								<td>
									<h5><%=p.getPname() %></h5>
								</td>
								<td>
									<h5><%=p.getPprice() %></h5>
								</td>
								<td>
									<h5><%=p.getPcategory()%></h5>
								</td>
								<td>
									<h5><%=p.getPdesc() %></h5>
								</td>
								<td>
									<h5><a href="single-product.jsp?pid=<%=p.getPid()%>" class="btn btn-success">Edit</a></h5>
								</td>
								<td>
									<h5><a href="delete-product.jsp?pid=<%=p.getPid() %>" class="btn btn-danger">Delete</a></h5>
								</td>
							</tr>
							<%} %>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</section>

</body>
</html>