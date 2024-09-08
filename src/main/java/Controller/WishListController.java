package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.WishListDao;
import model.WishList;

/**
 * Servlet implementation class WishListController
 */
@WebServlet("/WishListController")
public class WishListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WishListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("addtowishlist"))
		{
			int pid=Integer.parseInt(request.getParameter("pid"));
			int cusid=Integer.parseInt(request.getParameter("cus_id"));
			WishList w=new WishList();
			w.setPid(Integer.parseInt(request.getParameter("pid")));
			w.setCusid(Integer.parseInt(request.getParameter("cus_id")));
			boolean flag=WishListDao.checkWishList(cusid, pid);
			if(flag==false)
			{
				WishListDao.insertWishlist(cusid, pid);
				response.sendRedirect("customer-home.jsp");
			}
			else
			{
				request.setAttribute("msg", "Already added to wishlist");
				request.getRequestDispatcher("customer-home.jsp").forward(request, response);
			}
		}
		if(action.equalsIgnoreCase("remove"))
		{
			int wid=Integer.parseInt(request.getParameter("wid"));
			WishListDao.deleteWishList(wid);
			response.sendRedirect("wishlist.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
