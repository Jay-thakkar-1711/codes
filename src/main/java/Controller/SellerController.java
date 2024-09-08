package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Seller;
import Dao.SellerDao;
/**
 * Servlet implementation class SellerController
 */
@WebServlet("/SellerController")
public class SellerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SellerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equalsIgnoreCase("register"))
		{
			Seller s=new Seller();
			s.setName(request.getParameter("name"));
			s.setContact(Long.parseLong(request.getParameter("contact")));
			s.setAddress(request.getParameter("address"));
			s.setEmail(request.getParameter("email"));
			s.setPassword(request.getParameter("password"));
			String email=request.getParameter("email");
			System.out.println(s);
			boolean flag=SellerDao.checkEmail(email);
			if(flag==false)
			{
				SellerDao.insertSeller(s);
				response.sendRedirect("seller-login.jsp");
			}
			else
			{
				request.setAttribute("msg","account already exist");
				request.getRequestDispatcher("seller-registration.jsp").forward(request,response);
			}
			
		}
		else if(action.equalsIgnoreCase("login"))
		{
			Seller s=new Seller();
			s.setEmail(request.getParameter("email"));
			s.setPassword(request.getParameter("password"));
			String email=request.getParameter("email");
			boolean flag=SellerDao.checkEmail(email);
			if(flag==true)
			{
				Seller s1 = SellerDao.LoginSeller(s);
				if(s1==null)
				{
					request.setAttribute("msg","Password is incorrect");
					equest.getRequestDispatcher("seller-login.jsp").forward(request,response);
				}
			}
		}
	}

}
