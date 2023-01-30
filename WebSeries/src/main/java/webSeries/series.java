package webSeries;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 1,urlPatterns = "/web")
public class series extends HttpServlet {
	
	public series() {
		System.out.println("Running default const of series");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet in series...........");
		System.out.println(Thread.currentThread().getName());
		
		String name=req.getParameter("seriesName");
		String name1=req.getParameter("language");
		String name2=req.getParameter("noOfEpisodes");
		String name3=req.getParameter("ott");
		String name4=req.getParameter("budget");
		
		System.out.println(name);
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		
		
	PrintWriter ref=resp.getWriter();
	ref.print("<html>");
	ref.print("<body>");
	ref.print("<h1>");
	ref.print("<span style='color:orange;'>");
	ref.print("Series Name"+name+"is sent successfully");
	ref.print("</span>");
	ref.print("</h1>");
	ref.print("</body>");
	ref.print("</html>");
	resp.setContentType("text/html");
	}

}
