

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculationServelet
 */
@WebServlet("/CalculationServelet")
public class CalculationServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculationServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int n1=Integer.parseInt(request.getParameter("no1"));   //no1 value get from html page no1 variable which is declare in name="no1"
		int n2=Integer.parseInt(request.getParameter("no2"));   //no1,no2 comes as a string so we typecast nd covert into int
		int add=n1+n2;
		
		PrintWriter pw=response.getWriter(); //response.   ha reply denar tyacha pw ha obj create kelay
		//System.out.println("");
		pw.println("<h1> Addition is "+add+"</h1>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
