package homepage;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/contact")
public class ContactServlet extends HttpServlet {
	
	
	public ContactServlet() {
System.out.println("Default const of ContactServlet");	
}
	
	@Override
	public void init() throws ServletException {
		System.out.println("initialization of contact property");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet method");
	String s=	req.getParameter("userName");
	String st=req.getParameter("emailId");
	String str=req.getParameter("mobile");
	Long convertedMobile = Long.parseLong(str);
	String stri=req.getParameter("comments");
	
	
	System.out.println(s);
	System.out.println(st);
	System.out.println(convertedMobile);
	System.out.println(stri);
	
	PrintWriter ref=resp.getWriter();
	
	ref.print("<html>");
	ref.print("<body>");
	ref.print("<h1>");
	ref.print("username"+s);
	if(s.length()>3) {
		ref.print("<span color:green;>");
		ref.print("contact name"+s);
	}else {
		ref.print("<span color:red;>");
		ref.print("invalid name");
	}
	ref.print("<br>");
	if(st.length()>15) {
		ref.print("<span color:green;>");
		ref.print("contact email"+st);
	}else {
		ref.print("<span color:red;>");
		ref.print("invalid emailId");
	}
	ref.print("<br>");
	if(convertedMobile>1000000) {
		ref.print("<span color:green;>");
		ref.print("correct contact number"+convertedMobile);
	}else {
		ref.print("<span color:red;>");
		ref.print("invalid mobileNumber");
	}
	ref.print("<br>");
	if(stri.length()>3) {
		ref.print("<span color:green;>");
		ref.print("correct contact comments"+stri);
	}else {
		ref.print("<span color:red;>");
		ref.print("invalid comments");
	}
	ref.print("<br>");
	ref.print("<a href=\"index.html\">Home</a>");
	//ref.print("<br>");
	ref.print("<a href=\"Contact.html\">send again</a>");
	
	ref.print("<h1>");
	ref.print("<body>");
	ref.print("<html>");
	
	resp.setContentType("text/html");
	
	
	
	
	
	
	
	
	
	}
}
