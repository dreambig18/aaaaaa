package shop.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.connection.DbCon;
import shop.dao.*;
import shop.model.*;

@WebServlet("/user-login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	response.sendRedirect("Login.jsp");
}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			String email = request.getParameter("login-email");
			String password = request.getParameter("login-password");
			
			
			
			
			out.print(email+password);
			
			
			UserDao udao = new UserDao(DbCon.getConnection());
			User user = udao.userLogin(email, password);
			if (user != null) {
				request.getSession().setAttribute("auth", user);
//				System.out.print("user logged in");
				response.sendRedirect("index.jsp");
			} else {
				response.sendRedirect("index.jsp");
				out.println("there is no user");
			}

		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		} 

	}
}