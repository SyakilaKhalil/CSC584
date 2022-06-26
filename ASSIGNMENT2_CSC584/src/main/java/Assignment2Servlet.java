

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Assignment2Servlet")
public class Assignment2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Assignment2DAO ss;
	public void init() {
		ss=new Assignment2DAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		String action = request.getParameter("action");
		try {
			switch (action) {
			case "createaAssignment2": 
				createAssignment2(request,response);
			break;	
		}
		}
		catch (SQLException e) {
			throw new ServletException(e);
			}
	}
				
			
	
			
	private void createAssignment2(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		String name=request.getParameter("name");
		String age=request.getParameter("age");
		String email=request.getParameter("email");
		String phoneNumber=request.getParameter("phoneNumber");
		String date=request.getParameter("date");
		String item=request.getParameter("item");
		String brand=request.getParameter("brand");
		String problem=request.getParameter("problem");
		String problemdetails=request.getParameter("problemdetails");
		 
		Assignment2 ac = new Assignment2();
		
		ac.setname(name);
		ac.setage(age);
		ac.setemail(email);
		ac.setphoneNumber(phoneNumber);
		ac.setdate(date);
		ac.setitem(item);
		ac.setbrand(brand);
		ac.setproblem(problem);
		ac.setproblemdetails(problemdetails);
		
		ss.createAssignment2(ac);
			
	}
}
