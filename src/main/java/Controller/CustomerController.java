package Controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.CustomerDao;
import email_services.Servicess;
import model.Customer;

/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerController() {
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
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("register"))
		{
			Customer c=new Customer();
			c.setName(request.getParameter("name"));
			c.setContact(Long.parseLong(request.getParameter("contact")));
			c.setAddress(request.getParameter("addess"));
			c.setEmail(request.getParameter("email"));
			c.setPassword(request.getParameter("password"));
			System.out.println(c);
			String email=request.getParameter("email");
			System.out.println(email);
			boolean flag=CustomerDao.checkEmail(email);
			if(flag==false)
			{
				CustomerDao.insertCustomer(c);
				response.sendRedirect("customer-login.jsp");
			}
			else
			{
				request.setAttribute("msg", "Account already exist");
				request.getRequestDispatcher("customer-registration.jsp").forward(request, response);
			}
			
		}
		else if(action.equalsIgnoreCase("login"))
		{
			Customer c=new Customer();
			c.setEmail(request.getParameter("email"));
			c.setPassword(request.getParameter("password"));
			String email=request.getParameter("email");
			boolean flag=CustomerDao.checkEmail(email);
			if(flag==true)
			{
				Customer c1=CustomerDao.getLogin(c);
				if(c1!=null)
				{
					HttpSession session=request.getSession();
					session.setAttribute("data", c1);
					request.getRequestDispatcher("customer-home.jsp").forward(request, response);
				}
				else
				{
					request.setAttribute("msg", "Password is Incorrect");
					request.getRequestDispatcher("customer-login.jsp").forward(request, response);
				}
			}
			else
			{
				request.setAttribute("msg", "Email is incorrect");
				request.getRequestDispatcher("customer-login.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("update"))
		{
			Customer c=new Customer();
			c.setId(Integer.parseInt(request.getParameter("id")));
			c.setName(request.getParameter("name"));
			c.setContact(Long.parseLong(request.getParameter("contact")));
			c.setAddress(request.getParameter("address"));
			c.setEmail(request.getParameter("email"));
			CustomerDao.updateCustomer(c);
			HttpSession session=request.getSession();
			session.setAttribute("data", c);
			request.getRequestDispatcher("customer-home.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("changepswd"))
		{
			String email=request.getParameter("email");
			String op=request.getParameter("oldpassword");
			String np=request.getParameter("newpassword");
			String cnp=request.getParameter("confirmpassword");
			boolean flag=CustomerDao.checkOldPassword(email, op);
			if(flag==true)
			{
				if(np.equals(cnp))
				{
					CustomerDao.updatePassword(email, np);
					response.sendRedirect("customer-home.jsp");
				}
				else
				{
					request.setAttribute("msg", "New Password and Confirm Password is different");
					request.getRequestDispatcher("customer-change-pswd.jsp").forward(request, response);
				}
			}
			else
			{
				request.setAttribute("msg", "Password is incorrect");
				request.getRequestDispatcher("customer-change-pswd.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("getotp"))
		{
			String email=request.getParameter("email");
			boolean flag=CustomerDao.checkEmail(email);
			if(flag==true)
			{
				Random r=new Random();
				int num=r.nextInt(999999);
				Servicess s=new Servicess();
				s.sendMail(email,num);
				request.setAttribute("email", email);
				request.setAttribute("otp", num);
				request.getRequestDispatcher("customer-verify-otp.jsp").forward(request, response);
			}
			else
			{
				request.setAttribute("msg", "Email not valid");
				request.getRequestDispatcher("customer-forgot-password.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("verify"))
		{
			String email=request.getParameter("email");
			int otp1=Integer.parseInt(request.getParameter("otp1"));
			int otp2=Integer.parseInt(request.getParameter("otp2"));
			if(otp1==otp2)
			{
				request.setAttribute("email", email);
				request.getRequestDispatcher("customer-new-password.jsp").forward(request, response);
			}
			else
			{
				request.setAttribute("msg", "OTP is different");
				request.getRequestDispatcher("customer-verify-otp.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("up"))
		{
			String email=request.getParameter("email");
			String np=request.getParameter("np");
			String cnp=request.getParameter("cnp");
			if(np.equals(cnp))
			{
				CustomerDao.updatePassword(email, cnp);
				response.sendRedirect("customer-login.jsp");
			}
			else
			{
				request.setAttribute("msg", "New Password and Confirm Password are different");
				request.setAttribute("email", email);
				request.getRequestDispatcher("customer-new-password.jsp").forward(request, response);
			}
		}
	}

}
