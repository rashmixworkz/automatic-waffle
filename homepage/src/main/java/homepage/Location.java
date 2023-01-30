package homepage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 2,urlPatterns = "/location")
public class Location extends HttpServlet {
	
	public Location() {
System.out.println("Running default const of location servlet");	
}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Initializing Location properties");
		}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet method");
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String gender=req.getParameter("gender");
		String start=req.getParameter("StartPoint");
		String end=req.getParameter("destination");
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(gender);
		System.out.println(start);
		System.out.println(end);
		
		
	PrintWriter content=resp.getWriter();
	content.print("<html>");
	content.print("<body>");
	content.print("<h1>");
	if(name.length()>3) {
		content.print("<span color:green;>");
		content.print("contact name"+ name +"sent successfully");
	}else {
		content.print("<span color:red;>");
		content.print("invalid name");
	}
	content.print("<br>");
	if(email.length()>15) {
		content.print("<span color:green;>");
		content.print("contact email"+email);
	}else {
		content.print("<span color:red;>");
		content.print("invalid emailId");
	}
	
	content.print("<br>");
	if(start.length()>3) {
		content.print("<span color:green;>");
		content.print("correct startingPoint"+start);
	}else {
		content.print("<span color:red;>");
		content.print("invalid startPoint");
	}
	if(end.length()>3) {
		content.print("<span color:green;>");
		content.print("correct endingPoint"+end);
	}else {
		content.print("<span color:red;>");
		content.print("invalid endPoint");
	}
	content.print("<br>");
	content.print("<a href=\"index.html\">Home</a>");
	//ref.print("<br>");
	content.print("<a href=\"Contact.html\">send again</a>");
	
	content.print("<h1>");
	content.print("<body>");
	content.print("<html>");
	
	resp.setContentType("text/html");
	
	
	}

}
