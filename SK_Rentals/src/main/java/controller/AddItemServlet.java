package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ItemDao;
import model.Items;

/**
 * Servlet implementation class AddItemServlet
 */
public class AddItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddItemServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		int billNumber=Integer.parseInt(request.getParameter("billNumber"));
		String lehangaCode=request.getParameter("lehangaCode");
		String blouseCode=request.getParameter("blouseCode");
		String odhaniCode=request.getParameter("odhaniCode");
		
		Items item=new Items(billNumber, lehangaCode, blouseCode, odhaniCode);
		ItemDao itemdao=new ItemDao();
		List<Items> lst=new ArrayList<Items>();
		lst.add(item);
		int i=itemdao.createRecord(lst);
		String str;
		HttpSession session=request.getSession();
		if(i>0)
		{
			System.out.println("record saved");
//			response.sendRedirect("");
		}else {
	    	 str="Invalid Details!";
				session.setAttribute("result", str);
//	    	 response.sendRedirect("error.jsp");
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
