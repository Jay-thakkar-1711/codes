<%@page import="java.util.List" %>
<%@page import="Dao.ProductDao" %>
<%@page import="model.Product" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="customer-header.jsp"%>
<!DOCTYPE html>
<html lang="zxx" class="no-js">

<head>
</head>
<body>

   <br><br><br>
    <!-- ======= Portfolio Section ======= -->
    <section id="portfolio" class="portfolio">
      <div class="container">
      <%String msg=(String)request.getAttribute("msg");
      if(msg!=null){ %>
      <h5><%out.println(msg); %></h5>
      <%} %>
      <table class="table">
						<thead>
							<tr>
								<th scope="col">Image</th>
								<th scope="col">Name</th>
								<th scope="col">Price</th>
								<th scope="col">Category</th>
								<th scope="col">Description</th>
							</tr>
						</thead>
						<tbody>
						<%List<Product> list = ProductDao.getAllProducts(); %>
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
									<h5><a href="CartController?action=addtocart&cus_id=<%=c1.getId() %>&pid=<%=p.getPid() %>" >
									 <span class="ti-bag"></span><p class="hover-text">add to bag</p></a> 
								</td>
								<td>
									<h5><a href="WishListController?action=addtowishlist&cus_id=<%=c1.getId() %>&pid=<%=p.getPid() %>" > <span class="ti-bag"></span><p class="hover-text">add to wishlist</p></a></h5>
								</td>
							</tr>
							<%} %>
						</tbody>
					</table>
	</div>
   
      </div>
       
    </section><!-- End Portfolio Section -->

  </main><!-- End #main -->



	<footer class="footer-area section_gap">
		<div class="container">
			<div class="row">
				<div class="col-lg-3  col-md-6 col-sm-6">
					<div class="single-footer-widget">
						<h6>About Us</h6>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
							sed do eiusmod tempor incididunt ut labore dolore magna aliqua.</p>
					</div>
				</div>
				<div class="col-lg-4  col-md-6 col-sm-6">
					<div class="single-footer-widget">
						<h6>Newsletter</h6>
						<p>Stay update with our latest</p>
						<div class id="mc_embed_signup">
							<form target="_blank" novalidate="true"
								action="https://spondonit.us12.list-manage.com/subscribe/post?u=1462626880ade1ac87bd9c93a&amp;id=92a4423d01"
								method="get" class="form-inline">
								<div class="d-flex flex-row">
									<input class="form-control" name="EMAIL"
										placeholder="Enter Email" onfocus="this.placeholder = ''"
										onblur="this.placeholder = 'Enter Email '" required
										type="email">
									<button class="click-btn btn btn-default">
										<i class="fa fa-long-arrow-right" aria-hidden="true"></i>
									</button>
									<div style="position: absolute; left: -5000px;">
										<input name="b_36c4fd991d266f23781ded980_aefe40901a"
											tabindex="-1" value type="text">
									</div>

								</div>
								<div class="info"></div>
							</form>
						</div>
					</div>
				</div>
				<div class="col-lg-3  col-md-6 col-sm-6">
					<div class="single-footer-widget mail-chimp">
						<h6 class="mb-20">Instragram Feed</h6>
						<ul class="instafeed d-flex flex-wrap">
							<li><img src="img/i1.jpg" alt></li>
							<li><img src="img/i2.jpg" alt></li>
							<li><img src="img/i3.jpg" alt></li>
							<li><img src="img/i4.jpg" alt></li>
							<li><img src="img/i5.jpg" alt></li>
							<li><img src="img/i6.jpg" alt></li>
							<li><img src="img/i7.jpg" alt></li>
							<li><img src="img/i8.jpg" alt></li>
						</ul>
					</div>
				</div>
				<div class="col-lg-2 col-md-6 col-sm-6">
					<div class="single-footer-widget">
						<h6>Follow Us</h6>
						<p>Let us be social</p>
						<div class="footer-social d-flex align-items-center">
							<a href="#"><i class="fa fa-facebook"></i></a> <a href="#"><i
								class="fa fa-twitter"></i></a> <a href="#"><i
								class="fa fa-dribbble"></i></a> <a href="#"><i
								class="fa fa-behance"></i></a>
						</div>
					</div>
				</div>
			</div>
			<div
				class="footer-bottom d-flex justify-content-center align-items-center flex-wrap">
				<p class="footer-text m-0">
					Copyright &copy;
					<script>
						document.write(new Date().getFullYear());
					</script>
					All rights reserved | This template is made with <i
						class="fa fa-heart-o" aria-hidden="true"></i> by <a
						href="https://colorlib.com/" target="_blank">Colorlib</a>
				</p>
			</div>
		</div>
	</footer>

</body>

<!-- Mirrored from preview.colorlib.com/theme/karma/ by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 23 May 2024 12:09:35 GMT -->
</html>