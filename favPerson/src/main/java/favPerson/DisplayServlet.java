package favPerson;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/forward")
public class DisplayServlet extends HttpServlet {
	
	public DisplayServlet() {
System.out.println("Running default const of DisplayServlet");	
}
	@Override
	public void init() throws ServletException {
		System.out.println("initializing properties of favPerson");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost method");
		
		String first=req.getParameter("fname");
		String last=req.getParameter("lname");
		String gen=req.getParameter("gen");
		String rea=req.getParameter("rea");
		String add=	req.getParameter("add");
		
		
		System.out.println(first);
		System.out.println(last);
		System.out.println(gen);
		System.out.println(rea);
		System.out.println(add);
		
		RequestDispatcher ref=req.getRequestDispatcher("Display.jsp");
		req.setAttribute("first", first);
		req.setAttribute("last", last);
		req.setAttribute("gen", gen);
		req.setAttribute("rea", rea);
		req.setAttribute("add", add);
		ref.forward(req, resp);
		
	}

}
