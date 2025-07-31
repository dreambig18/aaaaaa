package com.Controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.RegisterDao;
import com.Model.Register;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int accNo=Integer.parseInt(request.getParameter("accNo"));
		String cname=request.getParameter("cname");
		int accbal=Integer.parseInt(request.getParameter("accbal"));
		
		Register register=new Register(accNo, cname, accbal);  //set to the model class and make register" as a object
		
		
		RegisterDao dao=new RegisterDao();    //pass this object to the RegisterDao
		int i=dao.createAccount(register);   
		
		
		PrintWriter pw=response.getWriter();
		if (i>0) {
			response.sendRedirect("Login.html");
		
//			pw.println("<h1> ACCOOUNT CREATED....</h1>");
		}
		//pw.print("<tr><td>"+register.getAccNo()+"</td>"+register.getCustName()+"</td>"+register.getAccBal()+"</td></tr>");
		//pw.print("\n\n"+register.getAccNo()+register.getCustName()+register.getAccBal());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
