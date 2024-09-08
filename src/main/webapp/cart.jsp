<%@page import="java.util.List" %>
<%@page import="model.Cart" %>
<%@page import="model.Product" %>
<%@page import="Dao.CartDao" %>
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
<%List<Cart> l1=CartDao.getProductByCusid(c1.getId()); %>
<br><br><br><br>
<table>
<thead>
							<tr>
								<th scope="col">Product</th>
								<th scope="col">Price</th>
								<th scope="col">Quantity</th>
								<th scope="col">Total</th>
								<th scope="col">Remove</th>
							</tr>
						</thead>
						<tbody>
						<%double net_price=0; %>
						<%for(Cart c:l1){ %>
						<%Product p=ProductDao.getProductByPid(c.getP_id()); %>
						<%net_price=net_price+c.getTtl_price(); %>
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
									<div class="product_count">
										<form action="CartController" method="post">
											<input type="hidden" name="cart_id"value="<%=c.getCart_id()%>"> 
											<input type="hidden" name="pid" value="<%=c.getP_id()%>"> 
											<input type="hidden" name="pprice" value="<%=c.getPrice()%>">
											<input type="number" name="qty" value="<%=c.getQty()%>" onchange="this.form.submit();">
										</form>
									</div>
								</td>
								<td>
								<h5><%=c.getTtl_price() %></h5>
								</td>
								<td>
								<a href="CartController?action=remove&cartid=<%=c.getCart_id() %>"><p class="hover-text">Remove</p></a>
								</td>
						</tr>
						<%} %>
						<tr>
								<td></td>
								<td></td>
								<td>
									<h5>Subtotal</h5>
								</td>
								<td>
									<h5>
										Rs.
										<%=net_price%></h5>
								</td>
							</tr>
						</tbody>
</table>
</body>
</html>