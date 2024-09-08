<%@page import="java.util.*" %>
<%@page import="model.WishList" %>
<%@page import="model.Product" %>
<%@page import="Dao.WishListDao" %>
<%@page import="Dao.ProductDao" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="customer-header.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br><br><br>
<table>
<thead>
							<tr>
								<th scope="col">Product</th>
								<th scope="col">Price</th>
								<th scope="col">Remove</th>
							</tr>
						</thead>
						<tbody>
						<%List<WishList> Wlist=WishListDao.getAllProductsByCusId(c1.getId()); %>
						<% for(WishList w1:Wlist) {%>
						<%Product p=ProductDao.getProductByPid(w1.getPid()); %> 
						
						<tr>
						<td>
									<div class="media">
										<div class="d-flex">
											<img src="images/<%=p.getImage()%>" height="100" width="100">
										</div>
										<div class="media-body">
											<p><%=p.getPname()%></p>
										</div>
									</div>
						</td>
						<td>
						<h5><%=p.getPprice() %></h5>
						</td>		
						<td>
						<a href="WishListController?action=remove&wid=<%=w1.getWid() %>"><p class="hover-text">Remove</p></a>
						</td>
						</tr>
						<%} %>
						</tbody>
</table>
</body>
</html>