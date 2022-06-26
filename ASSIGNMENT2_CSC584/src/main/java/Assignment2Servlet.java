
import java.io.IOException;
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
	
	 public Assignment2Servlet() {
	    	super();
	        // TODO Auto-generated constructor stub
	    }
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		String action = request.getParameter("action");
		try {
			switch (action) {
			case "createAssignment2r": 
				createAssignment2(request,response);
			break;
			/*case "deleteKhairatmember":
				deleteKhairatmember(request,response;)
			break;
			case "updateKahiratmember":
				updateKhairatmember(request,responses);
				break;
				case "cancel":
				 * cancel(request,response);
				 * break;*/
			
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
		String datee=request.getParameter("datee");
		String item=request.getParameter("item");
		String brand=request.getParameter("brand");
		String problem=request.getParameter("problem");
		String problemdetails=request.getParameter("problemdetails");
		 
		Assignment2 ac = new Assignment2();
		
		ac.setname(name);
		ac.setage(age);
		ac.setemail(email);
		ac.setphoneNumber(phoneNumber);
		ac.setdatee(datee);
		ac.setitem(item);
		ac.setbrand(brand);
		ac.setproblem(problem);
		ac.setproblemdetails(problemdetails);
		
		ss.createAssignment2(ac);
			
	}
	}
