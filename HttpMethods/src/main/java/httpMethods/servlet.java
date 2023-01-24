package httpMethods;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/httpmethods")
public class servlet extends HttpServlet {
	
	
	public servlet() {
		System.out.println("Running default constructor of servlet");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet Method");
		String string="Displaying data as doGet ";
		PrintWriter wire=resp.getWriter();
		wire.print(string);
	}
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost Method");
		String str="Displaying data as doPost ";
		PrintWriter data=resp.getWriter();
		data.print(str);
		
		
		
	}
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doDelecte Method");
		String space="Displaying data as doDelete ";
		PrintWriter msg=resp.getWriter();
		msg.print(space);
	}
	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doHead Method");
		String ptr="Displaying data as doHead ";
		PrintWriter read=resp.getWriter();
		read.print(ptr);
	}
	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doOptions Method");
		String rash="Displaying data as doOptions ";
		PrintWriter text=resp.getWriter();
		text.print(rash);
	}
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPut Method");
		String coffee="Displaying data as doPut ";
		PrintWriter type=resp.getWriter();
		type.print(coffee);
	}
	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doTrace Method");
		String lap="Displaying data as doTrace ";
		PrintWriter top=resp.getWriter();
		top.print(lap);
	}

}
