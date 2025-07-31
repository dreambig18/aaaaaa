package com.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.RegisterDao;
import com.Model.Login;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//request.getWriter().append("Served at: ").append(request.getContextPath());
		int  accNo=Integer.parseInt(request.getParameter("accNo"));
		String cname=request.getParameter("cname");
		Login lobj=new Login();
		lobj.setAccNo(accNo);
		lobj.setCname(cname);
		
		
//		lobj.setAccNo(accNo);
//		lobj.setCname();
//		
		RegisterDao rd=new RegisterDao();
		boolean b=rd.validateUser(lobj);
		if(b) {
			response.sendRedirect("welcome.html");
		}
		else {
			response.sendRedirect("Error.html");

			
		}
		//check usern & pass from db as username accNo and cname is pass
		//add validateUser method to registerDao
		//redirect to wc.html or error.html
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
