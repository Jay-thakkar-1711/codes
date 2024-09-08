package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.CartDao;
import Dao.ProductDao;
import model.Cart;
import model.Product;

/**
 * Servlet implementation class CartController
 */
@WebServlet("/CartController")
public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("addtocart"))
		{
			Cart c=new Cart();
			int pid=Integer.parseInt(request.getParameter("pid"));
			Product p=ProductDao.getProductByPid(pid);
			c.setCus_id(Integer.parseInt(request.getParameter("cus_id")));
			c.setP_id(Integer.parseInt(request.getParameter("pid")));
			c.setPrice(p.getPprice());
			c.setQty(1);
			c.setTtl_price(p.getPprice());
			c.setSub_ttl(p.getPprice());
			c.setPayment_status("pending");
			int cusid=Integer.parseInt(request.getParameter("cus_id"));
			boolean flag=CartDao.checkCart(cusid, pid);
			if(flag==false)
			{
				CartDao.insertCart(c);
				response.sendRedirect("customer-home.jsp");
			}
			else
			{
				request.setAttribute("msg", "Product already added to cart");
				request.getRequestDispatcher("customer-home.jsp").forward(request, response);
			}
		}
		if(action.equalsIgnoreCase("remove"))
		{
			int cart_id=Integer.parseInt(request.getParameter("cartid"));
			CartDao.deleteCart(cart_id);
			response.sendRedirect("cart.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cartid=Integer.parseInt(request.getParameter("cart_id"));
		int pid=Integer.parseInt(request.getParameter("pid"));
		double price=Double.parseDouble(request.getParameter("pprice"));
		int qty=Integer.parseInt(request.getParameter("qty"));
		Cart c=new Cart();
		c.setCart_id(cartid);
		c.setP_id(pid);
		c.setTtl_price(price*qty);
		c.setQty(qty);
		CartDao.updateCart(c);
		response.sendRedirect("cart.jsp");
		
		
		
	}

}
